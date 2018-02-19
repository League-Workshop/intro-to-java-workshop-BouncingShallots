PImage catPic;
int x = 162;
int y = 136;
int x2 = 130;
int y2 = 136;
void setup(){
size(500, 500);
catPic = loadImage("cat.jpeg");
  catPic.resize(500, 500);
  background(catPic);
  
}
void keyPressed(){
x= x+7/2 ;
y= y+7/2;
x2=x2+7/2 ;
y2 = y2 +7/2;

}
void draw(){
if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill(255, 0, 0);
noStroke(); ellipse(x, y, 10, 15);
noStroke(); ellipse(x2, y2, 10, 15);
if(x>500){
background(catPic);
x = 162;
x2 = 130;
y=136;
y2=136;
}

}