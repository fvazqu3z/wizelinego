CREATE TABLE IF NOT EXISTS customer(customerId INT PRIMARY KEY,name varchar ,lastName varchar ,email varchar ,phone varchar ,secundaryPhone varchar ,password varchar ,userLastModification int,lastModificationDate date,status boolean);

Insert Into customer(customerId,name,lastName,email,phone,secundaryPhone,password,userLastModification,lastModificationDate,status)
Select 1,'fernando','sanchez garcia','fernando@hotmail.com','3333333333','3333333333','12345',1,now(),1;

Insert Into customer(customerId,name,lastName,email,phone,secundaryPhone,password,userLastModification,lastModificationDate,status)
Select 2,'virginia azucena','rodriguez vizcarra','viciky@hotmail.com','3333333333','3333333333','12345',1,now(),1;

Insert Into customer(customerId,name,lastName,email,phone,secundaryPhone,password,userLastModification,lastModificationDate,status)
Select 3,'ana martha','garcia valverde','ana@hotmail.com','3333333333','3333333333','12345',1,now(),1;

Insert Into customer(customerId,name,lastName,email,phone,secundaryPhone,password,userLastModification,lastModificationDate,status)
Select 4,'alejandro','gonzalez rubio','alex@hotmail.com','3333333333','3333333333','12345',1,now(),1;

Insert Into customer(customerId,name,lastName,email,phone,secundaryPhone,password,userLastModification,lastModificationDate,status)
Select 5,'yessica','gomez ascensio','yessica@hotmail.com','3333333333','3333333333','12345',1,now(),1;
