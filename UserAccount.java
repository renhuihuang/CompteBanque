import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class UserAccount {
	private String name;
	private int account;
	private ArrayList<String> operation = new ArrayList<String>();
	
	public UserAccount(String name, int account){
		this.name = name;
		this.account = account;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	
	// Depot de l'argent.
	public boolean deposit(int value){
		if(value < 0){
			System.out.println("Le montant doit être supérieur à 0!");
			return false;
		}
		else{
			account = this.account + value;
			operation.add(operation(1, value));
			System.out.println(operation(1, value));
			return true;
		}
	}
	
	// Retrait de l'argent.
	public boolean withdraw(int value){
		if(value > this.getAccount()){
			System.out.println("Votre compte ne possède pas assez d'argent!");
			return false;
		}
		
		if(value < 0){
			System.out.println("Le montant doit être supérieur à 0!");
			return false;
		}
		
		this.account = this.account - value;
		this.operation.add(operation(2, value));
		System.out.println(operation(2, value));
		return true;
	}
	
	// Les opérations seront stocké dans une liste afin de pouvoir afficher.
	public String operation(int R_D, int value){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String op;
		
		if(R_D == 2){
			op = "Retrait de " + value + " en " + dateFormat.format(date) + "\t : " + account;
		}
		else{
			op = "Deposer de " + value + " en " + dateFormat.format(date) + "\t : " + account;
		}

		return op;
	}
	
	// Affichage de l'historique.
	public void AfficherOperation(){
		int length = operation.size();
		for(int i = 0; i<length; i++){
			System.out.println(operation.get(i));
		}
	}
	
}
