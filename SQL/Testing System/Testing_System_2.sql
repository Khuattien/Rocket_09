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
    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
    FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID)
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
	CONSTRAINT FOREIGN KEY(GroupID) REFERENCES `Group`(GroupID),
    CONSTRAINT FOREIGN KEY(AccountID) REFERENCES `Account`(AccountID)
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
    CONSTRAINT FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion(CategoryID),
    CONSTRAINT FOREIGN KEY(TypeID) REFERENCES TypeQuestion(TypeID)
);

-- table 9
DROP TABLE IF EXISTS Answer;
CREATE TABLE Answer
(
	AnswerID		INT AUTO_INCREMENT PRIMARY KEY,
    Content			VARCHAR(100),
    QuestionID		INT,
    isCorrect		VARCHAR(10),
    CONSTRAINT FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID)
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
    CONSTRAINT FOREIGN KEY(ExamID) REFERENCES Exam(ExamID),
    CONSTRAINT FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID)
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

-- Question 1: lấy ra tất cả các phòng ban
select
	* 
from 
	Department;

-- Question 2: lấy ra id của phòng ban có tên là "Sale"
select 
	DepartmentID 
from 
	Department 
where 
	DepartmentName = 'Sale';

-- Question 3: lấy ra thông tin account có full name dài nhất
select * from `Account` where char_length(FullName) = (select max(char_length(FullName)) from `Account`);

-- Question 4: Lấy ra tên group đã tham gia trước ngày 20/12/2019
select GroupName from `Group` where (CreateDate < '2019-12-20');

-- Question 5: Lấy ra ID của question có >= 4 câu trả lời
select 
	b.QuestionID, count(*)
from
	Question a inner join Answer b on a.QuestionID = b.QuestionID
group by 
	b.QuestionID
having 
	 count(*) >= 4;
    
-- Question 6: Lấy ra 5 group được tạo gần đây nhất
select 
	*
from
	`Group`
order by CreateDate desc
limit 5;

-- Question 8: Xóa tất cả các exam được tạo trước ngày 20/12/2019
-- ??
delete from 
	Exam 
where
	CreateDate > '2019-12-20';
    
-- Question 9: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và  email thành
update 
	`Account`
set
	FullName='Nguyễn Bá Lộc',
    Email= 'loc.nguyenba@vti.com.vn'

where
	AccountID=5;

-- Question 10: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ

select 
	a.AccountID, a.DepartmentID, b.DepartmentName
from
	`Account` a join Department b on a.DepartmentID = b.DepartmentID;

-- Question 11: Viết lệnh để lấy ra tất cả các developer 
select 
	*
from 
	Position
where 
	PositionName = 'Dev';

-- Question 12: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên

select 
	b.DepartmentID, b.DepartmentName, count(*) as So_nhan_vien
from
	Account a join Department b on a.DepartmentID = b.DepartmentID
group by
	DepartmentID
having
	count(*)>0;

-- Question 13: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất

select 	
	a.QuestionID, a.Content, count(*) as so_lan_dung
from 
	Question a join  ExamQuestion b on a.QuestionID = b.QuestionID
group by 
	b.QuestionID
having 
	count(*)=(	select 
					max(ds)
				from
					( select 	
						count(*) as ds
					from 
						Question a join  ExamQuestion b on a.QuestionID = b.QuestionID
					group by 
						b.QuestionID 
					) as bang_tam
				);
    
-- Question 14: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question

select
	b.CategoryID, count(*) as so_lan_dung
from
	CategoryQuestion a join Question b on a.CategoryID = b.CategoryID
group by 
	b.CategoryID;
    
-- Question 15: Lấy ra Question có nhiều câu trả lời nhất

select 
	b.QuestionID, a.Content, count(*) as so_cau_tra_loi
from
	Question a join Answer b on a.QuestionID= b.QuestionID
group by
	AnswerID
having
	so_cau_tra_loi=(select 	
						max(so_cau_tra_loi)
					from
                    ( 	select 
							count(*) as so_cau_tra_loi
						from
							Question a join Answer b on a.QuestionID= b.QuestionID
						group by
							AnswerID
					) as bang_tam
				);

-- Question 16: Tìm chức vụ có ít người nhất 
-- ??
select 
	PositionName, count(*) as so_nguoi
from
	Position a join `Account` b on a.PositionID = b.PositionID
group by
	a.PositionID
having
	so_nguoi =(	select 
					max(so_nguoi)
				from
				( select 
					count(*) as so_nguoi
				from
					Position a join `Account` b on a.PositionID = b.PositionID
				group by
					a.PositionID
				) as bang_tam
			);


-- Question 17: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM 
select
	a.DepartmentID, a.DepartmentName, count(*) as so_nhan_vien
from
	Department a join `Account` b on a.DepartmentID= b.DepartmentID  join Position c on c.PositionID = b.PositionID
group by 
	c.PositionID, a.DepartmentID, a.DepartmentName;


-- Question 18: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, 
-- loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …

select 
	* 
from
	Question a join CategoryQuestion b on a.CategoryID = b.CategoryID
				join TypeQuestion c on a.TypeID = c.TypeID;


-- Question 19: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
select 
	TypeName, count(*) as so_luong
from
	Question a 	join TypeQuestion b on a.TypeID = b.TypeID
group by
	TypeName;
	



