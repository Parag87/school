use studenttest;
TRUNCATE TABLE students;
INSERT INTO students (email,created,modified)
VALUES ('test@gmail.com','2017-03-15 00:00:00.000','2017-03-20 00:00:00.000');

TRUNCATE TABLE klasses;
INSERT INTO klasses (name,semester,department,fee,created,modified)
VALUES ('Compozed','2016-04-15 00:00:00.000','SCIENCE','122.20','2017-03-15 00:00:00.000','2017-03-20 00:00:00.000');
INSERT INTO klasses (name,semester,department,fee,created,modified)
VALUES ('Engineering','2016-04-15 00:00:00.000','SCIENCE','122.20','2017-03-15 00:00:00.000','2017-03-20 00:00:00.000');
INSERT INTO klasses (name,semester,department,fee,created,modified)
VALUES ('Science','2016-04-15 00:00:00.000','SCIENCE','122.20','2017-03-15 00:00:00.000','2017-03-20 00:00:00.000');

TRUNCATE TABLE teachers;
INSERT INTO teachers (name,age,gender)
VALUES ('Teacher1',40,'M');
INSERT INTO teachers (name,age,gender)
VALUES ('Teacher2',30,'F');
INSERT INTO teachers (name,age,gender)
VALUES ('Teacher3',25,'M');
INSERT INTO teachers (name,age,gender)
VALUES ('Teacher4',60,'M');


TRUNCATE TABLE klassmapping;
INSERT INTO klassmapping (teacherid,klassid)
VALUES(4,1);

INSERT INTO klassmapping (teacherid,klassid)
VALUES(2,1);


INSERT INTO klassmapping (teacherid,klassid)
VALUES(2,2);

INSERT INTO klassmapping (teacherid,klassid)
VALUES(3,1);

INSERT INTO klassmapping (teacherid,klassid)
VALUES(3,2);

INSERT INTO klassmapping (teacherid,klassid)
VALUES(3,3);

