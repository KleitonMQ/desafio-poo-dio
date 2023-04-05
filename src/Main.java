import java.time.LocalDate;

import main.java.Curso;
import main.java.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Um monte de treta sobre java.");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso SpringBoot");
        curso2.setDescricao("Springando o pom.");
        curso2.setCargaHoraria(8);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso Maven");
        curso3.setDescricao("Maveando o projeto.");
        curso3.setCargaHoraria(6);
    
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Como se tornar um coach chato.");
        mentoria1.setDescricao("Aprenda encher o saco dos amigos com frases motivacionais.");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}