package com.example.maverikdemosample.service;

import com.example.maverikdemosample.model.Direction;
import com.example.maverikdemosample.model.ProbeModel;
import org.springframework.stereotype.Service;

@Service
public class ProbeService {
    private final int[][] grid;
    private ProbeModel probe;

    public ProbeService() {
        this.grid = new int[10][10];
        grid[3][3] =1;  //obstacles
    }

    public  void initializeProbe(int x, int y, String direction){
        this.probe = new ProbeModel(x, y, Direction.valueOf(direction.toUpperCase()));
    }

    public void executecommands(String command){
        for (char commandChar : command.toCharArray()) {
            switch (commandChar) {
                case 'F'-> probe.moveForward(grid);
                case 'B'-> probe.moveBackward(grid);
                case 'L'-> probe.turnLeft();
                case 'R'-> probe.turnRight();
            }
        }
    }

    public ProbeModel getProbe(){
        return probe;
    }
}
