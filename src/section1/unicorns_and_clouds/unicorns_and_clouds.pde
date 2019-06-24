PImage transparentcloud;
  PImage unicorn;
void setup(){
  transparentcloud = loadImage ("transparent cloud.png");
  size(800,600);
  transparentcloud.resize (width, height);
  background(139,193,219);
  background(transparentcloud);
  unicorn = loadImage ("unicorn.png");
}
  
void draw(){
image (unicorn, mouseX, mouseY);
}
