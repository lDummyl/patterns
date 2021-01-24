package behave;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] strings = {"One", "Two"};
        MyIterator<String> iterator = new MyIterator<>(strings);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
