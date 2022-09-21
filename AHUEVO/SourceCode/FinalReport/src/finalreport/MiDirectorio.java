/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalreport;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class MiDirectorio {
    
    Scanner sc = new Scanner(System. in);
    private int numContactos;

    public void setNumContactos(int numContactos) {
        this.numContactos = numContactos;
    }

    public int getNumContactos() {
        return numContactos;
    }
    
    
    
    public int menu(){
        
        System.out.println("\n\n");
        System.out.println("\t\t\t   <[Bienvenido al sistema de directorio escolar]>");
        System.out.println("\t\t\t---------------------------------------------------");
        System.out.println("\t\t\t|1. Crear un directorio vacío                      |");
        System.out.println("\t\t\t|2. Insertar datos de un nuevo contacto            |");        
        System.out.println("\t\t\t|3. Mostrar información completa con el nombre     |");
        System.out.println("\t\t\t|4. Mostrar información completa nombre + rol      |");
        System.out.println("\t\t\t|5. Eliminar datos de contacto con su nombre       |");
        System.out.println("\t\t\t|6. Actualizar información de contacto con nombre  |");
        System.out.println("\t\t\t|7. Mostrar todos los contactos con sueldo fijado  |");
        System.out.println("\t\t\t|8. Mostrar todos los contactos por correo         |");
        System.out.println("\t\t\t|9. Mostrar todos los contactos de una carrera fija|");
        System.out.println("\t\t\t|10. Mostrar solo alumnos o profesores             |");
        System.out.println("\t\t\t|11. Eliminado especial                            |");
        System.out.println("\t\t\t|12. Busqueda especial                             |");
        System.out.println("\t\t\t|13. Salir                                         |");
        System.out.println("\t\t\t----------------------------------------------------");
        System.out.print("\t\t\t>> ");
        
        int respuesta = sc.nextInt();
        
        return respuesta;
    }
    
    public static void main(String[] args){
        MiDirectorio obj1 = new MiDirectorio();
        System.out.print("Por favor, digite el número de contactos: ");
        int numContactos = obj1.sc.nextInt();
        int flag1 = 0;
        
        obj1.setNumContactos(numContactos);
        
        Directorio directorio = new Directorio();
        
        while(true){
            int answer = obj1.menu();
            if(answer == 1 && flag1 == 0){
                
                
                System.out.println("\n\n");
                System.out.println("¡Directorio vacío creado!");
                System.out.println("(Alumnos)");
                System.out.println(">>Empty");
                System.out.println("(Profesores)");
                System.out.println(">>Empty");
                System.out.println("(Coordinadores)");
                System.out.println(">>Empty");
                flag1 +=1;
            }
            else if(answer == 2 && flag1!= 0){
                directorio.insertarDatos();
            }
            else if(answer == 3 && flag1!= 0){
                directorio.mostrarDatos1();
            }
            else if(answer == 4 && flag1!= 0){
                directorio.mostrarDatos2();
            }
            else if(answer == 5 && flag1!= 0){
                directorio.eliminarDatos();
            }
            else if(answer == 6 && flag1!= 0){
                directorio.actualizarDatos();
            }
            else if(answer == 7 && flag1!= 0){
                directorio.mostrarDatosPorSueldo();
            }
            else if(answer == 8 && flag1!= 0){
                directorio.mostrarDatosPorCorreo();
            }
            else if(answer == 9 && flag1!= 0){
                directorio.mostrarDatosPorCarrera();
            }
            else if(answer == 10 && flag1!= 0){
                directorio.mostrarEleccionAlumnosProfesores();
            }
            else if(answer == 11 && flag1!= 0){
                directorio.eliminadoEspecial();
            }
            else if(answer == 12 && flag1!= 0){
                directorio.busquedaEspecial();
            }
            else if(answer == 13){
                System.out.println("Saliendo...");
                break;
            }
            else{
                System.out.println("\n\n");
                System.out.println("¡Opción no válida, debe crear primero un directorio!");
            }
            
        }
        
        
    }
    
}
