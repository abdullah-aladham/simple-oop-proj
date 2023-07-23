public class Employee {
private int  id;
private String  name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private Customer customer;//dependency injection
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //
    public void Add_customer(int id,String name){ //a function that gives previllage for an employee to add customer
        customer.addCustomer(id,name);
    }
    public void Edit_customer(int id,String name){ //a function that gives previllage for an employee to add customer
        customer.editCustomer(id,name);
    }
    public void delete_customer(){ //a function that gives previllage for an employee to add customer
        customer.deleteCustomer();
    }
    public void Read_customer(int id){ //a function that gives previllage for an employee to add customer
        customer.getCustomer(id);
    }

}
