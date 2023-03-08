package PDO;
import java.util.Scanner;
public class movie{
    //atribuos
    private String name;
    private int duraion;
    String category;
    public String director;
    int aum=15;
    //metodos
    private Scanner dates=new Scanner(System.in);
    public void addMovie(){
        System.out.println("nombre de la pelicula");
        name=dates.nextLine();
        dates.nextLine();
        System.out.println("duracion de la pelicula (en minutos)");
        duraion=dates.nextInt();
        System.out.println("Categoria de la pelicula");
        category=dates.nextLine();
        dates.nextLine();
        System.out.println("ingrese el director de la pelicula");
        director=dates.nextLine();
    }
    public void changeCategory(String newCategory){
        category=newCategory;
    }
    public int addcredits(){
        duraion=duraion+aum;
        return duraion;
    }
    public void printMovie(){
        System.out.println("estos son los datos ingresados en el sistema");
        System.out.println(name);
        System.out.println(duraion);
        System.out.println(category);
        System.out.println(director);
    }
}

