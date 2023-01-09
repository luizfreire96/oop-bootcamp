package en.com.dio.bootcamp;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private Set<Content> contents = new LinkedHashSet<>();
    private Set<Dev> devs = new LinkedHashSet<>();
    private final LocalDate begginDate = LocalDate.now();
    private final LocalDate endDate = begginDate.plusDays(45);
    


    public Bootcamp() {
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }

    public LocalDate getBegginDate() {
        return begginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return description;
    }

    public void setDescricao(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Bootcamp \n ------------ \n Name: " + name + "\n  Description: " + description + 
        "\n Contents: " + contents + "\n Devs:" + devs
                + "\n Beggining Date: " + begginDate + "\n End Date: " + endDate;
    }

}
