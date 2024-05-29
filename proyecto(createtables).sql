create table DescuentoLey(
      id_descuento  int  primary key,
      tipo_descuento VARCHAR(15),
	  porsentaje float
);

create table HorasTrabajadas(
     id_horasTrabajadas  int  primary key,
     hora_inicio time,
     hora_salida time
    
);
create table Salida(
      id_salida  int  primary key,
      tipo_salida VARCHAR(15)
);

create table Cargo(
      id_cargo  int  PRIMARY KEY,
      cargos_disponibles VARCHAR(25),
      salario FLOAT
);

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

create table ProcesoSeleccion(
      id_proceso  INT  PRIMARY KEY,
      funcion INT,
      FOREIGN KEY (funcion) REFERENCES Cargo (id_cargo)
);

create table ProcesoPersona(
       id_procesoPersona INT PRIMARY KEY,
       candidato INT,
       seleccion INT,
       FOREIGN KEY (candidato) REFERENCES Personas (id_persona),
       FOREIGN KEY (seleccion) REFERENCES ProcesoSeleccion (id_proceso)
);

create table Contrato(
      id_contrato  int  primary key,
      Tipo_contrato VARCHAR(25),
      fecha_inicio date,
      fecha_finalizacion date,
      empleado INT,
      FOREIGN KEY (empleado) REFERENCES ProcesoPersona ( id_procesoPersona)
);

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

create table Nomina(
       id_nomina  INT PRIMARY KEY,
       pagoNomina FLOAT,
       horasTrabajo INT,
       motivoSalida INT,
	   convenio INT,
       FOREIGN KEY (convenio) REFERENCES Contrato ( id_contrato),
       FOREIGN KEY (horasTrabajo) REFERENCES HorasTrabajadas ( id_horasTrabajadas),
       FOREIGN KEY (motivoSalida) REFERENCES Salida (id_salida )
);

create table Descuentos(
      id_descuentos int PRIMARY KEY,
	  descuentos INT,
	  nomina INT,
      FOREIGN KEY (nomina) REFERENCES Nomina ( id_nomina),
      FOREIGN KEY (descuentos) REFERENCES DescuentoLey ( id_descuento)
);