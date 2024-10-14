package com.buttonexplorer;

interface Mobile {
  void show();
}

public class App2 {

  public static void main(String[] args) {
    App2 app2 = new App2();
    Mobile mobile = new Mobile() {
      @Override
      public void show() {
        System.out.println("Hello");
      }
    };
    mobile.show();
  }
}
