create table diary(
                      id int not null primary key auto_increment,
                      weather varchar(50) not null,
                      icon varchar(50) not null,
                      temperature double not null,
                      text varchar(50) null,
                      date Date not null
)