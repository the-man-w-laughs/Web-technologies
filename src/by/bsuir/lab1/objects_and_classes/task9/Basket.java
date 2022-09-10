package src.by.bsuir.lab1.objects_and_classes.task9;

import java.util.ArrayList;

public class Basket {
  ArrayList<Ball> balls;

  public Basket() {
    this.balls = new ArrayList<Ball>();
  }

  public void putBall(Ball ball) {
    this.balls.add(ball);
  }

  public int getWeight() {
    int weight = 0;
    for (int i = 0; i < this.balls.size(); i++) {
      weight += this.balls.get(i).weight;
    }
    return weight;
  }

  public int getNumberWithColor(String color) {
    int number = 0;
    for (int i = 0; i < this.balls.size(); i++) {
      if (this.balls.get(i).color == color) {
        number++;
      }
    }
    return number;
  }
}
