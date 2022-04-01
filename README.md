# Hotel-Management-System
This a hotel reservation management system.

# Project Description

__I mainly added three design patterns to this revision, and modified the previous authorization pattern and front-end controller pattern.  I added more than ten new classes to manage user login and subsequent operations, while keeping the same results as before.__

I have designed separate systems for employees, administrators and customers that need to be accessed by selecting and authorizing them at login to use the relevant functions. In the client system, clients can book rooms, modify orders, cancel orders, pay for rooms, etc. In the employee system, employees can add clients' accounts and update room information (this feature is still under design); in the manager system, managers can manage employees' and clients' accounts and update room information.

All the codes work well on my computer, but I'm not sure whether they can run well on yours.  I also provide a zip package contains all my codes, if the jar file can't work, you can try that file. For the details of the system, you can check the report.



## common

In my previous verithion of the code, I used SQL to store and operate the data, while in this version of my code, I put the data related class into package common. And  I create an interface Hotel.java and its implementation HotelImpl.java.

1. Account.java contains the information of users' accounts and passwords.

2. Room.java includes the data of the room, such as bed's information, price.

3. ClientTable.java provide the methods to access the information of the orders.



## hotel

In package hotel, there is class named RemoteAccount.java in order to connect the remote server. And other classes detatiled as below:

1. Booking.java provides four functions, i.e., browse the room information, reserve a room, cancel an order and modify an order.

2. Pay.java provides two functions, i.e., pay early without additional fees and pay within 24 hours with additional fees. (This class hasen't completely finished)

3. SystemOpthin.java is an interface defines the operations based on different system operators. ClientSystem.java is for client, employeeSystem.java is for employees, and ManagerSystem.java is for the manager of the hotel.

4. Manage.java is an interface for employees and  manager, which provides some methods for them to manage the system. Employee.java and Manager.java implements Manage.java to do the concrete things.

5. LogIn.java provides the log in methods, which operates the SQL, and only the registered users can use the system.

6. ConnectSQL.java is used to connect MySQL, account and password are required.

7. Hotel.sql is the scripts of the database which composed by 6 tables: client_acc(clients' account), manager_acc(manager's account), employee_account (employee's account), client_tbl (clients' basic information which will be recorded by the system), room_tbl (information about the rooms)

8. ClientView.java, EmployeeView.java, ManagerView.java, FrontController.java, and Dispatcher.java are the classes corresponding to front controller patten.

9.  UserOperate.java, ClientOperate.java, ManagerOperate.java and EmployeeOperate.java are the classes of template patten.

10. ClientLogIn.java, ManagerLogIn.java, EmployeeLogIn.java, LogInInvoker.java, LogInOption.java, Receiverclient.java, ReceiverManager.java, ReceiverEmployee.java are the classes of command patten.

11. LogInOperation.java, ClientLogInOperation.java, EmployeeLogInOperation.java and ManagerLogInOperation.java are the classes of factory patten.

     



## client

Operation.java  provides the operation method for clients to use the online system.



## MAKEFILE

This file provides the compile process.



## Report



It is a detailed report for this system, including examples, workflow and class descriptions.

