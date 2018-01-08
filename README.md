# AgendaJavaWeb(EnProceso)
aqui dejo los querys para las tablas y la base de datos con sus respectivas relaciones para que puedan ejecutar perfectamente la aplicacion

 crear la tabla usuario 

 create table usuario(usuarioId int not null primary key auto_increment, nombre varchar(50) not null ,apellido varchar(50) not null, correo varchar(50) not null, contraseña varchar(50) not null);
 
 create table contacto (contactoId int not null auto_increment primary key,usuario_Id int ,INDEX usuario_Id (usuario_Id),foreign key(usuario_id) references usuario(usuarioId), nombre varchar(50) not null, apellido varchar(50) not null, telefono varchar(50) not null, direccion varchar (150) not null ,fecha datetime not null, correo varchar (100) null , status int not null);