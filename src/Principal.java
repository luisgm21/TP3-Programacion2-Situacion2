
public class Principal {

    
    public static void main(String[] args) {
        CentrodeAtencion sanasana= new CentrodeAtencion();
        Paciente paciente1;
        paciente1 = new Paciente("Luis Gonzalo","Morelli",154237910,"masculino","11_08_1997","gonzy.morelli@gmail.com","Mi casa");
        Medico medico1=new MedicoPermanente("Agustin","Martinez",154678767,"masculino","12_08_1967","agu.martinez@outblook.com","su casa","Cardiolgo",null,null);
        sanasana.agregarElemento(paciente1);
        sanasana.agregarElemento(medico1);
        sanasana.leerElementos();
        
    }
    
}
