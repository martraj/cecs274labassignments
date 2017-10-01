package lab_assignment3;
/**
 * represents a Bug object that is able to move up in the vertical direction until it reaches 100 cm
 * @author Mariel
 * @version 1.0
 * @since 2017-09-14
 */
public class Bug {
	
	private int position;
	
	/**
	 * moves the bug 10 centimeters up until it reaches 100 cm, at which point it's position is reverted back
	 * to zero
	 */
	public void up(){
		position += 10;
		if(position == 100){
			position = 0;
		}
	}
	
	/**
	 * gets the current position of the bug as an int
	 * @return an integer that represents the position
	 */
	public int getPosition(){
		return position;
	}
}
