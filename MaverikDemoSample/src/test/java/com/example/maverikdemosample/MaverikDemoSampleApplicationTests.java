package com.example.maverikdemosample;

import com.example.maverikdemosample.service.ProbeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MaverikDemoSampleApplicationTests {

   @Test
    void testProbeInit() {
       ProbeService probeService = new ProbeService();
       probeService.initializeProbe(2, 2, "NORTH");
       assertEquals(2, probeService.getProbe().getX());
       assertEquals(2, probeService.getProbe().getY());
   }

    @Test
    void testProbeMove() {
        ProbeService probeService = new ProbeService();
        probeService.initializeProbe(2, 2, "NORTH");
        probeService.executecommands("FFRFF");
        assertEquals(4, probeService.getProbe().getX());
        assertEquals(0, probeService.getProbe().getY());
    }

    @Test
    void testProbeObstacle() {
        ProbeService probeService = new ProbeService();
        probeService.initializeProbe(2, 2, "EAST");
        probeService.executecommands("FFRFF");
        assertEquals(4, probeService.getProbe().getX());
        assertEquals(4, probeService.getProbe().getY());
    }
}
