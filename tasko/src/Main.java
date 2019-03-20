import java.util.Scanner;

public class Main {

	public static boolean runState = true;
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		if (args.length == 0) {
			while (runState) {
				Task.commandHeader();
				Task.menuOptions();

			}
		}
		else {
			Task.splitArgs(args);
		}
	input.close();
	}

}
