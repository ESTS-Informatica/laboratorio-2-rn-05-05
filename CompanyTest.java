

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste CompanyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class CompanyTest
{
    private Company company;
    private User user1;
    private User user2;
    private User user3;
    private User user4;
    /**
     * Construtor default para a classe de teste CompanyTest
     */
    public CompanyTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        user1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        user2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        user3 = new User("Fernando Fernandes", "966777101", " fefe@remax.pt");
        user4 = new User("Rodrigo Rodrigues", "966777152 ", "roro@remax.pt");
        
        company.registerClient(user1);
        company.registerClient(user2);
        company.registerSeller(user3);
        company.registerSeller(user4);
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
        company.getClients();
        company.getSellers();
    }
}

