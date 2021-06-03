
public class Assignment1 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i < args.length; i++) {
			
			String arg = args[i];
			
			try {
				sum += Integer.parseInt(arg);
			} catch (NumberFormatException e) {
				System.err.println(arg + " could not be parsed as a 32-bit signed integer.");
			}
		}
		
		System.out.println("Sum of all valid arguments: " + sum);
	}
}
