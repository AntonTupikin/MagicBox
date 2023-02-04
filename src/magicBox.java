import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    protected T item;
    protected int boxSize;
    protected int count = 0;
    protected String name;

    public MagicBox(int boxSize, String name) {

        T[] items = (T[]) new Object[boxSize];
        this.name=name;
        this.items = items;
        this.boxSize = boxSize;
        this.count = count;
    }

    public boolean addItem(T item) throws ToManyItemException {
        if (count <= (boxSize - 1)) {
            items[count] = item;
            count++;
            return true;
        } else {
            throw new ToManyItemException(name, boxSize);
        }
    }

    public int getBoxSize() {
        return boxSize;
    }

    public T giveItem() {
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }

}
