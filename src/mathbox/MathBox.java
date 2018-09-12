package mathbox;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MathBox {

    public Set<Integer> values;

    public MathBox(Integer[] in) {
        values = new TreeSet<Integer>();
        values.addAll(Arrays.asList(in));
    }

    public int summator() {
        int result = 0;
        for (Integer i : values) {
            result += i;
        }
        return result;
    }

    public Set splitter(int a) throws Exception {
        if (a==0) {
            throw new Exception("Devided by 0");
        }
        TreeSet devided = new TreeSet();
        for (Integer i : values) {
            devided.add(i / a);
        }
        return devided;
    }

    public void delete(int b) {
        values.remove(b);
    }

    @Override
    public String toString() {
        return values.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MathBox)) return false;

        MathBox mathBox = (MathBox) o;

        return values != null ? values.equals(mathBox.values) : mathBox.values == null;
    }

    @Override
    public int hashCode() {
        return values != null ? values.hashCode() : 0;
    }
}
