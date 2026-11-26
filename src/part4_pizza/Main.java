package part4_pizza;

import common.Input;
public class Main {
    public static void main(String[] args) {
        String[] names=new String[5]; int[] prices=new int[5];
        for(int i=0;i<5;i++){names[i]=Input.text("Pizza name "+(i+1)+": ");prices[i]=Input.integer("Price: ",0,Integer.MAX_VALUE);}
        Pizza[] pizzas=new Pizza[5]; for(int i=0;i<5;i++)pizzas[i]=new Pizza(names[i],prices[i]);
        for(int end=4;end>0;end--)for(int j=0;j<end;j++)if(pizzas[j].getPrice()>pizzas[j+1].getPrice()){
            Pizza temp=pizzas[j];pizzas[j]=pizzas[j+1];pizzas[j+1]=temp;
        }
        for(Pizza pizza:pizzas)System.out.println(pizza.getDescription());
    }
}
