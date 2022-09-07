package p0;

public class FireNation extends Nation {
	
	String uniqueUnit;
	int numOfUnits;
	
	
	public FireNation(String n, int p, String u, int o) {
		super(n, p);
		this.uniqueUnit = u;
		this.numOfUnits = o;
	}
	
	

	public String toString() {
		if (this.enemy == null && this.ally == null) {
			return this.name + " has " + this.population + " people. It has no enemy. It has no ally. It has " + this.numOfUnits + " units of " + this.uniqueUnit + ".";
		}
		else if (this.enemy == null) {
			return this.name + " has " + this.population + " people. It has no enemy. Its ally is " + this.ally.name + ". It has " + this.numOfUnits + " unique units of " + this.uniqueUnit + ".";
		}
		else if (this.ally == null) {
			return this.name + " has " + this.population + " people. Its enemy is " + this.enemy.name + ". It has no ally. It has " + this.numOfUnits + " unique units of " + this.uniqueUnit + ".";
		}
		else {
			return this.name + " has " + this.population + " people. Its enemy is " + this.enemy.name + ". Its ally is " + this.ally.name + ". It has " + this.numOfUnits + " unique units of " + this.uniqueUnit + ".";
		
	}

}
}