import en.com.dio.bootcamp.Bootcamp;
import en.com.dio.bootcamp.Course;
import en.com.dio.bootcamp.Dev;
import en.com.dio.bootcamp.Mentoring;

public class App {
    public static void main(String[] args) throws Exception {
        
        Mentoring mentoring1 = new Mentoring();
        mentoring1.setName("Career Mentoring");
        mentoring1.setDescription("miau miau");

        Mentoring mentoring2 = new Mentoring();
        mentoring2.setName("Techinical Mentoring");
        mentoring2.setDescription("miau miau");

        Course course1 = new Course();
        course1.setName("Java Course");
        course1.setDescription("miau miau");
        course1.setHours(5);


        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Orange Tech+");
        bootcampJava.setDescricao("OOP bootvamp with java supported by Inter");
        bootcampJava.getContents().add(mentoring1);
        bootcampJava.getContents().add(mentoring2);
        bootcampJava.getContents().add(course1);

        Dev joao = new Dev();
        joao.setName("joao");

        Dev maria = new Dev();
        joao.setName("maria");

        joao.enrollBootcamp(bootcampJava);
        maria.enrollBootcamp(bootcampJava);

        /* TEST 1 
        System.out.println(" ************************ \n João \n  " + joao.getEnrolledContents() +
        "\n ************************\n Maria \n" + maria.getEnrolledContents());
        */

        joao.progressContent();
        maria.progressContent();

        /* TEST 2
        System.out.println(" ************************ \n João \n  " + joao.getEnrolledContents() +
        "\n ************************\n Maria \n" + maria.getEnrolledContents());
        */

        /* TEST 3 
        System.out.println(" ************************ \n João \n  " + joao.getConcludedContents() +
        "\n ************************\n Maria \n" + maria.getConcludedContents());
        */
        System.out.println(" ************************ \n João \n  " + joao.getXp() +
        "\n ************************\n Maria \n  " + maria.getXp());


    }
}
