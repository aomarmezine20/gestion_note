package gestion_note;
public class Main {
	public static void main(String[] args) {
		etudiant e1 = new etudiant(1,"hamid");
		etudiant e2 = new etudiant(2,"driss");
		etudiant e3 = new etudiant(1,"youssef");
		e1.note =15;
		e2.note =12;
		e3.note =16;
		ListEtudiant mesEtudiants = new ListEtudiant();
		mesEtudiants.add(e1);
		mesEtudiants.add(e2);
		mesEtudiants.add(e3);
		
		
	}
	

}