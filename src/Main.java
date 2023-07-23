import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
try {
    System.out.println("Creation of Employee");
    Employee emp1 = new Employee(1, "Abdullah");
    System.out.println("Abdullah :Adding new Customer by your input");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Abdullah: Please Add Customer id");
    int id_input = scanner.nextInt();
    System.out.println("Abdullah: Please add Customer name");
    String Customer_name=scanner.next();
    Customer customer =new Customer(id_input,Customer_name);
  //  System.out.println("Customer data is");
//    emp1.Read_customer(id_input);
    System.out.println("Abdullah: please add product id");
    int Prod_id=scanner.nextInt();
    System.out.println("Abdullah: please add product name");
    String prdouctName=scanner.next();
    System.out.println("Abdullah: please add customer id who is that owner of product");
    int Product_Owner=customer.getId();
    System.out.println("Abdullah: please add customer name who is that owner of product");
    String Product_Owner_Name=customer.getName();

   Product product=new Product(Prod_id,prdouctName,Product_Owner,Product_Owner_Name);

}
catch (Exception e){
System.out.println( e.getMessage());
}

       

    }
}