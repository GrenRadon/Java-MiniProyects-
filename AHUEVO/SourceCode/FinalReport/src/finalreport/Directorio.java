/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalreport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Directorio {
    
    Scanner sc = new Scanner(System. in);

    //objects
    ArrayList<Alumnos> alumnos = new ArrayList<>();
    ArrayList<Profesores> profesores = new ArrayList<>();
    ArrayList<Coordinadores> coordinadores = new ArrayList<>();
    
    public Directorio() {
    
    }
    
    public String toString(){
        return "The name of the pet is  The age of the pet is ";
    }
    
    //primer punto
    public void insertarDatos(){
        System.out.println("\n\n");
        System.out.println ("Por favor, seleccione que tipo de contacto desee crear");
        System.out.println("1. Alumno");
        System.out.println("2. Profesor");
        System.out.println("1. Coordinador");
        System.out.print(">> ");
        int eleccion = sc.nextInt();
        
        OUTER:
        while (true) {
            switch (eleccion) {
                case 1:
                    {
                        System.out.print("Por favor, digite el número de cuenta: ");
                        long var1 = sc.nextLong();
                        System.out.print("Por favor, digite el celular: ");
                        long var2 = sc.nextLong();
                        System.out.print("Por favor, digite el semestre: ");
                        int var3 = sc.nextInt();
                        System.out.print("Por favor, digite su nombre completo: ");
                        String var4 = sc.nextLine();
                        System.out.print("Por favor, digite su fecha de nacimiento: ");
                        String var5 = sc.nextLine();
                        System.out.print("Por favor, digite su correo electrónico: ");
                        String var51 = sc.nextLine();
                        System.out.print("Por favor, digite su carrera: ");
                        String var52 = sc.nextLine();
                        List<String> var6 = new ArrayList<String>();
                        int tmp3 = 0;
                        System.out.println("\n");
                        while(true){
                            System.out.println("1. Agregar materia");
                            System.out.println("2. Salir");
                            System.out.print(">> ");
                            int tmp1 = sc.nextInt();
                            if(tmp1 == 1){
                                System.out.print("Por favor, digite el nombre de la materia: ");
                                sc.nextLine();
                                String tmp2 = sc.nextLine();
                                var6.add(tmp2);
                                tmp3 += 1;
                            }
                            else{
                                if(tmp3 != 0){
                                    break;
                                }
                                else{
                                    System.out.println("Debe seleccionar al menos una materia!");
                                }
                            }
                        }       alumnos.add(new Alumnos(var1, var2, var3, var4, var5, var51, var52, var6));
                        break OUTER;
                    }
                case 2:
                    {
                        System.out.print("Por favor, digite el número del profesor: ");
                        long var7 = sc.nextLong();
                        System.out.print("Por favor, digite el celular del profesor: ");
                        long var8 = sc.nextLong();
                        System.out.print("Por favor, digite el telefono de la oficina del profesor: ");
                        long var9 = sc.nextLong();
                        System.out.print("Por favor, digite el sueldo del profesor: ");
                        double var10 = sc.nextDouble();
                        System.out.print("Por favor, digite el nombre completo del profesor: ");
                        String var11 = sc.nextLine();
                        System.out.print("Por favor, digite su fecha de cumpleaños del profesor: ");
                        String var12 = sc.nextLine();
                        System.out.print("Por favor, digite el correo del profesor: ");
                        String var13 = sc.nextLine();
                        System.out.print("Por favor, digite el departamento al cual está adscrito el profesor: ");
                        String var14 = sc.nextLine();
                        System.out.print("Por favor, digite la carrera que en la que imparte el profesor: ");
                        String var15 = sc.nextLine();
                        List<String> var16 = new ArrayList<String>();
                        int tmp3 = 0;
                        System.out.println("\n");
                        while(true){
                            System.out.println("1. Agregar carrera");
                            System.out.println("2. Salir");
                            System.out.print(">> ");
                            int tmp1 = sc.nextInt();
                            if(tmp1 == 1){
                                System.out.print("Por favor, digite el nombre de la carrera: ");
                                sc.nextLine();
                                String tmp2 = sc.nextLine();
                                var16.add(tmp2);
                                tmp3 += 1;
                            }
                            else{
                                if(tmp3 != 0){
                                    break;
                                }
                                else{
                                    System.out.println("Debe seleccionar al menos una carrera!");
                                }
                            }
                        }       
                        //int numeroProfesor, int celular, int telOficina, double sueldo, String nombreProfesor, String fechaCumpleanios, String correoElectronico, String departamentoAdscrito, String carreraImparte, List<String> gruposImparte
                        profesores.add(new Profesores(var7, var8, var9, var10, var11, var12, var13, var14, var15, var16));
                        break OUTER;
                    }
                case 3:
                    System.out.print("Por favor, digite el número del coordinador: ");
                    long var17 = sc.nextLong();
                    System.out.print("Por favor, digite el número celular del coordinador: ");
                    long var18 = sc.nextLong();
                    System.out.print("Por favor, digite el teléfono de la oficina del coordinador: ");
                    long var19 = sc.nextLong();
                    System.out.print("Por favor, digite el sueldo del coordinador: ");
                    double var20 = sc.nextDouble();
                    System.out.print("Por favor, digite el nombre completo del coordinador: ");
                    String var21 = sc.nextLine();
                    System.out.print("Por favor, digite el cumpleaños del coordinador: ");
                    String var22 = sc.nextLine();
                    System.out.print("Por favor, digite el correo electrónico del coordinador: ");
                    String var23 = sc.nextLine();
                    System.out.print("Por favor, digite el departamento al cual está adscrito el coordinador: ");
                    String var24 = sc.nextLine();
                    System.out.print("Por favor, digite la carrera que coordina: ");
                    String var25 = sc.nextLine();
                    coordinadores.add(new Coordinadores(var17, var18, var19, var20, var21, var22, var23, var24, var25));
                    break OUTER;
                default:
                    System.out.println("¡Opción no válida");
                    break;
            }
        }   
    }
    
    //segundo punto
    
    public void mostrarDatos1(){
        System.out.println("\n\n");
        
        System.out.print("Por favor, digite el nombre completo del usuario: ");
        String nombreCompleto = sc.nextLine();
        
        int tmp = 0;
        
        //Alumnos
        for(int i = 0; i < alumnos.size(); i++){
            if(alumnos.get(i).getNombreCompleto().equalsIgnoreCase(nombreCompleto));
            {
                System.out.println("Rol: Alumno");
                System.out.println("Numero de la cuenta del alumno: "+alumnos.get(i).getNumeroCuenta());
                System.out.println("Celular del alumno: "+alumnos.get(i).getCelular());
                System.out.println("Semestre: "+alumnos.get(i).getSemestre());
                System.out.println("Nombre completo alumno: "+alumnos.get(i).getNombreCompleto());
                System.out.println("Fecha nacimiento alumno: "+alumnos.get(i).getFechaDeCumpleaios());
                System.out.println("Correo electrónico alumno: "+alumnos.get(i).getCorreoElectronico());
                System.out.println("Carrera alumno: "+alumnos.get(i).getCarrera());
                tmp += 1;
            }
        }
        
        //Profesores
        for(int i = 0; i < profesores.size(); i++){
            if(profesores.get(i).getNombreProfesor().equalsIgnoreCase(nombreCompleto));
            {
                System.out.println("Rol: Profesor");
                System.out.println("Número del profesor: "+profesores.get(i).getNumeroProfesor());
                System.out.println("Celular del profesor: "+profesores.get(i).getCelular());
                System.out.println("Teléfono oficina profesor: "+profesores.get(i).getTelOficina());
                System.out.println("Sueldo profesor: "+profesores.get(i).getSueldo());
                System.out.println("Nombre completo profesor: "+profesores.get(i).getNombreProfesor());
                System.out.println("Fecha cumpleaños profesor: "+profesores.get(i).getFechaCumpleanios());
                System.out.println("Correo electrónico profesor: "+profesores.get(i).getCorreoElectronico());
                System.out.println("Departamento al que está adscrito el profesor: "+profesores.get(i).getDepartamentoAdscrito()); 
                System.out.println("Carrera en la que imparte el profesor: "+profesores.get(i).getCarreraImparte());
                System.out.println("<[Grupos profesor]>");
                
                for(int j =0; j< profesores.get(i).getGruposImparte().size();j++){
                    System.out.println(profesores.get(i).getGruposImparte().get(j));
                }
                tmp += 1;
            }
        }
        
        //Coordinadores
        for(int i = 0; i < coordinadores.size(); i++){
            if(coordinadores.get(i).getNombreCompleto().equalsIgnoreCase(nombreCompleto));
            {
                System.out.println("Rol: Coordinador");
                System.out.println("Número del coordinador: "+coordinadores.get(i).getNumEmpleado());
                System.out.println("Celular del coordinador: "+coordinadores.get(i).getCelular());
                System.out.println("Teléfono oficina coordinador: "+coordinadores.get(i).getTelOficina());
                System.out.println("Sueldo coordinador: "+coordinadores.get(i).getSueldo());
                System.out.println("Nombre completo coordinador: "+coordinadores.get(i).getNombreCompleto());
                System.out.println("Fecha cumpleaños coordinador: "+coordinadores.get(i).getFechaCumpleanios());
                System.out.println("Correo electrónico coordinador: "+coordinadores.get(i).getCorreoElectronico());
                System.out.println("Departamento al que está adscrito el coordinador: "+coordinadores.get(i).getDepartamentoAdscrito()); 
                System.out.println("Carrera en la que imparte el coordinador: "+coordinadores.get(i).getCarreraCoordinada());
                
                tmp += 1;
            }
        }
        
        if(tmp != 0){
            System.out.println("<[¡Warning!]> Cliente no encontrado...");
        }
        
    }
    
    public void mostrarDatos2(){
        
        System.out.println("\n\n");
        
        System.out.print("Por favor, digite el nombre completo del usuario: ");
        String nombreCompleto = sc.nextLine();
        
        int tmp = 0;
        
        System.out.print("Por favor, digite el rol usuario[alumno, profesor, coordinador]: ");
        String rol = sc.nextLine();
        
        if(rol.equalsIgnoreCase("alumno")){
            //Alumnos
            for(int i = 0; i < alumnos.size(); i++){
                if(alumnos.get(i).getNombreCompleto().equalsIgnoreCase(nombreCompleto));
                {
                    System.out.println("Rol: Alumno");
                    System.out.println("Numero de la cuenta del alumno: "+alumnos.get(i).getNumeroCuenta());
                    System.out.println("Celular del alumno: "+alumnos.get(i).getCelular());
                    System.out.println("Semestre: "+alumnos.get(i).getSemestre());
                    System.out.println("Nombre completo alumno: "+alumnos.get(i).getNombreCompleto());
                    System.out.println("Fecha nacimiento alumno: "+alumnos.get(i).getFechaDeCumpleaios());
                    System.out.println("Correo electrónico alumno: "+alumnos.get(i).getCorreoElectronico());
                    System.out.println("Carrera alumno: "+alumnos.get(i).getCarrera());
                    tmp += 1;
                }
            }
        }
        
        else if(rol.equalsIgnoreCase("profesor")){
            //Profesores
            for(int i = 0; i < profesores.size(); i++){
                if(profesores.get(i).getNombreProfesor().equalsIgnoreCase(nombreCompleto));
                {
                    System.out.println("Rol: Profesor");
                    System.out.println("Número del profesor: "+profesores.get(i).getNumeroProfesor());
                    System.out.println("Celular del profesor: "+profesores.get(i).getCelular());
                    System.out.println("Teléfono oficina profesor: "+profesores.get(i).getTelOficina());
                    System.out.println("Sueldo profesor: "+profesores.get(i).getSueldo());
                    System.out.println("Nombre completo profesor: "+profesores.get(i).getNombreProfesor());
                    System.out.println("Fecha cumpleaños profesor: "+profesores.get(i).getFechaCumpleanios());
                    System.out.println("Correo electrónico profesor: "+profesores.get(i).getCorreoElectronico());
                    System.out.println("Departamento al que está adscrito el profesor: "+profesores.get(i).getDepartamentoAdscrito()); 
                    System.out.println("Carrera en la que imparte el profesor: "+profesores.get(i).getCarreraImparte());
                    System.out.println("<[Grupos profesor]>");

                    for(int j =0; j< profesores.get(i).getGruposImparte().size();j++){
                        System.out.println(profesores.get(i).getGruposImparte().get(j));
                    }
                    tmp += 1;
                }
            }
        }
        
        else if(rol.equalsIgnoreCase("coordinador")){
            //Coordinadores
            for(int i = 0; i < coordinadores.size(); i++){
                if(coordinadores.get(i).getNombreCompleto().equalsIgnoreCase(nombreCompleto));
                {
                    System.out.println("Rol: Coordinador");
                    System.out.println("Número del coordinador: "+coordinadores.get(i).getNumEmpleado());
                    System.out.println("Celular del coordinador: "+coordinadores.get(i).getCelular());
                    System.out.println("Teléfono oficina coordinador: "+coordinadores.get(i).getTelOficina());
                    System.out.println("Sueldo coordinador: "+coordinadores.get(i).getSueldo());
                    System.out.println("Nombre completo coordinador: "+coordinadores.get(i).getNombreCompleto());
                    System.out.println("Fecha cumpleaños coordinador: "+coordinadores.get(i).getFechaCumpleanios());
                    System.out.println("Correo electrónico coordinador: "+coordinadores.get(i).getCorreoElectronico());
                    System.out.println("Departamento al que está adscrito el coordinador: "+coordinadores.get(i).getDepartamentoAdscrito()); 
                    System.out.println("Carrera en la que imparte el coordinador: "+coordinadores.get(i).getCarreraCoordinada());
                    tmp += 1;
                }
            }
        }
        
        if(tmp != 0){
            System.out.println("<[¡Warning!]> Cliente no encontrado...");
        }
        
    }
    
    public void eliminarDatos(){
    
        System.out.println("\n\n");
        
        System.out.print("Por favor, digite el nombre completo del usuario: ");
        String nombreCompleto = sc.nextLine();
        int tmp = 0;
        
        //Alumnos
        for(int i = 0; i < alumnos.size(); i++){
            if(alumnos.get(i).getNombreCompleto().equalsIgnoreCase(nombreCompleto));
            {
      
                alumnos.get(i).setNumeroCuenta(0);
                alumnos.get(i).setCelular(0);
                alumnos.get(i).setSemestre(0);
                alumnos.get(i).setNombreCompleto(null);
                alumnos.get(i).setFechaDeCumpleaios(null);
                alumnos.get(i).setCorreoElectronico(null);
                alumnos.get(i).setCarrera(null);
                tmp += 1;
            }
        }
        
        //Profesores
        for(int i = 0; i < profesores.size(); i++){
            if(profesores.get(i).getNombreProfesor().equalsIgnoreCase(nombreCompleto));
            {
                profesores.get(i).setNumeroProfesor(0);
                profesores.get(i).setCelular(0);
                profesores.get(i).setTelOficina(0);
                profesores.get(i).setSueldo(0);
                profesores.get(i).setNombreProfesor(null);
                profesores.get(i).setFechaCumpleanios(null);
                profesores.get(i).setCorreoElectronico(null);
                profesores.get(i).setDepartamentoAdscrito(null); 
                profesores.get(i).setCarreraImparte(null);
                profesores.get(i).getGruposImparte().clear();
                
                tmp += 1;
            }
        }
        
        //Coordinadores
        for(int i = 0; i < coordinadores.size(); i++){
            if(coordinadores.get(i).getNombreCompleto().equalsIgnoreCase(nombreCompleto));
            {
                coordinadores.get(i).setNumEmpleado(0);
                coordinadores.get(i).setCelular(0);
                coordinadores.get(i).setTelOficina(0);
                coordinadores.get(i).setSueldo(0);
                coordinadores.get(i).setNombreCompleto(null);
                coordinadores.get(i).setFechaCumpleanios(null);
                coordinadores.get(i).setCorreoElectronico(null);
                coordinadores.get(i).setDepartamentoAdscrito(null); 
                coordinadores.get(i).setCarreraCoordinada(null);
                tmp += 1;
            }
        }
        
        if(tmp != 0){
            System.out.println("<[¡Warning!]> Cliente no encontrado...");
        }
        
    }
    
    public void actualizarDatos(){
        
        System.out.println("\n\n");
        
        System.out.print("Por favor, digite el nombre completo del usuario: ");
        String nombreCompleto = sc.nextLine();
        int tmp = 0;
        
        //Alumnos
        for(int i = 0; i < alumnos.size(); i++){
            if(alumnos.get(i).getNombreCompleto().equalsIgnoreCase(nombreCompleto));
            {
                System.out.print("Por favor, digite el número de cuenta: ");
                long var1 = sc.nextLong();
                System.out.print("Por favor, digite el celular: ");
                long var2 = sc.nextLong();
                System.out.print("Por favor, digite el semestre: ");
                int var3 = sc.nextInt();
                System.out.print("Por favor, digite su nombre completo: ");
                String var4 = sc.nextLine();
                System.out.print("Por favor, digite su fecha de nacimiento: ");
                String var5 = sc.nextLine();
                System.out.print("Por favor, digite su correo electrónico: ");
                String var51 = sc.nextLine();
                System.out.print("Por favor, digite su carrera: ");
                String var52 = sc.nextLine();
                List<String> var6 = new ArrayList<String>();
                int tmp3 = 0;
                System.out.println("\n");
                while(true){
                    System.out.println("1. Agregar materia");
                    System.out.println("2. Salir");
                    System.out.print(">> ");
                    int tmp1 = sc.nextInt();
                    if(tmp1 == 1){
                        System.out.print("Por favor, digite el nombre de la materia: ");
                        sc.nextLine();
                        String tmp2 = sc.nextLine();
                        var6.add(tmp2);
                        tmp3 += 1;
                    }
                    else{
                        if(tmp3 != 0){
                            break;
                        }
                        else{
                            System.out.println("Debe seleccionar al menos una materia!");
                        }
                    }
                }
                
                alumnos.get(i).setNumeroCuenta(var1);
                alumnos.get(i).setCelular(var2);
                alumnos.get(i).setSemestre(var3);
                alumnos.get(i).setNombreCompleto(var4);
                alumnos.get(i).setFechaDeCumpleaios(var5);
                alumnos.get(i).setCorreoElectronico(var51);
                alumnos.get(i).setCarrera(var52);
                alumnos.get(i).setMaterias(var6);
                tmp += 1;
            }
        }
        
        //Profesores
        for(int i = 0; i < profesores.size(); i++){
            if(profesores.get(i).getNombreProfesor().equalsIgnoreCase(nombreCompleto));
            {
                
                System.out.print("Por favor, digite el número del profesor: ");
                long var7 = sc.nextLong();
                System.out.print("Por favor, digite el celular del profesor: ");
                long var8 = sc.nextLong();
                System.out.print("Por favor, digite el telefono de la oficina del profesor: ");
                long var9 = sc.nextLong();
                System.out.print("Por favor, digite el sueldo del profesor: ");
                double var10 = sc.nextDouble();
                System.out.print("Por favor, digite el nombre completo del profesor: ");
                String var11 = sc.nextLine();
                System.out.print("Por favor, digite su fecha de cumpleaños del profesor: ");
                String var12 = sc.nextLine();
                System.out.print("Por favor, digite el correo del profesor: ");
                String var13 = sc.nextLine();
                System.out.print("Por favor, digite el departamento al cual está adscrito el profesor: ");
                String var14 = sc.nextLine();
                System.out.print("Por favor, digite la carrera que en la que imparte el profesor: ");
                String var15 = sc.nextLine();
                List<String> var16 = new ArrayList<String>();
                int tmp3 = 0;
                System.out.println("\n");
                while(true){
                    System.out.println("1. Agregar carrera");
                    System.out.println("2. Salir");
                    System.out.print(">> ");
                    int tmp1 = sc.nextInt();
                    if(tmp1 == 1){
                        System.out.print("Por favor, digite el nombre de la carrera: ");
                        sc.nextLine();
                        String tmp2 = sc.nextLine();
                        var16.add(tmp2);
                        tmp3 += 1;
                    }
                    else{
                        if(tmp3 != 0){
                            break;
                        }
                        else{
                            System.out.println("Debe seleccionar al menos una carrera!");
                        }
                    }
                }
                
                profesores.get(i).setNumeroProfesor(var7);
                profesores.get(i).setCelular(var8);
                profesores.get(i).setTelOficina(var9);
                profesores.get(i).setSueldo(var10);
                profesores.get(i).setNombreProfesor(var11);
                profesores.get(i).setFechaCumpleanios(var12);
                profesores.get(i).setCorreoElectronico(var13);
                profesores.get(i).setDepartamentoAdscrito(var14); 
                profesores.get(i).setCarreraImparte(var15);
                profesores.get(i).setGruposImparte(var16);
                
                tmp += 1;
            }
        }
        
        //Coordinadores
        for(int i = 0; i < coordinadores.size(); i++){
            if(coordinadores.get(i).getNombreCompleto().equalsIgnoreCase(nombreCompleto));
            {
                
                System.out.print("Por favor, digite el número del coordinador: ");
                long var17 = sc.nextLong();
                System.out.print("Por favor, digite el número celular del coordinador: ");
                long var18 = sc.nextLong();
                System.out.print("Por favor, digite el teléfono de la oficina del coordinador: ");
                long var19 = sc.nextLong();
                System.out.print("Por favor, digite el sueldo del coordinador: ");
                double var20 = sc.nextDouble();
                System.out.print("Por favor, digite el nombre completo del coordinador: ");
                String var21 = sc.nextLine();
                System.out.print("Por favor, digite el cumpleaños del coordinador: ");
                String var22 = sc.nextLine();
                System.out.print("Por favor, digite el correo electrónico del coordinador: ");
                String var23 = sc.nextLine();
                System.out.print("Por favor, digite el departamento al cual está adscrito el coordinador: ");
                String var24 = sc.nextLine();
                System.out.print("Por favor, digite la carrera que coordina: ");
                String var25 = sc.nextLine();
                
                
                coordinadores.get(i).setNumEmpleado(var17);
                coordinadores.get(i).setCelular(var18);
                coordinadores.get(i).setTelOficina(var19);
                coordinadores.get(i).setSueldo(var20);
                coordinadores.get(i).setNombreCompleto(var21);
                coordinadores.get(i).setFechaCumpleanios(var22);
                coordinadores.get(i).setCorreoElectronico(var23);
                coordinadores.get(i).setDepartamentoAdscrito(var24); 
                coordinadores.get(i).setCarreraCoordinada(var25);
                
                tmp += 1;
            }
        }
        
        if(tmp != 0){
            System.out.println("<[¡Warning!]> Cliente no encontrado...");
        }
        
    }
    
    public void mostrarDatosPorSueldo(){
        System.out.print("Por favor, digite el sueldo a utilizar como filtro: ");
        double sueldo = sc.nextDouble();
        
        int tmp = 0;
        
        
        //Profesores
        System.out.println("(Agrupación por Profesores)");
        System.out.println("\n\n");
        for(int i = 0; i < profesores.size(); i++){
            if(profesores.get(i).getSueldo() == sueldo);
            {
                System.out.println(profesores.get(i).getNombreProfesor());
                tmp += 1;
            }
        }
        
        //Coordinadores
        System.out.println("(Agrupación por coordinadores)");
        System.out.println("\n\n");
        for(int i = 0; i < coordinadores.size(); i++){
            if(coordinadores.get(i).getSueldo() == sueldo);
            {
                System.out.println(coordinadores.get(i).getNombreCompleto());
                tmp += 1;
            }
        }
        
        
        if(tmp != 0){
            System.out.println("<[¡Warning!]> No se ha encontrado ningún usuario con dicho sueldo...");
        }
    }
    
    public void mostrarDatosPorCorreo(){
    
        System.out.println("(Agrupación por Alumnos)");
        System.out.println("\n\n");
        //Alumnos
        for(int i = 0; i < alumnos.size(); i++){
            System.out.println("Nombre: "+alumnos.get(i).getNombreCompleto()+" | Correo: "+alumnos.get(i).getCorreoElectronico());
        }
        
        System.out.println("(Agrupación por Profesores)");
        System.out.println("\n\n");
        //Profesores
        for(int i = 0; i < profesores.size(); i++){
            System.out.println("Nombre: "+profesores.get(i).getNombreProfesor()+" | Correo: "+profesores.get(i).getCorreoElectronico());  
        }
        
        //Coordinadores
        System.out.println("(Agrupación por Coordinadores)");
        System.out.println("\n\n");
        for(int i = 0; i < coordinadores.size(); i++){
            System.out.println("Nombre: "+coordinadores.get(i).getNombreCompleto()+" | Correo: "+coordinadores.get(i).getCorreoElectronico());  
        }
        
    }
    
    public void mostrarDatosPorCarrera(){
        
        System.out.print("Por favor, digite la carrera a utilizar como filtro: ");
        String carrera = sc.nextLine();
        int tmp = 0;
        
        System.out.println("(Agrupación por Alumnos)");
        System.out.println("\n\n");
        //Alumnos
        for(int i = 0; i < alumnos.size(); i++){
            if(alumnos.get(i).getCarrera().equalsIgnoreCase(carrera)){
                System.out.println("Nombre: "+alumnos.get(i).getNombreCompleto());
            }
        }
        
        System.out.println("(Agrupación por Profesores)");
        System.out.println("\n\n");
        //Profesores
        for(int i = 0; i < profesores.size(); i++){
            if(profesores.get(i).getCarreraImparte().equalsIgnoreCase(carrera)){
                System.out.println("Nombre: "+profesores.get(i).getNombreProfesor());
            }
        }
        
        //Coordinadores
        System.out.println("(Agrupación por Coordinadores)");
        System.out.println("\n\n");
        for(int i = 0; i < coordinadores.size(); i++){
            if(coordinadores.get(i).getCarreraCoordinada().equalsIgnoreCase(carrera)){
                System.out.println("Nombre: "+coordinadores.get(i).getNombreCompleto());
            }
        }
        
        if(tmp != 0){
            System.out.println("<[¡Warning!]> No se ha encontrado ningún usuario inscrito a dicha...");
        }
    }
    
    private static void ordenamientoDeCadenasAlfabeticamente(String[] arr, int n){
 
        String temp;
 
       
        for (int j = 0; j < n - 1; j++)
        {
            for (int i = j + 1; i < n; i++)
            {
                if (arr[j].compareTo(arr[i]) > 0)
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    
    
    public void mostrarEleccionAlumnosProfesores(){
        System.out.println("\n\n");
        System.out.println("Por favor, seleccione: ");
        System.out.println("1. Agrupación por Alumnos");
        System.out.println("2. Agrupación por Profesores");
        System.out.print(">> ");
        int answer = sc.nextInt();
        while(answer < 1 || answer > 2){
            System.out.println("\n\n");
            System.out.println("[Warning] Respuesta no valida");
            System.out.println("Por favor, seleccione: ");
            System.out.println("1. Agrupación por Alumnos");
            System.out.println("2. Agrupación por Profesores");
            System.out.print(">> ");
            answer = sc.nextInt();
        }
        
        if(answer == 1){
            System.out.println("(Agrupación por Alumnos)");
            System.out.println("\n\n");
            //Alumnos
            String []arrAlumnos = new String[alumnos.size()];
            
            for(int i = 0; i < alumnos.size(); i++){
                arrAlumnos[i] = alumnos.get(i).getNombreCompleto();  
            }
            
            ordenamientoDeCadenasAlfabeticamente(arrAlumnos, alumnos.size());
            
            for(int i = 0; i < alumnos.size(); i++){
                System.out.println("Nombre: "+arrAlumnos[i]); 
            }
            
            
        }
        
        else{
            System.out.println("(Agrupación por Profesores)");
            System.out.println("\n\n");
            //Alumnos            
            String []arrProfesores = new String[profesores.size()];
            
            for(int i = 0; i < profesores.size(); i++){
                arrProfesores[i] = profesores.get(i).getNombreProfesor();  
            }
            
            ordenamientoDeCadenasAlfabeticamente(arrProfesores, profesores.size());
            
            for(int i = 0; i < alumnos.size(); i++){
                System.out.println("Nombre: "+arrProfesores[i]); 
            }
        }
        
    }
    
    public void eliminadoEspecial(){
        
        System.out.println("\n\n");
        System.out.println("Por favor, seleccione: ");
        System.out.println("1. Eliminación por Alumnos");
        System.out.println("2. Eliminación por Profesores");
        System.out.println("3. Eliminación por Coordinadores");
        System.out.print(">> ");
        int answer = sc.nextInt();
        while(answer < 1 || answer > 3){
            System.out.println("\n\n");
            System.out.println("[Warning] Respuesta no valida");
            System.out.println("Por favor, seleccione: ");
            System.out.println("1. Eliminación por Alumnos");
            System.out.println("2. Eliminación por Profesores");
            System.out.println("3. Eliminación por Coordinadores");
            System.out.print(">> ");
            answer = sc.nextInt();
        }
        
        int tmp = 0;
        
        switch (answer) {
            case 1:
                {
                    System.out.println("\n\n");
                    System.out.print("Por favor, digite el número de cuenta del alumno: ");
                    long numeroCompletoCuenta = sc.nextLong();
                    //Alumnos
                    for(int i = 0; i < alumnos.size(); i++){
                        if(alumnos.get(i).getNumeroCuenta() == numeroCompletoCuenta);
                        {
                            alumnos.get(i).setNumeroCuenta(0);
                            alumnos.get(i).setCelular(0);
                            alumnos.get(i).setSemestre(0);
                            alumnos.get(i).setNombreCompleto(null);
                            alumnos.get(i).setFechaDeCumpleaios(null);
                            alumnos.get(i).setCorreoElectronico(null);
                            alumnos.get(i).setCarrera(null);
                            tmp += 1;
                        }
                    }       if(tmp != 0){
                        System.out.println("Número de cuenta de alumno no existente");
                    }       break;
                }
            case 2:
                {
                    System.out.println("\n\n");
                    System.out.print("Por favor, digite el número del Profesor: ");
                    long numeroCompletoCuenta = sc.nextLong();
                    //Profesores
                    for(int i = 0; i < profesores.size(); i++){
                        if(profesores.get(i).getNumeroProfesor() == numeroCompletoCuenta);
                        {
                            profesores.get(i).setNumeroProfesor(0);
                            profesores.get(i).setCelular(0);
                            profesores.get(i).setTelOficina(0);
                            profesores.get(i).setSueldo(0);
                            profesores.get(i).setNombreProfesor(null);
                            profesores.get(i).setFechaCumpleanios(null);
                            profesores.get(i).setCorreoElectronico(null);
                            profesores.get(i).setDepartamentoAdscrito(null);
                            profesores.get(i).setCarreraImparte(null);
                            profesores.get(i).getGruposImparte().clear();
                            
                            tmp += 1;
                        }
                    }       if(tmp != 0){
                        System.out.println("Número del profesor no existente");
                    }       break;
                }
            case 3:
                {
                    System.out.println("\n\n");
                    System.out.print("Por favor, número de empleado del coordinador: ");
                    long numeroCompletoCuenta = sc.nextLong();
                    //Profesores
                    for(int i = 0; i < coordinadores.size(); i++){
                        if(coordinadores.get(i).getNumEmpleado() == numeroCompletoCuenta);
                        {
                            coordinadores.get(i).setNumEmpleado(0);
                            coordinadores.get(i).setCelular(0);
                            coordinadores.get(i).setTelOficina(0);
                            coordinadores.get(i).setSueldo(0);
                            coordinadores.get(i).setNombreCompleto(null);
                            coordinadores.get(i).setFechaCumpleanios(null);
                            coordinadores.get(i).setCorreoElectronico(null);
                            coordinadores.get(i).setDepartamentoAdscrito(null);
                            coordinadores.get(i).setCarreraCoordinada(null);
                            
                            tmp += 1;
                        }
                    }       if(tmp != 0){
                        System.out.println("Número del empleado de coordinador no existente");
                    }       break;
                }
            default:
                break;
        }
        
    }
    
    public void busquedaEspecial(){
        
        System.out.println("\n\n");
        
        System.out.print("Por favor, digite el número identificador del usuario: ");
        Long identificador = sc.nextLong();
        
        int tmp = 0;
        
        //Alumnos
        for(int i = 0; i < alumnos.size(); i++){
            if(alumnos.get(i).getNumeroCuenta() == identificador);
            {
                System.out.println("Rol: Alumno");
                System.out.println("Numero de la cuenta del alumno: "+alumnos.get(i).getNumeroCuenta());
                System.out.println("Celular del alumno: "+alumnos.get(i).getCelular());
                System.out.println("Semestre: "+alumnos.get(i).getSemestre());
                System.out.println("Nombre completo alumno: "+alumnos.get(i).getNombreCompleto());
                System.out.println("Fecha nacimiento alumno: "+alumnos.get(i).getFechaDeCumpleaios());
                System.out.println("Correo electrónico alumno: "+alumnos.get(i).getCorreoElectronico());
                System.out.println("Carrera alumno: "+alumnos.get(i).getCarrera());
                tmp += 1;
            }
        }
        
        //Profesores
        for(int i = 0; i < profesores.size(); i++){
            if(profesores.get(i).getNumeroProfesor() == identificador);
            {
                System.out.println("Rol: Profesor");
                System.out.println("Número del profesor: "+profesores.get(i).getNumeroProfesor());
                System.out.println("Celular del profesor: "+profesores.get(i).getCelular());
                System.out.println("Teléfono oficina profesor: "+profesores.get(i).getTelOficina());
                System.out.println("Sueldo profesor: "+profesores.get(i).getSueldo());
                System.out.println("Nombre completo profesor: "+profesores.get(i).getNombreProfesor());
                System.out.println("Fecha cumpleaños profesor: "+profesores.get(i).getFechaCumpleanios());
                System.out.println("Correo electrónico profesor: "+profesores.get(i).getCorreoElectronico());
                System.out.println("Departamento al que está adscrito el profesor: "+profesores.get(i).getDepartamentoAdscrito()); 
                System.out.println("Carrera en la que imparte el profesor: "+profesores.get(i).getCarreraImparte());
                System.out.println("<[Grupos profesor]>");
                
                for(int j =0; j< profesores.get(i).getGruposImparte().size();j++){
                    System.out.println(profesores.get(i).getGruposImparte().get(j));
                }
                
                tmp += 1;
            }
        }
        
        //Coordinadores
        for(int i = 0; i < coordinadores.size(); i++){
            if(coordinadores.get(i).getNumEmpleado() == identificador);
            {
                System.out.println("Rol: Coordinador");
                System.out.println("Número del coordinador: "+coordinadores.get(i).getNumEmpleado());
                System.out.println("Celular del coordinador: "+coordinadores.get(i).getCelular());
                System.out.println("Teléfono oficina coordinador: "+coordinadores.get(i).getTelOficina());
                System.out.println("Sueldo coordinador: "+coordinadores.get(i).getSueldo());
                System.out.println("Nombre completo coordinador: "+coordinadores.get(i).getNombreCompleto());
                System.out.println("Fecha cumpleaños coordinador: "+coordinadores.get(i).getFechaCumpleanios());
                System.out.println("Correo electrónico coordinador: "+coordinadores.get(i).getCorreoElectronico());
                System.out.println("Departamento al que está adscrito el coordinador: "+coordinadores.get(i).getDepartamentoAdscrito()); 
                System.out.println("Carrera en la que imparte el coordinador: "+coordinadores.get(i).getCarreraCoordinada());
                
                tmp += 1;
            }
        }
        
        if(tmp != 0){
            System.out.println("<[¡Warning!]> Cliente no encontrado...");
        }
        
    }
            
    
}
