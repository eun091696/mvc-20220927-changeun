package DI_IoC;

public class Main {

    public static void main(String[] args) {

        ClassB classB1 = new ClassBImpl1();
        ClassB classB2 = new ClassBImpl2();

        ClassA classA = new ClassAImpl1(classB2);

        classA.logic1();
        classA.logic2();
        classA.logic3();

    }
}
