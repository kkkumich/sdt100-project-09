package part3_static;

class Counter {
    public static int total=0;
    Counter() { total++; }
    public static String label(){return "Count="+total;}
    public static void staticCaller(){System.out.println(label());}
    public void instanceCaller(){System.out.println(label());}
}
public class Main {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Counter first=new Counter(), second=new Counter(); Counter.total=5;
        System.out.println(first.total+" = "+second.total); // Demonstrates shared state; prefer Counter.total in production.
        Counter.staticCaller(); first.instanceCaller(); System.out.println(Counter.label());
    }
}
