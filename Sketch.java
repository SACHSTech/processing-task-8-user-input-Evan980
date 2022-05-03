import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */

  // Variables
  boolean leftPressed;
  boolean rightPressed;
  float fltHouseX = 500;
  float fltHouseY = 210;
  float fltScale = 247;
  
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw(){
    
    fill(0, 0, 0);
    rect(fltHouseX, fltHouseY+(fltScale/8), (fltScale/2), (fltScale/2));
    
    if(keyPressed){
      if(key == 'q'){
        background(0, 0, 0);
      }
      else if(key == 'w'){
        background(255, 0, 0);
      }
      else if(key == 'e'){
        background(0, 255, 0);
      }
      else if(key == 'r'){
        background(0, 0, 255);
      }
    }

    if(rightPressed == true){
      fltHouseX++;
  }
    if(leftPressed == true){
      fltHouseX--;
    }
 } 

    
  // Draw dots when mouse clicks
  public void mouseClicked(){
    fill(50, 200, 100);
    ellipse(mouseX, mouseY, 10, 10);
  }
  // Detects if key is pressed
  public void keyPressed(){
    if(keyCode == LEFT){
      leftPressed = true;
    }
    if(keyCode == RIGHT){
      rightPressed = true;
    }
  }

  // Detects key released
  public void keyReleased(){
    if(keyCode == LEFT){
      leftPressed = false;
    }
    if(keyCode == RIGHT){
      rightPressed = false;
    }
  }

  // Detects mouse pressed
  public void mousePressed(){
    fill(255, 255, 255);
    ellipse(mouseX, mouseY, 50, 50);
  }

  // Detects mouse dragged
  public void mouseDragged(){
   rect(mouseX, mouseY, 10, 10);
 }
}
