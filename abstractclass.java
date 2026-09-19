abstract class abs{
    public abs(){
        System.out.println("abs ka constructor");
    }
    public void child(){
        System.out.println(" good morning");
    }
   abstract public void greet();
   abstract public void greet2();
}

class abs2 extends abs{
    @Override
    public void greet() {
        System.out.println("hiiiii");
    }
    
          @Override
    public void greet2() {
        System.out.println("hellooo");
    }
}

class abs3 extends abs{
 @Override
    public void greet() {
        System.out.println("goodby");
    }
    
          @Override
    public void greet2() {
        System.out.println("byyy");
    }
}


public class abstractclass {
    public static void main(String[] args) {
        abs2 ab = new abs2();
        abs3 aa = new abs3();


    }
}
