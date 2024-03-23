# JPA-Hibernate_OneToOneMapping
This project is used to demonstrate the mapping of two tables using JPA/Hibernate with @OneToOne mapping annotation.

For running this application, use spring boot version 3.2 and JAVA of version 17.
Create tables instructor and instructor_detail. For their columns, create according to column defination in entity class respectively.

In main application file(AdvanceMappingApplication), there are many methods created in commandLineRunner method.
These methods are used to demonstrate CRUD operation in both the tables.

This example not only demonstrate the joining of tables using **_@OneToOne_** mapping, but also shows the use of cascading.

**Cascading** is use to perform same operations in both the tables.

There are different types of cascading.

**All** -> it is use to perform all the CRUD operation which is perform on 1 table to be performed on the other table also.

**Remove** -> If delete operation is performed on 1 table, then it will also be performed on the other table.

**Persist** -> if save operation is performed on 1 table, then it will also be performed on the other table.

and many more..
