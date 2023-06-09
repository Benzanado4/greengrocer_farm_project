package bio.controller;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import bio.controller.bio.LoginController;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class LoginControllerTest extends ControllerTestCase {
    @Test
    public void run() throws Exception {
        tester.start("/Login");
        LoginController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/Login.jsp"));
    }
}
