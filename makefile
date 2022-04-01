JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java


CLASSES = \
		ClientSystem.java \
		Pay.java \
		Manage.java \
		Employee.java \
		ConnectSQL.java \
		SystemOption.java \
		Manager.java \
        Booking.java \
        employeeSystem.java \
        Manage.java \
        Room.java \
        Account.java \
        ClientTable.java \
        ClientTable.java \
        Hotel.java \
        HotelImpl.java \
        Booking.java \
        ClientLogIn.java \
        ClientLogInOperation.java \
        ClientOperate.java \
        ClientSystem.java \
        ClientView.java \
        Dispatcher.java \
        EmployeeLogIn.java \
        EmployeeLogInOperation.java \
        EmployeeOperate.java \
        EmployeeView.java \
        FrontController.java \
        LogInInvoker.java \
        LogInOperation.java \
        LogInOption.java \
        ManagerLogIn.jaba \
        ManagerLogInOperation.java \
        ManagerOperate.java \
        ManagerSystem.java \
        ManagerView.java \
        Receiverclient.java \
        ReceiverEmployee.java \
        ReceiverManager.java \
        UserOperate.java \
        Operation.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
