public class Rectangle extends Shape {
    public Rectangle(String color, int sideA,int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB=sideB;
    }

    @Override
    public void describe() {
        System.out.println("Side a is"+this.sideA+"Side B is"+this.sideB);
        super.describe();
    }

    private int sideA=0 , sideB=0;

    @Override
    public boolean equals(Object obj) {

        Rectangle r=(Rectangle) obj;

        if(this.sideA==r.sideA && this.sideB==r.sideB && this.getColor().equals(r.getColor());
        return true;
    }
    else{
        return false;
    }
}
