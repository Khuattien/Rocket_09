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
                      
-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo trước 1 năm trước

drop trigger if exists check_group;
delimiter $$
create trigger check_group
before insert on `Group`
for each row
begin
	if(new.CreateDate < date(now()-interval 1 year ))
    then
		signal sqlstate '12345'
        set message_text='không cho phép người dùng nhập vào Group có ngày tạo trước 1 năm trước';
	end if;
end $$
delimiter ;

-- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào
-- department "Sale" nữa, khi thêm thì hiện ra thông báo "Department "Sale" cannot add more user"

drop trigger if exists `Account`;
delimiter $$
create trigger `Account`
before insert on `Account`
for each row
begin
	if( new.DepartmentID = (
							select 
								DepartmentID
							from
								Department
							where 
								DepartmentName='Sale'
							)
    )
    then
		signal sqlstate '12345'
        set message_text='Department "Sale" cannot add more user';
	end if;
end $$
delimiter ;

-- Question 3: Cấu hình 1 group có nhiều nhất là 5 user
drop trigger if exists max_user_group;
delimiter $$
create trigger max_user_group
before insert on GroupAccount
for each row
begin
	if(
		(
			select 
				count(*)
			from
                GroupAccount 
			where 
				GroupID= new.GroupID
         ) >= 5
    ) 
    then
		signal sqlstate '12345'
        set message_text='Toi da 5 nv trong 1 group';
	end if;
end $$
delimiter ;

-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question
drop trigger if exists max_exam_question;
delimiter $$
create trigger  max_exam_question
before insert on ExamQuestion
for each row
begin
	if(
		(
			select 
				count(*)
			from
                ExamQuestion
			where 
				ExamID= new.ExamID
         ) >= 10
    ) 
    then
		signal sqlstate '12345'
        set message_text='Toi da 10 question trong 1 group';
	end if;
end $$
delimiter ;

-- Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là admin@gmail.com (đây là tài khoản admin, không cho phép user xóa),
-- còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông tin liên quan tới user đó

drop trigger if exists delete_account;
delimiter $$
create trigger  delete_account
before delete on `account`
for each row
begin
	if( old.Email = 'admin@gmail.com'
    ) 
    then
		signal sqlstate '12345'
        set message_text='đây là tài khoản admin, không cho phép user xóa';
	else
		delete
        from 
			GroupAccount
		where
			AccountID= old.AccountID;
	end if;
end $$
delimiter ;



