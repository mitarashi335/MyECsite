set names utf8;
set foreign_key_checks=0;
drop database if exists logindb_sasako12;
create database if not exists logindb_sasako12;
use logindb_sasako12;

drop table if exists user;
create table user(
id int,
user_name varchar(255),
password varchar(255)
);
insert into user values(1,"internous","123");
insert into user values(2,"sasako","335");
insert into user values(3,"hanzo","789");
