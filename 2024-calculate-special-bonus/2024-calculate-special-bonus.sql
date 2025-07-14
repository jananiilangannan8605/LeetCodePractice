# Write your MySQL query statement below
-- select emeployee_id case when left(name,1)='M'  and employee_id%2=0 then 0 else salary END as bonus
-- from Employees;
SELECT 
    employee_id,
    CASE 
        WHEN employee_id % 2 = 0 OR LEFT(name, 1) = 'M' THEN 0 
        ELSE salary 
    END AS bonus
FROM Employees
ORDER BY employee_id;
