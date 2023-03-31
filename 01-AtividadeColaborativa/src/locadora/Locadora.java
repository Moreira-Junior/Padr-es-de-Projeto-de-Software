package locadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Locadora {

    private List<Cliente> clientes;
    private GeradorDeExtrato geradorDeExtrato;

    public Locadora(GeradorDeExtrato geradorDeExtrato){
        this.geradorDeExtrato = geradorDeExtrato;
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public List<Cliente> getClientes(){
        return this.clientes;
    }

    public void setGeradorDeExtrato(GeradorDeExtrato geradorDeExtrato){
        this.geradorDeExtrato = geradorDeExtrato;
    }

    public String gerarExtratoPorNomeDoCliente(String nomeCliente){
        Optional<Cliente> cliente = this.clientes.stream().filter(cli -> cli.getNome().equalsIgnoreCase(nomeCliente)).findFirst();
        if(cliente.isPresent()){
            return this.geradorDeExtrato.gerarExtrato(cliente.get());
        } else {
            return "Cliente não encontrado!";
        }
    }
}
