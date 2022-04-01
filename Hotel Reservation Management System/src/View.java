import java.util.Scanner;
public class View {
    public static void main(String[] args) {
        LogIn login = new LogIn();
        SystemOption clientOperate = new ClientSystem();
        SystemOption managerOperate = new ManagerSystem();
        SystemOption employeeOperate = new employeeSystem();

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
                        clientOperate.operate(scan);
                        //clientSystem(scan);
                        break;
                    case 2:
                        System.out.println("Welcome to manager system");
                        System.out.println("-------------------------------------------");
                        login.managerLogIn();
                        System.out.println("-------------------------------------------");
                        System.out.println("Now you can do the following operations");
                        managerOperate.operate(scan);
                        //managerSystem(scan);
                        break;
                    case 3:
                        System.out.println("Welcome to employee system");
                        System.out.println("-------------------------------------------");
                        login.employeeLogIn();
                        System.out.println("-------------------------------------------");
                        System.out.println("Now you can do the following operations");
                        employeeOperate.operate(scan);
                        //employeeSystem(scan);
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
}
