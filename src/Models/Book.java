package Models;

public class Book {
    
    private String name;
    private int year;

    private Book(String name, int year){
        this.name=name;
        this.year=year;
    }

    public String getName(){
        return name;
    }

    public String setName(){
        return name;
    }
    
    public int getYear(){
        return year;
    }

    public int setYear(){
        return year;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", year=" + year + "]";
    }

    
}
