/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;

import java.awt.Graphics;

/**
 *
 * @author carpraesc
 */
public class Food extends Node {
    
    
    public DrawSquareInterface drawSquareInterface;
    
    public Food(Snake snake,DrawSquareInterface drawSquareInterface) {
        super(0, 0); 
        this.drawSquareInterface = drawSquareInterface;
        do {
        // Genera un número entre 0 y (NUM_COLSROWS - 1)
        row = (int) (Math.random() * Board.NUM_COLSROWS);
        col = (int) (Math.random() * Board.NUM_COLSROWS);
        
        // Actualizamos temporalmente para que contains pueda revisar
        this.setRow(row);
        this.setCol(col);
        
        } while (snake.contains(this));
    }
    
    public void paintFood(Graphics g) {
        drawSquareInterface.drawSquare(g, getRow(), getCol(), SquareType.FOOD);
    }
}

    
    
    
