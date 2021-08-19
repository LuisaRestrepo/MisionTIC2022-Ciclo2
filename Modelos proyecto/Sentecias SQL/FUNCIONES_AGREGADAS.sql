use sakila;

SELECT * FROM payment;

SELECT count(*) as pagos, 
sum(amount) as suma,
avg(amount) as promedio,
min(amount) as minimo,
max(amount) as maximo
FROM payment
WHERE payment_date BETWEEN "20120101"AND "20210818";