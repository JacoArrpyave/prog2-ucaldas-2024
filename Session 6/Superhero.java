public class Superhero {
    private String superhero_name="";
    private int superPowers_number=0;
    private String[] superPower=new String[superPowers_number];
    private boolean isAlive =false;
    private int universe =0;
    public Superhero(String superhero_name, int superPowers_number, String[] superPower, boolean isAlive,
            int universe) {
        this.superhero_name = superhero_name;
        this.superPowers_number = superPowers_number;
        this.superPower = superPower;
        this.isAlive = isAlive;
        this.universe = universe;
    }
    public String getSuperhero_name() {
        return superhero_name;
    }
    public int getSuperPowers_number() {
        return superPowers_number;
    }
    public void SuperPower() {
        for (String powers : superPower) {
            System.out.println(powers);
            
        }
    }
    public boolean isAlive() {
        return isAlive;
    }
    public int getUniverse() {
        return universe;
    }
    
}
