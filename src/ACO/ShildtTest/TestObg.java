package ACO.ShildtTest;

public class TestObg {

     String name;
     int age;

    void initMyObg(String name, int age){

        this.name = name;
        this.age = age;
    }



    void TestRezOut(TestObg locObg) {

        System.out.println("name=" + locObg.name + " " + "age=" + locObg.age);

    }
}

