package en.com.dio.bootcamp;

import java.time.LocalDate;

public class Mentoring extends Content {

    private final LocalDate date = LocalDate.now();

    public Mentoring() {
    }

    @Override
    public int determineXp() {
        return BASE_XP + 20;
    }

    public LocalDate getDate() {
        return date;
    }


    @Override
    public String toString() {
        return "Mentoring \n -------------- \n Name: " + this.getName() + 
        "\n Description: " +this.getDescription() +
        "\n Date: " + date;
    }
    
}
