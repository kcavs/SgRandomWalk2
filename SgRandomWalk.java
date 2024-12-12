public class SgRandomWalk{
    public static void main(String[]args){
        Rectangle field=new Rectangle(0,0,300,300);
        field.setColor(Color.BLUE);
        field.draw();
        field.fill();
        Ellipse circle=new Ellipse(150,150,100,100);
        circle.setColor(Color.PINK);
        circle.draw();
        circle.fill();
        Ellipse dot= new Ellipse(150,150,10,10);
        dot.setColor(Color.MAGENTA);
        dot.draw();
        dot.fill();
        int randy=(int)((Math.random()*21)-10);
        int randx=(int)((Math.random()*21)-10);
    }
}