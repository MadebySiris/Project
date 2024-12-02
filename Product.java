public abstract class Product {
    int productId;
    int price;
    int quantity;
    String name;
    String brand;
    
    // constructor overloading to accomdate for more use cases //
    public Product(int productId, int price, int quantity, String name, String brand){
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.brand = brand;
    }

    public Product(int productId, int price, int quantity, String name){
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }
    
    // Method will be used to help with order calculations//
    //price refers to price per item in this case//
    public int getprice(){
        return this.price;
    }
    // Method will be used to help with order calculations
    // the amount of items purchased//
    public int getquantity(){
        return this.quantity;
    }


}
