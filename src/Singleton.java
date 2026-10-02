
public class Singleton {


    private static Singleton instance;

    private Singleton() {
        System.out.println("Object created!");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // ✅ Yeh method s4, s5, s6 print karega
    public void printObject() {
        Singleton s4 = Singleton.getInstance();
        Singleton s5 = Singleton.getInstance();
        Singleton s6 = Singleton.getInstance();

        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s6 = " + s6);

        System.out.println("s4 == s5 : " + (s4 == s5));
        System.out.println("s5 == s6 : " + (s5 == s6));
    }
}