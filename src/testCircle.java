public class testCircle {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(8.0);
        circles[2] =new Circle(4.0);

        System.out.println("before:");
        for (int i=0;i<circles.length;i++){
            System.out.println(circles[i].getRadius());
        }
        System.out.println("after augment:");
       for (int i=0;i<circles.length;i++){
           circles[i].resize(Math.random()*100);
           System.out.println(circles[i].getRadius());
       }


    }
}
