package hotel;

import hotel.SystemOption;

import java.util.Scanner;

public class SystemInvoker {
    private SystemOption systemOption;

    public SystemInvoker(SystemOption systemOption){
        this.systemOption = systemOption;

    }

    public void setOption(SystemOption systemOption){
        this.systemOption = systemOption;
    }

    public void call(){
        Scanner scan = new Scanner(System.in);
        systemOption.operate(scan);
    }
}
