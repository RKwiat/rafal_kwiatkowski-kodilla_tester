public class Notebook {
    String name;
    String weight;
    int price;
    int year;

    public Notebook(String name, String weight, int price, int year) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public String getWeight() {
        return this.weight;
    }



}