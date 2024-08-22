class sum_even{
    public static void main(String[] args) {
        int i=1,sum_even=0;
        for(i=1;i<=20;i++){
            if(i%2==0){
                sum_even+=i;
                i++;   
            }
        }
        System.out.println("Sum of 10 even no's are="+sum_even);
    }
}