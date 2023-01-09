package en.com.dio.bootcamp;

public class Course extends Content {

    private int hours;

    public Course() {
    }

    @Override
    public int determineXp() {
        return BASE_XP * hours;
    }
    
    public int getHours() {
        return hours;
    }
    
    public void setHours(int hours) {
        this.hours = hours;
    }
    
        @Override
        public String toString() {
            return "Mentoring \n -------------- \n Name: " + this.getName() + 
            "\n Description: " +this.getDescription() +
            "\n Hours: " + hours;
        }
}
