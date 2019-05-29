set names utf8;
set foreign_key_checks=0;
drop database if exists loginpradb_sasako;
create database if not exists loginpradb_sasako;
use loginpradb_sasako;

drop table if exists user;

create table if not exists user(
id int,
user_name varchar(255) ,
password varchar(255)
);

insert into user values(1,"sasako","123");