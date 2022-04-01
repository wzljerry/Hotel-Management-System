package hotel;

import java.util.Scanner;

// operations of a client
// client can choose what kind of operations by his/her input
public class ClientSystem implements SystemOption {
    Scanner scan = new Scanner(System.in);
    @Override
    public void operate(Scanner scan) {
        try {
            while (true) {
                System.out.println("1 book; 2 cancel; 3 modify; 4 display; 5 exit");
                int cs = scan.nextInt();
                switch (cs) {
                    case 1:
                        new Booking().reserveRoom();
                        break;
                    case 2:
                        new Booking().cancelRoom();
                        break;
                    case 3:
                        new Booking().modifiyRoom();
                        break;
                    case 4:
                        new Booking().browseRoomInfor();
                    case 5:
                        scan.close();
                        System.exit(0);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
