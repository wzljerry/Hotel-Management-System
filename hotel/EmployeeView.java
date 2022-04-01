package hotel;

//template patten and front controller patten, call the method from template methods
public class EmployeeView {
    public void show(){
        UserOperate employee = new EmployeeOperate();
        employee.TemplateMethod();
    }
}
