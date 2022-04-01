import java.util.Scanner;

public class ManagerSystem implements SystemOption{
    Scanner scan = new Scanner(System.in);
    @Override
    public void operate(Scanner scan) {
        try {
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

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
