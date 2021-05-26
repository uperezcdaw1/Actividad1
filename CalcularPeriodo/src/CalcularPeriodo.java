import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalcularPeriodo {
	
	public static void main(String[] args) {
		
		//Creamos la fecha del descubrimiento de américa
		LocalDate fecha = LocalDate.of(1492, Month.OCTOBER, 12);	 
		// Mostramos cuánto tiempo ha pasado
		calcularPeriodo("El descubrimiento de América", fecha);
		
		
		LocalDate fecha2 = LocalDate.of(2021, Month.JUNE, 1);	 
		calcularPeriodo("Curso Aprobado", fecha2);
		
		LocalDate fecha3 = LocalDate.of(1995, Month.SEPTEMBER, 18);	 
		calcularPeriodo("Cumple", fecha2);
		
	}
	
	public static void calcularPeriodo(String nombre, LocalDate fecha) {
        
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fecha, fechaActual);
        
        // Cálculo de las diferencias
        int anyos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        
        String texto = String.format(nombre + " ocurrió hace %d años, %d meses y %d días.", anyos, meses, dias);
         
        System.out.println(texto);
    }
 
}
