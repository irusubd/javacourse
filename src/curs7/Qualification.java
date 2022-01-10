package curs7;

public class Qualification extends Teacher {
	
	public Qualification(String course, String schedule, int experienceYears) {
		super(course, schedule, experienceYears);
	}
	
	public void verify() {
		if(super.experienceYears>3 && super.course.equals("Java") && super.schedule.equals("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
		}
	}

}
