/**
 * write a program that takes as an input the semester
 * and the name of program and outputs the required
 * courses based on the following table(program should use nested switch statements)
 */

public class Exercise4 {

    public static String getRequiredCourses(String semester, String program) {
        String courses;

        switch (semester) {
            case "fall":
                switch (program) {
                    case "cs":
                        courses = "Introduction to Computer Science";
                        break;
                    case "ec":
                        courses = "English Literature";
                        break;
                    default:
                        courses = "Error: Invalid program for fall semester.";
                        break;
                }
                break;

            case "spring":
                switch (program) {
                    case "cs":
                        courses = "Object-Oriented Programming";
                        break;
                    case "ec":
                        courses = "Introduction to Journalism";
                        break;
                    default:
                        courses = "Error: Invalid program for spring semester.";
                        break;
                }
                break;

            default:
                courses = "Error: Invalid semester.";
                break;
        }

        return courses;
    }
}
