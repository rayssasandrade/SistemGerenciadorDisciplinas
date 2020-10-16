package model;

public class GradeCurricular {

    private int idGrade;
    //nome do PPC
    private String descricao;
    private Disciplina[] disciplina;
    private Curso curso;
    private PeriodoCurricular periodoCurricular;

    public int getIdGrade() {
        return idGrade;
    }

    public void setIdGrade(int idGrade) {
        this.idGrade = idGrade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Disciplina[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina[] disciplina) {
        this.disciplina = disciplina;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public PeriodoCurricular getPeriodoCurricular() {
        return periodoCurricular;
    }

    public void setPeriodoCurricular(PeriodoCurricular periodoCurricular) {
        this.periodoCurricular = periodoCurricular;
    }
}
