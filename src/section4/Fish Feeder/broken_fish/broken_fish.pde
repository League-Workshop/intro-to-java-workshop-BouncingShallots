int y= 20;
int y2= 25;
int y3= 30;
int y4= 18;
int x = 20;
int x2 = 168; 
int x3 = 300;
int x4 = 523;
int score = 0;

  void checkCatch(int x){
if (x > mouseX && x < mouseX+100){
                  score++;
                  y = 20;
    y2 = 25;
    y3 = 30;
    y4 = 18;
}
         else if (score > 0)
                 score--;
println("Your score is now: " + score);
}

void setup(){
  size(600,600);
  
  
  
}

void draw(){
  background(200,200,255);
  drawFish();
   fill(255, 255, 0);
   noStroke();  
   ellipse(x, y, 10, 25);
   fill(255, 0, 0);
  ellipse(x2,y2, 25, 10);
  fill(0,255,0);
  ellipse(x3, y3, 20, 5);
  fill(200, 200,0);
  ellipse(x4, y4, 10, 15);
  checkCatch(x);
  checkCatch(x2);
  checkCatch(x3);
  checkCatch(x4);
  y= y + 3;
  y2 = y2 + 3;
  y3= y3+3;
  y4= y4+3  ;
  if(y>600){
    y = 20;
    y2 = 25;
    y3 = 30;
    y4 = 18;
    x = (int) random(601);
    x2 = (int) random(601);
    x3 = (int) random(601);
    x4 = (int) random(601);
  }
  }
  void drawFish(){
  background(141,233,237);
  noStroke();
  fill(255,255,255);
  ellipse(mouseX-17,mouseY-17,20,20); //back side eye
  fill(255,200,88);
  ellipse(mouseX,mouseY,90,50); //body
  triangle(mouseX+30,mouseY,mouseX+70,mouseY+30,mouseX+70,mouseY-30); //tail
  stroke(0);
  triangle(mouseX,mouseY,mouseX+15,mouseY+10,mouseX+15,mouseY-10); //side fin
  noStroke();
  fill(255,200,88);
  ellipse(mouseX,mouseY,15,15); //side fin cover
  noStroke();
  fill(255,255,255);
  ellipse(mouseX-25,mouseY-15,20,20); //front eye
  fill(0,0,0);
  ellipse(mouseX-25,mouseY-15,5,5); //pupil
  fill(141,233,237);
  ellipse(mouseX-45,mouseY,25,25); //mouth

  }