public class Apple extends Food {
public Apple() {
super("Apple", 0.25, 100);
}

public void eat(Person p){
  super.eat(p);
  p.setIntelligence(p.getIntelligence()+1);
}


}