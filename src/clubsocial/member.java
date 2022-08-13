package clubsocial;

import java.util.Scanner;

public class member extends person {
    
    Scanner pc=new Scanner(System.in);
    
    private int membershipNumber;
    private String issuance;
    
    member(){
    }
    
    public member(int membershipNumber, String primerNombre, String segunNombre, String primerApellido, String segunApellido, int gender, String birthday) {
        super(primerNombre, segunNombre, primerApellido, segunApellido, gender, birthday);
        this.membershipNumber = membershipNumber;
    }
    public void setIssuance(){
        person a=new person();
        while(1!=2){
            System.out.print("Fecha de emision de Membresia usa el formato yyyy-MM-dd: ");
            issuance=pc.next();
            a.setBirthday(issuance);
           
            if(a.getAge()=="Intente de Nuevo"){
                    System.out.println("Ingrese una fecha correcta con formato correcto");
            }
            else{
                break;
            }
        }
    }
    public String getExpiration(){
         String sCadena = issuance.substring(0,4);
         String sCadena2 = issuance.substring(5,7);
         String sCadena3 = issuance.substring(8,10);
         int Cadena=Integer.parseInt(sCadena);
         Cadena=Cadena+2;
         return Cadena+"-"+sCadena2+"-"+sCadena3;
    }
    public String getMember(){
        return "Nombre= "+getPrimerNombre()+" "+getSegunNombre()+" "+getPrimerApellido()+" "+getSegunApellido()+" Fecha de nacimiento= "+getBirthday()+" Edad= "+getAge()+" Genero= "+getGender()+" Numero del miembro= "+membershipNumber+" Fecha de emision de la membresia= "+issuance+" Fecha de expiracion= "+getExpiration();
    }
   
    public int getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(int membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public String getIssuance() {
        return issuance;
    }

    public void setIssuance(String issuance) {
        this.issuance = issuance;
    }
    
}
