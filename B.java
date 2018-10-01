public class B 
{ 
    
    private Integer property; 
    B() 
    { 
       
    } 
  
    
    public void setProperty(Integer property) 
    { 
        if (property == 0) 
        { 
            
            return; 
        } 
        this.property=property; 
    } 
  
    
    public int getProperty() 
    { 
        if (property == 0) 
        { 
           
            return 0; 
        } 
        return property; 
    } 
}
