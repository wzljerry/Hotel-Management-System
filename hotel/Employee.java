package hotel;

import common.Account;

import java.util.Scanner;

//employees' operation when he/she log in the system
public class Employee extends Manage {


    public static final int SIZE = 20;
    Account[] account_list = new Account[SIZE];
    int count = 0;

    public int nameFind(String name)//find the account_table by name, return id;
    {
        int id = -1;
        for(int i = 0; i < count; i++)
        {
            if(account_list[i].getUsername() .equals(name))
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

        Account account = new Account(i,j,h,m);
        account_list[count] = account;
        count++;

        System.out.println("you have successfully add a client's account");



        //try {
            //Connection con = ConnectSQL.connectDB();
            //String sql = "insert into client_acc(client_id,client_name,client_acc,client_pas) values(?,?,?,?)";
            //PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setInt(1,i);
            //stmt.setString(2,j);
            //stmt.setInt(3,h);
            //stmt.setInt(4,m);
            //stmt.executeUpdate();
            //con.close();
            //System.out.println("you have successfully added a client's account");
        //}catch (SQLException se){
            //System.out.println(se);
       // }
    }
    // delete a client's account
    @Override
    public void deleteGust(){
        Account client1=new Account(1,"Jerry",1345,1234);
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the client's name?");
        String name = scan.next();
        int id = nameFind(name);
        if(id > -1)
        {
            for(int j = id; j<count-1; j++)
            {
                account_list[j]=account_list[j+1];
            }
            count --;
            System.out.println("you have successfully remove a client's account！");
        }
        else
        {
            System.out.println("nothing found, please try again");
        }
        //try {

            //Connection con = ConnectSQL.connectDB();
            //String sql = "delete from client_acc where client_name=?";
            //PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setString(1,i);
            //stmt.executeUpdate();
            //con.close();
            //System.out.println("you have successfully deleted a client's account");
        //}catch (SQLException se){
            //System.out.println(se);
       // };
    }

}
