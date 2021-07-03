
	import processing.core.*; 
	import processing.data.*; 
	import processing.event.*; 
	import processing.opengl.*; 

	import java.util.HashMap; 
	import java.util.ArrayList; 
	import java.io.File; 
	import java.io.BufferedReader; 
	import java.io.PrintWriter; 
	import java.io.InputStream; 
	import java.io.OutputStream; 
	import java.io.IOException; 

	public class nombre extends PApplet {
	  public void setup() {

	// dibujando G
	line(30,80,30,230);
	line(50,100,50,210);
	
	line(30,230,120,230);
	line(50,210,100,210);
	
	line(120,230,120,180);
	line(100,210,100,180);
	
	line(30,80,120,80);
	line(50,100,120,100);
	line(120,80,120,100);
	
	line(100,180,120,180);
	
	
	// dibujando A
	
	line(140,80,140,230);
	line(160,100,160,230);
	
	line(230,80,230,230);
	line(210,100,210,230);
	
	line(140,80,230,80);
	line(160,100,210,100);
	
	line(140,230,160,230);
	line(210,230,230,230);
	
	line(160,160,210,160);
	line(160,180,210,180);
	
	// dibujando B
	
	line(250,80,250,230);
	line(270,100,270,210);
	
	line(250,80,340,80);
	line(270,100,320,100);
	
	line(250,230,340,230);
	line(270,210,320,210);
	
	line(340,80,340,150);
	line(320,100,320,130);
	
	line(340,150,340,230);
	
	line(270,150,340,150);
	line(270,130,320,130);
	
	line(320,170,320,210);
	line(270,170,320,170);
	
	// dibujando R
	
	line(360,80,360,230);
	line(380,100,380,230);
	
	line(360,80,450,80);
	line(380,100,430,100);
	
	line(450,80,450,160);
	line(430,100,430,140);
	
	line(380,160,450,160);
	line(380,140,430,140);
	
	line(400,160,450,230);
	line(380,170,422,230);
	
	line(360,230,380,230);
	line(422,230,450,230);
	
	// dibujando I
	
	line(470,80,470,100);
	line(470,210,470,230);
	
	line(470,80,560,80);
	line(470,230,560,230);
	
	line(560,80,560,100);
	line(560,210,560,230);
	
	line(470,100,500,100);
	line(530,100,560,100);
	
	line(470,210,500,210);
	line(530,210,560,210);
	
	line(500,100,500,210);
	line(530,100,530,210);
	
	
	// dibujando E
	
	line(580,80,580,230);
	line(600,100,600,210);
	
	line(580,80,680,80);
	line(600,100,660,100);
	
	line(680,80,680,160);
	line(660,100,660,140);
	
	line(580,230,680,230);
	line(600,210,680,210);
	line(680,210,680,230);
	
	line(600,160,680,160);
	line(600,140,660,140);
	
	// dibujando L
	
	line(700,80,700,230);
	line(720,80,720,210);
	
	line(700,230,800,230);
	line(720,210,800,210);
	
	line(800,230,800,210);
	line(700,80,720,80);
	
	noLoop();
	    
	    
	  }

	  public void settings() { 
	size(830,330); }
	  static public void main(String[] passedArgs) {
	    String[] appletArgs = new String[] { "nombre" };
	    if (passedArgs != null) {
	      PApplet.main(concat(appletArgs, passedArgs));
	    } else {
	      PApplet.main(appletArgs);
	    }
	  }
	}

