
import java.util.Scanner;

public class Operation {

    public static void main(String[] args) {
        LogIn login = new LogIn();
        try {
            Scanner scan = new Scanner(System.in);
            while (true){
                System.out.println("Who are you? 1 client; 2 manager; 3 employee; 4 exit");
                int i = scan.nextInt();
                switch (i){
                    case 1:
                        System.out.println("Welcome to client system");
                        System.out.println("-------------------------------------------");
                        login.clientLogIn();
                        System.out.println("-------------------------------------------");
                        System.out.println("Now you can do the following operations");
                        clientSystem(scan);
                        break;
                    case 2:
                        System.out.println("Welcome to manager system");
                        System.out.println("-------------------------------------------");
                        login.managerLogIn();
                        System.out.println("-------------------------------------------");
                        System.out.println("Now you can do the following operations");
                        managerSystem(scan);
                        break;
                    case 3:
                        System.out.println("Welcome to employee system");
                        System.out.println("-------------------------------------------");
                        login.employeeLogIn();
                        System.out.println("-------------------------------------------");
                        System.out.println("Now you can do the following operations");
                        employeeSystem(scan);
                        break;
                    case 4:
                        scan.close();
                        System.exit(0);
                }

            }

        }catch (Exception e){
            System.out.println("Exception:"+e);
        }
    }

    // system for client
    public static void clientSystem(Scanner scan){
        while (true){
            System.out.println("1 book; 2 cancel; 3 modify; 4 display; 5 exit");
            int cs = scan.nextInt();
            switch (cs){
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

    }
    //system for manager
    public static void managerSystem(Scanner scan){

        while (true){
            System.out.println("1 add manager's account; 2 remove manager's account; 3 add client's account 4 remove client's account");
            int ms = scan.nextInt();
            scan.nextLine();
            switch (ms){
                case 1:
                    new Manager().addAdm();
                    break;
                case 2:
                    new Manager().deleteAdm();
                    break;
                case 3:
                    new Manager().addGust();
                    break;
                case 4:
                    new Manager().deleteGust();

            }
        }

    }
    //system for employee
    public static void employeeSystem(Scanner scan){
        while (true){
            System.out.println("1 add client's account; 2 delete client's account");
            int ms = scan.nextInt();
            scan.nextLine();
            switch (ms){
                case 1:
                    new Employee().addGust();
                    break;
                case 2:
                    new Employee().deleteGust();
                    break;
            }
        }

    }
}
