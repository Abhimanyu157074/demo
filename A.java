public class A 
{ 
    public static void main(String[] args) 
    { 
        B bean = new B(); 
  
        bean.setProperty(0); 
        System.out.println("After setting to 0: " + 
                                 bean.getProperty()); 
  
        bean.setProperty(5); 
        System.out.println("After setting to valid" + 
                      " value: " + bean.getProperty()); 
    } 
}