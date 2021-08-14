package Com.entitiees;

import java.time.LocalDate;
import java.time.LocalTime;

public class RegistroPonto {
    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalTime horaEntrada;
    private LocalTime horaSaida;

    public RegistroPonto(long idRegPonto, Funcionario func){
        this.idRegPonto = idRegPonto;
        this.func = func;
    }
    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        if (getDataRegistro() == null)
            setDataRegistro(LocalDate.now());

        this.horaEntrada = horaEntrada;
        apresentarRegistroPonto();
    }

    public LocalTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalTime horaSaida) {
        if (getDataRegistro() == null)
            setDataRegistro(LocalDate.now());

        this.horaSaida = horaSaida;
        apresentarRegistroPonto();
    }

    public void apresentarRegistroPonto() {
        StringBuilder msgRegistroDePonto = new StringBuilder();
        msgRegistroDePonto.append("========================\n");
        msgRegistroDePonto.append("Funcionário: " + func.getNome() + "\n");
        msgRegistroDePonto.append("Data de Registro: " + getDataRegistro() + "\n");
        msgRegistroDePonto.append("Horário Entrada: " + getHoraEntrada() + "\n");
        msgRegistroDePonto.append("Horário Saída: " + getHoraSaida());
        System.out.println();
        System.out.println(msgRegistroDePonto.toString());
    }
}
