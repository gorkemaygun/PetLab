public class Pet {

    public static void main(String[] args) {

        Pet pet1 = new Pet("Captain", 1, "Matthews", "Dog");
        System.out.println("Name: " + pet1.getName());
        System.out.println("Age: " + pet1.getAge());
        System.out.println("Location: " + pet1.getLocation());
        System.out.println("Type: " + pet1.getType());

    }

    private String name, location, type;
    private int age;

    Pet() {
        this.name = "Harry";
        this.age = 3;
        this.location = "North Carolina";
        this.type = "Dog";

    }

    Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setLocation(String location) {
        this.location = location;

    }

    public void setType(String type) {
        this.type = type;
    }
}
