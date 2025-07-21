public class Cow {
    private String name;
    private String breed;
    private Integer age;
    private Double weight;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public Integer getAge() {
        return age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void moo(){
        System.out.println("Moo...");
    }

    public void showInfo(){
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age + ", Weight: " + weight);
        moo();
    }

}
