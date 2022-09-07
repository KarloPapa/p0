package p0;

public class Nation {
	String name;
	int population;
	Nation enemy;
	Nation ally;
	
	public Nation(String n, int p) {
		this.name = n;
		this.population = p;
	}
	
	public void setEnemy(Nation n) {
		this.enemy = n;
		Nation t = new Nation(this.name, this.population);
		n.enemy = t;
		
				
	}
	
	public void setAlly(Nation n) {
		this.ally = n;
		Nation t = new Nation(this.name, this.population);
		n.ally = t;
		
				
	}
	
	public String toString() {
		if (this.enemy == null && this.ally == null) {
			return this.name + " has " + this.population + " people. It has no enemy. It has no ally.";
		}
		else if (this.enemy == null) {
			return this.name + " has " + this.population + " people. It has no enemy. Its ally is " + this.ally.name + ".";
		}
		else if (this.ally == null) {
			return this.name + " has " + this.population + " people. Its enemy is " + this.enemy.name + ". It has no ally.";
		}
		else {
			return this.name + " has " + this.population + " people. Its enemy is " + this.enemy.name + ". Its ally is " + this.ally.name + ".";
		}
	}
	public void backstab() {
		Nation n = new Nation("", 0);
		n = this.enemy;
		this.enemy = this.ally;
		this.ally = n;
	}
	public String getRelationship(Nation n) {
		if (this.enemy == n) {
			return "Enemy";
			}
		if (this.ally == n) {
			return "Ally";
			}
		else {
			return "No relationship";
			}
	}

}
