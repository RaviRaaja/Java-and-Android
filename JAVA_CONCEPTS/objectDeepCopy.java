class playerLife implements Cloneable{
	
	int noOfLives;
	int strengthPerLife;
	
	playerLife(int noOfLives, int strengthPerLife){
		this.noOfLives = noOfLives;
		this.strengthPerLife = strengthPerLife;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone(); 
	}
}

class gameOfThrones implements Cloneable{
	
	int noOfCharacters;
	playerLife pl;
	
	gameOfThrones(int noOfCharacters, playerLife pl){
		this.noOfCharacters = noOfCharacters;
		this.pl = pl;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		gameOfThrones temp = (gameOfThrones) super.clone();
		temp.pl = (playerLife) pl.clone(); 
		return temp;
	}
	
}

class clone_1{
	public static void  main(String[] args) throws CloneNotSupportedException {
		
		playerLife plObj1 = new playerLife(3, 100); 
		gameOfThrones gotObject1 = new gameOfThrones(10,plObj1);
		System.out.println("Initial values of object plObj1 and gotObject1 :");
		System.out.println(gotObject1.noOfCharacters + " " + gotObject1.pl.noOfLives+ " " + gotObject1.pl.strengthPerLife);
		
		gameOfThrones gotObject2 = (gameOfThrones) gotObject1.clone();
		
		int inf = (int) Double.POSITIVE_INFINITY;
		
		gotObject2.pl.noOfLives= inf;
		gotObject2.noOfCharacters = 40;
		
		System.out.println("Values of object plObj2 and gotObject2 thus deep copy of the object is done so that pl.strength value is retained as 100(prev) :");
		System.out.println(gotObject2.noOfCharacters + " " + gotObject2.pl.noOfLives + " " + gotObject2.pl.strengthPerLife);
		
		
		
	}
}
