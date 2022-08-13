package clubsocial;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class person {
    private String primerNombre;
    private String segunNombre;
    private String primerApellido;
    private String segunApellido;
    private int gender;
    private String birthday;
    public person(){
    }
    public person(String primerNombre, String segunNombre, String primerApellido, String segunApellido, int gender, String birthday) {
        this.primerNombre = primerNombre;
        this.segunNombre = segunNombre;
        this.primerApellido = primerApellido;
        this.segunApellido = segunApellido;
        this.gender = gender;
        this.birthday = birthday;
    }
    
    public String getGender(){
        switch(gender){
            case 1:
                return "Mujer";
            case 2: 
                return "Hombre";
            default : 
                    return "Opción inválida";
        }
    }
    public LocalDate setActualDate(){
        String day,month,year;
        Calendar date = Calendar.getInstance();
        day=Integer.toString(date.get(Calendar.DATE));
        if(day.length()<2)day="0"+day;
        month= Integer.toString(date.get(Calendar.MONTH));
        if(month.length()<2)month="0"+month;
        year= Integer.toString(date.get(Calendar.YEAR));
        return LocalDate.parse(year+"-"+month+"-"+day);
    }
    public String getAge(){
        try{
        LocalDate Birthday=LocalDate.parse(birthday);
        Period Age = Period.between(Birthday, setActualDate());
        return ""+Age.getYears();
        }
        catch(Exception AGE){
           
            return "Intente de Nuevo";
        }
    }



    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegunNombre() {
        return segunNombre;
    }

    public void setSegunNombre(String segunNombre) {
        this.segunNombre = segunNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegunApellido() {
        return segunApellido;
    }

    public void setSegunApellido(String segunApellido) {
        this.segunApellido = segunApellido;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
}
