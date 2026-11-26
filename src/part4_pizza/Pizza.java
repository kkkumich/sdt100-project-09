package part4_pizza;
public class Pizza {
    private String name; private int price;
    public Pizza(String name,int price){setName(name);setPrice(price);}
    public String getName(){return name;} public void setName(String value){if(value.trim().isEmpty())throw new IllegalArgumentException("Blank name");name=value;}
    public int getPrice(){return price;} public void setPrice(int value){if(value<0)throw new IllegalArgumentException("Negative price");price=value;}
    public String getDescription(){return name+": "+price;}
}
