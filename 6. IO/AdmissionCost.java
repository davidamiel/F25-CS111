public class AdmissionCost {

	public static void main(String[] args) {

		StdOut.println("How many people?");
		int people = StdIn.readInt();

		StdOut.println("Do you need parking (Yes/No)?");
		String parking = StdIn.readString();

		int cost = people * 15;
		if (parking.equals("Yes")) {
			cost += 10;
		}

		StdOut.println(cost);

	}
}
			

