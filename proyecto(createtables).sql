 create table DescuentoLey(
      id_descuento  int  primary key,
      tipo_descuento VARCHAR(15),
	  porsentaje float
);
select * from DescuentoLey;
DELETE FROM DescuentoLey;

INSERT INTO DescuentoLey (id_descuento, tipo_descuento, porsentaje) 
VALUES 
    (1, 'DESCUENTOS DE LEY', 0.09);
    


create table HorasTrabajadas(
    id_horasTrabajadas  int  primary key,
    horas_totales int,
	ID_CONTRATO INT,
    FOREIGN KEY (ID_CONTRATO) REFERENCES Contrato(id_contrato)
);
select * from HorasTrabajadas;
DROP TABLE  HorasTrabajadas;



create table Salida(
      id_salida  int  primary key,
      tipo_salida VARCHAR(15)
);
select * from Salida;

create table Cargo(
      id_cargo  int  PRIMARY KEY,
      cargos_disponibles VARCHAR(25),
      salario FLOAT
);


INSERT INTO Cargo (id_cargo, cargos_disponibles, salario) VALUES 
(1, 'Gerente de Tienda', 4500000.00), 
(2, 'Supervisor de Caja', 2000000.00), 
(3, 'Encargado de Inventario', 1800000.00), 
(4, 'Cajer@', 1600000.00), 
(5, 'Auxiliar de Bodega', 1550000.00);

create table Categoria(
       id_categoria int PRIMARY KEY,
       tipo VARCHAR(25)
);


create table Personas(
      id_persona  int  primary key,
      nombre_Completo VARCHAR(50),
      telefono VARCHAR(15),
      profesion VARCHAR(25),
      direccion VARCHAR(25),
      email VARCHAR(25),
      categoria INT,
      FOREIGN KEY (categoria) REFERENCES Categoria (id_categoria)
);
select * from Personas;

create table ProcesoSeleccion(
      id_proceso  INT  PRIMARY KEY,
      funcion INT,
      FOREIGN KEY (funcion) REFERENCES Cargo (id_cargo)
);

INSERT INTO ProcesoSeleccion (id_proceso, funcion)
VALUES 
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);

create table ProcesoPersona(
       id_procesoPersona INT PRIMARY KEY,
       candidato INT,
       seleccion INT,
       FOREIGN KEY (candidato) REFERENCES Personas (id_persona),
       FOREIGN KEY (seleccion) REFERENCES ProcesoSeleccion (id_proceso)
);

select * from ProcesoPersona;
delete  from ProcesoPersona;

create table Contrato(
      id_contrato  int  primary key,
      Tipo_contrato VARCHAR(25),
      fecha_inicio date,
      fecha_finalizacion VARCHAR(20),
      empleado INT,
      FOREIGN KEY (empleado) REFERENCES ProcesoPersona ( id_procesoPersona)
);
select * from Contrato;
delete from Contrato;
create table TerminacionContrato(
     id_terminacion  int  primary key,
     motivoTerminacion VARCHAR(50),
     pago_extra FLOAT,
     convenio INT,
     FOREIGN KEY (convenio) REFERENCES Contrato ( id_contrato)
);

create table Evaluacion(
      id_evaluacion  int  primary key,
      calificacion VARCHAR(15),
      convenio INT,
      FOREIGN KEY (convenio) REFERENCES Contrato ( id_contrato)
);
select * from Evaluacion;


create table Nomina(
       id_nomina  INT PRIMARY KEY,
       pagoNomina FLOAT,
       horasTrabajo INT,
       motivoSalida INT,
	   convenio INT,
       FOREIGN KEY (convenio) REFERENCES Contrato ( id_contrato),
       FOREIGN KEY (motivoSalida) REFERENCES Salida (id_salida )
);
select * from Nomina;

-- Primero, eliminamos la clave foránea de la tabla Nomina
ALTER TABLE Nomina
DROP CONSTRAINT horasTrabajo;
-- Consulta para verificar si la columna horasTrabajo en la tabla Nomina sigue siendo una clave foránea
-- Luego, cambiamos el tipo de datos de la columna horasTrabajo a INT
ALTER TABLE Nomina
ALTER COLUMN horasTrabajo SET DATA TYPE INT;

create table Descuentos(
      id_descuentos int PRIMARY KEY,
	  descuentos INT,
	  nomina INT,
      FOREIGN KEY (nomina) REFERENCES Nomina ( id_nomina),
      FOREIGN KEY (descuentos) REFERENCES DescuentoLey ( id_descuento)
);
Select * from Descuentos;