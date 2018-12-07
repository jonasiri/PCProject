/**
 * 
 */
package computersPractice;

/**
 * @author 40020788
 *
 */
public class Computer {
	private String name; 
	
	/**
	 * Default constructor
	 */
	public Computer() {
		
	}
	/**
	 * All fields constructor
	 * @param name
	 * @param rAM
	 * @param hDD
	 * @param processor
	 */
	public Computer(String name, int rAM, int hDD, double processor) {
		super();
		this.name = name;
		this.rAM = rAM;
		this.hDD = hDD;
		this.processor = processor;
	}
	/**
	 * @return the rAM
	 */
	public int getrAM() {
		return rAM;
	}
	/**
	 * @param rAM the rAM to set
	 */
	public void setrAM(int rAM) {
		this.rAM = rAM;
	}
	/**
	 * @return the hDD
	 */
	public int gethDD() {
		return hDD;
	}
	/**
	 * @param hDD the hDD to set
	 */
	public void sethDD(int hDD) {
		this.hDD = hDD;
	}
	/**
	 * @return the processor
	 */
	public double getProcessor() {
		return processor;
	}
	/**
	 * @param processor the processor to set
	 */
	public void setProcessor(double processor) {
		this.processor = processor;
	}
	private int rAM; 
	private int hDD;
	private double processor; 
	
	/**
	 * gets the name of the computer
	 * @return
	 */
	public String getName() {
		return name; 
	}
	/**
	 * sets the name of the computer
	 * @param name
	 */
	public void setName(String name) {
		this.name = name; 
	}
	
	/**
	 * DisplayAll Method
	 */
	public void displayAll(){
		System.out.println("Name:\t\t" + getName() + "\nRAM:\t\t"+ getrAM()+ "\nHDD:\t\t" + gethDD()+"\nProcessor:\t"+getProcessor());
	}
}
