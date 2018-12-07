/**
 * 
 */
package computersPractice;

/**
 * @author 40020788
 *
 */
public class Tower extends Computer {
	private double volume; 
	private int fans; 
	/**
	 * Default constructor
	 */
	public Tower() {
		
	}

	/**
	 * All fields constructor
	 * @param name
	 * @param rAM
	 * @param hDD
	 * @param processor
	 */
	public Tower(String name, int rAM, int hDD, double processor, double volume, int fans) {
		super(name, rAM, hDD, processor);
		setVolume(volume);
		setFans(fans);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the volume
	 */
	public double getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(double volume) {
		if (volume>200 && volume<2000) {
		this.volume = volume;
		} else {System.out.println("Incorrect volume for " + getName());
		this.volume = 1000; 
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
		if (fans>0 && fans<8) {
			this.fans = fans;
			} else {System.out.println("Incorrect fans value for " + getName());
			this.fans = 2; 
			}
	}
	
	@Override
	public void displayAll() {
		System.out.println("\nTower");
		super.displayAll();
		System.out.println("Volume:\t\t" + getVolume()+"\nFans:\t\t"+getFans());
		
	}

}
