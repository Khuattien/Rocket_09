DROP DATABASE IF EXISTS exercise_3;
CREATE DATABASE exercise_3;
USE exercise_3;

CREATE TABLE Infor
(
	ID 				INT AUTO_INCREMENT PRIMARY KEY,
    `Name`			VARCHAR(20),
    BirthDate		Date,
    Gender 			ENUM('0','1','NULL'),
    IsDeletedFlag	ENUM('0','1')
);