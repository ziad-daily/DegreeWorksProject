
//CHECK THE GeneralEducation part for the detaled information
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Elective extends JPanel {
	private JCheckBox ECOM_451;
	private JCheckBox ELEC_512;
	private JCheckBox ELEC_551;
	private JCheckBox ELEC_552;
	private JCheckBox ELEC_561;
	private JCheckBox ELEC_562;
	private JCheckBox ELEC_533;
	private JCheckBox ELEC_570;
	private JCheckBox ELEC_522;
	private JCheckBox ELEC_521;
	private JCheckBox ELEC_592;
	private JCheckBox ELEC_531;
	private JCheckBox ELEC_534;
	private JCheckBox ELEC_580;
	private JCheckBox ELEC_582;
	private JCheckBox ELEC_530;
	private int creditHours;
	public static final Color DARK_PURBLE = new Color(164, 16, 128);

	public Elective() {
		setLayout(new GridLayout(8, 0));
		setBorder(BorderFactory.createTitledBorder("ELECTRICAL ELECTIVES"));

		// a make a check box for all of the electives
		ECOM_451 = new JCheckBox("ECOM_451(0,0,0)");
		ELEC_512 = new JCheckBox("ELEC_512(0,0,0)");
		ELEC_551 = new JCheckBox("ELEC_551(0,0,0)");
		ELEC_552 = new JCheckBox("ELEC_552(0,0,0)");
		ELEC_561 = new JCheckBox("ELEC_561(0,0,0)");
		ELEC_562 = new JCheckBox("ELEC_562(0,0,0)");
		ELEC_533 = new JCheckBox("ELEC_533(0,0,0)");
		ELEC_570 = new JCheckBox("ELEC_570(0,0,0)");
		ELEC_522 = new JCheckBox("ELEC_522(0,0,0)");
		ELEC_521 = new JCheckBox("ELEC_521(0,0,0)");
		ELEC_592 = new JCheckBox("ELEC_592(0,0,0)");
		ELEC_531 = new JCheckBox("ELEC_531(0,0,0)");
		ELEC_534 = new JCheckBox("ELEC_534(0,0,0)");
		ELEC_580 = new JCheckBox("ELEC_580(0,0,0)");
		ELEC_582 = new JCheckBox("ELEC_582(0,0,0)");
		ELEC_530 = new JCheckBox("ELEC_530(0,0,0)");

		// COLOR THEM WITH PURBLE
		ECOM_451.setForeground(DARK_PURBLE);
		ELEC_512.setForeground(DARK_PURBLE);
		ELEC_551.setForeground(DARK_PURBLE);
		ELEC_552.setForeground(DARK_PURBLE);
		ELEC_561.setForeground(DARK_PURBLE);
		ELEC_562.setForeground(DARK_PURBLE);
		ELEC_533.setForeground(DARK_PURBLE);
		ELEC_570.setForeground(DARK_PURBLE);
		ELEC_522.setForeground(DARK_PURBLE);
		ELEC_521.setForeground(DARK_PURBLE);
		ELEC_592.setForeground(DARK_PURBLE);
		ELEC_531.setForeground(DARK_PURBLE);
		ELEC_534.setForeground(DARK_PURBLE);
		ELEC_580.setForeground(DARK_PURBLE);
		ELEC_582.setForeground(DARK_PURBLE);
		ELEC_530.setForeground(DARK_PURBLE);

		// add them to the panel
		add(ECOM_451);
		add(ELEC_512);
		add(ELEC_551);
		add(ELEC_552);
		add(ELEC_561);
		add(ELEC_562);
		add(ELEC_533);
		add(ELEC_570);
		add(ELEC_522);
		add(ELEC_521);
		add(ELEC_592);
		add(ELEC_531);
		add(ELEC_534);
		add(ELEC_580);
		add(ELEC_582);
		add(ELEC_530);
	}

	public int getCreditHours() // a class to get the credit hours
	{
		creditHours = 0;
		ArrayList<Integer> courseList = new ArrayList();

		if (ECOM_451.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_512.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_551.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_552.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_561.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_562.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_533.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_570.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_522.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_521.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_592.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_531.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_534.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_580.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_582.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_530.isSelected()) {
			courseList.add(3);
		}

		for (int index = 0; index < courseList.size(); index++) {
			creditHours += courseList.get(index);
		}

		return creditHours;
	}

	public ArrayList<String> getCourses()// a class to get the selected courses
	{
		ArrayList<String> courseList = new ArrayList();
		courseList.clear();

		if (ECOM_451.isSelected()) {
			courseList.add("ECOM_451");
		}
		if (ELEC_512.isSelected()) {
			courseList.add("ELEC_512");
		}
		if (ELEC_551.isSelected()) {
			courseList.add("ELEC_551");
		}
		if (ELEC_552.isSelected()) {
			courseList.add("ELEC_552");
		}
		if (ELEC_561.isSelected()) {
			courseList.add("ELEC_561");
		}
		if (ELEC_562.isSelected()) {
			courseList.add("ELEC_562");
		}
		if (ELEC_533.isSelected()) {
			courseList.add("ELEC_533");
		}
		if (ELEC_570.isSelected()) {
			courseList.add("ELEC_570");
		}
		if (ELEC_522.isSelected()) {
			courseList.add("ELEC_522");
		}
		if (ELEC_521.isSelected()) {
			courseList.add("ELEC_521");
		}
		if (ELEC_592.isSelected()) {
			courseList.add("ELEC_592");
		}
		if (ELEC_531.isSelected()) {
			courseList.add("ELEC_531");
		}
		if (ELEC_534.isSelected()) {
			courseList.add("ELEC_534");
		}
		if (ELEC_580.isSelected()) {
			courseList.add("ELEC_580");
		}
		if (ELEC_582.isSelected()) {
			courseList.add("ELEC_582");
		}
		if (ELEC_530.isSelected()) {
			courseList.add("ELEC_530");
		}

		return courseList;
	}

	public void setCourses(ArrayList<String> newCourses, int semester, boolean mainCheck, boolean electricalCheck) {
		String check1 = "", check2 = "", check3 = "";

		for (String str : newCourses) {
			if ("ECOM_451" == str)
				check1 = str;

			if ("ECOM_360" == str)
				check2 = str;

			if (check1 != "ECOM_451" && check2 == "ECOM_360" && semester % 2 == 1 && mainCheck && electricalCheck) {
				ECOM_451.setVisible(true);
				break;
			} else
				ECOM_451.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_512" == str)
				check1 = str;

			if ("ELEC_370" == str)
				check2 = str;

			if (check1 != "ELEC_512" && check2 == "ELEC_370" && semester % 2 == 0 && mainCheck && electricalCheck) {
				ELEC_512.setVisible(true);
				break;
			} else
				ELEC_512.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_551" == str)
				check1 = str;

			if ("ELEC_360" == str)
				check2 = str;

			if ("MATH_145" == str)
				check3 = str;

			if (check1 != "ELEC_551" && check2 == "ELEC_360" && check3 == "MATH_145" && semester % 2 == 1 && mainCheck
					&& electricalCheck) {
				ELEC_551.setVisible(true);
				break;
			} else
				ELEC_551.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_552" == str)
				check1 = str;

			if ("ECOM_432" == str)
				check2 = str;

			if (check1 != "ELEC_552" && check2 == "ECOM_432" && semester % 2 == 0 && mainCheck && electricalCheck) {
				ELEC_552.setVisible(true);
				break;
			} else
				ELEC_552.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_561" == str)
				check1 = str;

			if ("ELEC_330" == str)
				check2 = str;

			if (check1 != "ELEC_561" && check2 == "ELEC_330" && semester % 2 == 1 && mainCheck && electricalCheck) {
				ELEC_561.setVisible(true);
				break;
			} else
				ELEC_561.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_562" == str)
				check1 = str;

			if ("ELEC_451" == str)
				check2 = str;

			if (check1 != "ELEC_562" && check2 == "ELEC_451" && semester % 2 == 0 && mainCheck && electricalCheck) {
				ELEC_562.setVisible(true);
				break;
			} else
				ELEC_562.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_533" == str)
				check1 = str;

			if ("ELEC_370" == str)
				check2 = str;

			if (check1 != "ELEC_533" && check2 == "ELEC_370" && semester % 2 == 1 && mainCheck && electricalCheck) {
				ELEC_533.setVisible(true);
				break;
			} else
				ELEC_533.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_570" == str)
				check1 = str;

			if ("ELEC_330" == str)
				check2 = str;

			if ("ELEC_451" == str)
				check3 = str;
			if (check1 != "ELEC_570" && check2 == "ELEC_330" && check3 == "ELEC_451" && mainCheck && electricalCheck) {
				ELEC_570.setVisible(true);
				break;
			} else
				ELEC_570.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_522" == str)
				check1 = str;

			if ("ELEC_431" == str)
				check2 = str;

			if (check1 != "ELEC_522" && check2 == "ELEC_431" && semester % 2 == 0 && mainCheck && electricalCheck) {
				ELEC_522.setVisible(true);
				break;
			} else
				ELEC_522.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_521" == str)
				check1 = str;

			if ("ELEC_431" == str)
				check2 = str;

			if (check1 != "ELEC_521" && check2 == "ELEC_431" && semester % 2 == 1 && mainCheck && electricalCheck) {
				ELEC_521.setVisible(true);
				break;
			} else
				ELEC_521.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_592" == str)
				check1 = str;

			if ("ELEC_370" == str)
				check2 = str;

			if ("ELEC_320" == str)
				check3 = str;

			if (check1 != "ELEC_592" && check2 == "ELEC_370" && check3 == "ELEC_320" && semester % 2 == 0 && mainCheck
					&& electricalCheck) {
				ELEC_592.setVisible(true);
				break;
			} else
				ELEC_592.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_531" == str)
				check1 = str;

			if ("ELEC_472" == str)
				check2 = str;

			if (check1 != "ELEC_531" && check2 == "ELEC_472" && semester % 2 == 1 && mainCheck && electricalCheck) {
				ELEC_531.setVisible(true);
				break;
			} else
				ELEC_531.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_534" == str)
				check1 = str;

			if ("ELEC_472" == str)
				check2 = str;

			if (check1 != "ELEC_534" && check2 == "ELEC_472" && semester % 2 == 0 && mainCheck && electricalCheck) {
				ELEC_534.setVisible(true);
				break;
			} else
				ELEC_534.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_580" == str)
				check1 = str;

			if ("ELEC_370" == str)
				check2 = str;

			if (check1 != "ELEC_580" && check2 == "ELEC_370" && mainCheck && electricalCheck) {
				ELEC_580.setVisible(true);
				break;
			} else
				ELEC_580.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_582" == str)
				check1 = str;

			if ("ELEC_370" == str)
				check2 = str;

			if (check1 != "ELEC_582" && check2 == "ELEC_370" && semester % 2 == 0 && mainCheck && electricalCheck) {
				ELEC_582.setVisible(true);
				break;
			} else
				ELEC_582.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_530" == str)
				check1 = str;

			if ("ELEC_472" == str)
				check2 = str;

			if ("ELEC_431" == str)
				check3 = str;

			if (check1 != "ELEC_530" && (check2 == "ELEC_472" || check3 == "ELEC_431") && mainCheck
					&& electricalCheck) {
				ELEC_530.setVisible(true);
				break;
			} else
				ELEC_530.setVisible(false);
		}

		// make them invisibale if the course is selected
		for (String str : newCourses) {
			if ("ECOM_451" == str)
				ECOM_451.setVisible(false);

			if ("ELEC_512" == str)
				ELEC_512.setVisible(false);

			if ("ELEC_551" == str)
				ELEC_551.setVisible(false);

			if ("ELEC_552" == str)
				ELEC_552.setVisible(false);

			if ("ELEC_561" == str)
				ELEC_561.setVisible(false);

			if ("ELEC_562" == str)
				ELEC_562.setVisible(false);

			if ("ELEC_533" == str)
				ELEC_533.setVisible(false);

			if ("ELEC_570" == str)
				ELEC_570.setVisible(false);

			if ("ELEC_522" == str)
				ELEC_522.setVisible(false);

			if ("ELEC_521" == str)
				ELEC_521.setVisible(false);

			if ("ELEC_592" == str)
				ELEC_592.setVisible(false);

			if ("ELEC_531" == str)
				ELEC_531.setVisible(false);

			if ("ELEC_534" == str)
				ELEC_534.setVisible(false);

			if ("ELEC_580" == str)
				ELEC_580.setVisible(false);

			if ("ELEC_582" == str)
				ELEC_582.setVisible(false);

			if ("ELEC_530" == str)
				ELEC_530.setVisible(false);

		}
	}

	public void clearElective() {
		// set the courses to visible
		ECOM_451.setVisible(true);
		ELEC_551.setVisible(true);
		ELEC_552.setVisible(true);
		ELEC_561.setVisible(true);
		ELEC_562.setVisible(true);
		ELEC_533.setVisible(true);
		ELEC_570.setVisible(true);
		ELEC_522.setVisible(true);
		ELEC_521.setVisible(true);
		ELEC_592.setVisible(true);
		ELEC_531.setVisible(true);
		ELEC_534.setVisible(true);
		ELEC_580.setVisible(true);
		ELEC_582.setVisible(true);
		ELEC_530.setVisible(true);
		ELEC_512.setVisible(true);
		// deselect the courses.
		ECOM_451.setSelected(false);
		ELEC_551.setSelected(false);
		ELEC_552.setSelected(false);
		ELEC_561.setSelected(false);
		ELEC_562.setSelected(false);
		ELEC_533.setSelected(false);
		ELEC_570.setSelected(false);
		ELEC_522.setSelected(false);
		ELEC_521.setSelected(false);
		ELEC_592.setSelected(false);
		ELEC_531.setSelected(false);
		ELEC_534.setSelected(false);
		ELEC_580.setSelected(false);
		ELEC_582.setSelected(false);
		ELEC_530.setSelected(false);
		ELEC_512.setSelected(false);
	}

}
