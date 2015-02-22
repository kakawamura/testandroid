/**
 * 
 * @author Kazushi Kawamura 
 * how to push..
 *
 */
public class BlueCar extends Car{
	
	String color;
	public BlueCar(String name) {
		super(name);
		color = "blue";
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}
