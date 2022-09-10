package src.by.bsuir.lab1.objects_and_classes.task9;


public class Executer {
    public static void main(String[] args){
      Basket basket = new Basket();
      basket.putBall(new Ball(1, "green")); 
      basket.putBall(new Ball(4, "blue"));   
      basket.putBall(new Ball(2, "yellow"));  
      basket.putBall(new Ball(3, "black"));  
      basket.putBall(new Ball(4, "blue"));  

      System.out.println("result 9:");
      System.out.printf("weight = %d;\n",basket.getWeight());
      System.out.printf("Blue balls number = %d;\n",basket.getNumberWithColor("blue"));
    }
    
}
