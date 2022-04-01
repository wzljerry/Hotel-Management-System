import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import javax.swing.JComboBox;
import java.util.Scanner;


public class Booking {
    Pay pay = new Pay();

    // display the available rooms
    public void browseRoomInfor(){
        try {
            Connection con = ConnectSQL.connectDB();
            Statement stmt = null;
            ResultSet rs = null;
            stmt = con.createStatement();
            String sql = "SELECT * FROM room_tbl";
            rs = stmt.executeQuery(sql);

            // show the data
            while (rs.next()) {
                System.out.print("room_id: " + rs.getInt("room_id"));
                System.out.print(", room_type: " + rs.getString("room_type"));
                System.out.print(", bed_num: " + rs.getString("bed_num"));
                System.out.print(", bed_type: " + rs.getString("bed_type"));
                System.out.print(", room_smoking: " + rs.getString("room_smoking"));
                System.out.print("\n");
            }
        }catch(SQLException se){
                System.out.println(se);
            };
    };

    // book a room
    public void reserveRoom(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Which room do you chose? 1 room 1; 2 room 2; 3 room 3; 4 exit");
        int i = scan.nextInt();

        System.out.println("What's your name?");
        String j = scan.next();

        System.out.println("Where are you from?");
        String k = scan.next() ;

        System.out.println("What's your credit card number?");
        int h = scan.nextInt() ;

        System.out.println("How old are you?");
        int m = scan.nextInt();

        System.out.println("What's your phone number?");
        int n = scan.nextInt();

        System.out.println("How many nights will you stay?");
        int l = scan.nextInt();
        try {
            Connection con = ConnectSQL.connectDB();
            String sql = "insert into client_tbl(client_id,client_name,client_address,client_credit,client_room,client_night,client_age,client_phone) values(?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,3);
            stmt.setString(2,j);
            stmt.setString(3,k);
            stmt.setInt(4,h);
            stmt.setInt(5,i);
            stmt.setInt(6,l);
            stmt.setInt(7,m);
            stmt.setInt(8,n);
            stmt.executeUpdate();
            con.close();
            System.out.println("you have successfully reserved a room");
            pay.earlyPay();
        }catch (SQLException se){
            System.out.println(se);
        }
    }

    // cancel an order
    public void cancelRoom(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?");
        String i = scan.next();
        try {

            Connection con = ConnectSQL.connectDB();
            String sql = "delete from client_tbl where client_name=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,i);
            stmt.executeUpdate();
            con.close();
            System.out.println("you have successfully canceled an order");
            pay.latePay();
        }catch (SQLException se){
            System.out.println(se);
        };
    }

    // modify an order
    public void modifiyRoom(){
        Scanner scan = new Scanner(System.in);
        System.out.println("You can only modify the nights you want to stay by now");
        System.out.println("What's your name?");
        String j = scan.next();
        System.out.println("How many nights are you going to stay?");
        int i = scan.nextInt();
        try {
            Connection con = ConnectSQL.connectDB();
            String sql = "UPDATE client_tbl SET client_night = ? where client_name=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,i);
            stmt.setString(2,j);
            stmt.executeUpdate();
            con.close();
            System.out.println("you have successfully modified your order");
            pay.latePay();
        }catch (SQLException se){
            System.out.println(se);
        };
    }
}
