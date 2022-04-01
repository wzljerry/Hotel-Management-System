package common;

public class Room {
    private int room_id;
    private String room_type;
    private String bed_type;
    private int bed_num;
    private int room_rate;
    private int room_smoking;

    public Room(int room_id,String room_type,String bed_type,int bed_num,int room_rate,int room_smoking) {
        this.room_id = room_id;
        this.bed_num= bed_num;
        this.room_smoking=room_smoking;
        this.bed_type=bed_type;
        this.room_rate=room_rate;
        this.room_type=room_type;
    }

    public void setRoom(int room_id,String room_type,String bed_type,int bed_num,int room_rate,int room_smoking){
        this.room_id = room_id;
        this.bed_num= bed_num;
        this.room_smoking=room_smoking;
        this.bed_type=bed_type;
        this.room_rate=room_rate;
        this.room_type=room_type;
    }

    public int getRoom_id() {
        return room_id;
    }



    public String getRoom_type() {
        return room_type;
    }



    public String getBed_type() {
        return bed_type;
    }



    public int getBed_num() {
        return bed_num;
    }



    public int getRoom_rate() {
        return room_rate;
    }


    public int getRoom_smoking() {
        return room_smoking;
    }

}
