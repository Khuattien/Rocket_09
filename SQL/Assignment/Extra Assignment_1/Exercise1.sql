DROP DATABASE IF EXISTS Exercise_1;
CREATE DATABASE Exercise_1;
USE Exercise_1;

DROP TABLE IF EXISTS TRAINEE;
CREATE TABLE Trainee 
(
	Trainee_Id		INT AUTO_INCREMENT PRIMARY KEY,
    Full_Name		VARCHAR(20),
    Birth_Date		DATE,
    Gender 			ENUM('male', 'female','unknown'),
    ET_IQ 			TINYINT UNSIGNED,
    ET_Gmath		TINYINT UNSIGNED,
    ET_English		TINYINT UNSIGNED,
    Training_Class	VARCHAR(10),
    Evaluation_Note	VARCHAR(100)
);

ALTER TABLE Trainee 
ADD COLUMN VTI_Account	VARCHAR(20) NOT NULL UNIQUE;

