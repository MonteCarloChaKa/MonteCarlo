/**
 * Write a description of class Tester here.
 * 
 * @author Brandon Cooper
 * @version (a version number or a date)
 */
public class Tester {
    static int sqrCount = 0;
    static int cirCount = 0;
    static MonteCarlo monteCarlo = new MonteCarlo(5,3,2);    
        public static void main(String[] args){
        for(int i=0; i<10000000;i++){
            double randomx = monteCarlo.nextRainDrop_x();
            double randomy = monteCarlo.nextRainDrop_y(); 
            if(monteCarlo.insideCirle(randomx, randomy)){
                cirCount++;
            }
            sqrCount++;
        }
        System.out.println("Pi is about, "+cirCount*Math.pow((2*monteCarlo.r), 2)/(sqrCount*Math.pow(monteCarlo.r, 2)));
    }
}
