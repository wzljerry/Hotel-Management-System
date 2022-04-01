public class Account {
    private final int user_id;
    private final String user_name;
    private final int user_account;
    private final int user_password;

    public Account(int user_id, String user_name, int user_account, int user_password ) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_account = user_account;
        this.user_password = user_password;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }


    public int getUser_account() {
        return user_account;
    }

    public int getUser_password() {
        return user_password;
    }

}
