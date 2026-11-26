package part1_objects;

// Each numbered task has its own example class, above Main as requested.
class EmptyExample { }
class PublicMethod { public void print(String s) { System.out.println(s); } }
class PrivateMethod { private String secret() { return "private helper"; } public void demonstrate() { System.out.println(secret()); } }
class ConstructorExample { ConstructorExample() { System.out.println("Constructor was called"); } }
class PublicFields { public int count=2; public double price=3.5; public boolean active=true; public String name="Demo";
    public void print() { System.out.println(name+" "+count+" "+price+" "+active); } }
class PrivateFields { private int number=7; public void show() { System.out.println("Private value via method: "+number); } }
class Accessors {
    private int count; private double cost; private boolean available; private String label;
    public int getCount(){return count;} public void setCount(int n){count=n;}
    public double getCost(){return cost;} public void setCost(double n){cost=n;}
    public boolean isAvailable(){return available;} public void setAvailable(boolean n){available=n;}
    public String getLabel(){return label;} public void setLabel(String n){label=n;}
}
class ArgumentConstructor { private String name; ArgumentConstructor(String name){this.name=name;} public String getName(){return name;} }
public class Main {
    public static void main(String[] args) {
        EmptyExample object=new EmptyExample(); System.out.println(object.getClass().getSimpleName());
        new PublicMethod().print("Public method call"); new PrivateMethod().demonstrate(); new ConstructorExample();
        PublicFields publicFields=new PublicFields(); publicFields.count=5; publicFields.print(); new PrivateFields().show();
        Accessors a=new Accessors(); a.setCount(3); a.setCost(12.5); a.setAvailable(true); a.setLabel("Example");
        System.out.println(a.getLabel()+" "+a.getCount()+" "+a.getCost()+" "+a.isAvailable());
        System.out.println(new ArgumentConstructor("Constructor argument").getName());
    }
}
