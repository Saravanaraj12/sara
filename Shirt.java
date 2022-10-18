package CollectionObject2;

public class Shirt {
	private String brand,colour;
	private int price;
	private boolean isChecked;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
	public boolean getIsChecked() {
		return isChecked;
	}
	
	
	Shirt(String brand,String colour,int price,boolean isChecked)
	{
		this.brand=brand;
		this.colour=colour;
		this.price=price;
		this.isChecked=isChecked;
	}
	public String toString()
	{
		return brand+" "+colour+" "+price+" "+isChecked;
	}
	
	
	

}
