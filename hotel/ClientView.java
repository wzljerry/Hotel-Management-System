package hotel;

// this class is one of the components of front controller patten
public class ClientView {
    public void show(){
        UserOperate client = new ClientOperate();
        client.TemplateMethod(); // template method, first log in and then operate.
    }


}
