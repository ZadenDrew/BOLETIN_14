/*
 *        numeroCoches ( para saber o nº de coches que están nese momento no garaxe )  
           matricula para identificalo           
      Antes de deixar aparcar un coche. Debemos comprobar que temos sitio para él, en caso afirmativo poñemos unha mensase “ PLAZAS DISPOÑIBLES “ e rexistramos o coche . No caso contrario poríamos unha mensaxe “ COMPLETO “.
   Para facer máis doado o programa, suponer que o garaxe ten capacidade para 5 coches
 Para calcular o prezo do aparcamento , considerade o seguinte :
primeiros 3 horas. ----> 1.5 €
O resto do tempo : pagamos 0.20 € cada hora.
A daida será :
FACTURA
MATRICULA COCHE ........
TEMPO .................
PRECIO...............
CARTOS RECIBIDOS...........
CARTOS DEVOLTOS............

GRACIAS POR USAR O NOSO APARCADOIRO 

 
 * To 
 * and
 */
package garaxedecoches;

import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author andrea
 */
public class Garaxe {

    static int maxprazas = 5;
    private int numeroCoches;
    private String matricula;
    private int tempo;
    private float prezo;
    private float pagado;
    private float devolto;

    public Garaxe() {
    }

    public void setNumeroCoches() {
        this.numeroCoches = numeroCoches;
    }

    public void setMatricula() {
        this.matricula = matricula;
    }

    public String getNumeroCoches(String numeroCoches) {
        return numeroCoches;
    }

    public int getMatricula(int matricula) {
        return matricula;
    }

    public int capacidade() {

        for (numeroCoches = 0; numeroCoches <= maxprazas; numeroCoches++) {
            if (numeroCoches >= maxprazas) {
                System.out.println("“ COMPLETO “\n");
            } else {
                System.out.println("“ PLAZAS DISPOÑIBLES “\n");
                maxprazas--;
                rexistroCoche();
            }
            return maxprazas;
        }
        return numeroCoches;
    }

    public void rexistroCoche() {
        matricula = JOptionPane.showInputDialog("Escribe a matricula  do vehículo: ");
        LocalTime horaEntrada = LocalTime.now();
        int horaSalida = (int) (Math.random() * (24) + 1);
        tempo = horaEntrada.getHour() - horaSalida;
        if (tempo < 3) {
            prezo = 1.5f;
        } else {
            prezo = (1.5f + (tempo - 3) * 0.2f);
        }
        JOptionPane.showMessageDialog(null, "El precio son " + prezo + " euros");

        do {
            pagado = Float.parseFloat(JOptionPane.showInputDialog("Inserte dinero: "));
        } while (pagado < prezo);
        devolto = pagado - prezo;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return ("FACTURA :\n\nMATRICULA COCHE....: " + matricula + "\nTEMPO..............: " + tempo + "\nPRECIO.............: " + prezo
                + "\nCARTOS RECIBIDOS...: " + pagado + "\nCARTOS DEVOLTOS....: " + devolto + "\n\nGRACIAS POR USAR O NOSO APARCADOIRO\n");
    }
}
