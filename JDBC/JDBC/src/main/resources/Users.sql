CREATE TABLE IF NOT EXISTS USERS (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);
truncate table USERS;
insert into USERS (name) values ('Mehdi');
insert into USERS (name) values ('CEO');