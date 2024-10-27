class realprinter{

    void print(){

        System.out.println("hello real printer");

    }
}

class print{


    realprinter print = new realprinter();

    void print(){

        print.print();
    }         // الكلام ده معناه اني بخلي كلاس زي مساعد بيعملي الي انا عايزه بس بطريقه غير مباشره شويه
}


public class Test {

    public static void main(String[] args) {
        print printer = new print();
        printer.print();

    }

}
