import com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descricao");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Descricao do curso de JS");
        curso2.setCargaHoraria(5);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao da Mentoria");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Fullstack - Java & javaScript");
        bootcamp.setDescricao("Bootcamp lorem ipsum");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeo = new Dev();
        devLeo.setNome("Leonardo");
        devLeo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de " + devLeo.getNome() + ": " + devLeo.getConteudosInscritos());
        devLeo.progredir();
        devLeo.progredir();
        System.out.println("Conteudos Concluidos de " + devLeo.getNome() + ": " + devLeo.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos de " + devLeo.getNome() + " apos o progredir: " + devLeo.getConteudosInscritos());
        System.out.println("XP: " + devLeo.calcularTotalXp());

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de " + devPedro.getNome() + ": " + devPedro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de " + devPedro.getNome() + ": " + devPedro.getConteudosConcluidos());
        devPedro.progredir();
        System.out.println("Conteudos Inscritos de " + devLeo.getNome() + " apos o progredir: " + devLeo.getConteudosInscritos());
        System.out.println("XP: " + devPedro.calcularTotalXp());

    }
}
