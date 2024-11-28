use login_register;


create table `users`(
`username` varchar(50) not null,
`password` varchar(50) not null,
`enabled` tinyint not null,
primary key(`username`))engine=InnoDB default charset=latin1;

insert into users values 
('john@1','{noop}test123',1),
('mary@1','{noop}test123',1),
('susan@1','{noop}test123',1);

create table authorities(
username varchar(50) not null,
authority varchar(50) not null,
unique key authorities_idx_1 (username,authority),
constraint authorities_ibfx_1
foreign key(username) references users(username))engine=InnoDB default charset=latin1;

insert into authorities values
('john@1','ROLE_CUSTOMER'),
('mary@1','ROLE_CUSTOMER'),
('susan@1','ROLE_CUSTOMER'),
('susan@1','ROLE_ADMIN'),
('john@1','ROLE_SELLER');





