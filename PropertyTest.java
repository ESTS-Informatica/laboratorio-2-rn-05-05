

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste PropertyTest.
 *
 * @author  (Diana e Vitor)
 * @version (versão 1)
 */
public class PropertyTest
{
    private Property property;
    
    /**
     * Construtor default para a classe de teste PropertyTest
     */
    public PropertyTest()
    {
        String description = "T3 Monte Belo";
        double price = 150000.0;
        property = new Property(description, price);
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
    

    @Test
    public void testConstructor()
    { 
        property.getId();
        property.getPrice();
        property.getDescription();
    }
}

