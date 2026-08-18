package Atividade2.Objetos;
import java.time.LocalDateTime;

public class Locacao {
    private Veiculo veiculos;
    private Cliente clientes;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFimPrevista;
    private boolean ativo;

    public Locacao(Veiculo veiculos, Cliente clientes, LocalDateTime dataInicio, LocalDateTime dataFimPrevista) {
        this.veiculos = veiculos;
        this.clientes = clientes;
        this.dataInicio = dataInicio;
        this.dataFimPrevista = dataFimPrevista;
        this.ativo = true;
    }

    public Veiculo getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Veiculo veiculos) {
        this.veiculos = veiculos;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void iniciar() {

    }

    public void encerrar(){

    }
    public void exibirResumo() {

    }




}
