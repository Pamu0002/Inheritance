public class Inheritance {

        private String name;
        private int age;

        public Inheritance(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void makeSound() {
            System.out.println("Animal makes a generic sound.");
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age;
        }

        public static class Mammal extends Inheritance {
            String furcolour;

            public Mammal(String name, int age, String furcolour) {
                super(name, age);
                this.furcolour = furcolour;
            }

            public void makeSound() {
                System.out.println("Mammal makes a mammal-specific sound.");
            }

            @Override
            public String toString() {
                return super.toString() + ", Fur Color: " + furcolour;
            }
        }

        public static class Bird extends Inheritance {
            double wingspan;

            public Bird(String name, int age, double fwingspan) {
                super(name, age);
                this.wingspan = wingspan;
            }

            public void makeSound() {
                System.out.println("Bird makes a bird-specific sound.");
            }

            @Override
            public String toString() {
                return super.toString() + " Wing Span: " + wingspan;
            }
        }

        public static class Dog extends Inheritance {
            String breed;

            public Dog(String name, int age, String breed) {
                super(name, age);
                this.breed = breed;
            }

            public void makeSound() {
                System.out.println("Dog makes a dog-specific sound.");
            }

            @Override
            public String toString() {
                return super.toString() + ", Breed: " + breed;
            }
        }

        public class Main {
            public static void main(String[] args) {
                Inheritance animal = new Inheritance("Animal", 5);
                Mammal rabit = new Mammal("Rabbit", 8, "white");
                Bird eagle = new Bird("Eagle", 3, 6.5);
                Dog rotviolate = new Dog("Labrador", 2, "Rotviolate");

                animal.makeSound();
                rabit.makeSound();
                eagle.makeSound();
                rotviolate.makeSound();

                System.out.println(animal);
                System.out.println(rabit);
                System.out.println(eagle);
                System.out.println(rotviolate);
            }
    }
}
