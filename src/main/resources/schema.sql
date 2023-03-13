DROP TABLE IF EXISTS member;

create table member (
                       id BigInt not null auto_increment,
                       name varchar(100) not null
);

INSERT INTO member(id, name) VALUES (1, 'name1');