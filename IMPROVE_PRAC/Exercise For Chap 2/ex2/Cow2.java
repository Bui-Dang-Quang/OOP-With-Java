public class Cow2 {
    private String name;
    private String breed;
    private Integer age;

        // set a Cow input function
        public Cow2(String n, String b){
            this.name = n;
            this.breed = b;
            // this.age = a;
        }

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

