package ACO.week1day1;

public class Company {

    public String name;

    public User[] users;

    Company(){}

    Company(String name, int users){

        this.name = name;
        this.users = new User[users];

    }

    public void addUser(User newUser){

        boolean added = false;

        for (int i = 0; i < this.users.length; i++) {
            if (this.users[i] == null) {
                this.users[i] = newUser;
                added = true;
                break;
            }
        }

        if (!added == true) {
            System.out.println("Нет вакансий");
        }
        else {
            System.out.println("Сотрудник " + newUser.name + " добавлен");
        }
    }

    public void addUser(String name, int age, double salary, String position){

        User newUser = new User(name, age, salary, position);

        addUser(newUser);
    }

    public void removeUser(User userForRemove){

        boolean remove = false;

        for (int i = 0; i < this.users.length; i++) {
            if (this.users[i] == userForRemove) {
                this.users[i] = null;
                remove = true;
            }
        }

        if (!remove == true) {
            System.out.println("Сотрудник не обнаружен");
        }
        else {
            System.out.println("Сотрудник удален");
        }
    }

    public void viewStructoreCompany(){

        System.out.println("Company name - " + name);

        for (int i = 0; i < this.users.length; i++) {

            if (this.users[i] == null) {
                continue;
            }

            System.out.println("User position - " + this.users[i].position + "; " +
                    "User name - " + this.users[i].name + "; " +
                    "age - " + this.users[i].age + "; " +
                    "salary - " + this.users[i].salary + "; ");
        }
    }

}
