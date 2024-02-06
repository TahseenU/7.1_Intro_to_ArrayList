import java.util.ArrayList;

public class Main{
  public static void main (String [] args){
    ArrayList<Integer> ints = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) ints.add ((int) (Math.random () * 10) + 1);
    System.out.println (ints);
    
    ArrayList<Double> nums = new ArrayList<Double>();
    for (int i = 0; i < 10; i++){
      Double number = Math.random () * 10 + 1;
      int num = (int) (number * 100);
      number = num / 100.0;
      nums.add (number);
    }
    System.out.println (nums);
    
    ArrayList<String> strs = new ArrayList<String>();
    strs.add ("hello");
    strs.add ("bye");
    strs.add ("create beauty");
    System.out.println (strs);
    
    ArrayList<Boolean> booleans = new ArrayList<Boolean>();
    for (int i = 0; i < 10; i++){
      int check = (int) (Math.random () * 2);
      if (check == 0) booleans.add (false);
      else booleans.add (true);
    }
    System.out.println (booleans);
    
    ArrayList<Computer> comps = new ArrayList<Computer>();
    comps.add (new Computer ());
    System.out.println (comps);
    
    ArrayList list = new ArrayList ();
    list.add (3);
    list.add (3.54);
    list.add (false);
    list.add ("Be Now");
    list.add (new Computer ());
    System.out.print (list);
  }
}