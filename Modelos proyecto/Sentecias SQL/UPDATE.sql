use sakila;

SELECT * 
FROM payment
WHERE customer_id = 1;

UPDATE payment
SET payment_date = "2021-08-18", last_update = "2021-08-18"
WHERE customer_id = 2;

UPDATE payment
SET payment_date = "2021-08-18"
WHERE payment_id = 2;

SELECT * 
FROM payment
WHERE rental_id = 76;



