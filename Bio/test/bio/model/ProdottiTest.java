package bio.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ProdottiTest extends AppEngineTestCase {
    private Prodotti model = new Prodotti();
    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
