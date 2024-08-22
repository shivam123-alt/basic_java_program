class s_evendl{
    public static void main(String [] args){
        int i=0,sum_even=0;
        do{
            if(i%2==0){
                sum_even +=i;
                i++;
            }
        }
        while(i<=20);
            System.out.println(sum_even);
    }
}