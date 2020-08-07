package L08;

import java.util.Collection;
import java.util.Iterator;

//+public int size();
//+public boolean isEmpty();
//+public boolean contains(Object object);
//+public boolean add(Object object);
//+public boolean remove(Object object);
//+public boolean addAll(MyCollection collection);
//+public void clear();
//-public boolean retainAll(MyCollection collection);
//-public boolean removeAll(MyCollection collection);
//-public boolean containsAll(MyCollection collection);
public class Container implements Collection {
    private Object[] data = new Object[0];

    @Override
    public int size() {
        return data.length;
    }

    @Override
    public boolean isEmpty() {
        return data.length == 0;
    }

    @Override
    public boolean contains(Object other) {
        for (Object object : data) {
            if (object.equals(other)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(Object object) {
        Object[] newArray = new Object[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            newArray[i] = data[i];
        }
        newArray[data.length] = object;
        data = newArray;
        return true;
    }

    @Override
    public boolean remove(Object other) {
        int removeFlag = 0;
        for (int i = 0; i < data.length; i++)
            if (data[i].equals(other)) {
//                data[i] = null;
                removeFlag = i;
            }
        if (removeFlag != 0) {
            Object[] temporaryData = new Object[data.length - 1];
            for (int i = 0; i < (data.length); i++) {
                if (removeFlag > i) {
                    temporaryData[i] = data[i];
                } else {
                    if (removeFlag < i) {
                        temporaryData[i - 1] = data[i];
                    }
                }
            }
            data = temporaryData;
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection collection) {
        Object[] objects = collection.toArray();
        for (Object object : objects) {
            add(object);
        }
        return true;
    }

    @Override
    public void clear() {
        data = new Object[0];
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    public Object get(int i) {
        return data[i];
    }

    @Override
    public boolean removeAll(Collection collection) {
        Object[] objects = collection.toArray();
        boolean removeFlag = false;
        for (int i = data.length - 1; i >= 0; i--) {
            if (collection.contains(data[i])) {
                remove(data[i]);
                removeFlag = true;
            }
        }
        return removeFlag;
    }

    @Override
    public boolean retainAll(Collection collection) {
        Object[] objects = collection.toArray();
        boolean removeFlag = false;
//        System.out.println(data.length + "-");
//        for (int i = 0; i < data.length; i++) {
        for (int i = data.length - 1; i > -1; i--) {
            System.out.println(data[i] + " - " + i + "-" + removeFlag);
            if (!collection.contains(data[i])) {
                remove(data[i]);
                removeFlag = true;
            }
            System.out.println(data[i] + " - " + i + "-" + removeFlag);
        }
        return removeFlag;
    }

    @Override
    public boolean containsAll(Collection collection) {
        Object[] objects = collection.toArray();
        boolean containsFlag = true;
        for (int i = 0; i < data.length; i++) {
            if (!collection.contains(data[i])) {
                containsFlag = false;
            }
        }
        return containsFlag;
    }

    @Override
    public String toString() {
        String result = "";
        for (Object o : data) {
            result += (o + ", ");
        }
        if (result.length() != 0) {
            result = result.substring(0, result.length() - 2);
        }
        return "[" + result + "]";
    }

    @Override
    public Object[] toArray() {
        final Object[] dest = new Object[data.length];
        System.arraycopy(data, 0, dest, 0, data.length);
        return dest;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return new Object[0];
    }

}
