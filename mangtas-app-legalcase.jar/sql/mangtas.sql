[getEtracsUser]
SELECT * FROM sys_user
WHERE name LIKE $P{searchtext} 
ORDER BY lastname