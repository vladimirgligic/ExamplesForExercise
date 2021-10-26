


public class GreatCircle {
    public static void main(String[] args) {
       
                 
        double r = 6371.0; 
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        
        double a = Math.sin((Math.toRadians(x2-x1)) / 2) * Math.sin((Math.toRadians(x2-x1)) / 2) + 
                   Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * 
                   Math.sin((Math.toRadians(y2-y1)) / 2) * Math.sin((Math.toRadians(y2-y1)) / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double distance = r * c;
         
        System.out.println(distance+" kilometers");
 
    }
}
