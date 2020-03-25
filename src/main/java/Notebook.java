public class Notebook {
    String name;
    int weight;
    int price;
    int year;

    public Notebook(String name, int weight, int price, int year) {
        this.name = name;
        this.weight = Integer.valueOf(weight);
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

    public int getWeight() {

        return this.weight;
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is very light");
        } else if (this.weight > 1000 && this.weight < 1800) {
            System.out.println("This notebook is not too heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }

    public void checkYearPrice() {
        if (this.year > 2018 && this.price > 1500){
            System.out.println("This notebook is not attractive");
        } else if (this.year > 2000 && this.price < 600) {
            System.out.println("This notebook is attractive");
        } else {
            System.out.println("This notebook is very attractive");
        }
    }
}