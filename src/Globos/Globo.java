
package Globos;

import java.awt.Color;
import java.awt.Graphics;

public class Globo {
private int x=0;
private int y=0;
private int tam=20;
private int incx=6;
private int incy=6;
public static int xmax=400;
public static int xmin=0;
public static int ymax=300;
public static int ymin=0;
private Color color ;

public Globo(){ }
public Globo(int xx, int yy , int t , int ix , int iy , int rr, int gg, int bb){ 
 this.x =xx;
 this.y =yy;
 tam=t;
 incx=ix;
 incy=iy;
 color=new Color(rr,gg,bb);     
   }  
public void setXmax(int xmas){xmax=xmas;}
public void setYmax(int ymas){ymax=ymas;}
public int getX(){return x;}
public void setX(int xx){x=xx;}

public int getY(){return y;}
public void setY(int yy){y=yy;}

public int getTam(){return tam;}
public void setTam(int t){tam=t;}

public int getIncx(){return incx;}
public void setIncx(int ix){incx=ix;}

public int getIncy(){return incy;}
public void setIncy(int iy){incy=iy;}

public void Mostrar(Graphics area){
area.setColor(color);
area.fillOval(x, y, tam, tam);
}

public void Mover(){
x+=incx;
y+=incy;
 }

public void ChoqueConPared(){
if(x>=xmax-tam||x<xmin)
    incx=-incx;
if(y>=ymax-tam||y<ymin)
    incy=-incy;
 }

public void choqueConGlobos(Globo g){
int temp;
int xx = x+tam/2 - (g.getX()+g.getTam()/2);
int yy = y+tam/2 - (g.getY()+g.getTam()/2);
double r=Math.sqrt(xx*xx+yy*yy);
if(r<=(tam/2+g.getTam()/2)){
  
  temp=incx;
  incx=g.getIncx();
  g.setIncx(temp);
    temp=incy;
  incy=g.getIncy();
  g.setIncy(temp);
  }
 }

}
