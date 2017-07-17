DROP DATABASE IF EXISTS db_test;
CREATE DATABASE db_test;

# user table
DROP TABLE IF EXISTS db_test.user;
CREATE TABLE db_test.user (
  id       INT AUTO_INCREMENT PRIMARY KEY
  COMMENT 'PK',
  username VARCHAR(191) NOT NULL UNIQUE
  COMMENT '用户名',
  password VARCHAR(255) NOT NULL
  COMMENT '密码'
)
  COMMENT '用户表';

# book table
DROP TABLE IF EXISTS db_test.book;
CREATE TABLE db_test.book (
  id     INT AUTO_INCREMENT PRIMARY KEY
  COMMENT 'PK',
  title  VARCHAR(255)  NOT NULL
  COMMENT '书名',
  author VARCHAR(255)  NOT NULL
  COMMENT '作者',
  date   DATE          NOT NULL
  COMMENT '日期',
  price  DECIMAL(6, 2) NOT NULL
  COMMENT '定价'
)
  COMMENT '图书表';

TRUNCATE TABLE db_test.user;

SELECT *
FROM db_test.user;

SELECT *
FROM db_test.book;