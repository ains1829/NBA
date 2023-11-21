create database nba ;
create table equipe(
    idequipe serial primary key ,
    name_equipe varchar(55)
);
create table joueur(
    idjoueur serial primary key ,
    namejoueur varchar(55) ,
    numerojoueur varchar(55) ,
    idequipe int references equipe(idequipe) 
);
create table match(
    idmatch serial primary key ,
    stade varchar(55) ,
    idequipe1 int references equipe(idequipe) ,
    idequipe2 int references equipe(idequipe) 
);
create table stat(
    idstat serial primary key ,
    idmatch int references match (idmatch) ,
    idequipe int references equipe (idequipe) ,
    idjoueur int references joueur(idjoueur),
    points int default 0,
    passd int default 0 ,
    threepoints int default 0,
    rebonds int default 0,
    datestat timestamp 
);