

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TiendaTest {
    
    public TiendaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
   
    @Test
    public void testCalcularCostoTotal() {
        System.out.println("CalcularCostoTotal");
        // Se crean los objetos camisa de la clase Camisa
        Camisa camisa1 = new Camisa(1, "Camisa de manga corta", 190);
        Camisa camisa2 = new Camisa(2, "Camisa casual de manga larga", 230);
        Camisa camisa3 = new Camisa(3, "Camisa formal de manga larga", 310);

        // Arreglo de "camisas"
        Camisa[] camisas = {camisa1, camisa2, camisa3};

        // Se crea el objeto tienda de la clase Tienda
        Tienda tienda = new Tienda(camisas);

        // Arreglo de la cantidad de camisas
        int[] cantidadCamisas = {2, 3, 1};

        //Se establece el descuento
        tienda.setDescuento(DescuentoEnum.CASO_2);

        // Costo total
        double costoTotal = tienda.calcularCostoTotal(cantidadCamisas);

        // Resultado esperado
        assertEquals(1345.5, costoTotal, 0.0);
    
      
    }

    @Test
    public void testSetDescuento() {
        System.out.println("setDescuento");
        // Se crean los objetos "camisa" de la clase Camisa
        Camisa camisa1 = new Camisa(1, "Camisa de manga corta", 190);
        Camisa camisa2 = new Camisa(2, "Camisa casual de manga larga", 230);
        Camisa camisa3 = new Camisa(3, "Camisa formal de manga larga", 310);

        // Arreglo de "camisas"
        Camisa[] camisas = {camisa1, camisa2, camisa3};

        // Objeto tienda de la clase Tienda
        Tienda tienda = new Tienda(camisas);

        // Establecemos el descuento
        tienda.setDescuento(DescuentoEnum.CASO_3);

        // Comprobamos que el descuento se ha establecido correctamente
        assertEquals(DescuentoEnum.CASO_3, tienda.getDescuento());
        
    }
    
}
