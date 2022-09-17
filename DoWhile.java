

public class DoWhile {

    public static void main(String[] args){

     int i = 0;
    do {
        System.out.println("İkişer arttırma "+i);
      i+=2;
    }
    while (i < 10);  
     System.out.println("********************************** ");
    
    
     int j = 2;
    do {
        System.out.println("İkişer çarpma "+j);
      j*=2;
    }
    while (j < 10); 
         System.out.println("********************************** ");
    
       int c = 10;
      
    do{
     System.out.println("Birer eksiltme "+c);
      c-=1; 
    }  
      while ( c >= 1);
       System.out.println("********************************** ");
       int e = 20;
  do {
     System.out.println("İkiye bölme "+e);
      e/=2; 
    }    while ( e > 2);
    
    }

}
