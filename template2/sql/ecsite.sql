-- 文字化け防止
set names utf8;
-- 外部キー制約(変更や消去できなくなること)を無視できる。
set foreign_key_checks=0;
-- もしあったらDBecsite33を消す。
drop database if exists ecsite33;

-- DBecsite33を作成する。
create database if not exists ecsite33;

-- ecsite33を使う。
use ecsite33;

-- もしあったら下記tableを消す。
drop table if exists login_user_transaction;

/* table作成(ユーザー情報)
 *  primary keyはそのデータを特定することで、行(login_id&login_passなど)を特定する列(id)のこと。(null不可)
 *  unique  primary keyと同様に重複をなくす。(null可)
 *  insert_dateは作成時の日付
 *  update_dateは更新時の最新日付
 */
create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);

drop table if exists item_info_transaction;
-- (商品情報)
create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime
);

drop table if exists user_buy_item_transaction;
-- (顧客購入情報)
create table user_buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
);
-- 商品情報の追加
INSERT INTO item_info_transaction(item_name,item_price,item_stock)VALUES("ノートBook",100,50);
-- ユーザー情報の追加
INSERT INTO login_user_transaction(login_id,login_pass,user_name)VALUES("internous","internous01","test");