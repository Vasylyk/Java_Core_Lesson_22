package task2;

public class Main {
    public static void main(String[] args) {
        Throwable flip = ()->{
            if ((int)(Math.random()*2)==0){
                return "Орел";
            } else {
                return "Решка";
            }
        };
        System.out.println(flip.flip());
    }
}
