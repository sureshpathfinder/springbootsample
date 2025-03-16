package com.example.maverikdemosample.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.ScrollPosition;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProbeModel {
    private int x;
    private int y;
    private Direction direction;
    private List<String> movementHistory = new ArrayList<>();

    public ProbeModel(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        logPosition();
    }

    public void moveForward(int[][] grid){
        int newX = x, newY =y;
        switch (direction){
            case NORTH -> newY--;
            case SOUTH -> newY++;
            case EAST -> newX++;
            case WEST -> newX--;
        }
        updatePosition(newX, newY, grid);
    }

    public void moveBackward(int[][] grid){
        int newX = x, newY = y;
        switch (direction){
            case NORTH -> newY++;
            case SOUTH -> newY--;
            case EAST -> newX--;
            case WEST -> newX++;
        }
        updatePosition(newX, newY, grid);
    }

    public void turnLeft(){
        direction = direction.left();
    }

    public void turnRight(){
        direction = direction.right();
    }

    private void updatePosition(int newX, int newY, int[][] grid){
        if(isValidPosition(newX, newY, grid)){
            x = newX;
            y = newY;
            logPosition();
        }
    }

    private boolean isValidPosition(int x, int y, int[][] grid) {
        return x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 0;
    }

    private void logPosition() {
        movementHistory.add("("+x+","+y+")" + direction);
    }
}
