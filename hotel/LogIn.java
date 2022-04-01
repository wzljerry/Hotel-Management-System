package hotel;

import common.Account;

import java.util.Scanner;
/*
/This class is used to log in.
 */
public class LogIn {
    // clients log in
    public void clientLogIn() {
        Account client1 = new Account(1,"Jerry",1234,1234);
        Scanner scan = new Scanner(System.in);
        System.out.println("If you have an account already, you can log in directly");
        System.out.println("If you don't have an account, you should contact the employee to add an account");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Please input your account (1234)");
        int i = scan.nextInt();
        System.out.println("Please input your password (1234)");
        int j = scan.nextInt();
        if (i==client1.getAccount()&j==client1.getPassword()){
            System.out.println("Success");
        }else{
            System.out.println("please try again");
        }


        //try {
          //  Connection con = ConnectSQL.connectDB();
            //String sql = "select * from client_acc where client_acc=? and client_pas=?";
            //PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setInt(1, i);
            //stmt.setInt(2, j);
            //ResultSet rs = stmt.executeQuery();

            //if(rs.next()){
                //System.out.println("success!");
            //}else{
                //System.out.println("fail!");
                //System.exit(0);
            //}
            //con.close();

        //} catch (SQLException se) {
            //System.out.println(se);
        //}
    }
    // employee log in
    public void employeeLogIn() {
        Account employee1=new Account(1,"Bob",1235,1235);
        Scanner scan = new Scanner(System.in);
        System.out.println("If you have an account already, you can log in directly");
        System.out.println("If you don't have an account, you should contact the employee to add an account");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Please input your account (1235)");
        int i = scan.nextInt();
        System.out.println("Please input your password (1235)");
        int j = scan.nextInt();
        if(i==employee1.getAccount()&j==employee1.getPassword()){
            System.out.println("Success");

        }else {
            System.out.println("please try again");
        }




        //try {
            //Connection con = ConnectSQL.connectDB();
            //String sql = "select * from employee_acc where employee_acc=? and employee_pas=?";
            //PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setInt(1, i);
            //stmt.setInt(2, j);
            //ResultSet rs = stmt.executeQuery();

            //if(rs.next()){
                //System.out.println("success!");
            //}else{
                //System.out.println("fail!");
                //System.exit(0);
            //}
            //con.close();

        //} catch (SQLException se) {
           // System.out.println(se);
        //}
    }
    //manager logs in
    public void managerLogIn() {
        Account manager1 = new Account(1,"Tom",1236,1236);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your account (1236)");
        int i = scan.nextInt();
        System.out.println("Please input your password (1236)");
        int j = scan.nextInt();

        if(i==manager1.getAccount()&j==manager1.getPassword()){
            System.out.println("Success");
        }else{
            System.out.println("please try again");
        }


        //try {
            //Connection con = ConnectSQL.connectDB();
            //String sql = "select * from manager_acc where manager_acc=? and manager_pas=?";
            //PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setInt(1, i);
            //stmt.setInt(2, j);
            //ResultSet rs = stmt.executeQuery();

            //if(rs.next()){
                //System.out.println("success!");
            //}else{
                //System.out.println("fail!");
                //System.exit(0);
            //}
            //con.close();

        //} catch (SQLException se) {
            //System.out.println(se);
       // }
    }

    //public void userLogIn(){
        //LogIn login = new LogIn();
        //SystemOption clientOperate = new ClientSystem();
        //SystemOption managerOperate = new ManagerSystem();
        //SystemOption employeeOperate = new employeeSystem();

        //try {
            //Scanner scan = new Scanner(System.in);
            //while (true){
                //System.out.println("Welcome to our hotel!");
                //System.out.println("Who are you? 1 client; 2 manager; 3 employee; 4 exit");
                //int i = scan.nextInt();
                //switch (i){
                    //case 1:
                        //System.out.println("Welcome to client system");
                        //System.out.println("-------------------------------------------");
                        //clientLogIn();
                        //System.out.println("-------------------------------------------");
                        //System.out.println("Now you can do the following operations");
                        //clientOperate.operate(scan);
                        ////clientSystem(scan);
                        //break;
                    //case 2:
                        //System.out.println("Welcome to manager system");
                        //System.out.println("-------------------------------------------");
                        //managerLogIn();
                        //System.out.println("-------------------------------------------");
                        //System.out.println("Now you can do the following operations");
                        //managerOperate.operate(scan);
                        ////managerSystem(scan);
                        //break;
                    //case 3:
                        //System.out.println("Welcome to employee system");
                        //System.out.println("-------------------------------------------");
                        //employeeLogIn();
                        //System.out.println("-------------------------------------------");
                        //System.out.println("Now you can do the following operations");
                        //employeeOperate.operate(scan);
                       // //employeeSystem(scan);
                        //break;
                    //case 4:
                        //scan.close();
                        //System.exit(0);
                //}

           // }

       // }catch (Exception e){
           // System.out.println("Exception:"+e);
       // }

   // }

}

