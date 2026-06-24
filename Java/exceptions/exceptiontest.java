
/*class exceptiontest{
    public static void main(String[] args) {
        try {
            int result =10/0;
            System.out.println("RESULT"+result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero"+e.getMessage());
        }finally{
            System.out.println("This runs everytime..");
        }
    }
}
*/
/*
class exceptiontest{
    public  void checknum(int n){
        if(n<1) throw new ArithmeticException("Number is negative");
        else System.out.println("The square is "+(n*n));
    }
        public int divide(int m,int n) throws ArithmeticException{
            int div=m/n;
            return div;
        }
        public static void main(String[] args) {
            main obj=new main();
            // obj.checknum(-3);
            obj.divide(50, 0);
        }
}
*/
// subclassing exceptions 
    class InsufficentfundsException extends Exception{
        public InsufficentfundsException(String message){
            super(message);

        }
    }
    class exceptiontest{
        public static void main(String[] args) {
            int balanceamt=1000;
            int withdraw= 1900;
            try {
                if(withdraw>balanceamt) {
                    throw new InsufficentfundsException("Not enough balance");
                }
                balanceamt -=withdraw;
                System.out.println("Money withdrawn balance left"+balanceamt);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("End of program");
        }
    }




