public class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private Product product;
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
    public void addCustomer(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void editCustomer(int id,String newname){
        this.id=id;
        this.name=newname;
    }
    public void deleteCustomer(){
        this.id= Integer.parseInt(null);
        this.name=null;
    }
    public void getCustomer(int id){
        System.out.println("Id is "+this.id +" "+ "Name is "+this.name);
    }
    public void  addProd(int id, String name){
        product.addProduct(id,name);
    }
    public void  editProd(int id, String name){
        product.EditProduct(id,name);
    }
    public void  deleteProd(int id, String name){
        product.DeleteProduct(id,name);
    }
    public void  showProduct(int id){
        product.ShowProduct(id);
    }


}
