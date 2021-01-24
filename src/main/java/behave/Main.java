package behave;

    /*
    Написать релизацию итератора для матрицы (2 мерного массива) он должен выводить элементы
    в следующем порядке
    {{1,2,3},
    {4,5,6}}
    */

public class Main {

    public static void main(String[] args) {
        String[] strings = {"One", "Two"};
        MyIterator<String> iterator = new MyIterator<>(strings);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
