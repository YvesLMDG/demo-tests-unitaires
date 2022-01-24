public enum Saison { 
	
	PRINTEMPS(1, "Printemps"), ETE(2, "Eté"), AUTOMNE(3, "Automne"), HIVER(4, "Hiver"); 
	
	private int numOrder; 
	private String label; 
	
	Saison( int numOrder, String label ) { 
		this.numOrder = numOrder; this.label = label; 
	} 
	
	public int getNumOrder() { 
		return numOrder; 
	} 
	
	public void setNumOrder( int numOrder ) { 
		this.numOrder = numOrder; 
	}
	
	public String getLabel() { 
		return label; 
	}
	
	public void setLabel( String label ) { 
		this.label = label; 
	} 
	
	public static Saison fromLabel(String label) { 
		Saison found = null; 
		for ( Saison item : Saison.values() ) { 
			if (item.label.equals( label )) { 
				found = item; break; 
			} 
		} 
		return found; 
	} 
}