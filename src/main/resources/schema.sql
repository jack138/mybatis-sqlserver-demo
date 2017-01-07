if object_id('test') is null
  CREATE TABLE test
   (id int IDENTITY,
    col2 varchar(50),
    col3 int);
