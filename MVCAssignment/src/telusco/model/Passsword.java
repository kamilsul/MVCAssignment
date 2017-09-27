package telusco.model;

public class Passsword {
	String firstName = request.getParameter("firstName");
	String ageTxt = request.getParameter("age");

	Random random = new Random();

	// The order of appearance for the name and 0 for Name appearing first,
	// 1 for age appearing first. // Note: nextInt(x) excludes x
	int randomOrder = random.nextInt(2);

	String nameText = firstName;
	if (firstName.length() > 4) {

		// If name is shorter than 5 letters (Id <=6), display it as it is,
		// otherwise, choose randomely between 4 and 8.
		int randomNameLength = random.nextInt(5) + 4;

		if (firstName.length() > randomNameLength) {
			nameText = firstName.substring(0, randomNameLength);
		}
	}

	if (randomOrder == 0) {
		out.println(nameText + ageTxt);
	} else {
		out.println(ageTxt + nameText);
	}

}
