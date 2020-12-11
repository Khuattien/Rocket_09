DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE ThucTap;
USE ThucTap;

DROP TABLE IF EXISTS Country;
CREATE TABLE Country
(
	country_id		INT  PRIMARY KEY,
    country_name		VARCHAR(20)
);

DROP TABLE IF EXISTS Location;
CREATE TABLE Location
(
	location_id		INT  PRIMARY KEY,
    street_address		VARCHAR(20),
    postal_code		INT,
    country_id		INT,
    CONSTRAINT FOREIGN KEY(country_id) 
    REFERENCES Country(country_id) 
);

DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee
(
	employee_id		INT  PRIMARY KEY,
    full_name		VARCHAR(20),
    email			VARCHAR(20),
    location_id		INT,
	CONSTRAINT FOREIGN KEY(location_id) 
    REFERENCES Location(location_id) 
);

INSERT INTO Country
values (1,'Viet Nam'),
		(2,'TQ'),
        (3,'Lao');

INSERT INTO Location
values (1,'StreetA',1,1),
		(2,'StreetB',2,2),
        (3,'StreetC',3,3);
        
INSERT INTO Employee
values (1,'Tran Van A','tranvana@gmail.com',1),
		(2,'Tran Van B','tranvanb@gmail.com',2),
        (3,'Tran Van C','tranvanc@gmail.com',3);
-- 2
-- a.Lấy tất cả các nhân viên thuộc Việt nam
select 
	employee_id, full_name
from 
	Employee a
    join
    Location b
    on
    a.location_id = b.location_id
	join
    Country c
    on 
    b.country_id = c.country_id
where
	country_name='Viet Nam';

-- b.Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
select 
	country_name
from 
	Employee a
    join
    Location b
    on
    a.location_id = b.location_id
	join
    Country c
    on 
    b.country_id = c.country_id
where
	email='nn03@gmail.com';
    
-- c.Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.
select
    c.country_name,b.location_id, count(*) as So_Employee
from
	Employee a
    join
    Location b
    on
    a.location_id = b.location_id
	join
    Country c
    on 
    b.country_id = c.country_id
group by
	c.country_id, b.location_id;
    
    
-- 3.Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee
drop trigger if exists Insert_Employee;
delimiter $$
create trigger Insert_Employee
before insert  on Employee
for each row
begin
	if(
		(
		select
			count(*) 
		from
			Employee a
			join
			Location b
			on
			a.location_id = b.location_id
			join
			Country c
			on 
			b.country_id = c.country_id
		where
			c.country_id =  (
								select distinct
									b.country_id 
								from
									Employee a
									join
									Location b
									on
									a.location_id = b.location_id
								where 
									b.location_id = new.location_id
                            ) 
			) >= 10 ) then
			signal sqlstate '12345'
            set message_text = 'Qua 10 nv';
        end if;
end $$
delimiter ;


-- 4.Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở location đó sẽ có location_id = null

drop trigger if exists Delete_location;
delimiter $$
create trigger Delete_location
before delete  on Location
for each row
begin
		update 
			Employee
        set
			location_id = null
		where 
			location_id = old.location_id;
end $$
delimiter ;


