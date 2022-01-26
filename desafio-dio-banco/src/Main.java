
public class Main {
	
	public static void main(String[] args) {
		Cliente rainadson = new Cliente();
		rainadson.setNome("Rainadson");
		
		Conta cc = new ContaCorrente(rainadson);
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(rainadson);
		
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}
