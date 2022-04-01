package hotel;

// dispatch requests based on users inputs
public class Dispatcher {
    private ClientView clientView;
    private EmployeeView employeeView;
    private ManagerView managerView;

    public Dispatcher(){
        clientView = new ClientView();
        employeeView = new EmployeeView();
        managerView = new ManagerView();
    }

    public void dispatch(int request){
        if(request==1){
            clientView.show();
        }else if (request==2){
            employeeView.show();
        }else {
            managerView.show();
        }
    }

}
