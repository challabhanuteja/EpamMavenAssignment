public class Gift
{
	private int noOfSweets,noOfChocolates;
	
	public Gift(int noOfSweets, int noOfChocolates) {
		this.noOfSweets = noOfSweets;
		this.noOfChocolates = noOfChocolates;
	}
	
	public int getNoOfSweets() {
		return noOfSweets;
	}

	public void setNoOfSweets(int noOfSweets) {
		this.noOfSweets = noOfSweets;
	}

	public int getNoOfChocolates() {
		return noOfChocolates;
	}

	public void setNoOfChocolates(int noOfChocolates) {
		this.noOfChocolates = noOfChocolates;
	}
}