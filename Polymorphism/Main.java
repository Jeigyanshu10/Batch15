package com.technoelevate.Polymorphism;

class Movie{
	private String name;

	public Movie(String name) {
		this.name = name;
	}
	
	public String Plot() {
		return "no plots here";
	}
	
	public String getMovieName() {
		return this.name;
	}
}

class PK extends Movie{

	public PK() {
		super("PK");	
	}

	@Override
	public String Plot() {
	
		return "Misunderstanding God";
	}	
	
}


class Joker extends Movie{

	public Joker() {
		super("Joker");
	
	}

	@Override
	public String Plot() {
		
		return "Smile every time";
	}
	
}

class KGF extends Movie{

	public KGF() {
		super("KGF");
	}

	@Override
	public String Plot() {
		
		return "Survival of the fittest";
	}	
	
}

class Starwars extends Movie{

	public Starwars() {
		super("Star Wars");
	}

	@Override
	public String Plot() {
		
		return "Imperial forces try to take over universe";
	}
	
}

class Forgettable extends Movie{

	public Forgettable() {
		super("Forgettable");
	}
	
	// No plots provide
}

public class Main {

	public static void main(String[] args) {
		
		for(int i=1;i<11;i++) {
			Movie movie = randomMovie();
			Movie sw= new PK();
			System.out.println("Movie #"+i+" : "+movie.getMovieName()+"\n"+
								"Plot: "+movie.Plot()+"\n");
		}

	}
	
	public static Movie randomMovie() {
		
		int randomNumber = (int) (Math.random()*5)+1;
		System.out.println("Random number generated : "+randomNumber);
		
		switch(randomNumber) {
		case 1:
			return new PK();
		case 2:
			return new Joker();
		case 3:
			return new KGF();
		case 4:
			return new Starwars();
		case 5:
			return new Forgettable();
		default:
			return null;
		}
		
	}

}
