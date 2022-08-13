package clubsocial;

import java.util.Scanner;

public class employee extends person {
    
    Scanner pc=new Scanner(System.in);
    
    private String stand;
    private int employeeNumber;
    private String income;
    
    employee(){
    }
    
    public employee(String stand, int employeeNumber, String primerNombre, String segunNombre, String primerApellido, String segunApellido, int gender, String birthday) {
        super(primerNombre, segunNombre, primerApellido, segunApellido, gender, birthday);
        this.stand = stand;
        this.employeeNumber = employeeNumber;
    }
    public void setIncome(){
        person a=new person();
        while(1!=2){
            System.out.print("Fecha de Ingreso del empleado formato yyyy-MM-dd: ");
            income=pc.next();
            a.setBirthday(income);
            
            if(a.getAge()=="Intente de Nuevo"){
                    System.out.println("Ingrese una fecha correcta con formato correcto");
            }
            else{
                break;
            }
        }
    }
    public String getEmployee(){
        return "Nombre= "+getPrimerNombre()+" "+getSegunNombre()+" "+getPrimerApellido()+" "+getSegunApellido()+" Fecha de nacimiento= "+getBirthday()+" Edad= "+getAge()+" Genero= "+getGender()+" Puesto del empleado= "+stand+" Numero del empleado= "+employeeNumber+" Fecha de ingreso del empleado= "+income;
    }

    public String getStand() {
        return stand;
    }

    public void setStand(String stand) {
        this.stand = stand;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    
}
