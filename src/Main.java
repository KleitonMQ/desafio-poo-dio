import java.time.LocalDate;

import main.java.Bootcamp;
import main.java.Curso;
import main.java.Dev;
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
    
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Como se tornar um coach chato.");
        mentoria1.setDescricao("Aprenda encher o saco dos amigos com frases motivacionais.");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Proposta do bootcamp descritas aqui");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);

        Dev devkleiton = new Dev();
        devkleiton.setNome("Kleiton");
        devkleiton.inscreverBootcamp(bootcamp);
        devkleiton.progredir();

        System.out.println("Conteudos inscritos " + devkleiton.getNome() + "\n " + devkleiton.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devkleiton.getNome() + "\n " + devkleiton.getConteudosConcluidos());
        System.out.println("XP total: " + devkleiton.calcularTotalXp());
        Dev devFabricio = new Dev();
        devFabricio.setNome("Fabricio");
        devFabricio.inscreverBootcamp(bootcamp);
        devFabricio.progredir();
        devFabricio.progredir();
        System.out.println("Conteudos inscritos " + devFabricio.getNome() + "\n " + devFabricio.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devFabricio.getNome() + "\n " + devFabricio.getConteudosConcluidos());
        System.out.println("XP total: " + devFabricio.calcularTotalXp());
    }
}