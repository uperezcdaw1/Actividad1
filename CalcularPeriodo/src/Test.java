import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		CalcularPeriodo c = new CalcularPeriodo();
		c.calcularPeriodo("Prueba", LocalDate.now());
	}

}
