DROP TABLE IF EXISTS Employee;

CREATE TABLE Employee(emp_id INT PRIMARY KEY, EMP_NAME VARCHAR(255),department VARCHAR(25),age INT, gender VARCHAR(25));

INSERT INTO Employee (emp_id, EMP_NAME, department,age,gender) VALUES
  (1, 'Anand', 'CSE',35,'M'),
  (2, 'Anjali', 'MECH',41,'F'),     
  (3, 'Binod', 'CSE',45,'M');    