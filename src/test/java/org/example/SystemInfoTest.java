package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SystemInfoTest {

    @Test
    public void javaVersionCheck() {
        String vs = SystemInfo.javaVersion();
        int v = Integer.parseInt(vs);
        assertTrue(v>11, "at least 11");
    }
}