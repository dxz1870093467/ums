--创建数据库
drop table if exists ums_db;
create database ums_db character set 'utf8mb4';
user ums_db;

--创建用户表
drop table if exists sys_user;
create table  sys_user(
    id int (10) not null auto_increment comment'主键',
    name varchar (100) not null comment'姓名',
    cellphone varchar(100) not null comment'手机号码',
    idCard varchar (100) not null comment'省份证',
    email varchar (100) not null comment'电子邮件',
    status int (2) not null comment'状态 0-禁用 1-启用',
    createTime timestamp not null default CURRENT_TIMESTAMP comment '创建时间',
    updateTime timestamp not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '修改时间',
    primary key (id)
) Engine=InnoDB charset='utf8mb4'comment'用户表单';