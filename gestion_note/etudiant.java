package gestion_note;

public class etudiant {
	private int id;
	private String nom;
	private double note;
	public etudiant(int id ,String nom) {
		note =10;
		this.id = id;
		this.nom =nom;
	}
	public String toString()
	{
		return this.nom +":" + this.note;
	}
	public boolean equals(Object obj)
	{
		if (! (obj instanceof etudiant) ){
			return false;
		}
	return	((etudiant)obj).id==this.id;
	}
	public boolean compareTo(etudiant e)
	{
		if(this.note==e.note) return true;
		return false;

	}
	public void setNote(double note) {
		this.note = note;
	}
	public double getNote() {
		return note;
	}
}