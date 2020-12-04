DROP DATABASE IF EXISTS Testing_System_Assignment_1;
CREATE DATABASE Testing_System_Assignment_1;
USE Testing_System_Assignment_1;

-- table 1
DROP TABLE IF EXISTS Department;
CREATE TABLE Department
(
	DepartmentID 		INT AUTO_INCREMENT PRIMARY KEY,
    DepartmentName		VARCHAR(20)
);

-- table 2
DROP TABLE IF EXISTS `Position`;
CREATE TABLE `Position`
(
	PositionID 			INT AUTO_INCREMENT PRIMARY KEY,
    PositionName		ENUM('Dev', 'Test', 'Scrum Master', 'PM')
);

-- table 3
DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account`
(
	AccountID		INT AUTO_INCREMENT PRIMARY KEY,
    Email			VARCHAR(20),
    UserName		VARCHAR(20),
    FullName		VARCHAR(20),
    DepartmentID	INT,
    PositionID		INT,
    CreateDate		Date,
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID) ON DELETE CASCADE,
    FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID) ON DELETE CASCADE
);

-- table 4
DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group`
(
	GroupID 		INT AUTO_INCREMENT  PRIMARY KEY,
    GroupName		VARCHAR(20),
    CreatorID		INT,
    CreateDate		DATE
);

-- table 5
DROP TABLE IF EXISTS GroupAccount;
CREATE TABLE GroupAccount
(
	GroupID 		INT NOT NULL,
    AccountID		INT NOT NULL,
    JoinDate 		Date,
    CONSTRAINT PRIMARY KEY(GroupID, AccountID),
	CONSTRAINT FOREIGN KEY(GroupID) REFERENCES `Group`(GroupID) ON DELETE CASCADE,
    CONSTRAINT FOREIGN KEY(AccountID) REFERENCES `Account`(AccountID) ON DELETE CASCADE
);

-- table 6
DROP TABLE IF EXISTS TypeQuestion;
CREATE TABLE TypeQuestion
(
	TypeID 			INT AUTO_INCREMENT PRIMARY KEY,
    TypeName		ENUM('Essay', 'Multiple-Choice')
);

-- table 7
DROP TABLE IF EXISTS CategoryQuestion;
CREATE TABLE CategoryQuestion
(
	CategoryID		INT AUTO_INCREMENT PRIMARY KEY,
    CategoryName	VARCHAR(20)
);

-- table 8
DROP TABLE IF EXISTS Question;
CREATE TABLE Question
(
	QuestionID		INT AUTO_INCREMENT PRIMARY KEY,
    Content			VARCHAR(100),
    CategoryID		INT,
    TypeID			INT,
    CreatorID		INT,
    CreateDate		DATE,
    CONSTRAINT FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion(CategoryID) ON DELETE CASCADE,
    CONSTRAINT FOREIGN KEY(TypeID) REFERENCES TypeQuestion(TypeID) ON DELETE CASCADE
);

-- table 9
DROP TABLE IF EXISTS Answer;
CREATE TABLE Answer
(
	AnswerID		INT AUTO_INCREMENT PRIMARY KEY,
    Content			VARCHAR(100),
    QuestionID		INT,
    isCorrect		VARCHAR(10),
    CONSTRAINT FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID) ON DELETE CASCADE
);

-- table 10
DROP TABLE IF EXISTS Exam;
CREATE TABLE Exam
(
	ExamID			INT AUTO_INCREMENT PRIMARY KEY,
    `Code`			INT,
    Title			VARCHAR(20),
    CategoryID		INT,
    Duration		VARCHAR(10),
    CreatorID		INT,
    CreateDate		DATE
);

-- table 11
DROP TABLE IF EXISTS  ExamQuestion;
CREATE TABLE  ExamQuestion
(
	ExamID 			INT NOT NULL,
    QuestionID		INT NOT NULL,
    CONSTRAINT PRIMARY KEY (ExamID, QuestionID),
    CONSTRAINT FOREIGN KEY(ExamID) REFERENCES Exam(ExamID) ON DELETE CASCADE,
    CONSTRAINT FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID) ON DELETE CASCADE
);

-- Add data Department
INSERT INTO Department (DepartmentID, DepartmentName)
VALUES
			(1,		N'Bán hàng'),
            (2,		'Marketing'),
            (3,		N'Bảo vệ'),
            (4,		N'Nhân sự'),
            (5,		'Sale');

-- Add data  Position
INSERT INTO Position (PositionID, PositionName)
VALUES
			(1,		'PM'),
            (2,		'Dev'),
            (3,		'Scrum Master'),
            (4,		'Dev'),
            (5,		'Scrum Master');

-- Add data  Account
INSERT INTO `Account` (AccountID, Email, UserName, FullName, DepartmentID, PositionID, CreateDate)
VALUES
			(1,		'a1@gmail.com', 'a1', N'Trần A1', 1, 1,'2015-01-13'),
            (2,		'a2@gmail.com', 'a2', N'Trần A2', 2, 2,'2015-01-02'),
            (3,		'a3@gmail.com', 'a3', N'Trần A3', 3, 3,'2015-01-03'),
            (4,		'a4@gmail.com', 'a4', N'Trần A4', 4, 4,'2015-1-2'),
            (5,		'a5@gmail.com', 'a5', N'Trần A5', 5, 5,'2015-1-20');
            
-- Add data  Group
INSERT INTO `Group` (GroupID, GroupName, CreatorID, CreateDate)
VALUES
			(1,		N'G1', 1, '2010-10-16'),
            (2,		N'G2', 2, '2010-11-16'),
            (3,		N'G3', 3, '2010-12-16'),
            (4,		N'G4', 4, '2010-9-16'),
            (5,		N'G5', 5, '2010-8-16');

-- Add data  GroupAccount
INSERT INTO GroupAccount (GroupID, AccountID, JoinDate)
VALUES
			(1,		1, '2016-1-2'),
            (2,		2, '2016-1-3'),
            (3,		3, '2016-1-4'),
            (4,		4, '2016-1-5'),
            (5,		5, '2016-1-6');

-- Add data  TypeQuestion
INSERT INTO TypeQuestion (TypeID, TypeName)
VALUES 
			(1,		'Essay'),
            (2,		'Essay'),
            (3,		'Essay'),
            (4,		'Multiple-Choice'),
            (5,		'Multiple-Choice');
            
-- Add data  CategoryQuestion
INSERT INTO CategoryQuestion (CategoryID, CategoryName)
VALUES
			(1,		'Java'),
            (2,		'.NET'),
            (3,		'SQL'),
            (4,		'Postman'),
            (5,		'Ruby');
            
-- Add data  Question
INSERT INTO Question (QuestionID, Content, CategoryID, TypeID, CreatorID, CreateDate)
VALUES
			(1,		N'Question 1', 1, 1, 1, '2013-12-1'),
            (2,		N'Question 2', 2, 2, 1, '2013-12-4'),
            (3,		N'Question 3', 3, 3, 1, '2013-12-5'),
            (4,		N'Question 4', 4, 4, 1, '2013-12-7'),
            (5,		N'Question 5', 5, 5, 1, '2013-12-15');
            
-- Add data  Answer
INSERT INTO Answer (AnswerID, Content, QuestionID, isCorrect)
VALUES
			(1,		N'Answer 1', 1,'True'),
            (2,		N'Answer 2', 1,'True'),
            (3,		N'Answer 3', 1,'False'),
            (4,		N'Answer 4', 1,'True'),
            (5,		N'Answer 5', 1,'False');

-- Add data  Exam
INSERT INTO Exam (ExamID, `Code`, Title, CategoryID, Duration, CreatorID, CreateDate)
VALUES
			(1,		1, 'Title 1', 1, '90 min', 1, '2015-1-1'),
            (2,		2, 'Title 2', 2, '90 min', 1, '2015-1-1'),
            (3,		3, 'Title 3', 3, '90 min', 1, '2015-1-1'),
            (4,		4, 'Title 4', 4, '120 min', 1, '2015-1-1'),
            (5,		5, 'Title 5', 5, '120 min', 1, '2015-1-1');
      
-- Add data  ExamQuestion
INSERT INTO ExamQuestion (ExamID, QuestionID)
VALUES
			(1,		1),
            (1,		2),
            (1,		3),
            (1,		4),
            (1,		5);
                      
            
-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
DELIMITER $$
DROP PROCEDURE if exists NV_phong;
create procedure NV_phong (IN tenPhong varchar(20) )
	begin
		select 
			AccountID
		from
			`Account` a
            join
			Department b
            on
            a.DepartmentID = b.DepartmentID
		where
			DepartmentName = tenPhong;
    end$$
DELIMITER ;



-- Question 2: Tạo store để in ra số lượng account trong mỗi group

DROP PROCEDURE if exists SL_NV_Group;
DELIMITER $$
create procedure SL_NV_Group ()
	begin
		select 
			GroupID, count(*) as So_nhan_vien
		from
			GroupAccount
		group by
			GroupID;
    end$$
DELIMITER ;



-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại

DROP PROCEDURE if exists SL_question_tao_trong_thang_hien_tai;
DELIMITER $$
create procedure SL_question_tao_trong_thang_hien_tai ()
	begin
		select 
			a.TypeID, a.TypeName,count(*) as So_luong_cau_hoi
		from
			TypeQuestion a
            left join
            Question b
            on
            a.TypeID = b.TypeID
		where
			month(b.CreateDate)  = month(now())
		group by
			TypeID;
		
    end$$
DELIMITER ;

-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất

DROP PROCEDURE if exists Type_question_nhieu_cau_hoi_nhat;
DELIMITER $$
create procedure Type_question_nhieu_cau_hoi_nhat ()
	begin
		select 
			a.TypeID -- ,  count(*) as So_luong_cau_hoi
		from
			TypeQuestion a
            left join
            Question b
            on
            a.TypeID = b.TypeID
		group by
			a.TypeID
		having 
			count(*) = (	select 
								max(ds)
							from
								(select 
									count(*) as ds
								from
									TypeQuestion a
									left join
									Question b
									on
									a.TypeID = b.TypeID
								group by
									a.TypeID
								) as bang_tam
                        );
    end$$
DELIMITER ;

call Type_question_nhieu_cau_hoi_nhat ();
-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
-- ??
select
	TypeName
from
	TypeQuestion
where
	TypeID IN  (select Type_question_nhieu_cau_hoi_nhat())
				 ;

-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
-- chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào

DROP PROCEDURE if exists Find_group_or_username;
DELIMITER $$
create procedure Find_group_or_username (IN str varchar(50))
	begin
		select 
			GroupName
		from
			`Group`
		where
			GroupName like concat('%',str,'%');
		
        select 
			FullName
		from
			`Account`
		where
			FullName like concat('%',str,'%');
    end$$
DELIMITER ;

call Find_group_or_username('1');

-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán:
-- username sẽ giống email nhưng bỏ phần @..mail đi
-- positionID: sẽ có default là developer
-- departmentID: sẽ được cho vào 1 phòng chờ
-- Sau đó in ra kết quả tạo thành công

DROP PROCEDURE if exists infor;
DELIMITER $$
create procedure infor (IN fullname varchar(20), IN email varchar(20))
	begin
		insert into `Account` (Email, UserName, FullName, DepartmentID, PositionID, CreateDate)
        values	(email, )
    end$$
DELIMITER ;


-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
-- để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất

DROP PROCEDURE if exists max_content;
DELIMITER $$
CREATE PROCEDURE max_content (IN str CHAR(20))
BEGIN
	SELECT 
		QuestionID
    FROM
		Question
    WHERE 
		char_length(Content) = (SELECT 
									MAX(char_length(Content))
								FROM 
									Question
								WHERE 
									TypeID IN (SELECT 
													TypeID 
												FROM 
													TypeQuestion
												WHERE 
													TypeName = str
                                                )
								);
    
END$$
DELIMITER ;

-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID

DROP PROCEDURE if exists detele_exam;
DELIMITER $$
CREATE PROCEDURE detele_exam (IN num int)
BEGIN
	delete from 
		Exam
    where 
		ExamID = num;
END$$
DELIMITER ;

-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa)
-- Sau đó in số lượng record đã remove từ các table liên quan trong khi removing
-- ??

select count(*) from Exam where CreateDate < (SELECT SUBDATE(NOW(), INTERVAL 3 year));
-- call  detele_exam ( (select ExamID from Exam where CreateDate < (SELECT SUBDATE(NOW(), INTERVAL 3 year))) );


-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng nhập vào tên phòng ban và các account thuộc phòng ban đó 
-- sẽ được chuyển về phòng ban default là phòng ban chờ việc

DROP PROCEDURE if exists detele_phong;
DELIMITER $$
CREATE PROCEDURE detele_phong (IN phong varchar(20))
BEGIN
        UPDATE 
			`Account`
        SET 
			DepartmentID = (SELECT 
								DepartmentID 
							FROM 
								Department 
							WHERE 
								DepartmentName ='Phong cho')
        WHERE 
			DepartmentID = (SELECT 
								DepartmentID 
							FROM 
								Department 
							WHERE 
								DepartmentName = phong );
            
		DELETE FROM 
			Department
        WHERE  
			DepartmentName = phong;
            
END$$
DELIMITER ;

-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay

DROP PROCEDURE if exists Thong_ke_cau_hoi_nam;
DELIMITER $$
CREATE PROCEDURE Thong_ke_cau_hoi_nam ()
BEGIN
        select 
			month(CreateDate) as Tháng, count(*) as So_Luong
        from
			Question
		where 
			year(CreateDate) = year(now())
		group by
			month(CreateDate);
        
END$$
DELIMITER ;

-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất
-- (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng")         

DROP PROCEDURE if exists Thong_ke_cau_hoi_6_thang;
DELIMITER $$
CREATE PROCEDURE Thong_ke_cau_hoi_6_thang ()
BEGIN
		declare a, b, c,d int;
        set a = month((SELECT SUBDATE(NOW(), INTERVAL 6 MONTH)));
		set b = month(now());
        set c=0;
        create table thang
        (
			thang int
        );
        if  (a < b) then
			insert into thang values(b);
            insert into thang values(b-1);
            insert into thang values(b-2);
            insert into thang values(b-3);
            insert into thang values(b-4);
            insert into thang values(b-5);
		 else 
			 while (b>0) do
				insert into thang values(b);
                set b=b-1;
                set c=c+1;
             end while;
             
             while (a<=12) do
				insert into thang values(a);
                set a=a+1;
             end while;
        END if;
        
        select 
			thang.thang, So_Luong 
		from 
			(select 
				month(CreateDate) as thang, count(*) as So_Luong
			from
				Question 
			where 
				CreateDate > (SELECT SUBDATE(NOW(), INTERVAL 6 MONTH))
			group by
				month(CreateDate)
			) as bang_tam
			right join
			thang 
			on
			bang_tam.thang= thang.thang;
            
			drop table thang;
END$$
DELIMITER ;

call Thong_ke_cau_hoi_6_thang ();