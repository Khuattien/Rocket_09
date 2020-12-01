-- question 1
SELECT 
		a.`Name`, b.`Name` 
FROM
	countryregion a 
	RIGHT JOIN 
    stateprovince b 
    ON
	a.CountryRegionCode = b.CountryRegionCode;

-- c2


-- question 2
SELECT 
		a.`Name` as Provice, b.`Name` as Country
FROM
	stateprovince a
	LEFT JOIN 
    countryregion b 
    ON
	a.CountryRegionCode = b.CountryRegionCode
    WHERE 
    b.Name IN ('Germany', 'Canada');
	
-- question 3
-- khong thay BusinessEntityID
SELECT 
    a.SalesOrderID,
    a.OrderDate,
    a.SalesPersonID,
    b.Bonus,
    b.SalesYTD
FROM
    salesorderheader a
        LEFT JOIN
    salesperson b ON a.SalesPersonID = b.SalesPersonID;

-- question 4
