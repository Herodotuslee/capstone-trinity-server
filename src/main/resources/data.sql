

insert into project values(101,'Some quick example text to build on the card title and make up the bulk of the cards content.','2019-01-20','IEEE','Project name1','2019-02-20');
insert into project values(102,'Some quick example text to build on the card title and make up the bulk of the cards content.','2019-01-20','IEEE1','Project name1','2019-01-27');
insert into project values(103,'Some quick example text to build on the card title and make up the bulk of the cards content.','2019-01-20','IEEE2','Project name1','2019-02-20');
insert into project values(104,'Some quick example text to build on the card title and make up the bulk of the cards content.','2019-03-20','IEEE3','Project name1','2019-04-20');
insert into project values(105,'Some quick example text to build on the card title and make up the bulk of the cards content.','2019-01-20','IEEE4','Project name1','2019-01-21');
insert into backlog values(101,0,'IEEE',101);
insert into backlog values(102,0,'IEEE1',102);
insert into backlog values(103,0,'IEEE2',103);
insert into backlog values(104,0,'IEEE3',104);
insert into backlog values(105,0,'IEEE4',105);

-- private Long id;
--     private String projectSequence;
--
--     private String name;
--     private String note;
--     private String status;
--     private Integer priority;
--     private Date dueDate;
--     private Backlog backlog;
--
--     private String projectIdentifier;

insert into project_task (id,due_date,name,note,priority,important,project_identifier,project_sequence,status,backlog_id) values(101,'2019-01-01','ProjectTask Styling','Note',1,true,'IEEE','IEEE-1','TODO',101);
insert into project_task (id,due_date,name,note,priority,important,project_identifier,project_sequence,status,backlog_id) values(102,'2019-01-01','Calender ','havent start',1,true,'IEEE','IEEE-1','TODO',101);
insert into project_task (id,due_date,name,note,priority,important,project_identifier,project_sequence,status,backlog_id) values(103,'2019-01-01','User','Hard',2,false,'IEEE','IEEE-1','DOING',101);
insert into project_task (id,due_date,name,note,priority,important,project_identifier,project_sequence,status,backlog_id) values(104,'2019-01-01','NAME','Note',3,false,'IEEE','IEEE-1','DOING',101);
insert into project_task (id,due_date,name,note,priority,important,project_identifier,project_sequence,status,backlog_id) values(105,'2019-01-01','NAME','Note',2,true,'IEEE','IEEE-1','DOING',101);
insert into project_task (id,due_date,name,note,priority,important,project_identifier,project_sequence,status,backlog_id) values(106,'2019-02-01','NAME','Note',2,false,'IEEE','IEEE-1','TODO',101);
insert into project_task (id,due_date,name,note,priority,important,project_identifier,project_sequence,status,backlog_id) values(107,'2018-03-01','NAME','Note',1,true,'IEEE','IEEE-1','DONE',102);
insert into project_task (id,due_date,name,note,priority,important,project_identifier,project_sequence,status,backlog_id) values(108,'2018-04-01','CMU 231','Note',1,false,'IEEE','IEEE-1','DONE',102);
insert into project_task (id,due_date,name,note,priority,important,project_identifier,project_sequence,status,backlog_id) values(109,'2018-05-04','Learn Spring boot','its hard',1,true,'IEEE','IEEE-1','DONE',102);
insert into project_task (id,due_date,name,note,priority,important,project_identifier,project_sequence,status,backlog_id) values(110,'2018-06-20','IBM OA','PASS',2,true,'IEEE','IEEE-1','DONE',101);
insert into project_task (id,due_date,name,note,priority,important,project_identifier,project_sequence,status,backlog_id) values(111,'2018-07-20','AMEX OA','PASS',2,false,'IEEE','IEEE-1','TODO',101);
insert into project_task (id,due_date,name,note,priority,important,project_identifier,project_sequence,status,backlog_id) values(112,'2018-03-28','Angular','Note',1,true,'IEEE','IEEE-1','DONE',102);
insert into project_task (id,due_date,name,note,priority,important,project_identifier,project_sequence,status,backlog_id) values(113,'2018-04-02','Java','Note',1,true,'IEEE','IEEE-1','DONE',102);
insert into project_task (id,due_date,name,note,priority,important,project_identifier,project_sequence,status,backlog_id) values(114,'2018-12-25','OOP','Note',1,true,'IEEE','IEEE-1','DONE',102);

insert into expense values(101,1,200,'2019-01-01','note');
insert into expense values(102,2,400,'2019-01-01','note');
insert into expense values(103,3,220,'2019-01-01','note');
insert into expense values(104,4,120,'2019-01-01','note');
insert into expense values(105,5,250,'2019-01-01','note');
insert into expense values(106,6,300,'2019-01-01','note');
insert into expense values(107,5,200,'2019-01-01','note');
insert into expense values(108,1,200,'2019-02-01','note');
insert into expense values(109,2,300,'2019-02-01','note');
insert into expense values(110,3,200,'2019-02-01','note');
insert into expense values(111,4,240,'2019-02-01','note');
insert into expense values(112,5,200,'2019-03-01','note');
insert into expense values(113,6,250,'2019-03-01','note');
insert into expense values(114,5,200,'2019-03-01','note');
insert into expense values(115,1,200,'2019-03-01','note');
insert into expense values(116,2,450,'2019-03-01','note');
insert into expense values(117,3,200,'2019-04-01','note');
insert into expense values(118,4,260,'2019-04-01','note');
insert into expense values(119,5,230,'2019-04-01','note');
insert into expense values(120,6,240,'2019-05-01','note');
insert into expense values(121,5,260,'2019-05-01','note');
insert into expense values(122,1,200,'2019-05-01','note');
insert into expense values(123,2,430,'2019-05-01','note');
insert into expense values(124,3,230,'2019-06-01','note');
insert into expense values(125,4,230,'2019-06-01','note');
insert into expense values(126,5,200,'2019-06-01','note');
insert into expense values(127,3,230,'2019-07-01','note');
insert into expense values(128,5,200,'2019-07-01','note');
insert into expense values(129,6,230,'2019-08-01','note');
insert into expense values(130,5,200,'2019-08-01','note');
insert into expense values(131,2,330,'2019-09-01','note');
insert into expense values(132,5,200,'2019-09-01','note');
insert into expense values(133,4,240,'2019-10-01','note');
insert into expense values(134,4,200,'2019-10-01','note');
insert into expense values(135,3,300,'2019-11-01','note');
insert into expense values(136,5,240,'2019-11-01','note');
insert into expense values(137,3,200,'2019-12-01','note');
insert into expense values(138,6,300,'2019-12-01','note');
insert into expense values(139,5,200,'2019-12-01','note');
insert into expense values(140,4,100,'2019-12-01','note');
insert into expense values(141,5,100,'2019-12-01','note');
insert into expense values(142,6,240,'2019-12-01','note');
insert into expense values(143,5,200,'2019-12-01','note');
insert into expense values(144,5,200,'2019-11-01','note');
insert into expense values(145,4,200,'2019-08-01','note');
insert into expense values(146,4,500,'2019-10-01','note');
insert into expense values(147,3,200,'2019-06-01','note');
insert into expense values(148,2,240,'2019-07-01','note');
insert into expense values(149,5,200,'2019-09-01','note');
-- insert into project_task values(103,'crit','2019-01-01',1,'IEEE','IEEE-1','TO-DO','summary','101');
-- insert into project_task values(104,'crit','2019-01-01',1,'IEEE','IEEE-1','TO-DO','summary','101');