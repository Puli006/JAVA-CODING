public class Grade{
    public static void main(String[] args){
        int a=0, b=1, t=0;
        for(int i=2; i<=30; i++){
            t=a+b;
            a=b;
            b=t;
            System.out.println(t); //fabinoociseries
        }
}
}
