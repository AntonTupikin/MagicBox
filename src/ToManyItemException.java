public class ToManyItemException extends Exception {

    public ToManyItemException(String name, int size) {
        super("Достигнуто максимальное кол-во объектов в коробке: " + name + ": " + size);
    }
}
