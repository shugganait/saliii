public class Main {
    public static void main(String[] args) {
        Const main = new Const("Салима", "СПИ БЛЯ!!!");
        EntityInterface[] mass = {main, main,main, main,main, main,main, main,main, main,main, main,main, main,main, main,main, main,main, main,main, main,main, main,};
        for (int i = 0; i < mass.length; i++) {
            System.out.println(main.message());
        }
    }
}