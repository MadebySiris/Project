public class Clothing extends Product{
    boolean vintage;
    String size;
    String material;
    String quality; 

    //clothes inherits most of its atrributes from products while adding a couple//
    public Clothing(int productId, int price, int quantity, String name, String brand, 
    boolean vintage, String size, String material, String quality){
    super(productId, price, quantity, name, brand);
    this.vintage = vintage;
    this.size = size;
    this.material = material;
    this.quality = quality;
    }
}
