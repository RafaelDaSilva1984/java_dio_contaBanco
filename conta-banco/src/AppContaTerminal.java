import java.util.Scanner;

public class AppContaTerminal {
   public static void main(String[] args) {
        //iniciando o uso da classe
        ContaTerminal contaTerminal = new ContaTerminal(); 

        //iniciando uso do scanner  
        Scanner scanner = new Scanner(System.in);

        //input de usuário nome
        System.out.println(("Digite seu Nome: "));
        contaTerminal.criarNomeCliente(scanner.next());
        
        //input de usuário sobrenome
        System.out.println(("Digite seu Sobrenome: "));
        contaTerminal.criarSobrenomeCliente(scanner.next());

        //input de usuário número da agência       
        System.out.println(("Digite número Agência: "));
        contaTerminal.criarNumeroAgencia(scanner.next());
         
        ////input de usuário número da conta
        System.out.println(("Digite número Conta: "));
        contaTerminal.criarNumeroConta(scanner.nextInt());        
        
        // criando var que conacatena nome e sobrenome
        String nomeCompleto = contaTerminal.nomeCliente + " " + contaTerminal.sobrenomeCliente;      
        
        //usando input de entrada de valores para obter saldo na conta             
        System.out.println("Digite valor depósito: ");
        double valorDeposito = scanner.nextDouble();
        contaTerminal.depositarConta(valorDeposito);
        System.out.println("Saldo Atual: " + contaTerminal.saldoConta);

        //usando input para retirada de valores do saldo na conta 
        System.out.println("Deseja realizar saque de valor em conta: S para Sim e N para Não: ");
        String opcao = scanner.next().toUpperCase();
        //usando condição para retirada ou não de valores
        if(opcao.equals("S")){
        System.out.println("Digite valor saque: ");
        double valorSaque = scanner.nextDouble();
            if(contaTerminal.saldoConta > valorSaque){
            contaTerminal.sacarConta(valorSaque);
            System.out.println("Saldo Atual: " + contaTerminal.saldoConta);}
            else{
                System.out.println("Saldo Insuficiente para saque.");
            }
        }else{
            System.out.println("Fim.");
        }

        // imprimindo mensagem
        System.out.println("Olá " + nomeCompleto +" ,OBRIGADO   por criar uma conta em nosso BANCO, sua AGÊNCIA é " 
        + contaTerminal.numeroAgencia + " , CONTA " + contaTerminal.numeroConta + " e seu SALDO R$ " + contaTerminal.saldoConta + 
        " ,já está DISPONÍVEL para saque.");


   }}

      
