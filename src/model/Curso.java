package model;

public class Curso {

    private int idCurso;
    private String descricao;
    private String sigla;
    private int qtdPeriodos;
    private int qtdLimitePeriodos;
    private Departamento departamento;

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getQtdPeriodos() {
        return qtdPeriodos;
    }

    public void setQtdPeriodos(int qtdPeriodos) {
        this.qtdPeriodos = qtdPeriodos;
    }

    public int getQtdLimitePeriodos() {
        return qtdLimitePeriodos;
    }

    public void setQtdLimitePeriodos(int qtdLimitePeriodos) {
        this.qtdLimitePeriodos = qtdLimitePeriodos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
