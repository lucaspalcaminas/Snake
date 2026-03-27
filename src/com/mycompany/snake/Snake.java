/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.snake;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucpaland
 */




/**
 *
 * @author carpraesc
 */
public class Snake {
    private List<Node> nodes;
    private Direction direction;
    private DrawSquareInterface drawSquareInterface;
    private int nodesToGrow;
   
    
    public Snake(DrawSquareInterface drawSquareInterface) {
        nodes = new ArrayList<Node>();
        direction = Direction.RIGHT;
        this.drawSquareInterface = drawSquareInterface;
        int middle = Board.NUM_COLSROWS / 2;
        for (int i = 0; i < 4; i++) {
            Node node = new Node(middle, middle + i);
            addNode(node);
        }
        nodesToGrow = 0;
        
    }
    
    public boolean canMove() {
        switch (direction) {
            case UP:
                    return nodes.getFirst().getRow() - 1 >= 0;
            case DOWN:
                return nodes.getFirst().getRow() + 1 < Board.NUM_COLSROWS;
            case LEFT:
                
                    return nodes.getFirst().getCol() - 1 >= 0;
            case RIGHT:
                    return nodes.getFirst().getCol() + 1 < Board.NUM_COLSROWS;
        }
        return true;
    }
                
     
    
    public void move() {
        int row = nodes.getFirst().getRow();
        int col = nodes.getFirst().getCol();
        Node node = null;
           switch (direction) {
            case UP:
                node = new Node(row -1, col);
                break;
            case DOWN:
                node = new Node(row +1, col);
                break;
            case LEFT:
                node = new Node(row, col -1);
                break;
            case RIGHT:
                node = new Node(row, col +1);
                break;
        }
          nodes.addFirst(node);
          nodes.remove(nodes.getLast());
        
    }
    
    public void addNode(Node node) {
        nodes.add(0, node);
    }
    
    public void paint(Graphics g) {
        boolean first = true;
        for(Node node : nodes) {
            drawSquareInterface.drawSquare(g, node.getRow(), node.getCol(), first);
            if (first) {
                first = false;
            }
        }
        
    }

    void changeDirection(Direction direction) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Direction getDirection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}