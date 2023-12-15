public abstract class Food {
private double weight;
private String name;
private int calories;
public Food(String name, double weight, int calories) {
this.name = name;
this.weight = weight;
this.calories= calories;
}
public double getWeight() {
return weight;
}
public String getName() {
return name;
}
public int getCalories() {
return calories;
}

public void eat(Person p){
   p.adjustEnergy(this.getCalories());
   
    
  
}



@Override
public String toString() {
return getName();
}

}