package hotel;

import java.util.Scanner;

// interface for choosing systems
public interface SystemOption {
    Scanner scan = new Scanner(System.in);
    public void operate(Scanner scan);
}
