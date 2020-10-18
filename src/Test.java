public class Test {
    public static void main (String [] args) {
        int x = 0;
        int y = 0;
        while ( x < 5) {
            //change code between here
            if ( y > 5 ){
                x = x+1;
                if (y < 3 ){
                    x = x-1;
                }
            }
            y = y + 2;
            //change code between here
            System.out.println(x + "" + y +" ");
            x=x+1;
        }

    }
}
