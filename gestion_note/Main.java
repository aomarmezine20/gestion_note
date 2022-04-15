package gestion_note;

public class Main {

	public static void main(String[] args) {
	etudiant e1 = new etudiant(1,"hamid");
	etudiant e2 = new etudiant(2,"driss");
	etudiant e3 = new etudiant(3,"youssef");
	e1.setNote(15);
	e2.setNote(12);
	e3.setNote(16);
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	
	}
	

}