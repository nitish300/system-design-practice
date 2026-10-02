public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();   // object pehli baar banega
        Singleton s2 = Singleton.getInstance();   // object pehli baar banega
        System.out.println(s1);
        System.out.println(s2);
       // s1.printObject();                          // s4, s5, s6 print karo
    }
}