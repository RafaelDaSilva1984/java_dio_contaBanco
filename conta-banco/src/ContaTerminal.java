

public class ContaTerminal {

        boolean contaCriada = false;
        String numeroAgencia ;
        int numeroConta ;
        String nomeCliente;
        String sobrenomeCliente;
        double saldoConta = 1000;
    
            
        public void criarConta(){
            contaCriada = true;
        }
        public void encerrarConta(){
            contaCriada = false;
        }
        
        public void criarNumeroAgencia(String novoNumeroAgencia){            
            numeroAgencia = novoNumeroAgencia;         
        }

        public void criarNumeroConta(int novoNumeroConta){
            numeroConta = novoNumeroConta;
        }

        public void criarNomeCliente(String novoNomeCliente){
            nomeCliente = novoNomeCliente;
        }

        public void criarSobrenomeCliente(String novoSobrenomeCliente){
            nomeCliente = novoSobrenomeCliente;
        }


}       

