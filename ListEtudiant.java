package gestion_note;

import java.util.ArrayList;
import java.util.List;

public class ListEtudiant extends  ArrayList<etudiant> { 
	public boolean add(etudiant e) {
		if(this.indexOf(e)>=0) 
		{
			int i=indexOf(e); 
			super.set(i,e);
		    return false;	
		}
		return super.add(e);
		
	}
	public List<etudiant> flitrer(conditions c)
	{   ListEtudiant l= new ListEtudiant();
		for (etudiant e: this)
		  { 
		   if (c.estVrai(e));
		       l.add(e);
		  }
		    return l;
		    
		 
	}
	
	
}