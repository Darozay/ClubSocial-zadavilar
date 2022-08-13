package clubsocial;

import java.util.Scanner;

public class ClubSocial {
public static void main(String[] args) {
    Scanner pc=new Scanner(System.in);
    member a=new member();
    //Registro de miembro
    String Nombre1,Nombre2,Apellido1,Apellido2,FechaNacimiento;
    String Puesto;
    int Genero,NumeroMembresia,NumeroEmpleado;
    System.out.println("Ingrese el primer nombre");
    Nombre1=pc.next();
    System.out.println("Segundo Nombre");
    Nombre2=pc.next();
    System.out.println("Primer Apellido");
    Apellido1=pc.next();
    System.out.println("Segundo Apellido");
    Apellido2=pc.next();
    while(1!=0){
    System.out.println("Ingrese su genero\n1.mujer\n2.Hombre");
    Genero=pc.nextInt();
    a.setGender(Genero);
    if(a.getGender()!="Opción inválida")break;
    }
    System.out.println("Ingrese el numero de membresia");
    NumeroMembresia=pc.nextInt();
    while(1!=2){
    System.out.println("Ingrese Fecha de Nacimiento formato yyyy-MM-dd ejemplo: 2005-05-20");
    FechaNacimiento=pc.next();
    a.setBirthday(FechaNacimiento);

    if(!"Intente de Nuevo".equals(a.getAge()))break;
    }
    a=new member(NumeroMembresia,Nombre1,Nombre2,Apellido1,Apellido2,Genero,FechaNacimiento);
    a.setIssuance();
    System.out.println(a.getMember());
    
    //Registro de empleado
    employee b=new employee();
    
    System.out.println("Ingrese el primer nombre");
    Nombre1=pc.next();
    System.out.println("Segundo Nombre");
    Nombre2=pc.next();
    System.out.println("Primer Apellido");
    Apellido1=pc.next();
    System.out.println("Segundo Apellido");
    Apellido2=pc.next();
    while(1!=0){
    System.out.println("Ingrese su genero\n1.mujer\n2.Hombre");
    Genero=pc.nextInt();
    a.setGender(Genero);
    if(a.getGender()!="Opción inválida")break;
    }
    while(1!=2){
    System.out.println("Ingrese Fecha de Nacimiento formato yyyy-MM-dd ejemplo: 2005-05-20");
    FechaNacimiento=pc.next();
    a.setBirthday(FechaNacimiento);
    
    if(!"Intente de nuevo".equals(a.getAge()))break;
    }
    System.out.println("Puesto");
    Puesto=pc.next();
    System.out.println("Numero empleado");
    NumeroEmpleado=pc.nextInt();
    b=new employee(Puesto,NumeroEmpleado,Nombre1,Nombre2,Apellido1,Apellido2,Genero,FechaNacimiento);
    b.setIncome();
    System.out.println(b.getEmployee());
}
}
