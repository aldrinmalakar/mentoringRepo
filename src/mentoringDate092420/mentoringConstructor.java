package mentoringDate092420;

public class mentoringConstructor {

    /*
    Constructors are used to initialize the state of an object whereas a Method is used to expose the behaviour of an object.
The Constructor cannot have return type whereas the Method may or may not have a return type.
The Constructor name must be same as the class name whereas the Method name may or may not be same as the class name.
The Constructor is invoked implicitly whereas the Method invoked explicitly.
The Constructor is implicitly provided by the Java compiler if you don’t specify any Constructor in the java class, but the Method is never provided by the java compiler.

     */
    // Collecting info for Census2020

    String name;
    String address;
    static int zipcode = 11458;

    public mentoringConstructor(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public void printAddress() {
      System.out.println(name + " lives in " + address + " which is in zipcode area= " + zipcode);
    }

    public static void main(String[] args) {
        mentoringConstructor infoOnPeople = new mentoringConstructor("Syed", "Queens");
        mentoringConstructor infoOnPeople1 = new mentoringConstructor("Belayet", "Brooklyn");
        mentoringConstructor infoOnPeople2 = new mentoringConstructor("Tilak", "Bronx");

            infoOnPeople.printAddress();
            infoOnPeople1.printAddress();
            infoOnPeople2.printAddress();

    }


}
