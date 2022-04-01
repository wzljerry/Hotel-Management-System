import java.util.Scanner;

public class employeeSystem implements SystemOption{
    Scanner scan = new Scanner(System.in);
    @Override
    public void operate(Scanner scan){
        try{
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
            }catch (Exception e){
                    System.out.println(e);
            }
        }
    }
