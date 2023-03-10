import javax.swing.*;
//CHECK THE GeneralEducation part for the detaled information
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Core extends JPanel {

	private JCheckBox ELEC_305;
	private JCheckBox ELEC_320;
	private JCheckBox ELEC_315;
	private JCheckBox ELEC_325;
	private JCheckBox ELEC_330;
	private JCheckBox ELEC_335;
	private JCheckBox ELEC_360;
	private JCheckBox ELEC_370;
	private JCheckBox ECOM_360;
	private JCheckBox ECOM_432;
	private JCheckBox ELEC_431;
	private JCheckBox ELEC_451;
	private JCheckBox ELEC_411;
	private JCheckBox ELEC_462;
	private JCheckBox ELEC_472;
	private JCheckBox ELEC_310;
	private JCheckBox ELEC_345;
	private JCheckBox ELEC_375;
	private JCheckBox ELEC_461;
	private JCheckBox ECOM_442;
	private JCheckBox ELEC_433;
	private JCheckBox ELEC_481;
	private JCheckBox ELEC_495;
	private JCheckBox ELEC_585;
	private JCheckBox ELEC_590;
	private JCheckBox MSE;
	private int creditHours;

	public static final Color DARK_CYAN = new Color(81, 183, 209);
	public static final Color DARK_GREEN = new Color(49, 148, 0);

	public Core() {
		setLayout(new GridLayout(8, 0));
		setBorder(BorderFactory.createTitledBorder("ELECTRICAL CORE COURSES"));

		ELEC_305 = new JCheckBox("ELEC_305(0,3,16)");
		ELEC_310 = new JCheckBox("ELEC_310(0,0,0)");
		ELEC_320 = new JCheckBox("ELEC_320(1,1,6)");
		ELEC_315 = new JCheckBox("ELEC_315(0,1,7)");
		ELEC_325 = new JCheckBox("ELEC_325(1,0,0)");
		ELEC_330 = new JCheckBox("ELEC_330(1,2,6)");
		ELEC_335 = new JCheckBox("ELEC_335(0,2,5)");
		ELEC_345 = new JCheckBox("ELEC_345(0,0,0)");
		ELEC_360 = new JCheckBox("ELEC_360(0,2,11)");
		ELEC_370 = new JCheckBox("ELEC_370(1,0,5)");
		ELEC_375 = new JCheckBox("ELEC_375(1,0,0)");
		ECOM_360 = new JCheckBox("ECOM_360(1,1,4)");
		ECOM_432 = new JCheckBox("ECOM_432(0,0,1)");
		ECOM_442 = new JCheckBox("ECOM_442(0,0,0)");
		ELEC_431 = new JCheckBox("ELEC_431(0,0,3)");
		ELEC_433 = new JCheckBox("ELEC_433(0,0,0)");
		ELEC_451 = new JCheckBox("ELEC_451(1,1,3)");
		ELEC_461 = new JCheckBox("ELEC_461(1,0,0)");
		ELEC_411 = new JCheckBox("ELEC_411(0,0,0)");
		ELEC_481 = new JCheckBox("ELEC_481(0,0,0)");
		ELEC_462 = new JCheckBox("ELEC_462(0,0,0)");
		ELEC_472 = new JCheckBox("ELEC_472(0,0,0)");
		ELEC_495 = new JCheckBox("ELEC_495");
		ELEC_585 = new JCheckBox("ELEC_585");
		ELEC_590 = new JCheckBox("ELEC_590");
		MSE = new JCheckBox("MSE(1,0,0)");

		// COLOR GP1 GP2 IT with GREEN
		ELEC_495.setForeground(DARK_CYAN);
		ELEC_585.setForeground(DARK_CYAN);
		ELEC_590.setForeground(DARK_CYAN);
		MSE.setForeground(DARK_CYAN);
		ELEC_310.setForeground(DARK_GREEN);

		add(ELEC_305);
		add(ELEC_310);
		add(ELEC_320);
		add(ELEC_315);
		add(ELEC_325);
		add(ELEC_330);
		add(ELEC_335);
		add(ELEC_345);
		add(ELEC_360);
		add(ELEC_370);
		add(ELEC_375);
		add(ECOM_360);
		add(ECOM_432);
		add(ECOM_442);
		add(ELEC_431);
		add(ELEC_433);
		add(ELEC_451);
		add(ELEC_461);
		add(ELEC_411);
		add(ELEC_481);
		add(ELEC_462);
		add(ELEC_472);
		add(MSE);
		add(ELEC_495);
		add(ELEC_585);
		add(ELEC_590);

	}

	public int getCreditHours()// same idea as before
	{
		creditHours = 0;
		ArrayList<Integer> courseList = new ArrayList();

		if (ELEC_305.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_320.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_315.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_325.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_330.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_335.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_360.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_370.isSelected()) {
			courseList.add(3);
		}
		if (ECOM_360.isSelected()) {
			courseList.add(3);
		}
		if (ECOM_432.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_431.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_451.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_411.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_462.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_472.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_310.isSelected()) {
			courseList.add(1);
		}
		if (ELEC_345.isSelected()) {
			courseList.add(1);
		}
		if (ELEC_375.isSelected()) {
			courseList.add(1);
		}
		if (ELEC_461.isSelected()) {
			courseList.add(1);
		}
		if (ECOM_442.isSelected()) {
			courseList.add(1);
		}
		if (ELEC_433.isSelected()) {
			courseList.add(1);
		}
		if (ELEC_481.isSelected()) {
			courseList.add(1);
		}
		if (ELEC_495.isSelected()) {
			courseList.add(15);
		}
		if (ELEC_585.isSelected()) {
			courseList.add(3);
		}
		if (ELEC_590.isSelected()) {
			courseList.add(3);
		}
		if (MSE.isSelected()) {
			courseList.add(3);
		}
		for (int index = 0; index < courseList.size(); index++) {
			creditHours += courseList.get(index);
		}

		return creditHours;
	}

	public ArrayList<String> getCourses()// same idea as before
	{
		ArrayList<String> courseList = new ArrayList();
		courseList.clear();

		if (ELEC_305.isSelected()) {
			courseList.add("ELEC_305");
		}
		if (ELEC_320.isSelected()) {
			courseList.add("ELEC_320");
		}
		if (ELEC_315.isSelected()) {
			courseList.add("ELEC_315");
		}
		if (ELEC_325.isSelected()) {
			courseList.add("ELEC_325");
		}
		if (ELEC_330.isSelected()) {
			courseList.add("ELEC_330");
		}
		if (ELEC_335.isSelected()) {
			courseList.add("ELEC_335");
		}
		if (ELEC_360.isSelected()) {
			courseList.add("ELEC_360");
		}
		if (ELEC_370.isSelected()) {
			courseList.add("ELEC_370");
		}
		if (ECOM_360.isSelected()) {
			courseList.add("ECOM_360");
		}
		if (ECOM_432.isSelected()) {
			courseList.add("ECOM_432");
		}
		if (ELEC_431.isSelected()) {
			courseList.add("ELEC_431");
		}
		if (ELEC_451.isSelected()) {
			courseList.add("ELEC_451");
		}
		if (ELEC_411.isSelected()) {
			courseList.add("ELEC_411");
		}
		if (ELEC_462.isSelected()) {
			courseList.add("ELEC_462");
		}
		if (ELEC_472.isSelected()) {
			courseList.add("ELEC_472");
		}
		if (ELEC_310.isSelected()) {
			courseList.add("ELEC_310");
		}
		if (ELEC_345.isSelected()) {
			courseList.add("ELEC_345");
		}
		if (ELEC_375.isSelected()) {
			courseList.add("ELEC_375");
		}
		if (ELEC_461.isSelected()) {
			courseList.add("ELEC_461");
		}
		if (ECOM_442.isSelected()) {
			courseList.add("ECOM_442");
		}
		if (ELEC_433.isSelected()) {
			courseList.add("ELEC_433");
		}
		if (ELEC_481.isSelected()) {
			courseList.add("ELEC_481");
		}
		if (ELEC_495.isSelected()) {
			courseList.add("ELEC_495");
		}
		if (ELEC_585.isSelected()) {
			courseList.add("ELEC_585");
		}
		if (ELEC_590.isSelected()) {
			courseList.add("ELEC_590");
		}
		if (MSE.isSelected()) {
			courseList.add("MSE");
		}
		return courseList;
	}

	public void setCourses(ArrayList<String> newCourses, int semester, boolean electricalCheck, int out)
	// same idea as
	// before
	// there is some
	// modefication on the
	// method and check the
	// idustrail traing part

	{
		String check1 = "", check2 = "";
		int n = 0; // count the number of courses that is taken for industrail training

		for (String str : newCourses) {
			if (electricalCheck) {
				ELEC_305.setVisible(true);
				ELEC_310.setVisible(true);
			} else {
				ELEC_305.setVisible(false);
				ELEC_310.setVisible(false);
			}
		}

		for (String str : newCourses) {
			if ("GENG_220" == str)
				check1 = str;

			if ("ELEC_305" == str)
				check2 = str;

			if (electricalCheck && check1 == "GENG_220" && check2 == "ELEC_305") {
				ELEC_320.setVisible(true);
				break;
			} else
				ELEC_320.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_305" == str)
				check1 = str;

			if (electricalCheck && check1 == "ELEC_305") {
				ELEC_315.setVisible(true);
				break;
			} else
				ELEC_315.setVisible(false);
		}

		for (String str : newCourses) {
			if ("PHYS_110" == str)
				check1 = str;

			if ("MATH_135" == str)
				check2 = str;

			if (electricalCheck && check1 == "PHYS_110" && check2 == "MATH_135") {
				ELEC_325.setVisible(true);
				break;
			} else
				ELEC_325.setVisible(false);
		}
		for (String str : newCourses) {
			if (electricalCheck)
				ELEC_330.setVisible(true);
			else
				ELEC_330.setVisible(false);
		}

		for (String str : newCourses) {
			if (electricalCheck) {
				ELEC_335.setVisible(true);
				ELEC_345.setVisible(true);
			} else {
				ELEC_335.setVisible(false);
				ELEC_345.setVisible(false);
			}
		}
		for (String str : newCourses) {
			if ("MATH_270" == str)
				check1 = str;

			if (electricalCheck && check1 == "MATH_270") {
				ELEC_360.setVisible(true);
				break;
			} else
				ELEC_360.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_315" == str)
				check1 = str;

			if (electricalCheck && check1 == "ELEC_315") {
				ELEC_370.setVisible(true);
				ELEC_375.setVisible(true);
				break;
			} else {
				ELEC_370.setVisible(false);
				ELEC_375.setVisible(false);
			}
		}

		for (String str : newCourses) {
			if ("ELEC_360" == str)
				check1 = str;

			if (electricalCheck && check1 == "ELEC_360") {
				ECOM_360.setVisible(true);
				break;
			} else
				ECOM_360.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ECOM_360" == str)
				check1 = str;

			if (electricalCheck && check1 == "ECOM_360" && semester % 2 == 0) {
				ECOM_432.setVisible(true);
				ECOM_442.setVisible(true);
				break;
			} else {
				ECOM_432.setVisible(false);
				ECOM_442.setVisible(false);
			}
		}

		for (String str : newCourses) {
			if ("ECOM_360" == str)
				check1 = str;

			if ("MATH_145" == str)
				check2 = str;

			if (electricalCheck && check1 == "ECOM_360" && check2 == "MATH_145" && semester % 2 == 1) {
				ELEC_431.setVisible(true);
				ELEC_433.setVisible(true);
				break;
			} else {
				ELEC_431.setVisible(false);
				ELEC_433.setVisible(false);
			}
		}

		for (String str : newCourses) {
			if ("ELEC_335" == str)
				check1 = str;

			if ("ELEC_330" == str)
				check2 = str;

			if (electricalCheck && check1 == "ELEC_335" && check2 == "ELEC_330") {
				ELEC_451.setVisible(true);
				ELEC_461.setVisible(true);
				break;
			} else {
				ELEC_451.setVisible(false);
				ELEC_461.setVisible(false);
			}
		}

		for (String str : newCourses) {

			if ("ELEC_320" == str)
				check1 = str;

			if (electricalCheck && check1 == "ELEC_320" && semester % 2 == 1) {
				ELEC_411.setVisible(true);
				ELEC_481.setVisible(true);
				break;
			} else {
				ELEC_411.setVisible(false);
				ELEC_481.setVisible(false);
			}
		}

		for (String str : newCourses) {
			if ("ELEC_451" == str)
				check1 = str;

			if (check1 != "ELEC_462" && check1 == "ELEC_451" && semester % 2 == 0) {
				ELEC_462.setVisible(true);
				break;
			} else
				ELEC_462.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_320" == str)
				check1 = str;

			if (electricalCheck && check1 == "ELEC_320" && semester % 2 == 0) {
				ELEC_472.setVisible(true);
				break;
			} else
				ELEC_472.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_495" == str)
				check1 = str;

			if (check1 == "ELEC_495") {
				ELEC_585.setVisible(true);
				break;
			} else
				ELEC_585.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_585" == str)
				check1 = str;

			if (check1 == "ELEC_585") {
				ELEC_590.setVisible(true);
				break;
			} else
				ELEC_590.setVisible(false);
		}

		for (String str : newCourses)// industrail training condition
		{
			if (str == "GENG_215" || str == "MATH_145" || str == "GENG_315" || str == "CHEM_270"
					|| str == "ELEC_320" || str == "ELEC_325" || str == "ELEC_330" || str == "ELEC_370"
					|| str == "ECOM_360" || str == "ELEC_451" || str == "ELEC_461"
					|| str == "ELEC_375" || str == "STAT_210"
					|| str == "GENG_220" || str == "MATH_130" || str == "MATH_135"
					|| str == "MATH_270" || str == "PHYS_105" || str == "PHYS_110")
				n++;

			if (n == 19 && checkIT(out) >= 98) // will only be true if all required traing courses are taken and the
			{ // the total credithours taken are above 98.
				ELEC_495.setVisible(true);
				break;
			} else
				ELEC_495.setVisible(false);
		}

		for (String str : newCourses) {
			if (electricalCheck && (str == "MATH_270" || str == "MATH_145" || str == "PHYS_105"))
				MSE.setVisible(true);
			else
				MSE.setVisible(false);
		}

		for (String str : newCourses) {
			if ("ELEC_305" == str)
				ELEC_305.setVisible(false);

			if ("ELEC_320" == str)
				ELEC_320.setVisible(false);

			if ("ELEC_315" == str)
				ELEC_315.setVisible(false);

			if ("ELEC_325" == str)
				ELEC_325.setVisible(false);

			if ("ELEC_330" == str)
				ELEC_330.setVisible(false);

			if ("ELEC_335" == str)
				ELEC_335.setVisible(false);

			if ("ELEC_360" == str)
				ELEC_360.setVisible(false);

			if ("ELEC_370" == str)
				ELEC_370.setVisible(false);

			if ("ECOM_360" == str)
				ECOM_360.setVisible(false);

			if ("ECOM_432" == str)
				ECOM_432.setVisible(false);

			if ("ELEC_431" == str)
				ELEC_431.setVisible(false);

			if ("ELEC_451" == str)
				ELEC_451.setVisible(false);

			if ("ELEC_411" == str)
				ELEC_411.setVisible(false);

			if ("ELEC_462" == str)
				ELEC_462.setVisible(false);

			if ("ELEC_472" == str)
				ELEC_472.setVisible(false);

			if ("ELEC_310" == str)
				ELEC_310.setVisible(false);

			if ("ELEC_345" == str)
				ELEC_345.setVisible(false);

			if ("ELEC_375" == str)
				ELEC_375.setVisible(false);

			if ("ELEC_461" == str)
				ELEC_461.setVisible(false);

			if ("ECOM_442" == str)
				ECOM_442.setVisible(false);

			if ("ELEC_433" == str)
				ELEC_433.setVisible(false);

			if ("ELEC_481" == str)
				ELEC_481.setVisible(false);

			if ("ELEC_495" == str)
				ELEC_495.setVisible(false);

			if ("ELEC_585" == str)
				ELEC_585.setVisible(false);

			if ("ELEC_590" == str)
				ELEC_590.setVisible(false);

			if ("MSE" == str)
				MSE.setVisible(false);

		}
	}

	public int checkIT(int out) {
		int totalCreditHours = out;

		return totalCreditHours;
	}

	public void clearCore() {
		// set the courses to visible
		ELEC_305.setVisible(true);
		ELEC_315.setVisible(true);
		ELEC_320.setVisible(true);
		ELEC_325.setVisible(true);
		ELEC_330.setVisible(true);
		ELEC_335.setVisible(true);
		ELEC_360.setVisible(true);
		ELEC_370.setVisible(true);
		ECOM_360.setVisible(true);
		ECOM_432.setVisible(true);
		ELEC_431.setVisible(true);
		ELEC_451.setVisible(true);
		ELEC_411.setVisible(true);
		ELEC_462.setVisible(true);
		ELEC_472.setVisible(true);
		ELEC_310.setVisible(true);
		ELEC_345.setVisible(true);
		ELEC_375.setVisible(true);
		ELEC_461.setVisible(true);
		ECOM_442.setVisible(true);
		ELEC_433.setVisible(true);
		ELEC_481.setVisible(true);
		ELEC_495.setVisible(true);
		ELEC_585.setVisible(true);
		ELEC_590.setVisible(true);
		MSE.setVisible(true);
		// deselect the courses
		ELEC_305.setSelected(false);
		ELEC_315.setSelected(false);
		ELEC_320.setSelected(false);
		ELEC_325.setSelected(false);
		ELEC_330.setSelected(false);
		ELEC_335.setSelected(false);
		ELEC_360.setSelected(false);
		ELEC_370.setSelected(false);
		ECOM_360.setSelected(false);
		ECOM_432.setSelected(false);
		ELEC_431.setSelected(false);
		ELEC_451.setSelected(false);
		ELEC_411.setSelected(false);
		ELEC_462.setSelected(false);
		ELEC_472.setSelected(false);
		ELEC_310.setSelected(false);
		ELEC_345.setSelected(false);
		ELEC_375.setSelected(false);
		ELEC_461.setSelected(false);
		ECOM_442.setSelected(false);
		ELEC_433.setSelected(false);
		ELEC_481.setSelected(false);
		ELEC_495.setSelected(false);
		ELEC_585.setSelected(false);
		ELEC_590.setSelected(false);
		MSE.setSelected(false);
	}
}
