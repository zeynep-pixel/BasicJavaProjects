public abstract class GameItem {
private double weight;
private String name;
public GameItem(String name, double weight) {
this.name = name;
this.weight = weight;
}
public double getWeight() {
return weight;
}
public String getName() {
return name;
}
@Override
public String toString() {
return getName();
}
}