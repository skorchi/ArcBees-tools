package ${package}.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "${package}.${module}";
    }

    public void testSandbox() {
        assertTrue(true);
    }
}