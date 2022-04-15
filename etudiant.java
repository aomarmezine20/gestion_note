package gestion_note;

public class etudiant {
	private int id;
	private String nom;
	private double note;
	public etudiant(int id ,String nom) {
		this.id = 10;
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
}