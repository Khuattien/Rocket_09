-- question 1
select 
	`Name`
from
	product
where 
	productsubcategoryID = (select
									productsubcategoryID
							from 	
									productsubcategory
							where 
									`Name` = 'Saddles'
							);
                            
-- question 2
select 
	`Name`
from
	product
where 
	ProductSubcategoryID IN (select
									ProductSubcategoryID
							from 	
									productsubcategory
							where 
									`Name` like 'Bo%'
							);

-- question 3
select 
		`Name`
from
		product
where 
		ListPrice= (select 
						min(ListPrice)
					from
						product
					where
						productsubcategoryID = ( select 
													productsubcategoryID
												from
													productsubcategory
												where 
													`Name`='Touring Bikes'
												)
					);

		