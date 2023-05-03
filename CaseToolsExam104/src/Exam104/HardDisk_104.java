package Exam104;

    /**
     * @author exam104
     * this is a class called Hard disk <p>
     * this class is used to determine the size of hardDisk and to format and delete it.
     * this class has three things to do:-
     * 1)format the HardDisk
     * 2)Delete it
     * 3)Determine the size
     */

public class HardDisk_104 {
	
	int size;
	
	/**
	 * 
	 * @param size
	 * This is a constructor used to initialize the class HardDisk
	 * 
	 */
	HardDisk_104(int size)
	{
		this.size=size;
	}
	
	/**
	 * This is a function used to determine Format of hardDisk
	 * @see Format
	 */
	
	void format()
	{
		size = 1000;
	}
	
	/**
	 * This is a function used to Delete file size from size
	 * @param file_size
	 */
	
	void delete(int file_size)
	{
		size = size - file_size;
	}
	
	/**
	 * This is a Function used to display the remaining memory in HardDisk
	 * @see +size
	 */
	
	void display_()
	{
		System.out.println("The remaining memory is " +size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
