package com.mycompany.entrega_proyectofinal;

import java.util.Scanner;

/**
 *
 * @author Julián Villamizar
 */
public class Entrega_ProyectoFinal{
    
    public void casoUno(){
        
        
        System.out.print("Por favor, digite la cantidad de empleados: ");
        Scanner sc = new Scanner(System.in);
        int tmp1 = sc.nextInt();

        //Creacción de un array de objetos
        EmpleadoEjer1 listaEmpleados[];
        listaEmpleados = new EmpleadoEjer1[tmp1];

        //Creación de instancias por cada empleado que hay y asignación de valores
        for(int i=0;i<tmp1;i++){
            listaEmpleados[i]=new EmpleadoEjer1();
            listaEmpleados[i].capturaDeDatosEmpleado();
        }
        //Impresión de resultados
        for(int i=0;i<tmp1;i++){
            System.out.println("Nombre completo empleado: "+listaEmpleados[i].getnombreEmpleado()+" "+listaEmpleados[i].getapellidosEmpleado());
            if(listaEmpleados[i].getPilaObject().sumatoriaHorasPorSemanaEmpleado() > 500){
                System.out.println("Este empleado ha ganado más de 500 USD semanales...");
                System.out.println("<{Vista del cheque semanal}>");
                System.out.println(" ");
                System.out.println("Ganancias por día en USD (desplegandose desde la primera hasta la última de arriba hacia abajo)");
                for(int a=0;a<listaEmpleados[i].getdiasDeLaSemana().size();a++){
                    System.out.print(listaEmpleados[i].getdiasDeLaSemana().get(a)+" ");
                }
                System.out.println(" ");
                listaEmpleados[i].getPilaObject().listar();
                System.out.println("\n\n<[Total ganado]>: "+listaEmpleados[i].getPilaObject().sumatoriaHorasPorSemanaEmpleado()+" USD");
            }
            else{
               System.out.println("Este empleado ha ganado menos de 500 USD semanales..."); 
               System.out.println("Bono de despensasemana: 150 USD");
               System.out.println("Total + bono: "+(listaEmpleados[i].getPilaObject().sumatoriaHorasPorSemanaEmpleado()+150)+" USD");
            }
            System.out.println("\n");
        }
    }
    
    public void casoDos(){
        System.out.print("Por favor, digite la cantidad de estudiantes: ");
        Scanner sc = new Scanner(System.in);
        int tmp1 = sc.nextInt();
        int cantNotasPorEstudiante = 3;

        //Creacción de un array de objetos
        EstudianteEjer2 listaEstudiantes[];
        listaEstudiantes = new EstudianteEjer2[tmp1];
        
        //Creación de instancias por cada Estudiante que hay y asignación de valores
        for(int i=0;i<tmp1;i++){
            listaEstudiantes[i]=new EstudianteEjer2();
            listaEstudiantes[i].capturaDeDatosEstudiante(cantNotasPorEstudiante);
        }
        //Impresión de resultados
        for(int i=0;i<tmp1;i++){
            System.out.println("\nNombre completo estudiante: "+listaEstudiantes[i].getnombreEstudiante()+" "+listaEstudiantes[i].getapellidosEstudiante());
            if(listaEstudiantes[i].getcarreraEstudiante().equals("Medicina") || listaEstudiantes[i].getcarreraEstudiante().equals("medicina")){
               System.out.println("Este estudiante pertenece a la carrera de medicina");
               System.out.println("<{Boleta de calificaciones}>");
               System.out.println("Las 3 notas obtenidas fueron (desplegandose desde la primera hasta la última de arriba hacia abajo): ");
               System.out.println("\n");
               listaEstudiantes[i].getPilaObjectEstudiantes().listar2();
               float numerador = listaEstudiantes[i].getPilaObjectEstudiantes().sumatoriaNotasEstudiantes();
               float denominador = listaEstudiantes[i].getPilaObjectEstudiantes().getTamanio();
               System.out.println("\nPromedio final: "+numerador/denominador);
               System.out.println("\n\n");
            }
            else{
                System.out.println("\n<<<<<<<<<<<<<<<<<<CORDIAL SALUDO PADRE DE FAMILIA>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("\n<<<<<<<<<<<<<<<<<<<<<Motivo: Plática amistosa>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("\n|El motivo de la siguiente citación tiene por objeto hacerle saber de |");
                System.out.println("\n|La importancia de su presencia en las instalaciónesde nuestra insti- |");
                System.out.println("\n|tución el próximo martes 22 de febrero a las 6:45 p.m, agradecemos su|");
                System.out.println("\n|Oportuna asistencia, cordialmente: La coordinación                   |");
                System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<|");
                System.out.println("\n\n");
            }
        }
        
    }
    
    public void casoTres(){
        System.out.print("Por favor, digite el número de pedidos: ");
        Scanner sc = new Scanner(System.in);
        int tmp1 = sc.nextInt();

        //Creacción de un array de objetos
        ProductoEjer3 listaProductos[];
        listaProductos = new ProductoEjer3[tmp1];
        
        //Creación de instancias por cada Estudiante que hay y asignación de valores
        for(int i=0;i<tmp1;i++){
            listaProductos[i]=new ProductoEjer3();
            listaProductos[i].capturaDeDatosProducto();
        }
        for(int i=0;i<tmp1;i++){
            System.out.println("\nNombre completo Del producto: "+listaProductos[i].getNombreProducto());
            if(listaProductos[i].getNacionalidadProducto().equals("Guatemala") || listaProductos[i].getNacionalidadProducto().equals("guatemala")){
                System.out.println("Este prodcuto es un producto nacional...");
                listaProductos[i].getPilaObjectProducto().listar();
            }
            else{
                    //No hacemos nada
            }
            System.out.println("\n");
        }  
    }
    
    public void casoCuatro(){
        System.out.print("Por favor, digite el número de pedidos: ");
        Scanner sc = new Scanner(System.in);
        int tmp1 = sc.nextInt();

        //Creacción de un array de objetos
        ProductoEjer4 listaProductos[];
        listaProductos = new ProductoEjer4[tmp1];
        
        
         //Creación de instancias por cada Estudiante que hay y asignación de valores
        for(int i=0;i<tmp1;i++){
            listaProductos[i]=new ProductoEjer4();
            listaProductos[i].capturaDeDatosProducto2();
        }
        for(int i=0;i<tmp1;i++){
            System.out.println("\nNombre completo Del producto: "+listaProductos[i].getNombreProducto2());
            if(listaProductos[i].getcantidadEnExistencia2() < listaProductos[i].getpuntoReorden() || (listaProductos[i].getNacionalidadProducto2().equals("Guatemala") || listaProductos[i].getNacionalidadProducto2().equals("guatemala"))){
                System.out.println("Este prodcuto es un producto nacional o la cantidad en existencia es menor al punto de reorden...");
                listaProductos[i].getPilaObjectProducto2().listar();
            }
            else{
                    //No hacemos nada
            }
            System.out.println("\n");
        }
    }
    
    public void casoCinco(){
        System.out.print("Por favor, digite la cantidad de empleados: ");
        Scanner sc = new Scanner(System.in);
        int tmp1 = sc.nextInt();

        //Creacción de un array de objetos
        EmpleadoEjer5 listaEmpleados[];
        listaEmpleados = new EmpleadoEjer5[tmp1];

        //Creación de instancias por cada empleado que hay y asignación de valores
        for(int i=0;i<tmp1;i++){
            listaEmpleados[i]=new EmpleadoEjer5();
            listaEmpleados[i].capturaDeDatosEmpleado();
        }
        //Impresión de resultados
        for(int i=0;i<tmp1;i++){
            System.out.println("Nombre completo empleado: "+listaEmpleados[i].getnombreEmpleado()+" "+listaEmpleados[i].getapellidosEmpleado());
            if(listaEmpleados[i].getPilaObject().sumatoriaHorasPorSemanaEmpleado() > 500 && (listaEmpleados[i].getdepartamento().equals("Producción") || listaEmpleados[i].getdepartamento().equals("Produccion")) || listaEmpleados[i].getdepartamento().equals("produccion")){
                System.out.println("Este empleado ha ganado más de 500 USD semanales y pertenece al departamento de producción...");
                System.out.println("<{Vista del cheque semanal}>");
                System.out.println(" ");
                System.out.println("Ganancias por día en USD (desplegandose desde la primera hasta la última de arriba hacia abajo)");
                for(int a=0;a<listaEmpleados[i].getdiasDeLaSemana().size();a++){
                    System.out.print(listaEmpleados[i].getdiasDeLaSemana().get(a)+" ");
                }
                System.out.println(" ");
                listaEmpleados[i].getPilaObject().listar();
                System.out.println("\n\n<[Total ganado]>: "+listaEmpleados[i].getPilaObject().sumatoriaHorasPorSemanaEmpleado()+" USD");
            }
            else{
               System.out.println("Este empleado ha ganado menos de 500 USD semanales o no pertenece al departamento de producción..."); 
               System.out.println("Bono de despensasemana: 25% USD");
               System.out.println("Total + bono: "+((float)listaEmpleados[i].getPilaObject().sumatoriaHorasPorSemanaEmpleado()*0.25+(float)listaEmpleados[i].getPilaObject().sumatoriaHorasPorSemanaEmpleado())+" USD");
            }
            System.out.println("\n");
        }
    }
    
    public void menu(){
        char answer='1';
         
        //Declaración de objetos como locales a este método.
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<[Bienvenido al menú de opciones del proyecto]>");
        System.out.println(" ");
        
        while(answer >= '1' && answer <= '5' ){
            System.out.println("1. Acceder al ejercicio número uno; Empleados");
            System.out.println("2. Acceder al ejercicio número dos; Estudiantes");
            System.out.println("3. Acceder al ejercicio número dos; Estudiantes");
            System.out.println("4. Acceder al ejercicio número dos; Estudiantes");
            System.out.println("5. Acceder al ejercicio número dos; Estudiantes");
            System.out.println("6. Salir");
            System.out.println(" ");
            System.out.print(">>");
            answer = sc.next().charAt(0);
            switch (answer) {
                case '1':
                    casoUno();
                    break;
                case '2':
                    casoDos();
                    break;
                case '3':
                    casoTres();
                    break;
                case '4':
                    casoCuatro();
                    break;
                case '5':
                    casoCinco();
                    break;
                default:
                    System.out.println("Saliendo...");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Entrega_ProyectoFinal Elector=new Entrega_ProyectoFinal();
        Elector.menu();
    }
}
