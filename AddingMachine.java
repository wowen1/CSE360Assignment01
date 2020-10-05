package cse360assignment01;

public class AddingMachine
{
   private int total;
   private String history;
   
   public AddingMachine()
   {
      total = 0;
      history = "0";
   }
   
   public int getTotal()//returns the total.
   {
      return total;
   }
   
   public void add(int value) //adds the value to total
   {
      total = total + value;
      history = history + " + " + value;
   }
   
   public void subtract(int value) //subtracts the value from total
   {
      total = total - value;
      history = history + " - " + value;
   }
   
   public String toString() //returns the history
   {
      return history; 
   }      
   
   public void clear() //clears history
   {
      history = "";
   }

}   
   
      
    