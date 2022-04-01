import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Employee extends Manage{
    // add a client's account
    @Override
    public void addGust() {
        Scanner scan = new Scanner(System.in);

        System.out.println("You can add a client's account below");
        System.out.println("---------------------------------------");
        System.out.println("client's id");
        int i = scan.nextInt();

        System.out.println("What's the client's name?");
        String j = scan.next();

        System.out.println("What's the account?");
        int h = scan.nextInt() ;

        System.out.println("What's the password");
        int m = scan.nextInt();

        try {
            Connection con = ConnectSQL.connectDB();
            String sql = "insert into client_acc(client_id,client_name,client_acc,client_pas) values(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,i);
            stmt.setString(2,j);
            stmt.setInt(3,h);
            stmt.setInt(4,m);
            stmt.executeUpdate();
            con.close();
            System.out.println("you have successfully added a client's account");
        }catch (SQLException se){
            System.out.println(se);
        }
    }
    // delete a client's account
    @Override
    public void deleteGust(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the client's name?");
        String i = scan.next();
        try {

            Connection con = ConnectSQL.connectDB();
            String sql = "delete from client_acc where client_name=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,i);
            stmt.executeUpdate();
            con.close();
            System.out.println("you have successfully deleted a client's account");
        }catch (SQLException se){
            System.out.println(se);
        };
    }
}
