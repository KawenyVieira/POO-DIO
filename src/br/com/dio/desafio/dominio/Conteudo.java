package br.com.dio.desafio.dominio;
//heranca para diminuir linhas de codigo, as filhas utilizarao os atributos
public abstract class Conteudo { // calsse abstrata nao é instanciada

    protected static final double XP_PADRAO= 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
