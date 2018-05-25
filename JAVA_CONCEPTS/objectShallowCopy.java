class playerLife_1 {
	
	int noOfLives;
	int strengthPerLife;
	
	playerLife_1(int noOfLives, int strengthPerLife){
		this.noOfLives = noOfLives;
		this.strengthPerLife = strengthPerLife;
	}

}

class gameOfThrones_1 implements Cloneable{
	
	int noOfCharacters;
	playerLife_1 pl;
	
	gameOfThrones_1(int noOfCharacters, playerLife_1 pl){
		this.noOfCharacters = noOfCharacters;
		this.pl = pl;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}

class shallow_copy{
	public static void  main(String[] args) throws CloneNotSupportedException {
		
		playerLife_1 plObj1 = new playerLife_1(3, 100); 
		gameOfThrones_1 gotObject1 = new gameOfThrones_1(10,plObj1);
		
		//object shallow copy
		gameOfThrones_1 gotObject2 = (gameOfThrones_1) gotObject1.clone();
	
		//System.out.println(gotObject2.noOfCharacters + " " + gotObject2.pl.noOfLives + " " + gotObject2.pl.strengthPerLife);
		
		gotObject2.noOfCharacters = 60;
		gotObject1.pl.noOfLives = 1000;
		
		System.out.println(gotObject1.noOfCharacters + " " + gotObject1.pl.noOfLives + " " + gotObject1.pl.strengthPerLife);

		System.out.println(gotObject2.noOfCharacters + " " + gotObject2.pl.noOfLives + " " + gotObject2.pl.strengthPerLife);

		
	}
}