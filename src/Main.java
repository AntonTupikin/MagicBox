import java.util.Random;

public class Main {
    public static void main(String[] args) throws ToManyItemException {

        MagicBox<String> magicBoxWords = new MagicBox<String>(5, "Коробка со словами");
        magicBoxWords.addItem("Эйяфьятлайокудль");
        magicBoxWords.addItem("Гассельтербурвеншемонд");
        magicBoxWords.addItem("Холм Мамунгкукумпурангкунтджунья");
        magicBoxWords.addItem("Озеро Пеквачнамайкосквасквейпинваник");
        magicBoxWords.addItem("Муканагедердаухаулия");
        //magicBoxWords.addItem("Äteritsiputeritsipuolilautatsijänkä "); //тестим что коробка не переполняется
        System.out.println(magicBoxWords.giveItem());

        MagicBox<Integer> magicBoxNumbers = new MagicBox<Integer>(10, "Коробка с чифрами");
        Random random = new Random();
        for (int i = 0; i < magicBoxNumbers.getBoxSize(); i++) {
            magicBoxNumbers.addItem(random.nextInt(999));
        }
        System.out.println(magicBoxNumbers.giveItem());
    }
}