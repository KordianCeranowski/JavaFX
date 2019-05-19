import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> productList;

    public Cart() {
        productList = new ArrayList<Product>();
    }

    public void add(int index){
        productList.add(new Product(index, SETTINGS.names[index], SETTINGS.prices[index]));
    }

    public void empty(){
        for(Product product : productList){
            SETTINGS.returnToStock(product.getId());
        }
        productList.clear();
    }

    public void buy(){
        productList.clear();
    }

    String sumOfPurchases(){
        double sum = 0;
        for(Product product : productList){
            sum += product.getPrice();
        }
        return (String.format("%.2f", sum));
    }

    Double sumOfPurchasesDouble(){
        double sum = 0;
        for(Product product : productList){
            sum += product.getPrice();
        }
        return sum;
    }

    int countOfProducts(){
        return productList.size();
    }

    int countOfDifferentProducts(){
        int[] array = generateInvoiceData();
        int sum = 0;
        for (int num:array) {
            if(num != 0)
                sum++;
        }
        return sum;
    }

    int[] generateInvoiceData(){
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (Product product : productList) {
            array[product.getId()]++;
        }
        return array;
    }



    @Override
    public String toString() {
        return "Cart{" +
                "productList=" + productList +
                '}';
    }
}
