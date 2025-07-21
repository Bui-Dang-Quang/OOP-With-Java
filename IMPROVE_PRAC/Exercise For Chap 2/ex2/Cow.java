
public class Cow {
    private String name;
    private String breed;
    private Integer age;

        // public setter
        public void setName(String n){
            this.name = n;
        }
        public void setBreed(String b){
            this.breed = b;
        }
        public void setAge(Integer a){
            this.age = a;
        }
    
        // public getter
        public String getName(){
            return name;
        }
        public String getBreed(){
            return breed;
        }
        public Integer geteAge(){
            return age;
        }

        public void moo(){
            System.out.println("Moo...!");
        }  
}
