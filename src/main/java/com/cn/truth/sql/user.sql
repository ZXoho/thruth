create table user_info(
user_openid varchar(32) not null,
user_point integer default 0,
user_address varchar(128),
primary key(user_openid)
)