public class Computer{
  private double cost;
  public Computer (){
    cost = (int) (Math.random() * 1000000) + 100;
    cost /= 100;
  }
  public String toString (){
    return "Your computer costs $" + cost + ".";
  }
}