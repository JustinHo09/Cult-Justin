/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture{
    private Square sky;
    private Circle earth;
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture(){
        sky = new Square();
        earth = new Circle();
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
    }

    /**
     * Draw this picture.
     */
    public void draw(){
        sky.changeColor("lightBlue");
        sky.moveHorizontal(-310);
        sky.moveVertical(-120);
        sky.changeSize(500);
        sky.makeVisible();

        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        earth.changeColor("green");
        earth.moveHorizontal(-660);
        earth.moveVertical(160);
        earth.changeSize(1300);
        earth.makeVisible();
        
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();

        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
    }

    public void sunset(){
        sun.slowMoveVertical(250);
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite(){
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor(){
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
