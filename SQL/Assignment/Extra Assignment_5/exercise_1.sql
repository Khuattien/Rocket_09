
drop database if exists Assignment_4;
create database Assignment_4;
use Assignment_4;
create table Employee
(
	EmployeeID int primary key,
    EmployeeLastName varchar(50),
    EmployeeFirstName varchar(50),
    EmployeeHireDate datetime,
    EmployeeStatus tinyint,
    SupervisorID int ,
    SocialSecurityNumber int
);
drop table if exists Projects;
create table Projects
(
	ProjectID int primary key,
    managerID int,
    ProjectName varchar(100),
    ProjectStartDate datetime,
    ProjectDescription varchar(255),
    ProjectDetailt varchar(255),
    ProjectCompletedOn datetime
);

drop table if exists Project_Modules;
create table Project_Modules
(
	ModuleID int  primary key,
    ProjectID int,
    ProjectModulesDate datetime,
    ProjectModulesCompledOn datetime,
    ProjectModulesDescription varchar(255),
    constraint foreign key(ProjectID)
    references Projects(ProjectID) ON DELETE CASCADE
);

drop table if exists Work_Done;
create table Work_Done
(
	WorkDoneID int primary key,
    EmployeeID int,
    ModuleID int,
    WorkDoneDate datetime,
    WorkDoneDescription varchar(255),
    WorkDoneStatus tinyint,
    constraint foreign key(EmployeeID)
    references Employee(EmployeeID) ON DELETE CASCADE,
    constraint foreign key(ModuleID)
    references Project_Modules(ModuleID) ON DELETE CASCADE
);

drop trigger if exists check_project_module;
delimiter $$
create trigger check_project_module
before insert on Project_Modules
for each row
begin
	if(new.ProjectModulesDate < (	select 
										ProjectStartDate 
									from 
										Projects a
                                        join
                                        Project_Modules b
                                        on 
                                        a.ProjectID = b.ProjectID
								)
		or new.ProjectModulesCompledOn  >  (	select 
													ProjectCompletedOn
												from 
													Projects a
													join
													Project_Modules b
													on 
													a.ProjectID = b.ProjectID
								)
	) then
		signal sqlstate '12345'
        set message_text ='Project_Modules.ProjectModulesDate < Projects.ProjectStartDate or Project_Modules.ProjectModulesCompletedOn > Projects.ProjectCompletedOn';
    end if ;
end $$
delimiter ;

