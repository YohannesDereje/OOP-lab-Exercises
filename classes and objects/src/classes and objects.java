public class Main {
    class Lamp {

        // stores the value for light
        // true if light is on
        // false if light is off
        boolean isOn;

        // method to turn on the light
        void turnOn() {
            isOn = true;
            System.out.println("Light on? " + isOn);

        }

        // method to turnoff the light
        void turnOff() {
            isOn = false;
            System.out.println("Light on? " + isOn);
        }
    }

    class Main {
        public static void main(String[] args) {

            // create objects led and halogen
            Lamp led = new Lamp();
            Lamp halogen = new Lamp();

            // turn on the light by
            // calling method turnOn()
            led.turnOn();

            // turn off the light by
            // calling method turnOff()
            halogen.turnOff();
        }
    }
    // Class Declaration

    public class Dog
    {
        // Instance Variables
        String name;
        String breed;
        int age;
        String color;

        // Constructor Declaration of Class
        public Dog(String name, String breed,
                   int age, String color)
        {
            this.name = name;
            this.breed = breed;
            this.age = age;
            this.color = color;
        }

        // method 1
        public String getName()
        {
            return name;
        }

        // method 2
        public String getBreed()
        {
            return breed;
        }

        // method 3
        public int getAge()
        {
            return age;
        }

        // method 4
        public String getColor()
        {
            return color;
        }

        @Override
        public String toString()
        {
            return("Hi my name is "+ this.getName()+
                    ".\nMy breed,age and color are " +
                    this.getBreed()+"," + this.getAge()+
                    ","+ this.getColor());
        }

        public static void main(String[] args)
        {
            Dog tuffy = new Dog("tuffy","papillon", 5, "white");
            System.out.println(tuffy.toString());
        }
    }
}