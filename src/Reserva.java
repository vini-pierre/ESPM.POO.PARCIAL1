package src;

public class Reserva implements Pagamento {
    
    Cliente cliente;
    boolean pagamentoAVista; 

    Reserva(Cliente cliente, boolean pagamentoAVista) {
        this.cliente = cliente;
        this.pagamentoAVista = pagamentoAVista;

    }

    @Override

        public String toString() {
            String tipoCliente = "Tipo do Cliente: ";
            String tipoPagamento = "Tipo de Pagamento: ";
            String nomeCliente = "Cliente: " + this.cliente.getNome();

            if(this.cliente instanceof PessoaFisica) {
                PessoaFisica pessoafisica = (PessoaFisica) this.cliente;
                tipoCliente += pessoafisica.getClass().getName();
            } else {
                PessoaJuridica pessoajuridica = (PessoaJuridica) this.cliente;
                tipoCliente += pessoajuridica.getClass().getName();
            }

            if(this.pagamentoAVista) {
                tipoPagamento += "Pagamento À Vista";
            } else {
                tipoPagamento += "Pagamento Parcelado";

            }

            return tipoCliente + "\n" + nomeCliente + "\n" + tipoPagamento;
        }

        @Override
            public double calcularPagamento() {
                double valor = 3200.00;
                double desconto = 0.1;

                if(this.pagamentoAVista) {
                    valor = valor * (1 - desconto);
                    } 
                    return valor;
                }

            public Cliente getCliente() {
                return cliente;
            }

            public void setCliente(Cliente cliente) {
                this.cliente = cliente;

            }

            public boolean getpagamentoAVista(){
                return this.pagamentoAVista;
            }

            public void setPagamentoAVista(boolean pagamentoAVista) {
                this.pagamentoAVista = pagamentoAVista;
            }
        }
    







