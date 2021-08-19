USE sakila;

SELECT * -- a.first_name as Nombre, f.title as Titulo
FROM actor as a
LEFT JOIN film_actor as fa
ON a.actor_id = fa.actor_id
LEFT JOIN film as f
ON fa.film_id = f.film_id
WHERE f.title IS NULL;

SELECT  c.customer_id, c.first_name, c.last_name, c.email, sum(p.amount) as suma
FROM customer c
LEFT JOIN payment p
ON c.customer_id = p.customer_id
WHERE payment_date >= "20210101"
GROUP BY customer_id
HAVING customer_id > 1
ORDER BY suma DESC