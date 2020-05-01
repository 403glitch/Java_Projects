package com.company;

class Movie{

    private String movie;

    public Movie(String movie) {
        this.movie = movie;
    }

    public String plot(){
     return "No plot here";
    }

    public String getMovie() {
        return movie;
    }
}

class Jaws extends Movie{

    public Jaws(String movie){  //here we have assigned the data type and variable name of the parent class (Movie)
        super(movie);
    }

    public String plot(){
        return "Movie on Shark Attack";
    }
}

class IndependenceDay extends Movie{

    public IndependenceDay (){
        super("Independence Day");
    }

    public String plot(){
        return "Terrorist Attack";
    }
}

class MazeRunner extends Movie{

    public MazeRunner (){
        super("Maze Runner");
    }

    public String plot(){
        return "Kid try to escape a maze";
    }
}

class StarWars extends Movie{

    public StarWars (){
        super("Star Wars");
    }

    public String plot(){
        return ("Intergalactic Battle");
    }
}

class Forgettable extends Movie{

    public Forgettable (){
        super("Forgettable");
    }

    // No Plot Method
}


public class Main {

    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + " : " + movie.getMovie() +
                                "\n" + "Plot : " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {

        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random Number Generated = " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Jaws("Jaws"); // here we have assign the value for our variable (String movie[line 22 23])

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgettable();

        }

        return null;
    }
}
