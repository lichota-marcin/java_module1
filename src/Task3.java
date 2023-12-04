public class Task3 {

    static class Person {
        private String name;
       private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    static class MakingChanges {
        public static void changeIdentities(Person p1, Person p2) {
            int temp1 = p1.getAge();
            String temp2 = p1.getName();
            p1.setAge(p2.getAge());
            p1.setName(p2.getName());
            p2.setName(temp2);
            p2.setAge(temp1);
        }
    }

    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("Ron", 45),
                new Person("Leslie", 40)
        };
        MakingChanges.changeIdentities(people[0],people[1]);
        System.out.println("Ron's new name: "+people[0].getName());
        System.out.println("Ron's new age: "+people[0].getAge());

        System.out.println("Leslie's new name: "+people[1].getName());
        System.out.println("Leslie's new age: "+people[1].getAge());
    }



}
