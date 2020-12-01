USE  testing_system_assignment_1;

-- question 1:  Tạo view có chứa danh sách nhân viên thuộc phòng ban sale

CREATE VIEW NV_Sale
AS
SELECT 
		AccountID, FullName
FROM
		`Account`
WHERE
		DepartmentID = (SELECT 
							DepartmentID
						FROM
							Department a
						WHERE
							a.DepartmentName = 'Sale');

-- question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất

CREATE VIEW Acc_group
AS
SELECT 
	a.AccountID, a.Email, a.UserName, a.FullName, a.DepartmentID, a.PositionID, a.CreateDate, count(*) AS So_group_tham_gia
FROM
	`Account` a 
    left join
    GroupAccount b
    ON 
    a.AccountID = b.AccountID
GROUP BY
	a.AccountID
HAVING
	count(*) = (SELECT 
					MAX(ds)
				FROM	
					( SELECT 
							COUNT(*) AS ds
						FROM
							GroupAccount
						GROUP BY
							AccountID
					) AS BANG_TAM
				);
                
-- question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 ki tu được coi là quá dài) và xóa nó đi
-- ??
SELECT 
    QuestionID, Content
FROM
    Question
WHERE
    CHAR_LENGTH(Content) > 300;

-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
CREATE VIEW DS
AS
SELECT 
	*
FROM
	Department 
WHERE
	DepartmentID IN (	SELECT
							DepartmentID
						FROM
							`Account` 
						GROUP BY
							DepartmentID
						HAVING
							COUNT(*) = ( SELECT 
												MAX(DS)
										FROM
												(SELECT 
														COUNT(*) AS DS
                                                FROM
														`Account`
												GROUP BY
														DepartmentID
												) AS BANG_TAM
										)
						);
							
-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
-- ko có tên của người tạo câu hỏi chỉ có id người tạo