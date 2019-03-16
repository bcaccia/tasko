package tasko;

public class Main {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("interactive mode");
		}
		else {
			Core.splitArgs(args);
		}

	}

}
