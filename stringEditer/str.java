public class str{

  public str(){
   
  }
  
  public static String replaceLetters(String str, int n){
    StringBuilder result = new StringBuilder();
    for(int i=0 ; i< str.length() ; i++){
      
      int y = (int) str.charAt(i) ;
      
      //Ýf letter uppercase 
      if(y>=65 && y<=91){
       y = y + n;
       //check if value is not bigger than ascýý uppercases value 
       if(y>=65 && y<91){
        char x = (char) y;
        result.append(x);
       }
       //if it is bigger than ascýý uppercases value 
      else{
        y = y-26;
        char x = (char) y;
        result.append(x);
       }
       }
      
      
      //Ýf letter lowercase
      else if(y>=97 && y<=122){
       y = y + n;
       //check if value is not bigger than ascýý lowercases value
       if(y>=97 && y<122){
        char x = (char) y;
        result.append(x);
       }
       // if it is bigger than ascýý lowercases value
       else{
        y = y-26;
        char x = (char) y;
        result.append(x);
       }
       }
      
      
      //Ýf it is not a case
      else{
        char x = (char) y;
        result.append(x);
      }
    
    
  
  }
    return result.toString();
  
}
  
  
  
  
  
  
  
  public static String stripFromBothEnd(String str){
    StringBuilder result = new StringBuilder();
    
    //if string has space both at start and end delete first and last character and append others
    if((int) str.charAt(0)==32 && (int) str.charAt(str.length()-1)==32){
      for(int i=1 ; i< str.length()-1 ; i++){
        result.append(str.charAt(i));
      }
    }
    
    //if string has space only at start delete first character and append others
    else if((int) str.charAt(0)==32 && (int) str.charAt(str.length()-1)!=32){
      for(int i=1 ; i< str.length() ; i++){
        result.append(str.charAt(i));
      }
    }
    
    //if string has space only at end delete last character and append others
    else if((int) str.charAt(0)!=32 && (int) str.charAt(str.length()-1)==32){
      for(int i=0 ; i< str.length()-1 ; i++){
        result.append(str.charAt(i));
    
    }
    }
    
    //if string has not space both at start and end append all
    else{
     for(int i=0 ; i< str.length() ; i++){
        result.append(str.charAt(i));
    
    }
    }
    
   
    return result.toString();
  }
 
  
  
  
  
  
  
  
  
  public static String removeRepeatingChars(String str){
   StringBuilder result = new StringBuilder();

   
   //check for all charcters
   for(int i=0 ; i< str.length() ; i++){
     boolean y = true;
     
     // compare char with char append before
     for(int j=0 ; j< result.length() ; j++){
       int a = (int) str.charAt(i);
       int b = (int) result.charAt(j);
       //if char appened before change value of y to false  
       if(a==b){
        y = false;
       }
     }
     
     // check y to see if char append before or not, if not append add to result
     if(y==true){
      result.append(str.charAt(i));
     
     }
   
   
   }
   
    return result.toString();
  
  }
  
  
  
  public static String compressText(String str) {
    StringBuilder result = new StringBuilder();
    int i = 0;

    while (i < str.length()) {
        char currentChar = str.charAt(i);
        int j = i + 1;
        
        while (j < str.length() && str.charAt(j) == currentChar) {
            j++;
        }

        int count = j - i;
        result.append(currentChar);
        if (count > 1) {
            result.append(count);
        }
        
        i = j;
    }

    return result.toString();
}

   
  
  
  
  
  
  
  
  
  
  
  
}
  