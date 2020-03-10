public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("simpleNotebook","600", 1000, 2020);
        System.out.println(notebook.name + " " + notebook.weight + "g " + notebook.price + " zł") ;
        notebook.checkPrice();
       

        Notebook heavyNotebook = new Notebook("heavyNotebook","2000", 1500, 2018);
        System.out.println(heavyNotebook.name + " " + heavyNotebook.weight + "g " + heavyNotebook.price + " zł");
        heavyNotebook.checkPrice();

        Notebook oldNotebook = new Notebook("oldNotebook","1600",500, 2016);
        System.out.println(oldNotebook.name + " " + oldNotebook.weight + "g " + oldNotebook.price + " zł");
        oldNotebook.checkPrice();

        String notebookWeight = notebook.getWeight();
        System.out.println(notebookWeight);

    }
}