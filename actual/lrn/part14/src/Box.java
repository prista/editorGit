import java.io.*;

public class Box implements Serializable{
    private int width;
    private int weight;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;

        Box box = (Box) o;

        if (width != box.width) return false;
        return weight == box.weight;
    }

    @Override
    public int hashCode() {
        int result = width;
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setWidth(50);
        myBox.setWeight(20);

        try {
            FileOutputStream fs = new FileOutputStream("../part14/foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
