use sakila;
-- comentario
SELECT * FROM customer;
SELECT first_name, last_name, email FROM customer;
SELECT first_name, last_name, email FROM customer;

SELECT first_name, last_name, email 
FROM customer
LIMIT 10;

SELECT first_name, last_name, email, active
FROM customer
WHERE active = 0
LIMIT 10;