package Assignment_02.DataCoupling;

public class Manager {
    Product p1 = new Product();

    public void NewProduct(){
        p1.SetName("Mobile");
        p1.SetModel("i Phone X");
        p1.SetPrice(100000);
    }
}
