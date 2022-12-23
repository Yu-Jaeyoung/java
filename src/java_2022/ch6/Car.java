package java_2022.ch6;

public class Car {
  //필드
  private int speed;
  private boolean stop;

  //생성자

  //메소드
  public int getSpeed(){
      return speed;
  }

  public void setSpeed(int Speed){
      if(speed < 0){
          this.speed = 0;
          return;
      } else {
          this.speed = speed;
      }
  }

  public boolean isStop(){
      return stop;
  }
  public void setStop(boolean stop){
      this.stop = stop;
      this.speed = 0;
  }
}