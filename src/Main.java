import java.util.Random;

public class Main {
    public static void main(String[] args) {

        magicBox<String> magicBoxWords = new magicBox<String>(5);
        magicBoxWords.addItem("Эйяфьятлайокудль");
        magicBoxWords.addItem("Гассельтербурвеншемонд");
        magicBoxWords.addItem("Холм Мамунгкукумпурангкунтджунья");
        magicBoxWords.addItem("Озеро Пеквачнамайкосквасквейпинваник");
        magicBoxWords.addItem("Муканагедердаухаулия");
        magicBoxWords.addItem("Äteritsiputeritsipuolilautatsijänkä "); //тестим что коробка не переполняется
        System.out.println(magicBoxWords.giveItem());

        magicBox<Integer> magicBoxNumbers = new magicBox<Integer>(10);
        Random random = new Random();
        for (int i = 0; i < magicBoxNumbers.getBoxSize(); i++) {
            magicBoxNumbers.addItem(random.nextInt(999));
        }
        System.out.println(magicBoxNumbers.giveItem());
    }
}