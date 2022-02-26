DROP DATABASE IF EXISTS banco;
CREATE DATABASE banco;

USE banco;

CREATE TABLE cliente(
	dni VARCHAR(10) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellidos VARCHAR(255) NOT NULL,
    fecha_nacimiento VARCHAR(255) DEFAULT "" NULL,
    PRIMARY KEY (dni)
);

 CREATE TABLE sucursal(
     id_sucursal INT NOT NULL AUTO_INCREMENT,
     direccion VARCHAR(75),
     PRIMARY KEY (id_sucursal)
 );

CREATE TABLE cuenta(
	id_cuenta INT NOT NULL AUTO_INCREMENT,
    numero_cuenta INT UNIQUE NOT NULL,
    dni_cuenta VARCHAR(10) NOT NULL,
    id_sucursal INT NOT NULL,
    saldo INT UNSIGNED DEFAULT "0",
    PRIMARY KEY (id_cuenta),
    FOREIGN KEY (id_sucursal) REFERENCES sucursal(id_sucursal) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (dni_cuenta) REFERENCES cliente(dni) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE movimientos(
    id_movimiento INT NOT NULL AUTO_INCREMENT,
    id_cuenta INT NOT NULL,
    fecha VARCHAR(25) DEFAULT "" NULL,
    cantidad INT NOT NULL,
    FOREIGN KEY (id_cuenta) REFERENCES cuenta(id_cuenta) ON DELETE CASCADE ON UPDATE CASCADE,
    PRIMARY KEY (id_movimiento)
);

INSERT INTO cliente VALUES ('000000A', 'Tomas', 'Rodriguez', '27/06/2000');
INSERT INTO cliente VALUES ('000000B', 'Juan', 'Mellado', '27/02/2003');
INSERT INTO cliente VALUES ('000000C', 'Helios', 'Gomez', '27/02/2001');
INSERT INTO cliente VALUES ('000000D', 'Rodrigo', 'Cumbreras', '21/04/2000');
INSERT INTO cliente VALUES ('000000E', 'Ana', 'Rodriguez', '27/01/2002');
INSERT INTO cliente VALUES ('000000F', 'María', 'Ibis', '27/02/1999');
INSERT INTO cliente VALUES ('000000G', 'Jorge', 'Puertas', '4/02/2000');
INSERT INTO cliente VALUES ('000000H', 'Pablo', 'Atienza', '1/04/1999');

INSERT INTO sucursal (direccion) VALUES ('Castellana 8');
INSERT INTO sucursal (direccion) VALUES ('Almendro 9');
INSERT INTO sucursal (direccion) VALUES ('Sagasta 24');
INSERT INTO sucursal (direccion) VALUES ('Rosales 2');
INSERT INTO sucursal (direccion) VALUES ('Princesa 11');
INSERT INTO sucursal (direccion) VALUES ('Ramales 8');
INSERT INTO sucursal (direccion) VALUES ('Veigar 122');

INSERT INTO cuenta (numero_cuenta, dni_cuenta, id_sucursal, saldo) VALUES ('6411111', '000000A', '1', '1500');
INSERT INTO cuenta (numero_cuenta, dni_cuenta, id_sucursal, saldo) VALUES ('6411112', '000000B', '2', '00');
INSERT INTO cuenta (numero_cuenta, dni_cuenta, id_sucursal, saldo) VALUES ('6411113', '000000C', '3', '150');
INSERT INTO cuenta (numero_cuenta, dni_cuenta, id_sucursal, saldo) VALUES ('6411114', '000000D', '4', '200');
INSERT INTO cuenta (numero_cuenta, dni_cuenta, id_sucursal, saldo) VALUES ('6411115', '000000E', '5', '15');
INSERT INTO cuenta (numero_cuenta, dni_cuenta, id_sucursal, saldo) VALUES ('6411116', '000000F', '1', '300');

INSERT INTO movimientos (id_cuenta, fecha, cantidad) VALUES ('1', '4/02/2020', '-100');
INSERT INTO movimientos (id_cuenta, fecha, cantidad) VALUES ('2', '8/02/2020', '50');
INSERT INTO movimientos (id_cuenta, fecha, cantidad) VALUES ('3', '8/03/2020', '70');
INSERT INTO movimientos (id_cuenta, fecha, cantidad) VALUES ('1', '8/04/2020', '80');
INSERT INTO movimientos (id_cuenta, fecha, cantidad) VALUES ('5', '8/05/2020', '500');
INSERT INTO movimientos (id_cuenta, fecha, cantidad) VALUES ('4', '8/06/2020', '-75');

