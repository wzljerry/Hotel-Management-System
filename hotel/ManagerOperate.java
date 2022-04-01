package hotel;

// manager's operations, first log in and then do some operations
class ManagerOperate extends UserOperate {
    public void UserLogin(){
        //LogInOption log = new ManagerLogIn();
        LogInOperation log = new ManagerLogInOperation();
        LogInInvoker ml = new LogInInvoker(log.userLogIn());
        System.out.println("welcome to the manager page");

        ml.call();
    }

    public void UserOperation(){
        ManagerSystem ma = new ManagerSystem();
        SystemInvoker mi = new SystemInvoker(ma);
        //System.out.println("welcome to the manager page");
        System.out.println("Now you can do the following operations");

        mi.call();
    }
}
