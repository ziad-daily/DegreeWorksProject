import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class GeneralEducation extends JPanel {
	private JRadioButton HSS_105;
	private JRadioButton ISLM_101;
	private JRadioButton ESPU_107;
	private JRadioButton GESU_121;
	private JRadioButton GEIT_112;
	private JRadioButton GEIE_222;
	private JRadioButton GE_1;
	private JRadioButton GE_2;
	private JRadioButton GE_3;
	private int creditHours;
	public static final Color DARK_Yellow = new Color(118, 123, 14);

	public GeneralEducation() {
		setLayout(new GridLayout(8, 0));
		setBorder(BorderFactory.createTitledBorder("GENERAL EDUCATION"));

		// creating buttons for each course
		HSS_105 = new JRadioButton("HSS_105(0,0,0)");
		ISLM_101 = new JRadioButton("ISLM_101(0,0,0)");
		ESPU_107 = new JRadioButton("ESPU_107(1,1,1)");
		GESU_121 = new JRadioButton("GESU_121(0,0,0)");
		GEIT_112 = new JRadioButton("GEIT_112(0,0,0)");
		GEIE_222 = new JRadioButton("GEIE_222(0,0,0)");
		GE_1 = new JRadioButton("GE_1(0,0,0)");
		GE_2 = new JRadioButton("GE_2(0,0,0)");
		GE_3 = new JRadioButton("GE_3(0,0,0)");

		// setting the FONT color
		HSS_105.setForeground(DARK_Yellow);
		ISLM_101.setForeground(DARK_Yellow);
		ESPU_107.setForeground(DARK_Yellow);
		GESU_121.setForeground(DARK_Yellow);
		GEIT_112.setForeground(DARK_Yellow);
		GEIE_222.setForeground(DARK_Yellow);
		GE_1.setForeground(DARK_Yellow);
		GE_2.setForeground(DARK_Yellow);
		GE_3.setForeground(DARK_Yellow);

		// add them to the panle
		add(HSS_105);
		add(ISLM_101);
		add(ESPU_107);
		add(GESU_121);
		add(GEIT_112);
		add(GEIE_222);
		add(GE_1);
		add(GE_2);
		add(GE_3);

	}

	public int getCreditHours() {
		creditHours = 0;
		ArrayList<Integer> courseList = new ArrayList();

		if (HSS_105.isSelected()) {
			courseList.add(3);
		}
		if (ISLM_101.isSelected()) {
			courseList.add(3);
		}
		if (ESPU_107.isSelected()) {
			courseList.add(3);
		}
		if (GESU_121.isSelected()) {
			courseList.add(3);
		}
		if (GEIT_112.isSelected()) {
			courseList.add(3);
		}
		if (GEIE_222.isSelected()) {
			courseList.add(3);
		}
		if (GE_1.isSelected()) {
			courseList.add(3);
		}
		if (GE_2.isSelected()) {
			courseList.add(3);
		}
		if (GE_3.isSelected()) {
			courseList.add(3);
		}

		for (int index = 0; index < courseList.size(); index++) {
			creditHours += courseList.get(index);
		}

		return creditHours;
	}

	public ArrayList<String> getCourses() {
		ArrayList<String> courseList = new ArrayList();
		courseList.clear();

		if (HSS_105.isSelected()) {
			courseList.add("HSS_105");
		}
		if (ISLM_101.isSelected()) {
			courseList.add("ISLM_101");
		}
		if (ESPU_107.isSelected()) {
			courseList.add("ESPU_107");
		}
		if (GESU_121.isSelected()) {
			courseList.add("GESU_121");
		}
		if (GEIT_112.isSelected()) {
			courseList.add("GEIT_112");
		}
		if (GEIE_222.isSelected()) {
			courseList.add("GEIE_222");
		}
		if (GE_1.isSelected()) {
			courseList.add("GE_1");
		}
		if (GE_2.isSelected()) {
			courseList.add("GE_2");
		}
		if (GE_3.isSelected()) {
			courseList.add("GE_3");
		}

		return courseList;
	}

	public void setCourses(ArrayList<String> newCourses) {
		String check1 = "", check2 = "", check3 = "";
		for (String str : newCourses) {
			if ("HSS_105" == str)
				HSS_105.setVisible(false);

			if ("ISLM_101" == str)
				ISLM_101.setVisible(false);

			if ("ESPU_107" == str)
				ESPU_107.setVisible(false);

			if ("GESU_121" == str)
				GESU_121.setVisible(false);

			if ("GEIT_112" == str)
				GEIT_112.setVisible(false);

			if ("GEIE_222" == str)
				GEIE_222.setVisible(false);

			if ("GE_1" == str)
				GE_1.setVisible(false);

			if ("GE_2" == str)
				GE_2.setVisible(false);

			if ("GE_3" == str)
				GE_3.setVisible(false);
		}

	}

	public void clearGeneralEqu() {
		// set the courses to visisble.
		HSS_105.setVisible(true);
		ISLM_101.setVisible(true);
		ESPU_107.setVisible(true);
		GESU_121.setVisible(true);
		GEIT_112.setVisible(true);
		GEIE_222.setVisible(true);
		GE_1.setVisible(true);
		GE_2.setVisible(true);
		GE_3.setVisible(true);
		// deselect the courses.
		HSS_105.setSelected(false);
		ISLM_101.setSelected(false);
		ESPU_107.setSelected(false);
		GESU_121.setSelected(false);
		GEIT_112.setSelected(false);
		GEIE_222.setSelected(false);
		GE_1.setSelected(false);
		GE_2.setSelected(false);
		GE_3.setSelected(false);
	}
}