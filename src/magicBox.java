import java.util.Random;

public class magicBox<T> {
    protected T[] items;
    protected T item;
    protected int boxSize;
    protected int count = 0;

    public magicBox(int boxSize) {

        T[] items = (T[]) new Object[boxSize];
        this.items = items;
        this.boxSize = boxSize;
        this.count = count;
    }

    public boolean addItem(T item) {
        if (count <= (boxSize - 1)) {
            items[count] = item;
            count++;
            return true;
        } else {
            return false;
        }
    }

    public int getBoxSize() {
        return boxSize;
    }

    public T giveItem() {
        Random random = new Random();
        int randomInt = random.nextInt(items.length + 1);
        return items[randomInt];
    }

}
