package Familia36;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cli1= new Cliente ("Felipe",23,198765432,"Rua nove de julho");
		
		cli1.ImprimirInfo();
		System.out.println("\n******MUDOU DE ENDEREÇO******");
		cli1.setEndereço("Rua Acre");
		cli1.setIdade(50);
		cli1.ImprimirInfo();
	}

}
