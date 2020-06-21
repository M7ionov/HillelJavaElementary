package L05;

public class Main {

    public static void main(String[] args) {
        //Реализовать простой контейнер для int на базе массива. Здесь можно
        // проявить мастерство архитектора :). Первым делом нужно подумать,
        // что должен делать контейнер, а потом реализовывать. Например:
        Container container = new Container();
        container.add(1);
        System.out.println(container.arrayToString());
        System.out.println(container.size());
        container.add(2);
        System.out.println(container.arrayToString());
        System.out.println(container.size());
        container.add(25);
        container.add(10);
        container.add(20);
        container.add(15);
        container.add(5);
        System.out.println(container.arrayToString());
        System.out.println(container.size());
        System.out.println(container.indexOf(5));
        System.out.println(container.getOfIndex(5));
        System.out.println(container.contains(0));
        System.out.println(container.arrayToString());
        container.sort();
        System.out.println(container.arrayToString());

        container.clear();
        System.out.println(container.arrayToString());

    }
}
