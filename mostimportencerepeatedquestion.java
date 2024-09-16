public class mostimportencerepeatedquestion {
    static void m1(int n){
        System.out.println("int");//1
    }
    static void m1(Integer n){
        System.out.println("integer");//2
    }
    static void m1(Object n){
        System.out.println("Object");//3
    }
    public static void main(String[] args) {

        m1(10);
       
    }
    
}
