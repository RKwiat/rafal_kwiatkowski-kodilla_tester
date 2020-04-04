public class User {
    String name;
    int year;

    public User(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public static void main(String[] args) {

        User father = new User("father", 40);
        User mother = new User("mother", 39);
        User son = new User("son", 13);
        User doughter = new User("doughter", 11);
        User uncle = new User("uncle", 43);

        User[] users = {father, mother, son, doughter, uncle};

        int numberOfUsers = users.length;

        int sumUsersYear = 0;

        for (int i = 0; i < numberOfUsers; i++) {
            int age = users [i].getYear();
            sumUsersYear = sumUsersYear + age;
        }
        System.out.println("Suma lat uzytkowników: " + sumUsersYear);

        System.out.println("Liczba użytkowników: " + numberOfUsers);

        double avg = sumUsersYear / numberOfUsers;
        System.out.println(avg);

        for (int i = 0; i < numberOfUsers; i++) {
            int age = users [i].getYear();
            if(age < avg){
                System.out.println(users[i].name);
            }

        }



    }




    public int getYear() {
        return year;
    }






}
