package threads1;

public class Podium  
{  
      
    private String intercalação;  
    private boolean fim = false;  
  
    public void setintercalação(String intercalação)  
    {  
          
        if(fim == false)  
        {  
             this.intercalação = intercalação;  
             fim  = true;  
        }  
    }       
        
      
    public String getintercalação()  
    {  
        return intercalação;  
    }  
}  
