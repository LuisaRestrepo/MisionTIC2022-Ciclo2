use sakila;
-- comentario
SELECT * FROM customer;
SELECT first_name, last_name, email FROM customer;

SELECT first_name, last_name, email 
FROM customer
LIMIT 10;

SELECT first_name, last_name, email, active
FROM customer
WHERE active = 0
LIMIT 10;

SELECT first_name, last_name, email, active
FROM customer
WHERE active = 1 OR address_id = 5
LIMIT 10;

SELECT first_name, last_name, email, active
FROM customer
WHERE first_name LIKE 'A%';

SELECT first_name, last_name, email, active
FROM customer
WHERE first_name NOT LIKE 'A%';

SELECT first_name, last_name, email, active
FROM customer
WHERE first_name IN ("LISA","MARY");

SELECT first_name, last_name, email, active
FROM customer
WHERE first_name NOT IN ("LISA","MARY");

SELECT * 
FROM payment
WHERE amount != 4.99;

SELECT * 
FROM payment
WHERE amount BETWEEN 2 AND 4.99;
