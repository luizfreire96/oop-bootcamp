package en.com.dio.bootcamp;

public abstract class Content {

    protected static final double BASE_XP = 10.0;

    private String name;
    private String description;

    public abstract double determineXp();

    public static double getBaseXp() {
        return BASE_XP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
