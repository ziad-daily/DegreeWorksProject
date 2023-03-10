

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaProject extends JFrame {
	private JPanel subPanel;// to combain all three in the center
	private GeneralEducation geEdu;// a new class
	private CollegeRequirement coReq;// a new class
	private Core core;// a new class
	private Elective elective;// a new class
	private JTextArea selectedCourses;// text area
	private JTextArea passedCourses;
	private JScrollPane scrollPane2;
	private JPanel mainTitle;
	private JPanel buttonPanel;
	private JScrollPane scrollPane1;
	private JButton saveButton;
	private JButton exitButton;
	private JButton slcSemesterButton;
	private JButton passedCoursesButton;
	private JButton resetButton;
	private JButton coursesButton;
	private JButton courseChartButton;
	private JTextField creditHours;
	public static int semester = 1;
	public static int year = 2023;
	private ArrayList<String> eachCourse = new ArrayList(); // array list that store semester by semester only
	private ArrayList<String> newCourses = new ArrayList(); // array for all the courses selected
	private ArrayList<String> lastCourses = new ArrayList(); // array for all the courses selected not including the
																// newest one
	private ArrayList<String> semesters = new ArrayList();

	private File file = new File("allTakenCourses.txt"); // saving to file
	private PrintWriter fw1 = new PrintWriter(file);

	public JavaProject() throws FileNotFoundException {
		setSize(1550, 550);
		setTitle("ELECTRICAL ENGNEERING");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		geEdu = new GeneralEducation();
		coReq = new CollegeRequirement();
		core = new Core();
		elective = new Elective();
		subPanel = new JPanel();
		mainTitle = new JPanel();

		mainTitle.setBorder(BorderFactory.createTitledBorder("JAVA PROGRAMING PROJECT"));

		passedCourses = new JTextArea();
		scrollPane2 = new JScrollPane(passedCourses);

		selectedCourses = new JTextArea(10, 10);
		scrollPane1 = new JScrollPane(selectedCourses);// add the text area to the scroll (2 in 1)

		// combain all three in the middle in one panel
		subPanel.add(coReq);
		subPanel.add(core);
		subPanel.add(elective);

		buildButtonPanel();

		// it cant be modefied by the user
		creditHours.setEditable(false);
		selectedCourses.setEditable(false);

		// add all the panels to the frame
		add(mainTitle, BorderLayout.NORTH);
		add(geEdu, BorderLayout.WEST);
		add(subPanel, BorderLayout.CENTER);// will all add all three
		add(scrollPane1, BorderLayout.EAST);// text area with scroll
		add(buttonPanel, BorderLayout.SOUTH);// with save and exit button

		setVisible(true);

	}

	private void buildButtonPanel() {
		// Create a panel for the buttons.
		buttonPanel = new JPanel();

		// Create the buttons.
		saveButton = new JButton("Save");
		exitButton = new JButton("Exit");
		slcSemesterButton = new JButton("St. Sem.");
		passedCoursesButton = new JButton("passed courses");
		resetButton = new JButton("reset");
		coursesButton = new JButton("Courses");
		courseChartButton = new JButton("Course Chart");

		creditHours = new JTextField(3);
		// set the button text color to red.
		exitButton.setForeground(Color.RED);
		// add an action listner to the button
		saveButton.addActionListener(new saveButtonListener1());
		saveButton.addActionListener(new saveButtonListener2());
		exitButton.addActionListener(new ExitButtonListener());
		slcSemesterButton.addActionListener(new slcSemesterButtonListener());
		resetButton.addActionListener(new resetButtonListener());
		passedCoursesButton.addActionListener(new passedCoursesButtonListener());
		coursesButton.addActionListener(new coursesButtonListener());
		courseChartButton.addActionListener(new courseChartButtonListener());

		// add the buttons to the panel
		buttonPanel.add(slcSemesterButton);
		buttonPanel.add(passedCoursesButton);
		buttonPanel.add(saveButton);
		buttonPanel.add(exitButton);
		buttonPanel.add(creditHours);
		buttonPanel.add(courseChartButton);
		buttonPanel.add(resetButton);
		buttonPanel.add(coursesButton);
	}

	private class saveButtonListener2 implements ActionListener // a method for the courses on each semeter and remove
																// them from the frame
	{
		public void actionPerformed(ActionEvent e) {
			for (String s : newCourses)// copy the newCourses before adding the new Semester
				lastCourses.add(s);

			// get all of the selected courses
			for (String s : geEdu.getCourses()) {
				newCourses.add(s);
			}
			for (String s : coReq.getCourses()) {
				newCourses.add(s);
			}
			for (String s : elective.getCourses()) {
				newCourses.add(s);
			}
			for (String s : core.getCourses()) {
				newCourses.add(s);// will have all the selected courses
			}

			for (String s : newCourses)// copy selected courses to eachCourses
				eachCourse.add(s);

			boolean electiveCheck = true, electricalCheck = false;
			if (elective.getCreditHours() > 11)
				electiveCheck = false;// the check if there are 4 subjects taken from electives

			electricalCheck = electricalAvilable(newCourses); // check if the electrical courses are allowed to be taken

			// removing the taken courses and show the avalible to take courses for that
			// semester
			int out = core.getCreditHours() + elective.getCreditHours() + geEdu.getCreditHours()
					+ coReq.getCreditHours();
			geEdu.setCourses(newCourses);
			coReq.setCourses(newCourses);
			core.setCourses(newCourses, semester, electricalCheck, out);
			elective.setCourses(newCourses, semester, electiveCheck, electricalCheck);

			semester++;
		}
	}

	private boolean electricalAvilable(ArrayList<String> newCourses) {
		int n = 0;// each time start with zero

		for (String str : newCourses) {
			if (str == "STAT_210" || str == "GENG_220" || str == "MATH_130" || str == "MATH_135" || str == "PHYS_105"
					|| str == "CHEM_111" || str == "ESPU_107" || str == "PHYS_135")
				n++; // add 1 to n if the required for applying to electrical is taken
		}

		if (n > 6)
			return true;// only will be true if 6 out of the 7 courses is taken
		else
			return false;
	}

	private class saveButtonListener1 implements ActionListener // a method for the tottal credit hour and the taken
																// courses
	{
		public void actionPerformed(ActionEvent e) {
			try {
				int out;

				out = coReq.getCreditHours() + geEdu.getCreditHours() + elective.getCreditHours()
						+ core.getCreditHours();// get the hours of each class then add them

				creditHours.setText(out + "");// add the value of the crediet hour to the text field
				selectedCourses.setText("");// reset the courses

				for (String s : newCourses)// this nested loop will KEEP the courses for the last course only
				{
					for (String str : lastCourses) {
						if (str == s) {
							for (int index = 0; index < eachCourse.size(); index++) {
								if (str == eachCourse.get(index))
									eachCourse.remove(index);
							}
						}
					}
				}

				// adding the year and the semster for the text area at start semester = 1
				if (semester % 2 == 0) {
					selectedCourses.append("Spring " + year + "\n\n");
					passedCourses.append("Spring " + year + "\n\n");
				}
				if (semester % 2 == 1) {
					selectedCourses.append("Fall " + year + "\n\n");
					passedCourses.append("Fall " + year + "\n\n");
					year++;
				}

				// get all the seleted courses for a semeter and store it in the text area
				for (String s : eachCourse) {
					selectedCourses.append(s);
					selectedCourses.append("\n");
					passedCourses.append(s);
					passedCourses.append("\n");
				}
				passedCourses.append("\n");
				printing(eachCourse);
			} catch (FileNotFoundException ex) {
				Logger.getLogger(JavaProject.class.getName()).log(Level.SEVERE, null, ex);
			}

		}
	}

	private class ExitButtonListener implements ActionListener // make the exit button stop the program
	{
		public void actionPerformed(ActionEvent e) {
			fw1.close();
			System.exit(0);

		}
	}

	private class slcSemesterButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String input;
			while (true) {
				input = JOptionPane.showInputDialog(null, "Enter the starting semeter (EX: Fall or EX: Spring): ");

				if (input.equalsIgnoreCase("Fall")) {
					semester = 0;
					break;
				} else if (input.equalsIgnoreCase("Spring")) {
					semester = 1;
					break;
				} else {
					JOptionPane.showMessageDialog(null, "ERROR(Try to correct the spelling)");
				}
			}

			input = JOptionPane.showInputDialog(null, "Enter the starting year (EX: 2020): ");
			year = Integer.parseInt(input);

		}

	}

	private class resetButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			eachCourse.clear();
			newCourses.clear();
			lastCourses.clear();
			passedCourses.setText("");
			coReq.clearCoReq();
			elective.clearElective();
			geEdu.clearGeneralEqu();
			core.clearCore();
			selectedCourses.setText("");
			creditHours.setText("");
			year = 2023; // reset the year to 2023
			semester = 1; // reset the semester to spring
			fw1.format("");
			fw1.close();
		}

	}

	private class passedCoursesButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JFrame passedCoursesPanel = new JFrame("Passed Courses");
			try {
				passedCoursesPanel.setSize(500, 400);
				passedCoursesPanel.setLayout(new BorderLayout());
				passedCourses.setEditable(false); // the text area is not editable
				passedCourses.setVisible(true); // display the text area
				scrollPane2.setVisible(true);
				passedCoursesPanel.add(scrollPane2, BorderLayout.CENTER);
				passedCoursesPanel.setVisible(true);

			} catch (Exception anyException) {
				System.out.println("ERROR");
			}
		}

	}

	private class coursesButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			try {
				File myFile = new File("courses.pdf");
				Desktop.getDesktop().open(myFile);
			} catch (IOException ex) {

			}
		}

	}

	private class courseChartButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			JFrame frame = new JFrame();
			ImageIcon icon = new ImageIcon("CoursesChart.png");
			JLabel label = new JLabel(icon);
			frame.add(label);
			frame.pack();
			frame.setVisible(true);
		}

	}

	public void printing(ArrayList<String> eachCourse) throws FileNotFoundException {
		for (String s : eachCourse)
			fw1.println(s);
	}

	public static void main(String[] args) throws FileNotFoundException {
		JavaProject em = new JavaProject();
	}
}
