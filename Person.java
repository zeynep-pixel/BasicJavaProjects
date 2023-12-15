/** A person in a game */
public class Person {
  
  // the strength of the person
  private int strength;
  
  // the energy level of the person, it starts at a default value
  private int energy = 10;
  
  // the intelligence of the person
  private int intelligence;
  
  //carry
  public boolean carry= false;

  /** Create a person with the given strength and intelligence */
  public Person(int strength, int intelligence) {
    this.strength = strength;
    this.intelligence = intelligence;
  }
  
  /** Returns the strength of the person */
  public int getStrength() {
    return strength;
  }
  
  /** Changes the strength of the person */
  public void setStrength(int strength) {
    this.strength = strength;
  }
  
  /** Returns the energy of the person */
  public int getEnergy() {
    return energy;
  }
  
  /** Increases or decreases the energy of the person by amount */
  public void adjustEnergy(int amount) {
    this.energy = this.energy + amount;
  }
  
  /** Returns the intelligence of the person */
  public int getIntelligence() {
    return intelligence;
  }
  
  /** Changes the intelligence of the person */
  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }
  
   public void setCarry(boolean carry) {
    this.carry = carry;
  }
   public boolean getCarry() {
    return this.carry;
  }
  
  
  
  public boolean pickup(GameItem x){
    if(this.getStrength()< x.getWeight()){
      return false;
    }
    else{
     this.setCarry(true); 
     return true;
     
    }
    
  }
  
  public String drop(GameItem x){
    if(this.getCarry() == true){
       this.setCarry(false);
       return x.getName();
    }
    else{
      return null;
    }
  
  }
  
  public void eat(Food a ){
    this.adjustEnergy(a.getCalories());
    a.eat(this);
    
  }
  
  
}
