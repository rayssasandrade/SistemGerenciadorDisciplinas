package model;

public class Disciplina {

    private int idDisciplina;
    private String descricao;
    private int credito;
    private Disciplina[] disciplinaRequrida;

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public Disciplina[] getDisciplinaRequrida() {
        return disciplinaRequrida;
    }

    public void setDisciplinaRequrida(Disciplina[] disciplinaRequrida) {
        this.disciplinaRequrida = disciplinaRequrida;
    }
}
