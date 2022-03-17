create table local_user (
    `id` int primary key auto_increment,
    `name` varchar(50) not null,
    `password` varchar(200)
);