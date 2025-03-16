package com.example.maverikdemosample.controller;

import com.example.maverikdemosample.model.ProbeModel;
import com.example.maverikdemosample.service.ProbeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/seasubmarine")
public class ProbeController {
    private final ProbeService probeService;

    public ProbeController(ProbeService probeService) {
        this.probeService = probeService;
    }

    @PostMapping("/init")
    public String initProbe(@RequestParam int x, @RequestParam int y, @RequestParam String direction){
        probeService.initializeProbe(x, y, direction);
        return "Probe initialized at ("+x+ ", "+y+") facing "+ direction;
    }

    @PostMapping("/move")
    public String moveProbe(@RequestParam String commands){
        probeService.executecommands(commands);
        return "Commands executed: " + commands;
    }

    @GetMapping("/status")
    public ProbeModel getProbeStatus(){
        return probeService.getProbe();
    }
}
