public class Product {
    private int id;
    private String name;
    private Customer customer;//linkage between customer and his\her product entities

    private int Cust_id=customer.getId();
    private String Cust_name= customer.getName();

    public Product(int id, String name,int cust_id, String cust_name) {
        this.id = id;
        this.name = name;
        this.customer = customer;
        Cust_id = cust_id;
        Cust_name = cust_name;
    }

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
    public void addProduct(int id,String name){ //function to add product
        this.id=id;
        this.name=name;
    }
    public void EditProduct(int id,String name){ //function to add product
        this.id=id;
        this.name=name;
    }
    public void DeleteProduct(int id,String name){ //function to add product
        this.id= Integer.parseInt(null);
        this.name=null;
    }
    public void ShowProduct(int id){ //function to add product
      System.out.println("Product id is "+this.id+" "+"Product Name is "+this.name +"\n"+"and "+"Owner id is "+this.Cust_id+"and owner name is"+this.Cust_name);
    }

    public int getCust_id() {
        return Cust_id;
    }

    public void setCust_id(int cust_id) {
        Cust_id = cust_id;
    }

    public String getCust_name() {
        return Cust_name;
    }

    public void setCust_name(String cust_name) {
        Cust_name = cust_name;
    }
}
