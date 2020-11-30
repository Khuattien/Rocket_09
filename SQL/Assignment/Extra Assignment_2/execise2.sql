DROP DATABASE IF EXISTS execise2;
CREATE DATABASE IF NOT EXISTS execise2;
USE execise2;

DROP TABLE IF EXISTS Department;
CREATE TABLE Department
(
	Department_Number INT NOT NULL PRIMARY KEY,
	Department_Name VARCHAR(100)
);

DROP TABLE IF EXISTS Employee_Table;
CREATE TABLE Employee_Table
(
	Employee_Number INT PRIMARY KEY,
	Employee_Name VARCHAR(100),
	Department_Number INT,
	CONSTRAINT FOREIGN KEY(Department_Number) REFERENCES Department(Department_Number)
);

DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE Employee_Skill_Table
(
	Employee_Number INT PRIMARY KEY,
	Skill_Code VARCHAR(100),
	Date_Registered DATE,
	CONSTRAINT FOREIGN KEY(Employee_Number) REFERENCES Employee_Table(Employee_Number)
);

INSERT INTO Department VALUES 
	(1, 'SAMSUNG'),
	(2, 'SONY'),
	(3, 'LG'),
	(4, 'CANON');

INSERT INTO Employee_Table VALUES 
(1, 'Soobin Hoang Son', 2),
(2, 'Tran Thanh MC', 2),
(3, 'Truong Giang MC', 1),
(4, 'Quan AP', 4),
(5, 'My Tam', 1),
(6, 'Dam Vinh Hung', 2),
(7, 'Binz', 2),
(8, 'SuBoi', 1),
(9, 'Big Daddy', 2),
(10, 'Erik', 3),
(11, 'Duc Phuc', 4),
(12, 'Harry Won', 2);

INSERT INTO Employee_Skill_Table VALUES 
(1, 'JAVA', '2020-11-28'),
(2, 'PYTHON', '2020-11-28'),
(3, 'HTML', '2020-11-28'),
(4, 'CSS', '2020-11-28'),
(5, 'JAVA', '2020-11-28'),
(6, 'C#', '2020-11-28'),
(7, 'SQL', '2020-11-28'),
(8, 'PHOTOSHOP', '2020-11-28'),
(9, 'JAVA', '2020-11-28'),
(10, 'JAVA', '2020-11-28'),
(11, 'HTML', '2020-11-28'),
(12, 'C#', '2020-11-28');


-- Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java
select 
	Employee_Name
from
	Employee_Table a left join Employee_Skill_Table b on a.Employee_Number = b.Employee_Number
where 
	Skill_Code='JAVA';

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
select 
	b.Department_Number, b.Department_Name
from
	Employee_Table a join Department b on a.Department_Number = b.Department_Number
group by
		b.Department_Number
having 
	count(*) >3;
	
-- Question 5: Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.
select 
	* 
from 
	Employee_Table
order by 
	Department_Number;
 
-- Question 6: Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.
select 
	a.Employee_Name
from
	Employee_Table a left join Employee_Skill_Table b on a.Employee_Number = b.Employee_Number
group by
	a.Employee_Number
having 
	count(*) >1;
	