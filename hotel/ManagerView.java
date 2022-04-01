package hotel;

//template method and front controller method
public class ManagerView {
    public void show(){
        UserOperate manager = new ManagerOperate();
        manager.TemplateMethod(); // call the template methods
    }
}
