package mathbox;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MathBox extends ObjectBox {

    public Set<Number> array;

    public MathBox(Number[] in) {
        array = new TreeSet<Number>();
        array.addAll(Arrays.asList(in));
    }

    public Double summator() {
        Double result = 0d;
        for (Number i : array) {
            result = result + i.doubleValue();
        }
        return result;
    }

    public Set splitter(Number a) throws Exception {
        if (a==null) {
            throw new Exception("Devided by 0");
        }
        TreeSet devided = new TreeSet();
        for (Number i : array) {
            devided.add(i.doubleValue() / a.doubleValue());
        }
        return devided;
    }

    public void delete(Number b) {
        array.remove(b);
    }

    @Override
    public String toString() {
        return array.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MathBox)) return false;

        MathBox mathBox = (MathBox) o;

        return array != null ? array.equals(mathBox.array) : mathBox.array == null;
    }

    @Override
    public int hashCode() {
        return array != null ? array.hashCode() : 0;
    }
}
