package model;

public class SugestaoMatriculaTurma {

    private Aluno aluno;
    private Turma turma;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Turma[] turmasParaCursar(){
        //fazer lógica
        return null;
    }

    public String gerarArquivoProlog(){
        //codigo que gera arquivo
        return null;
    }

}
