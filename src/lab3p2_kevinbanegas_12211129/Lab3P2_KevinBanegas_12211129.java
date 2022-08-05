package lab3p2_kevinbanegas_12211129;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_KevinBanegas_12211129 {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        boolean centinela = true;
        ArrayList<Planetas> planetas = new ArrayList();
        ArrayList<Cohetes> cohetes = new ArrayList();
        
        planetas.add(new Rocosos(34,false,"Serpulo",700000000,120000,129));
        planetas.get(0).getLunas().add(new Lunas("Europa", 40));
        planetas.get(0).getLunas().add(new Lunas("Francium", 80));
        planetas.add(new Rocosos(10,true,"Aries",192000000,1294000,30));
        planetas.get(1).getLunas().add(new Lunas("Salting", 90));
        planetas.get(1).getLunas().add(new Lunas("MoonTwo", 30));
        planetas.add(new Gaseosos(100,20,"Mega Saturn", 530233000, 3000000, 300));
        planetas.get(2).getLunas().add(new Lunas("USA Moon", 10));
        planetas.get(2).getLunas().add(new Lunas("Arctic", 100));
        cohetes.add(new CombustLiqui(23000, 50000,"Autumn",123442,8));
        cohetes.get(0).getPersonas().add(new Personas("Wilmer", 34, 100));
        cohetes.get(0).getPersonas().add(new Personas("Jason", 29, 120));
        cohetes.add(new DeFases(3, 6, 20, 40000, "Mecha", 149823, 5));
        cohetes.get(1).getPersonas().add(new Personas("Hashem", 32, 100));
        cohetes.get(1).getPersonas().add(new Personas("Ana", 30, 110));
        cohetes.add(new CombustSolid(1900,"Thorium", 800000,"Europa",123442,8));
        cohetes.get(2).getPersonas().add(new Personas("Alex", 31, 100));
        cohetes.get(2).getPersonas().add(new Personas("Kevun", 28, 1020));
        
        
        System.out.println(planetas);
        System.out.println(cohetes);
        while (centinela == true) {
            System.out.println("---------Universe SandBox 3---------");
            System.out.println("1) Crear Cohete");
            System.out.println("2) Crear Planeta");
            System.out.println("3) Editar Cohete");
            System.out.println("4) Editar Planeta");
            System.out.println("5) Listar Cohetes");
            System.out.println("6) Listar Planetas");
            System.out.println("7) Probar Cohete");
            System.out.println("------------------------------------");
            System.out.println("Ingrese una opcion: ");
            int opcion = lea.nextInt();
        }
    }

}
