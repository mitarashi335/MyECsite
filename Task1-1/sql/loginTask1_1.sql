set names utf8;
set foreign_key_checks=0;
drop database if exists logindb_14;
create database if not exists logindb_14;
use logindb_14;

drop table if exists user;
create table user(
id int,
user_name varchar(255),
password varchar(255)
);

insert into user values
(1,"qaz","147"),
(2,"wsx","258"),
(3,"edc","369");