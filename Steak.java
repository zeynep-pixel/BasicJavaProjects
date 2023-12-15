public class Steak extends Food {
public Steak() {
super("Steak", 0.25, 500);
}

public void eat(Person p){
  super.eat(p);
  p.setStrength(p.getStrength()+1);
}

}