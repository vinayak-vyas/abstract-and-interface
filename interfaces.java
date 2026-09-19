interface bicycle{
    void applybreak(int decrement);
    void speedup(int increment);
}

class avoncycle implements bicycle{
    void blowhorn(){
        System.out.println("hornnnnnn");
    }

   public void applybreak(int decrement){
        System.out.println("apply breaking");
    }

    public void speedup(int increment){
        System.out.println("apply speed");
    }
}

public class interfaces {
    public static void main(String[] args) {
        avoncycle avon = new avoncycle();
        avon.applybreak(5);
        avon.speedup(50);
    }
}
