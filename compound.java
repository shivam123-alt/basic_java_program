class compound {
    
    public static void main(String a[])
    {
        int p=1000;
        int r=10;
        int t=2;
        double CI,A;
        A= p*Math.pow((1+.01*r),t);
        CI=A-p;
        
        System.out.println(CI);
    }
}
