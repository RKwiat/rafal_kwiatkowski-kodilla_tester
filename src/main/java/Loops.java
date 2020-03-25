public class Loops {
    private int i;

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++ ) {
            System.out.println(i);
        }
        System.out.println();
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};

        int nrOfElements = names.length;
        System.out.println("Tabela " + "zawiera " + nrOfElements + " elementy");

        for (int i = 0; i < nrOfElements; i++) { //Pętla for (ze zmienną)
            System.out.println(names[i]);
        }
        System.out.println();

        for (int i = 0; i < names.length; i++) { //Pętla for
            System.out.println(names[i]);
        }
        System.out.println();

        for (String i : names) { //Pętla foreach
            System.out.println(i);
        }
        System.out.println();

        for (int i = names.length - 1; i >= 0; i--) { //Pętla od tyłu
            System.out.println(names[i]);
        }

        int i = 0;
        while (i <= 10) {
        System.out.println(i);
        i++;
        }

    }
    public int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }
}