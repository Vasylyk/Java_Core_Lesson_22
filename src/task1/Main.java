package task1;

public class Main {
    public static void main(String[] args) {
        Pet cat = ()-> System.out.println("Я кіт- Мяууу-Мяууу");
        cat.voice();
        Pet dog = () -> System.out.println("Я пес - Гаууу-Гаууу");
        dog.voice();
        Pet cow = () -> System.out.println("Я корова- Мууу-Мууу");
        dog.voice();
    }
}
