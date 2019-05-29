set names utf8;
set foreign_key_checks=0;
drop database if exists logindb_sasako2;
create database logindb_sasako2;
use logindb_sasako2;

drop table if exists user;
create table user(
id int not null primary key,
user_name varchar(255),
password varchar(255)
);

INSERT INTO user VALUES
(1,"sasako","123"),
(2,"innta","456"),
(3,"nousu","789");
