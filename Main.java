import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		UserAccount user = new UserAccount("Alice", 2000);
		System.out.println("Nom du Compte : Alice.\nMontant du Compte : 2000.\n");
		
		String operation;
		Scanner sc;
		boolean flag = true;
		int value = 0;
		
		while(flag){
			System.out.println("\nR : Retrait.\nD : Deposer.\nH : Historique.\nQ : Quitter.");
			sc= new Scanner(System.in);
			operation = sc.nextLine();
			

			if(operation.charAt(0) == 'R'){
				System.out.println("Montant?");
				value = Integer.parseInt(sc.nextLine());
				user.withdraw(value);
			}
			
			if(operation.charAt(0) == 'D'){
				System.out.println("Montant?");
				value = Integer.parseInt(sc.nextLine());
				user.deposit(value);
			}
			
			if(operation.charAt(0) == 'H'){
				user.AfficherOperation();
			}
			
			if(operation.charAt(0) == 'Q'){
				flag = false;
			}
		}
	}
}
