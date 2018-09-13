package mathbox;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Number[] values = new Number[]{5, 6, 7, 98, 2, 5};
        MathBox mathBox = new MathBox(values);
        System.out.println(mathBox.array);
        System.out.println(mathBox.summator());
        mathBox.delete(25);
        System.out.println(mathBox.array);
        System.out.println(mathBox.summator());
        mathBox.delete(2);
        System.out.println(mathBox.array);

        Object[] array = new Object[]{"my", 2.54, 965, -356, "object", "container"};
        ObjectBox objectBox = new ObjectBox(array);
        objectBox.addObject(5);
        objectBox.deleteObject(965);
        System.out.println(objectBox.dump());

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("fileName.bin"))) {
            objectOutputStream.writeObject(array);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
