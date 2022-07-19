create
database if not exists spring_db character set utf8;
use
spring_db;
create table if not exists tbl_account
(
    id
    int
    primary
    key
    auto_increment,
    name
    varchar
(
    20
),
    money double
    );
insert into tbl_account
values (null, 'Tom', 1000);
insert into tbl_account
values (null, 'Jerry', 1000);