public class Square {
    private Rectangle r = new Rectangle();

    public Square(int side) {
        this.setSide(side);
    }
    
    public void setSide(int side) {
        r.setWidth(side);
        r.setHeight(side);        
    }
    
    public int getSide(){
        return r.getWidth();
    }

    public int getArea(){
        return r.getArea();
    }
   
}
