package create.builder;


/*
Задание
сделать строитель для здания: Фундамент, корпус, кровля, тепловой узел, лифт.
 */
public class Main {

    public static void main(String[] args) {
        Person.Builder builder = new Person.Builder();
        builder.withName("John");
        builder.withAge(18);
        Person johny = builder.build();

        System.out.println(johny);



    }
}
