import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso a");
        curso1.setDescricao("aaaa");
        curso1.setCargaHoraria(50);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso b");
        curso2.setDescricao("bbb");
        curso2.setCargaHoraria(50);

        //Conteudo conteudo = new Curso();//polimorfismo

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mena");
        mentoria.setDescricao("aaaa");
        mentoria.setDate(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        //instanciando bootcamp e dev
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp");
        bootcamp.setDescricao("Bootcamp Descricao");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        bootcamp.setNome("dev1");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos"+ dev1.getConteudoInscritos());
        dev1.progredir();
        System.out.println("Conteudos Inscritos"+ dev1.getConteudoInscritos());
        dev1.progredir();
        System.out.println("Conteudos Inscritos"+ dev1.getConteudoInscritos());
        System.out.println("Conteudos Concluidos"+ dev1.getConteudoConcluido());
        System.out.println("XP "+ dev1.cacularTotalXp());

        System.out.println("-----------------");

        Dev dev2 = new Dev();
        bootcamp.setNome("dev2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos"+ dev2.getConteudoInscritos());
        dev2.progredir();
        System.out.println("Conteudos Inscritos"+ dev1.getConteudoInscritos());
        System.out.println("Conteudos Concluidos"+ dev2.getConteudoConcluido());
        System.out.println("XP "+ dev2.cacularTotalXp());
    }
}

