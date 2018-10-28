
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Principal {

    
    public static void main(String[] args) {
        
        DateTimeFormatter miFormatFecha = DateTimeFormatter.ofPattern("d/MM/yyyy H:mm:ss");
        
        Turno turno1 = new Turno();
        turno1.setHoraentrada(LocalDateTime.parse("14/10/2018 08:00:00", miFormatFecha));
        turno1.setHorasalida(LocalDateTime.parse("14/10/2018 14:00:00", miFormatFecha));
        turno1.setHoraextraentrada(LocalDateTime.parse("15/10/2018 00:00:00", miFormatFecha));
        turno1.setHoraextrasalida(LocalDateTime.parse("15/10/2018 00:00:00", miFormatFecha));

        Turno turno2 = new Turno();
        turno2.setHoraentrada(LocalDateTime.parse("14/10/2018 15:00:00", miFormatFecha));
        turno2.setHorasalida(LocalDateTime.parse("14/10/2018 20:00:00", miFormatFecha));
        turno2.setHoraextraentrada(LocalDateTime.parse("15/10/2018 00:00:00", miFormatFecha));
        turno2.setHoraextrasalida(LocalDateTime.parse("15/10/2018 00:00:00", miFormatFecha));

        Turno turno3 = new Turno();
        turno3.setHoraentrada(LocalDateTime.parse("14/10/2018 18:00:00", miFormatFecha));
        turno3.setHorasalida(LocalDateTime.parse("14/10/2018 23:59:59", miFormatFecha));
        turno3.setHoraextraentrada(LocalDateTime.parse("15/10/2018 00:00:00", miFormatFecha));
        turno3.setHoraextrasalida(LocalDateTime.parse("15/10/2018 00:00:00", miFormatFecha));
        
        Turno turno4 = new Turno();
        turno4.setHoraentrada(LocalDateTime.parse("15/10/2018 00:00:01", miFormatFecha));
        turno4.setHorasalida(LocalDateTime.parse("15/10/2018 06:00:00", miFormatFecha));
        turno4.setHoraextraentrada(LocalDateTime.parse("15/10/2018 00:00:00", miFormatFecha));
        turno4.setHoraextrasalida(LocalDateTime.parse("15/10/2018 00:00:00", miFormatFecha));
        
        Turno turnoextra = new Turno();
        turnoextra.setHoraentrada(LocalDateTime.parse("15/10/2018 00:00:00", miFormatFecha));
        turnoextra.setHorasalida(LocalDateTime.parse("15/10/2018 00:00:00", miFormatFecha));
        turnoextra.setHoraextraentrada(LocalDateTime.parse("15/10/2018 04:00:00", miFormatFecha));
        turnoextra.setHoraextrasalida(LocalDateTime.parse("15/10/2018 08:00:00", miFormatFecha));
        
        CentrodeAtencion sanasana= new CentrodeAtencion();
        Paciente paciente1;
        paciente1 = new Paciente("Luis Gonzalo","Morelli",154237910,"masculino","11_08_1997","gonzy.morelli@gmail.com","Mi casa");
        MedicoPermanente medico1=new MedicoPermanente("Agustin","Martinez",154678767,"masculino","12_08_1967","agu.martinez@outblook.com","su casa","Cardiolgo",20000 );
        MedicoTemporal medico2=new MedicoTemporal("Ramon","Rodriguez",15567612,"masculiono","23_02_1983","ramonelmasloco22@gmail.com","calle falsa123","pediatra");
        medico1.Agregarturno(turno1);
        medico1.Agregarturno(turno2);
        medico2.Agregarturno(turno3);
        medico2.Agregarturno(turnoextra);
        sanasana.agregarElemento(paciente1);
        sanasana.agregarElemento(medico1);
        sanasana.agregarElemento(medico2);
        sanasana.leerElementos();
        medico1.calcularSueldo();
        medico2.calcularSueldo();
        
    }
    
}
