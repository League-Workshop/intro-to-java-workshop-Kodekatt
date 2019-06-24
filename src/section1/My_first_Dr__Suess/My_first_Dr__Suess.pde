void setup(){
size(1080,720);
background(0,255,0);
}

void draw(){
if(mousePressed){
  fill(random(256),random(256),random(256));
}
else{
fill(0,255,0);
}
ellipse(mouseX,mouseY,10,10);
}
