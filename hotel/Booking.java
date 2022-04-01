package hotel;
import common.ClientTable;
import common.Room;

import java.util.Scanner;

//  behaviours of clients, suck as booking, modifying/canceling orders.
public class Booking {
    public static final int SIZE = 20;
    ClientTable[] client_list = new ClientTable[SIZE];
    int count = 0;
    Pay pay = new Pay();
    Room room_1 = new Room(1,"medium","large",1,150,0);
    Room room_2 = new Room(2,"large","small",2,200,1);
    Room room_3 = new Room(3,"small","large",3,250,0);

    // display the available rooms

    //public void printAllRoom(){
        //for (int i =0;i< 3;i++){
        //System.out.println(roomlist[i].getRoom_id() + "room_type：" + roomlist[i].getRoom_type() + " bed_type：" + roomlist[i].getBed_type() + " bed_num：" + roomlist[i].getBed_num() + "room_rate:" + roomlist[i].getRoom_rate() + "room_smoking:" + roomlist[i].getRoom_smoking());
        //}
    //}

    //System.out.println(room_1);



    //clients can see the information of rooms
    public void browseRoomInfor(){

        System.out.println("room_id:"+room_1.getRoom_id() + "room_type：" + room_1.getRoom_type() + " bed_type：" + room_1.getBed_type() + " bed_num：" + room_1.getBed_num() + "room_rate:" + room_1.getRoom_rate() + "room_smoking:" + room_1.getRoom_smoking());
        System.out.println("room_id:"+room_2.getRoom_id() + "room_type：" + room_2.getRoom_type() + " bed_type：" + room_2.getBed_type() + " bed_num：" + room_2.getBed_num() + "room_rate:" + room_2.getRoom_rate() + "room_smoking:" + room_2.getRoom_smoking());
        System.out.println("room_id:"+room_3.getRoom_id() + "room_type：" + room_3.getRoom_type() + " bed_type：" + room_3.getBed_type() + " bed_num：" + room_3.getBed_num() + "room_rate:" + room_3.getRoom_rate() + "room_smoking:" + room_3.getRoom_smoking());

        //try {
            //Connection con = ConnectSQL.connectDB();
            //Statement stmt = null;
            //ResultSet rs = null;
            //stmt = con.createStatement();
            //String sql = "SELECT * FROM room_tbl";
            //rs = stmt.executeQuery(sql);

            // show the data
            //while (rs.next()) {
                //System.out.print("room_id: " + rs.getInt("room_id"));
                //System.out.print(", room_type: " + rs.getString("room_type"));
               // System.out.print(", bed_num: " + rs.getString("bed_num"));
            //    System.out.print(", bed_type: " + rs.getString("bed_type"));
              //  System.out.print(", room_smoking: " + rs.getString("room_smoking"));
            //    System.out.print("\n");
           // }
      //  }catch(SQLException se){
              //  System.out.println(se);
          //  };
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

        System.out.println("what's your id");
        int g = scan.nextInt();

        System.out.println("How old are you?");
        int m = scan.nextInt();

        System.out.println("What's your phone number?");
        int n = scan.nextInt();

        System.out.println("How many nights will you stay?");
        int l = scan.nextInt();

        ClientTable client_table = new ClientTable(g,j,k,h,i,l,m,n);
        client_list[count] = client_table;
        count++;

        System.out.println("you have successfully reserved a room");
        pay.earlyPay();
        //try {
            //Connection con = ConnectSQL.connectDB();
            //String sql = "insert into client_tbl(client_id,client_name,client_address,client_credit,client_room,client_night,client_age,client_phone) values(?,?,?,?,?,?,?,?)";
            //PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setInt(1,3);
            //stmt.setString(2,j);
            //stmt.setString(3,k);
            //stmt.setInt(4,h);
            //stmt.setInt(5,i);
            //stmt.setInt(6,l);
            //stmt.setInt(7,m);
            //stmt.setInt(8,n);
            //stmt.executeUpdate();
            //con.close();
            //System.out.println("you have successfully reserved a room");
            //pay.earlyPay();
        //}catch (SQLException se){
            //System.out.println(se);
        //}
    }

    // cancel an order
    public void cancelRoom(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scan.next();
        int id = nameFind(name);
        if(id > -1)
        {
            for(int j = id; j<count-1; j++)
            {
                client_list[j]=client_list[j+1];
            }
            count --;
            System.out.println("success！");
        }
        else
        {
            System.out.println("nothing found, please try again");
        }
        //try {

            //Connection con = ConnectSQL.connectDB();
            //String sql = "delete from client_tbl where client_name=?";
            //PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setString(1,i);
            //stmt.executeUpdate();
           // con.close();
            //System.out.println("you have successfully canceled an order");
            //pay.latePay();
        //}catch (SQLException se){
            //System.out.println(se);
        };

    // modify an order
    public void modifiyRoom(){
        Scanner scan = new Scanner(System.in);
        System.out.println("You can change your order now");
        System.out.println("What's your name?");
        String name = scan.next();

        int id = nameFind(name);

        if(id >0){
            System.out.println("old name"+client_list[id].getClient_name()+"what are you going to change (name)?");
            String str = scan.next();

            System.out.println("Which room do you chose? 1 room 1; 2 room 2; 3 room 3; 4 exit");
            int i = scan.nextInt();

            System.out.println("Where are you from?");
            String k = scan.next() ;

            System.out.println("What's your credit card number?");
            int h = scan.nextInt() ;

            System.out.println("what's your id");
            int g = scan.nextInt();

            System.out.println("How old are you?");
            int m = scan.nextInt();

            System.out.println("What's your phone number?");
            int n = scan.nextInt();

            System.out.println("How many nights will you stay?");
            int l = scan.nextInt();

            ClientTable client_table = new ClientTable(g,str,k,h,i,l,m,n);

            System.out.println("you have successfully modified your order");
            pay.latePay();

        }

        //System.out.println("How many nights are you going to stay?");
        //int i = scan.nextInt();



        //try {
            //Connection con = ConnectSQL.connectDB();
           // String sql = "UPDATE client_tbl SET client_night = ? where client_name=?";
            //PreparedStatement stmt = con.prepareStatement(sql);
           // stmt.setInt(1,i);
            //stmt.setString(2,j);
            //stmt.executeUpdate();
            //con.close();
            //System.out.println("you have successfully modified your order");
           // pay.latePay();
        //}catch (SQLException se){
            //System.out.println(se);
        //};
    }



    //find the client_table by name, return id;
    public int nameFind(String name)
    {
        int id = -1;
        for(int i = 0; i < count; i++)
        {
            if(client_list[i].getClient_name() .equals(name))
            {
                id = i;
                break;
            }
            else if(i<count)
                continue;
            else
            {
                System.out.println("nothing found, please try again");
                break;
            }
        }
        return id;
    }
}
