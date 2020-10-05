class expression{
    public static void main(String args[]){
        int x = 2;
        int y;
        y = (x*x) + (3*x) -7;
        System.out.println("y is :  " + y);

        y = x++ + ++x ;
        System.out.println("x is : " +x+ "\n y is " +y );

        int z;
        z = x++ - --y - --x  +  x++ ;
        System.out.println("x : " +x+ " y: " +y+ " z : " +z);

        boolean a = true;
        boolean b = false;
        boolean c;
        c = a && b || !(a || b)  ;
        System.out.println(c);
    }
}
