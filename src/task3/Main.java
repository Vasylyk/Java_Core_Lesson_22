package task3;

public class Main {
    public static void main(String[] args) {
        Expo dMax = ()->Double.MAX_VALUE;
        System.out.println(dMax.number());
        Expo dMin = ()->Double.MIN_VALUE;
        System.out.println(dMin.number());
        Expo fMax = ()->Float.MAX_VALUE;
        System.out.println(fMax.number());
        Expo fMin = ()->Float.MIN_VALUE;
        System.out.println(fMin.number());
    }
}
