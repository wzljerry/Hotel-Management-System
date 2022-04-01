package common;

public class ClientTable {
    private int client_id;
    private String client_name;
    private String client_address;
    private int client_credit;
    private int client_room;
    private int client_night;
    private int client_age;
    private int client_phone;

    public ClientTable(int client_id,String client_name, String client_address,
                       int client_credit,int client_room,int client_night,
                       int client_age,int client_phone) {

        this.client_id = client_id;
        this.client_name=client_name;
        this.client_address=client_address;
        this.client_age=client_age;
        this.client_credit=client_credit;
        this.client_room=client_room;
        this.client_night=client_night;
        this.client_phone=client_phone;

    }

    public void setClientTable(int client_id,String client_name, String client_address,
                               int client_credit,int client_room,int client_night,
                               int client_age,int client_phone){
        this.client_id = client_id;
        this.client_name=client_name;
        this.client_address=client_address;
        this.client_age=client_age;
        this.client_credit=client_credit;
        this.client_room=client_room;
        this.client_night=client_night;
        this.client_phone=client_phone;
    }

    public int getClient_id() {
        return client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public String getClient_address() {
        return client_address;
    }

    public int getClient_credit() {
        return client_credit;
    }

    public int getClient_room() {
        return client_room;
    }

    public int getClient_night() {
        return client_night;
    }

    public int getClient_age() {
        return client_age;
    }

    public int getClient_phone() {
        return client_phone;
    }
}
