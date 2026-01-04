class Parent {
    final void show() {
        System.out.println("This is Parent show()");
    }
}

public class FinalMethodExample extends Parent {

    public static void main(String[] args) {
        FinalMethodExample obj = new FinalMethodExample();
        obj.show();
    }
    public void show(){
        System.out.print("Santosh Kumar Kowru");
    }
}


/*

OUTPUT:

FinalMethodExample.java:13: error: show() in FinalMethodExample cannot override show() in Parent
    public void show(){
                ^
  overridden method is final
1 error

*/
