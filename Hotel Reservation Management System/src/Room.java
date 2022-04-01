public class Room {
    //basic attributes
    private String  roomType;
    private double roomRate;
    private double roomNumber;
    private int roomBedNumber;
    private String roomBedType;
    private int roomSmoking;
    private int roomAvaliability;

    public int getRoomAvaliability() {

        return roomAvaliability;
    }

    public void setRoomAvaliability(int roomAvaliability) {

        this.roomAvaliability = roomAvaliability;
    }

    public int getRoomSmoking() {

        return roomSmoking;
    }


    public void setRoomSmoking(int roomSmoking) {
        this.roomSmoking = roomSmoking;
    }
//setter and getter


    public String getRoomBedType() {
        return roomBedType;
    }

    public void setRoomBedType(String roomBedType) {
        this.roomBedType = roomBedType;
    }

    public int getRoomBedNumber() {
        return roomBedNumber;
    }

    public void setRoomBedNumber(int roomBedNumber) {
        this.roomBedNumber = roomBedNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(double roomRate) {
        this.roomRate = roomRate;
    }

    public double getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(double roomNumber) {
        this.roomNumber = roomNumber;
    }


}
