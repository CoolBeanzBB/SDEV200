public class RegularPolygonTest {
    public static void main(String [] args){
        RegularPolygon rp1=new RegularPolygon();
        RegularPolygon rp2=new RegularPolygon(6, 4);
        RegularPolygon rp3=new RegularPolygon(10, 4, 5.6, 7.8);
        
        System.out.println("Regular Polygon with no argument : ");
        System.out.println("Area : "+rp1.getArea()+" , Perimeter : "+rp1.getPerimeter());
        
        System.out.println("Regular Polygon with two arguments : ");
        System.out.println("Area : "+rp2.getArea()+" , Perimeter : "+rp2.getPerimeter());
        
        System.out.println("Regular Polygon with four arguments : ");
        System.out.println("Area : "+rp3.getArea()+" , Perimeter : "+rp3.getPerimeter());
        
        
    }
}
