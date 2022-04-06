package Studies;


public class Study {

    public Study print() {
        System.out.println("Printed");
        return this;
    }

    public boolean printAgain() {
        System.out.println("Wow.");
        return true;
    }

    public static void main(String[] args) {

        Study s = new Study();

        System.out.println(s.print().print().print().print());

    }
}
