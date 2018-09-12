package mathbox;

public class Main {
    public static void main(String[] args) {
        Integer[] values = new Integer[]{5, 6, 7, 25, 98, 2, 5};
        MathBox mathBox = new MathBox(values);
        System.out.println(mathBox.values);
        System.out.println(mathBox.summator());
        mathBox.delete(25);
        System.out.println(mathBox.values);
        System.out.println(mathBox.summator());
        mathBox.delete(2);
        System.out.println(mathBox.values);
    }
}
