class ExpH{
    public static void main(String[] args){
        try{
            int result = 10/0;
            System.out.println("result"+result);
        } catch (ArithmeticException e){
            System.out.println("Error : cannot be dived by zero" + e.getMessage());
        }finally {
            System.out.println("this block will always execute");
        }
    }
}