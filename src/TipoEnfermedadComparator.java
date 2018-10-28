
import java.util.Comparator;


public class TipoEnfermedadComparator implements Comparator<Enfermedad> {

    @Override
    public int compare(Enfermedad enf1, Enfermedad enf2) {
      if(enf1.getTipo().compareTo(enf2.getTipo())>0)
      {
          return -1;
      }
      else {
            if(enf1.getTipo().compareTo(enf2.getTipo())<0){
              return 1;
            }
            else
           {
              return 0;
           }
            } 
        
    } 
}
