-- 1. User Upcoming Events
SELECT e.title, e.city, e.start_date
FROM Events e
JOIN Registrations r ON e.event_id = r.event_id
JOIN Users u ON r.user_id = u.user_id
WHERE e.status = 'upcoming' AND u.city = e.city
ORDER BY e.start_date;

-- 2. Top Rated Events
SELECT e.title, AVG(f.rating) as avg_rating
FROM Events e
JOIN Feedback f ON e.event_id = f.event_id
GROUP BY e.event_id
HAVING COUNT(f.feedback_id) >= 10

-- 3. Inactive Users
SELECT u.full_name, u.email
FROM Users u
WHERE u.user_id NOT IN (
    SELECT r.user_id FROM Registrations r
    WHERE r.registration_date >= DATE_SUB(CURDATE(), INTERVAL 90 DAY)
);

-- 4. Peak Session Hours
SELECT event_id, COUNT(*) as session_count
FROM Sessions
WHERE HOUR(start_time) >= 10 AND HOUR(start_time) < 12
GROUP BY event_id;

-- 5. Most Active Cities
SELECT u.city, COUNT(DISTINCT r.user_id) as total_registrations
FROM Users u
JOIN Registrations r ON u.user_id = r.user_id
GROUP BY u.city
ORDER BY total_registrations DESC
LIMIT 5;

-- 6. Second Highest Salary (PYQ)
SELECT salary FROM employee
ORDER BY salary DESC
LIMIT 1 OFFSET 1;

-- 7. Employee Count Per Department (PYQ)
SELECT department, COUNT(*) as emp_count
FROM employee
GROUP BY department;

-- 8. LEFT JOIN Bonus (PYQ)
SELECT e.name, b.bonus
FROM employee e
LEFT JOIN bonus b ON e.id = b.emp_id
WHERE b.bonus < 1000 OR b.bonus IS NULL;
