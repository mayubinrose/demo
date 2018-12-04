
create table t_user(
  id int(11) not null,
  username varchar(10) not null,
  phone varchar(11) not null,
  password varchar(50) not null,
  primary key (id)
);

create table t_entrytime(
  id int auto_increment not null,
  face_id varchar(11) not null,
  entry_time varchar (10) not null,
  user_id int(10) not null,
  primary key (id)
);
insert into t_entrytime values ('1','1',"2018-10-22","1");
insert into t_entrytime values ('2','2',"2018-10-22","1");
insert into t_entrytime values ('3','3',"2018-10-21","1");
insert into t_entrytime values ('4','4',"2018-10-22","1");
insert into t_entrytime values ('5','5',"2018-10-23","1");
insert into t_entrytime values ('6','6',"2018-01-23","1");
insert into t_entrytime values ('7','7',"2018-02-23","1");
insert into t_entrytime values ('8','1',"2018-10-22","1");
create table t_facefeature(
  face_id varchar(20) not null,
  sex int(2) not null,
  age int(5) not null,
  primary key(face_id)
);
#1男，2女
insert into t_facefeature values ('1',"1","22");
insert into t_facefeature values ('2',"2","22");
insert into t_facefeature values ('3',"1","22");
insert into t_facefeature values ('4',"2","22");
insert into t_facefeature values ('5',"1","22");
insert into t_facefeature values ('6',"2","25");
insert into t_facefeature values ('7',"1","26");
#性别分析
select sex, count(*) from t_facefeature a ,(select face_id  from t_entrytime where user_id="1" and  str_to_date("2018-9-12", '%Y-%m-%d')<= str_to_date(entry_time, '%Y-%m-%d') and str_to_date("2018-10-23", '%Y-%m-%d') >= str_to_date(entry_time, '%Y-%m-%d')) b where a.face_id = b.face_id group by sex;
select * from t_facefeature where face_id in (
select face_id from t_entrytime where user_id="1" and  str_to_date("2018-9-12", '%Y-%m-%d')<= str_to_date(entry_time, '%Y-%m-%d') and str_to_date("2018-10-23", '%Y-%m-%d') >= str_to_date(entry_time, '%Y-%m-%d')
);
) group by sex