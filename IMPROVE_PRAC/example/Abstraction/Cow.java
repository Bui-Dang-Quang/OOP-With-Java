class Cow extends Animal{
    public void createNoise() {
        System.out.println("Moo");
    }
    public void createNoise2() {
        System.out.println("Abstract Method: Moo");
    }

    public static void main(String[] args) {
        Animal ani = new Cow();
        ani.createNoise();

        // vd 2: applied abstract to method
        Cow mycow = new Cow();
        mycow.createNoise2();
    }
    
}
