package L07;

//+public int size();
//+public boolean isEmpty();
//+public boolean contains(Object object);
//+public boolean add(Object object);
//+public boolean remove(Object object);
//+public boolean addAll(MyCollection collection);
//+public void clear();
//+public boolean retainAll(MyCollection collection);
//-public boolean removeAll(MyCollection collection);
//-public boolean containsAll(MyCollection collection);
public class Container {
    private Object[] data = new Object[0];

    public int size() {
        return data.length;
    }

    public boolean add(Object object){
        Object[] newArray = new Object[data.length + 1];
        for (int i =0; i < data.length; i++){
            newArray[i] = data[i];
        }
        newArray[data.length] = object;
        data = newArray;
        return true;
    }

    public boolean isEmpty(){
        return data.length == 0;
    }

    public void addAll(Container container){
        for (int i = 0; i < container.data.length; i++) {
            add(container.data[i]);
        }
    }

    public void clear(){
        data = new Object[0];
    }

    public boolean contains(Object other){
        for (Object object : data ) {
            if (object.equals(other)){
                return true;
            }
        }
        return false;
    }

    public boolean remove(Object other){
        int removeFlag = 0;
        for (int i = 0; i < data.length; i++)
            if (data[i].equals(other)) {
                data[i] = null;
                removeFlag = i;
            }
        if (removeFlag != 0){
            Object[] temporaryData = new Object[data.length - 1];
            for (int i = 0; i < (data.length); i++) {
                if (removeFlag > i){
                    temporaryData[i] = data[i];
                } else {
                    if (removeFlag < i){
                        temporaryData[i-1] = data[i];
                    }
                }
            }
            data = temporaryData;
            return true;
        }
        return false;
    }

    public void retainAll(Container container){
        Object[] temporaryData = new Object[container.data.length];
        for (int i = 0; i < container.data.length; i++) {
//            System.out.println(container.data[i]);
            if ((container.data[i] != null) || (contains(container.data[i]))){
                temporaryData[i] = container.data[i];
            }

        }
        data = temporaryData;
//        return false
    }

    public void removeAll(Container container){
        Object[] temporaryData = new Object[data.length];
        temporaryData = data;
        for (int i = 0; i < container.data.length; i++) {
//            System.out.println(container.data[i]);
//            if ((contains(container.data[i])) || (data[i] != null)){
            if (contains(container.data[i])){
//                System.out.println(contains(container.data[i]) + "=" + container.data[i]);
                remove(container.data[i]);
//                temporaryData[i] = data[i];
            }
        }
//        data = temporaryData;
    }

    public boolean containsAll(Container container){
        for (int i = 0; i < container.data.length; i++) {
            if (!contains(container.data[i])){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String result = "";
        for (Object o : data ) {
            result += (o + ", ");
        }
        if (result.length() != 0){
            result =  result.substring(0, result.length() - 2);
        }
        return "[" + result + "]";
    }
}
