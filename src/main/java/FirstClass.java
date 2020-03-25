public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("simpleNotebook", 1000, 1200, 2020);
        System.out.println(notebook.name + " " + notebook.weight + "g " + notebook.price + " zł") ;
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearPrice();
        System.out.println();

        Notebook heavyNotebook = new Notebook("heavyNotebook", 1500, 1800, 2018);
        System.out.println(heavyNotebook.name + " " + heavyNotebook.weight + "g " + heavyNotebook.price + " zł");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearPrice();
        System.out.println();

        Notebook oldNotebook = new Notebook("oldNotebook", 500, 2500, 2016);
        System.out.println(oldNotebook.name + " " + oldNotebook.weight + "g " + oldNotebook.price + " zł");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearPrice();
        System.out.println();

        int notebookWeight = notebook.getWeight();
        System.out.println(notebookWeight);

    }
}