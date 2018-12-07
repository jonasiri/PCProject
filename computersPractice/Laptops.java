/**
 * 
 */
package computersPractice;

/**
 * @author 40020788
 *
 */
public class Laptops extends Computer {

	private double screenSize; 
	private int fans; 
	/**
	 * Default constructor
	 */
	public Laptops() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * All fields constructor
	 * @param name
	 * @param rAM
	 * @param hDD
	 * @param processor
	 */
	public Laptops(String name, int rAM, int hDD, double processor, double screenSize, int fans) {
		super(name, rAM, hDD, processor);
		setScreenSize(screenSize);
		setFans(fans);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the screenSize
	 */
	public double getScreenSize() {
		return screenSize;
	}

	/**
	 * @param screenSize the screenSize to set
	 */
	public void setScreenSize(double screenSize) {
		if (screenSize>0 && screenSize<50) {
		this.screenSize = screenSize;
		} else {System.out.println("\nInvalid screen size for "+ getName());
		this.screenSize = 15.6; 
		}
	}
		
	/**
	 * @return the fans
	 */
	public int getFans() {
		return fans;
	}

	/**
	 * @param fans the fans to set
	 */
	public void setFans(int fans) {
		if (fans>0 && fans<=4) {
		this.fans = fans;
		} else {System.out.println("Incorrect fans value for " + getName());
		this.fans = 2; 
		}
	}

	@Override
	public void displayAll() {
		System.out.println("\nLaptop");
		super.displayAll();
		System.out.println("Screen size:\t" + getScreenSize()+"\nFans:\t\t"+getFans());
		
	}

}
