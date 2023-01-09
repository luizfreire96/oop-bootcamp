package en.com.dio.bootcamp;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

    String name;
    int xp;
    Set<Content> enrolledContents = new LinkedHashSet<>(); 
    Set<Content> concludedContents = new LinkedHashSet<>();
    
    
    public Dev() {
    }

    public void enrollBootcamp(Bootcamp bootcamp){

        enrolledContents.addAll(bootcamp.getContents());
        bootcamp.getDevs().add(this);

    };

    public void progressContent(){

        Optional<Content> content = enrolledContents.stream().findFirst();
        if (content.isPresent()){
            this.concludedContents.add(content.get());
            this.enrolledContents.remove(content.get());
            xp += content.get().determineXp();
        }
        else {
            System.err.println("Você não está matriculado em nenhum curso!");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getEnrolledContents() {
        return enrolledContents;
    }

    public void setEnrolledContents(Set<Content> enrolledContents) {
        this.enrolledContents = enrolledContents;
    }

    public Set<Content> getConcludedContents() {
        return concludedContents;
    }

    public void setConcludedContents(Set<Content> concludedContents) {
        this.concludedContents = concludedContents;
    }

    @Override
    public String toString() {
        return "Dev \n -------------- \n Name: " + name + "\n Erolled Content: " + enrolledContents + "\nConcluded Contents: "
                + concludedContents;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((enrolledContents == null) ? 0 : enrolledContents.hashCode());
        result = prime * result + ((concludedContents == null) ? 0 : concludedContents.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (enrolledContents == null) {
            if (other.enrolledContents != null)
                return false;
        } else if (!enrolledContents.equals(other.enrolledContents))
            return false;
        if (concludedContents == null) {
            if (other.concludedContents != null)
                return false;
        } else if (!concludedContents.equals(other.concludedContents))
            return false;
        return true;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

}
