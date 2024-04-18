package tinkoff_endless_contest;

public class Test extends Thread{
  Test(){
      System.out.println(" My threat");
  }

  public void run(){
      System.out.println(" bar");
  }

  public void run(String s){
      System.out.println(" baz");
  }

}

class ThreadDemo{
    public static void main(String[] args) {
        Thread t = new Test(){
            public void run(){
                System.out.println(" foo");
            }
        };
        t.start();
    }
}
