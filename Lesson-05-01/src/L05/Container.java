package L05;
//+добавлять (add)
//+доставать по индексу (get)
//+проверять наличие элемента (contains)
//+добавлять все элементы из другого контейнера (addAll)
//проверять на равенство (equals)
//+очищать (clear)
//+находить индекс элемента (find or indexOf)
//+узнавать размер (getSize)
//+сортировать (sort)
public class Container {

    private int[] array = new int[5];
    private int size = 0;

    public Container(int[] array){
        this.array = createCopy(array);
    }

    public Container(){
    }
    //вывод на печать
    public String arrayToString(){
        if (isEmpty()){
            return "[]";
        }
        String s = "";
        for (int i = 0; i<size; i++)
            s += array[i] + ", ";
        s = s.substring(0, s.length()-2);
        s = "["+s+"]";
        return s;
    }
    //находить индекс элемента (find or indexOf)
    public int indexOf(int toFind){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toFind){
                return i;
            }
        }
        return -1;
    }
    //проверять наличие элемента (contains)
    public boolean contains(int toFind){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toFind){
                return true;
            }
        }
        return false;
    }
    //доставать по индексу (get)
    public int getOfIndex(int index){
        if (index < size){
            return array[index];
        }
        return -1;
    }
    //очищать (clear)
    public void clear(){
        //for (int i = 0; i < array.length; i++) {
        for (int i = 0; i < size; i++) {
            array[i] = 0;
        }
    }
    //сортировать (sort)
    public void sort(){
        //for (int i = 0; i < array.length; i++) {
        for (int i = 0; i < size; i++) {
            int min = array[i];
            int min_i = i;
            //for (int j = i+1; j < array.length; j++) {
            for (int j = i+1; j < size; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }

    private int[] createCopy(int[] array){
        int[] result = new int[array.length];
        for (int i=0; i<array.length; i++){
            result[i]=array[i];
        }
        return result;
    }
    //добавлять (add)
    public void add(int el){
        if (size == array.length){
            int[] newArray = new int[size*2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = el;
        size++;
    }
    //узнавать размер (getSize)
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    //добавлять все элементы из другого контейнера (addAll)
    public void addAll(int[] array){
        this.array = array;
        this.size = array.length;
    }
}
