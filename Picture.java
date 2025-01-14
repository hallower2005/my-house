/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Square suelo;
    private Person persona1;
    private Person persona2;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        suelo = new Square();
        suelo.makeVisible();
        suelo.changeSize(1000);
        suelo.moveHorizontal(-320);
        suelo.moveVertical(130);
        suelo.changeColor("green");
        
        moon = new Circle();
        moon.changeColor("magenta");
        moon.moveHorizontal(-200);
        moon.changeSize(25);

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-50);
        sun.changeSize(80);
        sun.makeVisible();
        sun.slowMoveVertical(150);
        sun.makeInvisible();
        
        moon.makeVisible();
        
    }
    public void amanecer()
    {   
        sun.makeVisible();
        sun.slowMoveVertical(-150);
        
        moon.makeInvisible();
        
        persona1 = new Person();
        persona1.moveHorizontal(-250);
        persona1.moveVertical(25);
        persona1.makeVisible();
        persona1.slowMoveHorizontal(100);
        persona2 = new Person();
        persona2.moveHorizontal(250);
        persona2.moveVertical(25);
        persona2.makeVisible();
        persona2.slowMoveHorizontal(-200);
        
        
        
    }
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
