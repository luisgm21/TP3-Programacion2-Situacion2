
import java.time.chrono.ChronoLocalDateTime;
import java.util.Comparator;


public class FechaIniComparator implements Comparator <Enfermedad> {

    @Override
    public int compare(Enfermedad enf1, Enfermedad enf2) {
       if(enf1.getTipo().compareTo(enf2.getTipo())==0)
       {
           if(enf1.getFechadeinicio().getDayOfYear()>enf2.getFechadeinicio().getDayOfYear()){
           return 1;
       }
       else{ if(enf1.getFechadeinicio().getDayOfYear()<enf2.getFechadeinicio().getDayOfYear()){
            return -1;
       }
       else{
                   return 0;
                   }
       }
     }
        return 0;
    
}
    
}
