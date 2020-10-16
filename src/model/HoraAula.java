package model;

public class HoraAula {

    private int idHoraAula;
    private String descricao;
    private int HoraInicio;
    private int HoraTermina;

    public int getIdHoraAula() {
        return idHoraAula;
    }

    public void setIdHoraAula(int idHoraAula) {
        this.idHoraAula = idHoraAula;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(int horaInicio) {
        HoraInicio = horaInicio;
    }

    public int getHoraTermina() {
        return HoraTermina;
    }

    public void setHoraTermina(int horaTermina) {
        HoraTermina = horaTermina;
    }
}
