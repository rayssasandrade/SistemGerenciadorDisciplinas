package model;

public class DisciplinasOfertadas {

    private Disciplina[] disciplina;
    private PeriodoLetivo periodoLetivo;

    public Disciplina[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina[] disciplina) {
        this.disciplina = disciplina;
    }

    public PeriodoLetivo getPeriodoLetivo() {
        return periodoLetivo;
    }

    public void setPeriodoLetivo(PeriodoLetivo periodoLetivo) {
        this.periodoLetivo = periodoLetivo;
    }
}
