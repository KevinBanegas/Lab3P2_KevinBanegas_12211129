package lab3p2_kevinbanegas_12211129;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3P2_KevinBanegas_12211129 {

    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {
        boolean centinela = true;
        ArrayList<Planetas> planetas = new ArrayList();
        ArrayList<Cohetes> cohetes = new ArrayList();
        planetas.add(new Rocosos(34, false, "Serpulo", 700000000, 1200, 129));
        planetas.get(0).getLunas().add(new Lunas("Europa", 40));
        planetas.get(0).getLunas().add(new Lunas("Francium", 80));
        planetas.add(new Rocosos(10, true, "Aries", 192000000, 12900, 30));
        planetas.get(1).getLunas().add(new Lunas("Salting", 90));
        planetas.get(1).getLunas().add(new Lunas("MoonTwo", 30));
        planetas.add(new Gaseosos(100, 20, "Mega Saturn", 530233000, 9000, 300));
        planetas.get(2).getLunas().add(new Lunas("USA Moon", 10));
        planetas.get(2).getLunas().add(new Lunas("Arctic", 100));
        cohetes.add(new CombustLiqui(23000, 50000, "Autumn", 123442, 8));
        cohetes.get(0).getPersonas().add(new Personas("Wilmer", 34, 100));
        cohetes.get(0).getPersonas().add(new Personas("Jason", 29, 120));
        cohetes.add(new DeFases(3, 6, 20, 40000, "Mecha", 149823, 5));
        cohetes.get(1).getPersonas().add(new Personas("Hashem", 32, 100));
        cohetes.get(1).getPersonas().add(new Personas("Ana", 30, 110));
        cohetes.add(new CombustSolid(1900, "Thorium", 800000, "Europa", 123442, 8));
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
            System.out.println("8) Salir");
            System.out.println("------------------------------------");
            System.out.println("Ingrese una opcion: ");
            int opcion = lea.nextInt();
            lea = new Scanner(System.in);
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el nombre:");
                    String nombre = lea.nextLine();
                    lea = new Scanner(System.in);
                    System.out.println("Ingrese pero soportable: ");
                    int pesoSoport = lea.nextInt();
                    lea = new Scanner(System.in);
                    System.out.println("Ingrese el numero de serie:");
                    int numSerie = lea.nextInt();
                    lea = new Scanner(System.in);
                    int check = 0;
                    for (Cohetes cohete : cohetes) {
                        if (cohete.getNumSerie() == numSerie) {
                            check = 1;
                        }
                    }
                    if (check == 0) {
                        System.out.println("Ingrese la potencia(1-9): ");
                        int potencia = lea.nextInt();
                        if (potencia > 0 && potencia < 9) {
                            System.out.println("Ingrese el tipo de cohete:");
                            System.out.println("1) Combustible Liquido");
                            System.out.println("2) De Fases");
                            System.out.println("3) Combustible Solido");
                            int tipo = lea.nextInt();
                            lea = new Scanner(System.in);
                            switch (tipo) {
                                case 1:
                                    System.out.println("Ingrese los litros de gas:");
                                    int litros = lea.nextInt();
                                    lea = new Scanner(System.in);
                                    cohetes.add(new CombustLiqui(litros, pesoSoport, nombre, numSerie, potencia));
                                    break;
                                case 2:
                                    System.out.println("Ingrese la cantidad de fases: ");
                                    int fases = lea.nextInt();
                                    lea = new Scanner(System.in);
                                    System.out.println("Ingrese la cantidad de motores");
                                    int motores = lea.nextInt();
                                    lea = new Scanner(System.in);
                                    System.out.println("Ingrese la altura: ");
                                    int altura = lea.nextInt();
                                    cohetes.add(new DeFases(fases, motores, altura, pesoSoport, nombre, numSerie, potencia));
                                    break;
                                case 3:
                                    System.out.println("Ingrese los kilos de combustible: ");
                                    int kilos = lea.nextInt();
                                    lea = new Scanner(System.in);
                                    System.out.println("Ingrese le material del combustible: ");
                                    String material = lea.nextLine();
                                    lea = new Scanner(System.in);
                                    cohetes.add(new CombustSolid(kilos, material, pesoSoport, nombre, numSerie, potencia));

                                    break;
                                default:
                                    System.out.println("Ingreso un tipo invalido");
                                    break;
                            }
                        } else {
                            System.out.println("La potencia que ingreso es invalido.");
                        }
                    } else {
                        System.out.println("Ese numero de serie ya existe.");
                    }
                }
                break;
                case 2: {
                    System.out.println("Ingrese el nombre: ");
                    String nombre = lea.next();
                    lea = new Scanner(System.in);
                    int checkNom = 0;
                    for (Planetas planeta : planetas) {
                        if (planeta.getNombre().equals(nombre)) {
                            checkNom = 1;
                        }
                    }
                    if (checkNom == 0) {
                        System.out.println("Ingrese la masa: ");
                        int masa = lea.nextInt();
                        lea = new Scanner(System.in);
                        System.out.println("Ingrese el radio: ");
                        int radio = lea.nextInt();
                        lea = new Scanner(System.in);
                        System.out.println("Ingrese la temperatura promedio: ");
                        int tempProm = lea.nextInt();
                        lea = new Scanner(System.in);
                        System.out.println("Ingrese el tipo de planeta: ");
                        System.out.println("1) Rocoso");
                        System.out.println("2) Gaseoso");
                        int tipo = lea.nextInt();
                        switch (tipo) {
                            case 1:
                                System.out.println("Ingrese la densidad: ");
                                int densidad = lea.nextInt();
                                lea = new Scanner(System.in);
                                System.out.println("Ingrese si hay vida(1-SI   2-NO): ");
                                int vida = lea.nextInt();
                                lea = new Scanner(System.in);
                                boolean ifVida = false;
                                switch (vida) {
                                    case 1:
                                        ifVida = true;
                                        planetas.add(new Rocosos(densidad, ifVida, nombre, masa, radio, tempProm));
                                        break;
                                    case 2:
                                        ifVida = true;
                                        planetas.add(new Rocosos(densidad, ifVida, nombre, masa, radio, tempProm));
                                        break;
                                    default:
                                        System.out.println("Ingreso un dato invalido para verificar si hay vida. ");
                                        break;
                                }
                                break;

                            case 2:
                                System.out.println("Ingrese la presion: ");
                                int presion = lea.nextInt();
                                lea = new Scanner(System.in);
                                System.out.println("Ingrese la cantidad anillos: ");
                                int cantAnillos = lea.nextInt();
                                lea = new Scanner(System.in);
                                planetas.add(new Gaseosos(presion, cantAnillos, nombre, masa, radio, tempProm));
                                break;
                            default:
                                System.out.println("Ingreso un tipo de planeta invalido.");
                                break;
                        }
                    } else {
                        System.out.println("El nombre del planeta ya existe.");
                    }
                }
                break;
                case 3: {
                    System.out.println("Ingrese el indice del cohete que desea modificar: ");
                    int modCohete = lea.nextInt();
                    lea = new Scanner(System.in);
                    if (modCohete < cohetes.size() && modCohete > 0) {
                        System.out.println("-------Cohete-------");
                        System.out.println("1) Agregar Personas");
                        System.out.println("2) Eliminar Personas");
                        System.out.println("-------------------");
                        int opcionCohete = lea.nextInt();
                        lea = new Scanner(System.in);
                        switch (opcionCohete) {
                            case 1:
                                System.out.println("Ingres el nombre: ");
                                String nombre = lea.nextLine();
                                lea = new Scanner(System.in);
                                System.out.println("Ingrese la edad: ");
                                int edad = lea.nextInt();
                                lea = new Scanner(System.in);
                                System.out.println("Ingrese el peso: ");
                                int peso = lea.nextInt();
                                lea = new Scanner(System.in);
                                cohetes.get(modCohete).getPersonas().add(new Personas(nombre, edad, peso));
                                break;
                            case 2:
                                System.out.println("Ingrese el indice de la persona que desea eliminar: ");
                                int elimPersona = lea.nextInt();
                                lea = new Scanner(System.in);
                                if (elimPersona < cohetes.get(modCohete).getPersonas().size() && elimPersona > 0) {
                                    cohetes.get(modCohete).getPersonas().remove(elimPersona);
                                } else {
                                    System.out.println("El indice de la persona no existe: ");
                                }
                                break;
                            default:
                                break;
                        }
                    } else {
                        System.out.println("El indice del cohete no existe.");
                    }
                }
                break;
                case 4: {
                    System.out.println("Ingrese el Indice del planeta que desea modificar: ");
                    int modPlaneta = lea.nextInt();
                    if (modPlaneta < planetas.size() && modPlaneta > 0) {
                        lea = new Scanner(System.in);
                        System.out.println("-------Lunas-------");
                        System.out.println("1) Agregar Lunas");
                        System.out.println("2) Eliminar Lunas");
                        System.out.println("-------------------");
                        int opcionLuna = lea.nextInt();
                        lea = new Scanner(System.in);
                        switch (opcionLuna) {
                            case 1:
                                System.out.println("Ingrese el nombre: ");
                                String nombre = lea.nextLine();
                                lea = new Scanner(System.in);
                                System.out.println("Ingrese la cantidad de crateres: ");
                                int cantCrater = lea.nextInt();
                                lea = new Scanner(System.in);
                                planetas.get(modPlaneta).getLunas().add(new Lunas(nombre, cantCrater));
                                break;
                            case 2:
                                System.out.println("Ingrese el indice de la luna que desea eliminar: ");
                                int elimLuna = lea.nextInt();
                                if (elimLuna < planetas.get(modPlaneta).getLunas().size() && elimLuna > 0) {
                                    planetas.get(modPlaneta).getLunas().remove(elimLuna);
                                } else {
                                    System.out.println("El indice de la luna no existe.");
                                }
                                break;
                            default:
                                break;
                        }
                    } else {
                        System.out.println("El indice del planeta no existe. ");
                    }
                }
                break;
                case 5: {
                    System.out.println(cohetes);
                }
                break;
                case 6: {
                    System.out.println(planetas);
                }
                break;
                case 7: {
                    System.out.println("Ingrese el planeta que desea probar: ");
                    int planeta = lea.nextInt();
                    lea = new Scanner(System.in);
                    System.out.println("-----Lanzamiento-----");
                    System.out.println("1) Un cohete");
                    System.out.println("2) Todos los cohetes");
                    System.out.println("---------------------");
                    System.out.println("Ingrese una opcion: ");
                    int opcionLaunch = lea.nextInt();
                    switch (opcionLaunch) {
                        case 1: {
                            int fallo = 0;
                            int exito = 0;
                            System.out.println("Ingrese el indice del cohete que desea lanzar: ");
                            int coheteLaunch = lea.nextInt();
                            lea = new Scanner(System.in);
                            cohetes.get(coheteLaunch).setVelocidad(5000 + r.nextInt(20000));
                            if (cohetes.get(coheteLaunch).getVelocidad() > planetas.get(planeta).getVelEscape()) {
                                System.out.println("El Cohete " + cohetes.get(coheteLaunch).getNombre() + " alcanzó la velocidad de " + cohetes.get(coheteLaunch).getVelocidad() + " Km/h y logró salir del planeta " + planetas.get(planeta).getNombre());
                                exito++;
                            }else{
                                System.out.println("El Cohete " + cohetes.get(coheteLaunch).getNombre() + " alcanzó la velocidad de " + cohetes.get(coheteLaunch).getVelocidad() + " Km/h y no logró salir del planeta " + planetas.get(planeta).getNombre());
                                fallo++;
                            }
                            System.out.println("Intetos Exitosos: " + exito);
                            System.out.println("Intentos Fallidos: " + fallo);
                        }
                        break;
                        case 2: {
                            int fallo = 0;
                            int exito = 0;
                            for (Cohetes cohete : cohetes) {
                                cohete.setVelocidad(5000 + r.nextInt(20000));
                                System.out.println(cohete.getVelocidad());
                                System.out.println(planetas.get(planeta).getVelEscape());
                                if (cohete.getVelocidad() > planetas.get(planeta).getVelEscape()) {
                                    System.out.println("El Cohete " + cohete.getNombre() + " alcanzó la velocidad de " + cohete.getVelocidad() + " Km/h y logró salir del planeta " + planetas.get(planeta).getNombre());
                                    exito++;
                                } else {
                                    System.out.println("El Cohete " + cohete.getNombre() + " alcanzó la velocidad de " + cohete.getVelocidad() + " Km/h y logró salir del planeta " + planetas.get(planeta).getNombre());
                                    fallo++;
                                }
                            }
                            System.out.println("Intetos Exitosos: " + exito);
                            System.out.println("Intentos Fallidos: " + fallo);
                        }
                        break;
                    }
                }
                break;
                case 8: {
                    centinela = false;
                }
                break;
                default: {
                    System.out.println("Ingreso un valor invalido");
                }

            }
        }
    }

}
