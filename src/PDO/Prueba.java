package PDO;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner dates=new Scanner(System.in);
        Animal panda=new Animal();
        String name;
        int age;
        System.out.println("ingrese el nombre del animal");
        name=dates.nextLine();

        System.out.println("ingrese la edad del animal");
        age=dates.nextInt();
        panda.registarAnimal(name,age);
        panda.mostrarAnimal();
        int resultado=panda.duplEdad(age);
        System.out.println("la edad duplicada es "+resultado);
        System.out.println("la edad duplicada es "+panda.duplEdad(resultado));
        dates.close();
        //movie avenger=new movie();
    }
}
