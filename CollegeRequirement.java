
//CHECK THE GeneralEducation part for the detaled information
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class CollegeRequirement extends JPanel {

	private JCheckBox STAT_210;
	private JCheckBox GENG_215;
	private JCheckBox GENG_220;
	private JCheckBox MATH_130;
	private JCheckBox MATH_135;
	private JCheckBox MATH_270;
	private JCheckBox MATH_145;
	private JCheckBox PHYS_105;
	private JCheckBox PHYS_135;
	private JCheckBox PHYS_110;
	private JCheckBox PHYS_140;
	private JCheckBox CHEM_111;
	private JCheckBox CHEM_175;
	private JCheckBox GENG_315;
	private JCheckBox CHEM_270;
	private int creditHours;
	public static final Color DARK_RED = new Color(146, 10, 24);

	public CollegeRequirement()// the constructor that has the all the check box added to the panel and the
								// color was set
	{
		setLayout(new GridLayout(8, 0));
		setBorder(BorderFactory.createTitledBorder("COLLEGE REQUIRMENT UNIT"));

		ButtonGroup group = new ButtonGroup();

		STAT_210 = new JCheckBox("STAT_210(1,0,0)");
		GENG_215 = new JCheckBox("GENG_215(1,0,0)");
		GENG_220 = new JCheckBox("GENG_220(1,2,13)");
		MATH_130 = new JCheckBox("MATH_130(1,3,17)");
		MATH_135 = new JCheckBox("MATH_135(1,2,14)");
		MATH_270 = new JCheckBox("MATH_270(1,3,12)");
		MATH_145 = new JCheckBox("MATH_145(1,3,13)");
		PHYS_105 = new JCheckBox("PHYS_105(0,3,6)");
		PHYS_135 = new JCheckBox("PHYS_135(0,3,6)");
		PHYS_110 = new JCheckBox("PHYS_110(0,2,3)");
		PHYS_140 = new JCheckBox("PHYS_140(0,2,3)");
		CHEM_111 = new JCheckBox("CHEM_111(0,1,1)");
		CHEM_175 = new JCheckBox("CHEM_175(0,1,1)");
		GENG_315 = new JCheckBox("GENG_315(1,0,0)");
		CHEM_270 = new JCheckBox("CHEM_270(1,0,0)");

		STAT_210.setForeground(DARK_RED);
		GENG_215.setForeground(DARK_RED);
		GENG_220.setForeground(DARK_RED);
		MATH_130.setForeground(DARK_RED);
		MATH_135.setForeground(DARK_RED);
		MATH_270.setForeground(DARK_RED);
		MATH_145.setForeground(DARK_RED);
		PHYS_105.setForeground(DARK_RED);
		PHYS_135.setForeground(DARK_RED);
		PHYS_110.setForeground(DARK_RED);
		PHYS_140.setForeground(DARK_RED);
		CHEM_111.setForeground(DARK_RED);
		CHEM_175.setForeground(DARK_RED);
		GENG_315.setForeground(DARK_RED);
		CHEM_270.setForeground(DARK_RED);

		add(STAT_210);
		add(GENG_215);
		add(GENG_220);
		add(MATH_130);
		add(MATH_135);
		add(MATH_270);
		add(MATH_145);
		add(PHYS_105);
		add(PHYS_135);
		add(PHYS_110);
		add(PHYS_140);
		add(CHEM_111);
		add(CHEM_175);
		add(GENG_315);
		add(CHEM_270);
	}

	public int getCreditHours()// same as before
	{
		creditHours = 0;
		ArrayList<Integer> courseList = new ArrayList();

		if (STAT_210.isSelected()) {
			courseList.add(3);
		}
		if (GENG_215.isSelected()) {
			courseList.add(2);
		}
		if (GENG_220.isSelected()) {
			courseList.add(3);
		}
		if (MATH_130.isSelected()) {
			courseList.add(3);
		}
		if (MATH_135.isSelected()) {
			courseList.add(3);
		}
		if (MATH_270.isSelected()) {
			courseList.add(3);
		}
		if (MATH_145.isSelected()) {
			courseList.add(3);
		}
		if (PHYS_105.isSelected()) {
			courseList.add(3);
		}
		if (PHYS_135.isSelected()) {
			courseList.add(1);
		}
		if (PHYS_110.isSelected()) {
			courseList.add(3);
		}
		if (PHYS_140.isSelected()) {
			courseList.add(1);
		}
		if (CHEM_111.isSelected()) {
			courseList.add(3);
		}
		if (CHEM_175.isSelected()) {
			courseList.add(1);
		}
		if (GENG_315.isSelected()) {
			courseList.add(3);
		}
		if (CHEM_270.isSelected()) {
			courseList.add(3);
		}

		for (int index = 0; index < courseList.size(); index++) {
			creditHours += courseList.get(index);
		}

		return creditHours;
	}

	public ArrayList<String> getCourses()// same as before
	{
		ArrayList<String> courseList = new ArrayList();
		courseList.clear();

		if (STAT_210.isSelected()) {
			courseList.add("STAT_210");
		}
		if (GENG_215.isSelected()) {
			courseList.add("GENG_215");
		}
		if (GENG_220.isSelected()) {
			courseList.add("GENG_220");
		}
		if (MATH_130.isSelected()) {
			courseList.add("MATH_130");
		}
		if (MATH_135.isSelected()) {
			courseList.add("MATH_135");
		}
		if (MATH_270.isSelected()) {
			courseList.add("MATH_270");
		}
		if (MATH_145.isSelected()) {
			courseList.add("MATH_145");
		}
		if (PHYS_105.isSelected()) {
			courseList.add("PHYS_105");
		}
		if (PHYS_135.isSelected()) {
			courseList.add("PHYS_135");
		}
		if (PHYS_110.isSelected()) {
			courseList.add("PHYS_110");
		}
		if (PHYS_140.isSelected()) {
			courseList.add("PHYS_140");
		}
		if (CHEM_111.isSelected()) {
			courseList.add("CHEM_111");
		}
		if (CHEM_175.isSelected()) {
			courseList.add("CHEM_175");
		}
		if (GENG_315.isSelected()) {
			courseList.add("GENG_315");
		}
		if (CHEM_270.isSelected()) {
			courseList.add("CHEM_270");
		}
		return courseList;
	}

	public void setCourses(ArrayList<String> newCourses)// new details were added like the specefication for opening a
														// course
	{
		String check1 = "", check2 = "", check3 = "";

		for (String str : newCourses) {
			if ("STAT_210" == str)
				check1 = str;

			if ("MATH_130" == str)
				check3 = str;

			if (check1 != "STAT_210" && check3 == "MATH_130") {
				STAT_210.setVisible(true);
				break;
			} else
				STAT_210.setVisible(false);
		}

		for (String str : newCourses) {
			if ("GENG_215" == str)
				check1 = str;

			if ("ESPU_107" == str)
				check3 = str;

			if (check1 != "GENG_215" && check3 == "ESPU_107") {
				GENG_215.setVisible(true);
				break;
			} else
				GENG_215.setVisible(false);
		}

		for (String str : newCourses) {
			if ("GENG_220" == str)
				check1 = str;

			if ("PHYS_105" == str)
				check3 = str;

			if (check1 != "GENG_220" && check3 == "PHYS_105") {
				GENG_220.setVisible(true);
				break;
			} else
				GENG_220.setVisible(false);
		}

		for (String str : newCourses) {
			if ("MATH_130" == str)
				MATH_130.setVisible(false);
		}

		for (String str : newCourses) {
			if ("MATH_135" == str)
				check1 = str;

			if ("MATH_130" == str)
				check3 = str;

			if (check1 != "MATH_135" && check3 == "MATH_130") {
				MATH_135.setVisible(true);
				break;
			} else
				MATH_135.setVisible(false);
		}

		for (String str : newCourses) {
			if ("MATH_270" == str)
				check1 = str;

			if ("MATH_135" == str)
				check3 = str;

			if (check1 != "MATH_270" && check3 == "MATH_135") {
				MATH_270.setVisible(true);
				break;
			} else
				MATH_270.setVisible(false);
		}

		for (String str : newCourses) {
			if ("MATH_145" == str)
				check1 = str;

			if ("MATH_135" == str)
				check3 = str;

			if (check1 != "MATH_145" && check3 == "MATH_135") {
				MATH_145.setVisible(true);
				break;
			} else
				MATH_145.setVisible(false);
		}

		for (String str : newCourses) {
			if ("PHYS_105" == str)
				PHYS_105.setVisible(false);
		}

		for (String str : newCourses) {
			if ("PHYS_110" == str)
				check1 = str;

			if ("PHYS_105" == str)
				check3 = str;

			if (check1 != "PHYS_110" && check3 == "PHYS_105") {
				PHYS_110.setVisible(true);
				break;
			} else
				PHYS_110.setVisible(false);
		}

		for (String str : newCourses) {
			if ("CHEM_111" == str)
				CHEM_111.setVisible(false);
		}

		for (String str : newCourses) {
			if ("CHEM_175" == str)
				CHEM_175.setVisible(false);
		}

		for (String str : newCourses) {
			if ("GENG_315" == str)
				check1 = str;

			if ("MATH_130" == str)
				check3 = str;

			if (check1 != "GENG_315" && check3 == "MATH_130") {
				GENG_315.setVisible(true);
				break;
			} else
				GENG_315.setVisible(false);
		}

		for (String str : newCourses) {
			if ("CHEM_270" == str)
				check1 = str;

			if ("CHEM_175" == str)
				check2 = str;

			if ("CHEM_111" == str)
				check3 = str;

			if (check1 != "CHEM_270" && check3 == "CHEM_111" && check2 == "CHEM_175") {
				CHEM_270.setVisible(true);
				break;
			} else
				CHEM_270.setVisible(false);
		}

		for (String str : newCourses) {
			if ("STAT_210" == str)
				STAT_210.setVisible(false);

			if ("GENG_215" == str)
				GENG_215.setVisible(false);

			if ("GENG_220" == str)
				GENG_220.setVisible(false);

			if ("MATH_130" == str)
				MATH_130.setVisible(false);

			if ("MATH_135" == str)
				MATH_135.setVisible(false);

			if ("MATH_270" == str)
				MATH_270.setVisible(false);

			if ("MATH_145" == str)
				MATH_145.setVisible(false);

			if ("PHYS_105" == str)
				PHYS_105.setVisible(false);

			if ("PHYS_135" == str)
				PHYS_135.setVisible(false);

			if ("PHYS_110" == str)
				PHYS_110.setVisible(false);

			if ("PHYS_140" == str)
				PHYS_140.setVisible(false);

			if ("CHEM_111" == str)
				CHEM_111.setVisible(false);

			if ("CHEM_175" == str)
				CHEM_175.setVisible(false);

			if ("GENG_315" == str)
				GENG_315.setVisible(false);

			if ("CHEM_270" == str)
				CHEM_270.setVisible(false);

		}
	}

	public void clearCoReq() {
		// set the courses to visible.
		STAT_210.setVisible(true);
		GENG_215.setVisible(true);
		GENG_220.setVisible(true);
		MATH_130.setVisible(true);
		MATH_135.setVisible(true);
		MATH_270.setVisible(true);
		MATH_145.setVisible(true);
		PHYS_105.setVisible(true);
		PHYS_135.setVisible(true);
		PHYS_110.setVisible(true);
		PHYS_140.setVisible(true);
		CHEM_111.setVisible(true);
		CHEM_175.setVisible(true);
		GENG_315.setVisible(true);
		CHEM_270.setVisible(true);
		// deselect the courses.
		STAT_210.setSelected(false);
		GENG_215.setSelected(false);
		GENG_220.setSelected(false);
		MATH_130.setSelected(false);
		MATH_135.setSelected(false);
		MATH_270.setSelected(false);
		MATH_145.setSelected(false);
		PHYS_105.setSelected(false);
		PHYS_135.setSelected(false);
		PHYS_110.setSelected(false);
		PHYS_140.setSelected(false);
		CHEM_111.setSelected(false);
		CHEM_175.setSelected(false);
		GENG_315.setSelected(false);
		CHEM_270.setSelected(false);
	}
}
