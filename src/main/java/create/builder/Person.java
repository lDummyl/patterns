package create.builder;

public class Person {

    private int age;
    private String name;

    @Override
    public String toString() {
        return String.format("Hi, I'm %s, %d years old", name, age);
    }

    public static class Builder {

        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public void withName(String name) {
            newPerson.name = name;
        }

        public void withAge(int age) {
            newPerson.age = age;
        }

        public Person build(){
            return newPerson;
        }
    }
}
