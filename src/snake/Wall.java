/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;

/**
 *
 * @author luchi
 */
import java.awt.Graphics;

public class Wall extends Node { // Debe extender de Node

    private DrawSquareInterface drawSquareInterface;

    public Wall(Snake snake, DrawSquareInterface drawSquareInterface) {
        super(0, 0);
        this.drawSquareInterface = drawSquareInterface;

        int newRow, newCol;
        boolean inside;

        do {
            inside = false;
            newRow = (int) (Math.random() * Board.NUM_COLSROWS);
            newCol = (int) (Math.random() * Board.NUM_COLSROWS);

            // Comprobamos manualmente cada nodo de la serpiente
            // Usamos getNodes() que es como lo tienes en tu Snake.java
            for (Node n : snake.getNodes()) {
                if (n.getRow() == newRow && n.getCol() == newCol) {
                    inside = true;
                    break;
                }
            }
        } while (inside); // Si ha caído dentro, repite el proceso

        this.setRow(newRow);
        this.setCol(newCol);
    }
}
