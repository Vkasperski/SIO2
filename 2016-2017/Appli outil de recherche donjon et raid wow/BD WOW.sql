CREATE DATABASE WOW

CREATE TABLE MODE
{
	id_mode int(1),
	nom_mode varchar(20),
};


CREATE TABLE DONJON
{
	id_donjon int(3),
	nom_donjon varchar(100),
	is_modes_exist boolean,
	lvl_Min_donjon int(3),
	lvl_Max_donjon int(3),
	Localisation_donjon varchar(50),
};


CREATE TABLE RAID
{
	
};

CREATE TABLE EXTENTION
{
	
};