/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;






/**
 *
 * @author carpraesc
 */
public class Board extends JPanel implements DrawSquareInterface, InitGame {
    
   
    /*
    class MyKeyAdapter extends KeyAdapter {
        
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (timer.isRunning() && canMove(currentRow, currentCol - 1, currentShape)) { //currentCol -1 sirve para comprobar si se puede mover hacia la izquierda
                        currentCol--;
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (timer.isRunning() && canMove(currentRow, currentCol + 1, currentShape)) { //currentCol + 1 sirve para comprobar si se puede mover hacia la derecha
                        currentCol++;
                    }
                    break;
                case KeyEvent.VK_UP:
                    rotate();
                    break;
                case KeyEvent.VK_DOWN:
                    if (timer.isRunning() && canMove(currentRow + 1, currentCol, currentShape)) {
                        currentRow++;
                    }
                    break;
                case KeyEvent.VK_SPACE:
                    
                default:
                    break;
            }
            repaint();
        }
      }*/
    class MyKeyAdapter extends KeyAdapter {
        
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (snake.getDirection() != Direction.RIGHT && canChangeDirection) { //currentCol -1 sirve para comprobar si se puede mover hacia la izquierda
                        snake.changeDirection(Direction.LEFT);
                        canChangeDirection = false;
                        
                    }
                    System.out.println("left");
                    break;
                case KeyEvent.VK_RIGHT:
                    if (snake.getDirection() != Direction.LEFT && canChangeDirection) { //currentCol + 1 sirve para comprobar si se puede mover hacia la derecha
                        snake.changeDirection(Direction.RIGHT);
                        canChangeDirection = false;
                        
                    }
                    System.out.println("Right");
                    break;
                case KeyEvent.VK_UP:
                    if (snake.getDirection() != Direction.DOWN && canChangeDirection) { //currentCol + 1 sirve para comprobar si se puede mover hacia la derecha
                        snake.changeDirection(Direction.UP);
                        canChangeDirection = false;
                        
                    }
                    System.out.println(delta_time);
                    System.out.println("Up");
                    break;
                case KeyEvent.VK_DOWN:
                    if (snake.getDirection() != Direction.UP && canChangeDirection) { //currentCol + 1 sirve para comprobar si se puede mover hacia la derecha
                        snake.changeDirection(Direction.DOWN);
                        canChangeDirection = false;
                       
                    }
                    System.out.println("Down");
                    break;
                case KeyEvent.VK_SPACE:
                default:
                break;
            }
        }

        private boolean canMove(int i, int currentCol, int currentShape) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
   
    private SpecialFood specialFood= null;
    private Food food;
    private Timer timer;
    private Snake snake;
    public  int delta_time = 200;
    public static int NUM_COLSROWS = 20;
    private int currentRow;
    private int currentCol;
    private Direction direction;
    private int aceleracion = 2;
    private Incrementer incrementer;
    private GameOverInterface gameOverInterface;
    private boolean canChangeDirection = true;
    
    
    private MenuInterface menuInterface;
    private Menu menu;
    
    //private MyKeyAdapter keyAdapter;
    
    private DrawSquareInterface drawSquareInterface;
    
    private int currentShape;
    
    public Board() {
        initComponents();
        snake = new Snake(this);
        addKeyListener(new MyKeyAdapter());
        setFocusable(true);
        requestFocusInWindow();
        food = new Food(snake, this);
        
        timer = new Timer(delta_time, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                tick();
                }
        
            });
        
        
        }
    public void initGame(){
        snake = new Snake(this);
        timer.start();
        food = new Food(snake,this);
        specialFood = new SpecialFood(snake, this);
        if (incrementer != null) {
            incrementer.reset();
        }
         
        timer.setDelay(delta_time);
        timer.start();
    }    
    public void pause(){
        if (timer.isRunning()) {
            timer.stop();
        } else {
            timer.start();
        }
    }

    public void changeDirection(Direction direction){
        this.direction = direction;
    }
        

    
    
    
    
    public void tick(){
        if(snake.canMoveAny()){
            snake.move();
            if(snake.eats(food)){
                snake.grow(1);
                snake.addNode(food);
                food = new Food(snake,this); 
                if (incrementer != null) incrementer.incrementScore(1);
                //incrementer.incrementScore(1);
            }
            if(snake.eats(specialFood)){
                snake.grow(2);
                
                delta_time = delta_time - aceleracion;
                if (delta_time < 10){
                    delta_time = 10;
                }
                timer.setDelay(delta_time);
                snake.addNode(specialFood);
                snake.addNode(specialFood);
                specialFood = new SpecialFood(snake,this); 
                incrementer.incrementScore(2);
                
            }
            canChangeDirection = true;
        } else{
            timer.stop();
            if(gameOverInterface != null){
                gameOverInterface.setVisible(this);
            }
            
        }
        repaint();
        canChangeDirection = true;
        
        
    }
    /*
    private void tick2(){
    if (snake.canMove()){
        snake.move();
        if(snake.eats(food)){
            snake.grow(1);
            food = new Food(snake, this);
        }
        if(snake.eats(specialFood)){
            snake.grow(2);
            snake.addNode(food);
            specialFood = new SpecialFood(snake,this);
        }
        
    }
    }
    */
    
    public void setMenuInterface(MenuInterface mnInterface){
        this.menuInterface = mnInterface;
    }
    
    private void processMenu(){
        timer.stop();
        menuInterface.setVisible(this);
    }
    
    public void setGameOverInterface(GameOverInterface gmInterface) {
        this.gameOverInterface = gmInterface;        
    }
    
    private void processGameOver() {
        timer.stop();
        gameOverInterface.setVisible(this);
    }
    
    private void paintBorderBoard(Graphics g){
        g.setColor(Color.black);
        int width = squareWidth() * NUM_COLSROWS;
        int height = squareHeight() * NUM_COLSROWS;
        g.drawRect(0,0,width,height);
        
    }
    
    
    private Color getSquareColor(SquareType type) {
        switch (type) {
            case HEAD:
                return new Color(0, 255, 255);
                
            case BODY:
                return new Color(30, 30, 53);
                
            case FOOD:
                return new Color(200, 50, 50); // Rojo estándar
            case SPECIALFOOD:
                return new Color(255, 215, 0);
                
            default:
                throw new AssertionError();
        }
        
               
    }

    public void setIncrementer(Incrementer incrementer) {
        this.incrementer = incrementer;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        snake.paint(g);
        Toolkit.getDefaultToolkit().sync();
        if (food != null) {
            food.paintFood(g);
        }
        if (specialFood != null){
            specialFood.paintFood(g);
        }
    
        snake.paint(g);
        Toolkit.getDefaultToolkit().sync();
    }
    
    private int squareWidth() {
        return getWidth() / NUM_COLSROWS;
    }

    private int squareHeight() {
        return getHeight() / NUM_COLSROWS;
    }
    private void rotate(){
        
    }

    
    public void drawSquare(Graphics g, int row, int col, SquareType squareType) {
        int x = col * squareWidth();
        int y = row * squareHeight();
        
        //Color color = isHead ? new Color(204, 102, 102) : new Color (102, 102, 204);
        Color color = getSquareColor(squareType);
        g.setColor(color);
        g.fillRect(x + 1, y + 1, squareWidth() - 2,
                squareHeight() - 2);
        g.setColor(color.brighter());
        g.drawLine(x, y + squareHeight() - 1, x, y);
        g.drawLine(x, y, x + squareWidth() - 1, y);
        g.setColor(color.darker());
        g.drawLine(x + 1, y + squareHeight() - 1,
                x + squareWidth() - 1, y + squareHeight() - 1);
        g.drawLine(x + squareWidth() - 1,
                y + squareHeight() - 1,
                x + squareWidth() - 1, y + 1);
    }
    



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void setSpeed(int speed) {
    this.delta_time = speed;
    if (timer != null) {
        timer.setDelay(delta_time); 
        }
    }
    
    public void setSquareSize(int size) {
    this.NUM_COLSROWS = size;
    
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
