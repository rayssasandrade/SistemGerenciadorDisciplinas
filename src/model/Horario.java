package model;

public class Horario {

    private int idHorario;
    private DiaSemana diaSemana;
    private Turno turno;
    private HoraAula[] horaAula;

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getSiglaHorario(DiaSemana diaSemana, Turno turno, HoraAula[] horaAula){
        //fazer método de cocatenar;
        return diaSemana.getDescricao();
    }

}
