use studenttest;
TRUNCATE TABLE students;
INSERT INTO students (email,created,modified)
VALUES ('test@gmail.com','2017-03-15 00:00:00.000','2017-03-20 00:00:00.000');

TRUNCATE TABLE klasses;
INSERT INTO klasses (name,semester,department,fee,created,modified)
VALUES ('test@gmail.com','2016-04-15 00:00:00.000','SCIENCE','122.20','2017-03-15 00:00:00.000','2017-03-20 00:00:00.000');