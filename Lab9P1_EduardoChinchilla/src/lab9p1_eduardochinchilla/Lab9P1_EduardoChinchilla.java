package lab9p1_eduardochinchilla;

import java.util.*;

public class Lab9P1_EduardoChinchilla {

    static Scanner read = new Scanner(System.in);
    static ArrayList<Libros> libros = new ArrayList<>();
    static Libros l1 = new Libros();

    public static void main(String[] args) {
        int opcion = 0;
        boolean sm = false;
        while (opcion != 8) {
            System.out.println("1.Agregar Libro");
            System.out.println("2. Listar Libros");
            System.out.println("3. Modificar Libros");
            System.out.println("4. Eliminar Libros");
            System.out.println("5. Filtro por titulo");
            System.out.println("6. Filtro por autor");
            System.out.println("7. Filtro por genero");
            System.out.println("8. Salir");

            opcion = read.nextInt();

            switch (opcion) {
                case 1: {
                    int cont = 0;
                    
                    read.nextLine();
                    System.out.println("Titulo: ");
                    String t = read.nextLine();
                    l1.setTitulo(t);
                    System.out.println("Autor: ");
                    String a = read.nextLine();
                    l1.setNombreA(a);
                    System.out.println("Genero: ");
                    String g = read.nextLine();
                    l1.setGenero(g);
                    System.out.println("Edad minima: ");
                    int em = read.nextInt();
                    l1.setEdadM(em);

                    while (em < 0) {
                        System.out.println("Error debe ser mayor a 0");
                        System.out.println("Edad minima: ");
                        em = read.nextInt();
                    }

                    libros.add(new Libros(t, a, g, em));
                    System.out.println("Libro agregado exitosamente!");
                    
                    if (cont < 1){
                        sm = true;
                    }
                    cont++;
//                    Libros l = new Libros(t, a, g, em);
//                    l.setTitulo(t);
//                    l.setNombreA(a);
//                    l.setGenero(g);
//                    l.setEdadM(em);
                    break;
                }
                case 2: {
                    if (sm == true){
                    System.out.println("Libros Disponibles: ");
                    //System.out.println(libros.toString());
                    impr(libros);
                    }else{
                        System.out.println("Debe ingresar un libro primero");
                    }
                    break;
                }
                case 3: {
                    if (sm == true){
                    System.out.println("Libros Disponibles: ");
//                  System.out.println(libros.toString());
                    impr(libros);
                    System.out.println("Ingrese el indice ");
                    int indice = read.nextInt();

                    while (indice > libros.size()) {
                        System.out.println("Error ese libro no existe");
                        System.out.println("Ingrese el indice");
                        indice = read.nextInt();
                    }
                    
                    System.out.println("Ha seleccionado" + " " + libros.get(indice).getTitulo());
                    System.out.println("Que atributo desea modificar");
                    
                    int atributo;
                    System.out.println("1. Titulo");

                    System.out.println("2. Autor");

                    System.out.println("3. Genero");

                    System.out.println("4. Edad Minima");
                    atributo = read.nextInt();

                    switch (atributo) {
                        case 1: {
                            read.nextLine();
                            System.out.println("Ingrese el titulo nuevo");
                            String t1 = read.nextLine();
                            System.out.println("Titulo modificado");
                            libros.get(indice).setTitulo(t1);

                            break;
                        }
                        case 2: {
                            read.nextLine();
                            System.out.println("Ingrese el Autor Nuevo");
                            String a1 = read.nextLine();
                            System.out.println("Autor modificado");
                            libros.get(indice).setNombreA(a1);

                            break;
                        }
                        case 3: {
                            read.nextLine();
                            System.out.println("Ingrese el Genero nuevo");
                            String g1 = read.nextLine();
                            System.out.println("Genero modificado");
                            libros.get(indice).setGenero(g1);

                            break;
                        }
                        case 4: {
                            read.nextLine();

                            System.out.println("Ingrese el Edad Minima nuevo");
                            int em1 = read.nextInt();
                            System.out.println("Edad minima modificada");
                            libros.get(indice).setEdadM(em1);
                            
                            break;
                        }
                    
                        default:
                            }
                    }else{
                        System.out.println("Debe ingresar un libro primero");
                    
                }
                    break;
                }
                case 4: {
                    if (sm == true){
                    System.out.println("Libros Disponibles: ");
                    //System.out.println(libros.toString());
                    impr(libros);

                    System.out.println("Ingrese el indice del libro a eliminar ");
                    int indice = read.nextInt();
                    
                    while (indice > libros.size()) {
                        System.out.println("Error ese libro no existe");
                        System.out.println("Ingrese el indice");
                        indice = read.nextInt();
                    }
                    
                    libros.remove(indice);
                    System.out.println("El libro ha sido eliminado exitosamente");
                    }else{
                        System.out.println("Debe ingresar un libro primero");
                    }
                    break;
                }
                case 5: {
                    if (sm == true){
                    boolean encuentra = false;
                    System.out.println("Ingrese el titulo del libro a buscar: ");
                    read.nextLine();
                    String t = read.nextLine();
                    t.toLowerCase();
                    for (int i = 0; i < libros.size(); i++) {
                        libros.get(i);
                        if (libros.get(i).getTitulo().equals(t.toLowerCase())){
                        encuentra = true;
                        }                    
                    }
                    if(encuentra == true){
                        System.out.println("El libro se ha encontrado");
                    }else{
                        System.out.println("El libro no se ha encontrado");
                    }
                    }else{
                        System.out.println("Debe ingresar un libro primero");
                    }
                    break;
                }
                case 6: {
                    if (sm == true){
                    boolean encuentra = false;
                    System.out.println("Ingrese el autor del libro a buscar: ");
                    read.nextLine();
                    String t = read.nextLine();
                    
                    for (int i = 0; i < libros.size(); i++) {
                        libros.get(i);
                        if (libros.get(i).getNombreA().equals(t.toLowerCase())){
                        encuentra = true;
                        }                    
                    }
                    if(encuentra == true){
                        System.out.println("El libro se ha encontrado");
                    }else{
                        System.out.println("El libro no se ha encontrado");
                    }
                    }else{
                        System.out.println("Debe ingresar un libro primero");
                    }
                    break;
                }
                case 7: {
                    if (sm == true){
                    System.out.println("Ingrese el genero del libro a buscar: ");
                    read.nextLine();
                    String t = read.nextLine();
                    t.toLowerCase();
                    boolean encuentra = false;
                    for (int i = 0; i < libros.size(); i++) {
                        libros.get(i);
                        if (libros.get(i).getGenero().equals(t.toLowerCase())){
                            
                            encuentra = true;
                        }                    
                    }
                    if(encuentra == true){
                        System.out.println("El libro se ha encontrado");
                    }else{
                        System.out.println("El libro no se ha encontrado");
                    }
                    }else{
                        System.out.println("Debe ingresar un libro primero");
                    }
                    break;
                }
                case 8: {
                    System.out.println("Ha salido");
                    break;
                }

                default:
            }
        }
    }//fin main
    public static void impr (ArrayList<Libros> l){
        String s = " ";
        for (int i = 0; i < l.size(); i++) {
            s += "\n"+"Libro "+i+"\n" + "Titulo: "+l.get(i).getTitulo() + "\n" +"Autor: "+l.get(i).getNombreA()+ "\n" + "Genero: " + l.get(i).getGenero()+ "\n" + "Edad Minima: "+l.get(i).getEdadM();
        }
        System.out.println(s);
    }
}
