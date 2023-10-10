import multithread.Singleton;
import simple.SimpleSingleton;

public class Main {
  public static void main(String[] args) {
    // Simple singleton
    SimpleSingleton simpleSingleton = SimpleSingleton.getInstance("FOO");
    SimpleSingleton anotherSingleton = SimpleSingleton.getInstance("BAR");

    System.out.println(simpleSingleton.getValue()); // FOO
    System.out.println(anotherSingleton.getValue()); // FOO

    // Multi thread Singleton
    System.out.println("-------------- Multi Thread ---------------");
    Thread threadFoo = new Thread(new ThreadFoo());
    Thread threadBar = new Thread(new ThreadBar());

    threadBar.start(); // BAR
    threadFoo.start(); // BAR
  }

  static class ThreadFoo implements Runnable {
    @Override
    public void run() {
      Singleton singleton = Singleton.getInstance("FOO");
      System.out.println(singleton.getValue());
    }
  }

  static class ThreadBar implements Runnable {
    @Override
    public void run() {
      Singleton singleton = Singleton.getInstance("BAR");
      System.out.println(singleton.getValue());
    }
  }
}