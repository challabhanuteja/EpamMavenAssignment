public class Chocolate extends Gift
{
	private double price, weight;
	
	public Chocolate(double price, double weight) {
		this.price = price;
		this.weight = weight;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}