import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
/*
/This class is used to log in.
 */
public class LogIn {
    // clients log in
    public void clientLogIn() {
        Scanner scan = new Scanner(System.in);
        System.out.println("If you have an account already, you can log in directly");
        System.out.println("If you don't have an account, you should contact the employee to add an account");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Please input your account");
        int i = scan.nextInt();
        System.out.println("Please input your password");
        int j = scan.nextInt();

        try {
            Connection con = ConnectSQL.connectDB();
            String sql = "select * from client_acc where client_acc=? and client_pas=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, i);
            stmt.setInt(2, j);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                System.out.println("success!");
            }else{
                System.out.println("fail!");
                System.exit(0);
            }
            con.close();

        } catch (SQLException se) {
            System.out.println(se);
        }
    }
    // employee log in
    public void employeeLogIn() {
        Scanner scan = new Scanner(System.in);
        System.out.println("If you have an account already, you can log in directly");
        System.out.println("If you don't have an account, you should contact the employee to add an account");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Please input your account");
        int i = scan.nextInt();
        System.out.println("Please input your password");
        int j = scan.nextInt();

        try {
            Connection con = ConnectSQL.connectDB();
            String sql = "select * from employee_acc where employee_acc=? and employee_pas=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, i);
            stmt.setInt(2, j);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                System.out.println("success!");
            }else{
                System.out.println("fail!");
                System.exit(0);
            }
            con.close();

        } catch (SQLException se) {
            System.out.println(se);
        }
    }
    //manager logs in
    public void managerLogIn() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your account");
        int i = scan.nextInt();
        System.out.println("Please input your password");
        int j = scan.nextInt();

        try {
            Connection con = ConnectSQL.connectDB();
            String sql = "select * from manager_acc where manager_acc=? and manager_pas=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, i);
            stmt.setInt(2, j);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                System.out.println("success!");
            }else{
                System.out.println("fail!");
                System.exit(0);
            }
            con.close();

        } catch (SQLException se) {
            System.out.println(se);
        }
    }
}

