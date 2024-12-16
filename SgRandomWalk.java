public class SgRandomWalk{
    public static void main(String[]args){
        boolean escaped=false;
        int tries=0;
        Rectangle field=new Rectangle(0,0,300,300);
        field.setColor(Color.BLUE);
        field.draw();
        field.fill();
        Ellipse circle=new Ellipse(100,100,100,100);
        circle.setColor(Color.PINK);
        circle.draw();
        Ellipse dot= new Ellipse(125,125,10,10);
        dot.setColor(Color.MAGENTA);
        dot.draw();
        dot.fill();
        while(escaped==false){
            try { Thread.sleep(100);}
            catch(Exception ex) {};
            int randy=(int)((Math.random()*21)-10);
            int randx=(int)((Math.random()*21)-10);
            tries+=1;
            dot.translate(randx,randy);
            double dist=Math.sqrt(((randx-150)*(randx-150))+((randy-150)*(randy-150)));
            if(dist>100){
                escaped=true;
                System.out.println("it took "+tries+" to escape");
            }
        }
    }
}