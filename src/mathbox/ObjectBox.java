package mathbox;

import java.io.Serializable;
import java.util.*;

public class ObjectBox implements Serializable {

    public Collection<Object> array;

    public ObjectBox() {
    }

    public ObjectBox(Object[] o) {
        array = new ArrayList<Object>();
        array.addAll(Arrays.asList(o));

    }

    public void addObject(Object a) {
        array.add(a);
    }

    public void deleteObject(Object a) {
        array.remove(a);
    }

    public String dump() {
        return array.toString();
    }

    @Override
    public String toString() {
        return array.toString();
    }
}
