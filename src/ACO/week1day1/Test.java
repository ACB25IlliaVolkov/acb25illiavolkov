package ACO.week1day1;

public class Test {

    public static void main(String[] args) {

        Company myCompany = new Company();

        myCompany.name = "SmallFirstCompany";
        myCompany.users = new User[5];

        myCompany.addUser("Salnikov Vosily", 25, 3500, new Position().trainee);

        User director = new User();
        director.name = "Gorodetsky Evgen";
        director.age = 45;
        director.salary = 40000;
        director.position = new  Position().director;
        myCompany.addUser(director);

        myCompany.viewStructoreCompany();

    }
}
