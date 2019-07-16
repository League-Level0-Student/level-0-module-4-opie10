import static javax.swing.JOptionPane.*;
void setup() {
showMessageDialog(null,"Click Waldo to win");
 
  PImage waldo = loadImage("wst.jpg"); // Change this to match your file name.
  size(1505, 972);
  image(waldo, 0, 0);
  doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch } 
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 
println("X: " + mouseX + " Y: " + mouseY); 
  if (mousePressed){    // If the mouse is on Waldo, print “Waldo found!”
int Lx=247-10;
int Hx=247+10;
int Ly=818-10;
int Hy=818+10;
if(mouseX<Hx&&mouseX>Lx && mouseY<Hy && mouseY >Ly){
playWoohoo();
  showMessageDialog(null,"Waldo has been found!!!!!!!!!");
System.exit(0);
}
      // If Waldo is found, also use the method below to play “Woohoo”
else {
 playDoh();
  showMessageDialog(null, "You clicked on the wrong place, you lose."); 
 System.exit(0);
}      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}
}
void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
