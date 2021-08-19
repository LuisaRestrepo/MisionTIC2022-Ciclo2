use sakila;

SELECT * FROM customer;

INSERT INTO customer
(store_id,first_name,last_name,address_id,active,create_date)
VALUES (1,"IVAN","BERNAL",570,1,"20210818"),
 (1,"SANTIAGO","GUZMAN",570,1,"20210818");

SELECT * 
FROM customer
ORDER BY customer_id DESC;

SELECT * 
FROM customer
WHERE email IS NULL;


