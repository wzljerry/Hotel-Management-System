
-- DROP TABLE IF EXISTS ;
-- -------------------------
-- -create table for room
-- -------------------------
create table room_tbl(
    room_id INT NOT NULL AUTO_INCREMENT,
    room_type VARCHAR(100) NOT NULL,
    bed_type VARCHAR(100) NOT NULL,
    bed_num INT NOT NULL,
    room_rate INT NOT NULL,
    room_smoking int NOT NULL,
    PRIMARY KEY ( room_id )
);

-- -------------------------
-- -create table for client
-- -------------------------
create table client_tbl(
                         client_id INT NOT NULL AUTO_INCREMENT,
                         client_name VARCHAR(100) NOT NULL,
                         client_address VARCHAR(100) NOT NULL,
                         client_credit INT NOT NULL,
                         client_room INT NOT NULL,
                         client_night INT NOT NULL,
                         client_age INT NOT NULL,
                         client_phone INT NOT NULL,
                         PRIMARY KEY ( client_id )
);


-- -------------------------
-- -create table for employee account
-- -------------------------

create table employee_acc(
                           employee_id INT NOT NULL AUTO_INCREMENT,
                           employee_name VARCHAR(100) NOT NULL,
                           employee_acc INT NOT NULL,
                           employee_pas INT NOT NULL,
                           PRIMARY KEY (employee_id )
);
-- -------------------------
-- -create table for client account
-- -------------------------

create table client_acc(
                             client_id INT NOT NULL AUTO_INCREMENT,
                             client_name VARCHAR(100) NOT NULL,
                             client_acc INT NOT NULL,
                             client_pas INT NOT NULL,
                             PRIMARY KEY (client_id )
);

-- -------------------------
-- -create table for manager account
-- -------------------------

create table manager_acc(
                           manager_id INT NOT NULL AUTO_INCREMENT,
                           manager_name VARCHAR(100) NOT NULL,
                           manager_acc INT NOT NULL,
                           manager_pas INT NOT NULL,
                           PRIMARY KEY (manager_id )
);

-- basic information-------
insert room_tbl values('2','medium','small','1','150','0');
insert room_tbl values('3','small','small','1','100','1');

insert client_tbl values('1','Jerry','LA','123','1','2','34','123');
insert client_tbl values('2','Tim','IN','123','2','2','24','124');

insert manager_acc values('1','Bob','1234','1234');

insert client_acc values('1','Jerry','1345','1234');

insert employee_acc values('1','Marry','1244','1234');
insert employee_acc values('2','Lisa','1245','1234');







