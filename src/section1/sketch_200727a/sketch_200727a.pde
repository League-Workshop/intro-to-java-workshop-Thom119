void setup(){
size(1000,1000);

}

void draw(){
 
  background(#57BC24);
  
  if(mousePressed){
    fill(#983C3D);
  }
    
  
  rect(50,50,50,50);
  ellipse(600,600,100,100);
  triangle(100,100,40,50,25,40);
  rect(423,412,141,315);
  ellipse(208,713,716,534);
  triangle(269,195,132,50,117,198);
  rect(813,152,170,187);
  ellipse(mouseX,mouseY,100,100);
  

}
