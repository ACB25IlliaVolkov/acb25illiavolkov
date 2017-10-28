package ACO.ShildtTest;

public class RunTest {

    public static void main(String[] args) {


        TestObg[] myObg = new TestObg[5];

        for (int c=0; c<myObg.length; c++){
            TestObg el = myObg[c];
            //el.TestRezOut(el);
            el.initMyObg("Ilya", 35);
            //el.TestRezOut(el);
        }

    }
}
