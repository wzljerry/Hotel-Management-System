package common;

public class Account {
    private int userid;
    private String username;
    private int account;
    private int password;

    public Account(int userid,String username,int account,int password) {
        this.userid = userid;
        this.account=account;
        this.password=password;
        this.username=username;
    }
    public void setAccount(int userid,String username,int account,int password){
        this.userid = userid;
        this.account=account;
        this.password=password;
        this.username=username;
    }

    public int getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public int getAccount() {
        return account;
    }

    public int getPassword() {
        return password;
    }

}
