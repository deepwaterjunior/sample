import jdk.jfr.Description;
import org.junit.Test;
import org.smai.clients.PetStoreClient;

import javax.management.DescriptorKey;

import static org.smai.clients.PetStoreClient.getStoreInventory;

public class SimpleTest extends AbstractTestBase {

    @Test
    public void getStoreInventorySuccessTest(){
        var response = getStoreInventory();
        response.assertThat().statusCode(200);
    }
}
