public class Pattern1 {

    private static int j;
  public static void main(String[] args) {
    int n = 5;
   /*  for(int i = 1; i <= n; i++){
       for(int j = i; j < n; j++){
        System.out.print(" ");
       }
       for(int k = 1; k <= (2*i-1); k++){
        if(k==1||i==n||k==(2*i-1)){
          System.out.print("*");

        }else{
          System.out.print(" ");
        }
        
       }
       System.out.println(" ");
    }
      


       for(int i = n; i >= 1; i--){
        for(int j = i; j < n; j++){
         System.out.print(" ");
        }
        for(int k = 1; k <= (2*i-1); k++){
         if(k==1||i==n||k==(2*i-1)){
           System.out.print("*");
 
         }else{
           System.out.print(" ");
         }
         
        }
        System.out.println(" ");
     }
        
        for(int i = 1; i <= n; i++){
          for(int j = 1; j <= n-i; j++){
            System.out.print(" ");
          }
          for(int j = 1; j <= 2*i-1; j++){
            if(j==1||j==2*i-1){
              System.out.print("*");
            }else{
              System.out.print(" ");
            }

          }
          System.out.println(" ");
        }
        for(int i = n; i >= 1; i--){
          for(int j = 1; j <= n-i; j++){
            System.out.print(" ");
          }
          for(int j = 1; j <= 2*i-1; j++){
            if(j==1||j==2*i-1){
              System.out.print("*");
            }else{
              System.out.print(" ");
            }

          }
          System.out.println(" ");
        }
           



           /// print the hallow pattern in java
          for(int i = 0; i < n; i++){// row
            for(int j = 0; j < n; j++){// colums
          
            if(i==0||j==0||i==n-1||j==n-1){
              System.out.print("*");
            }else{
              System.out.print(" ");
            }
          }
          System.out.println(" ");

  }
        

          // print the Number Triangle Pattern in java
          for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
              
                System.out.print(" ");
              }
              for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
              }
              for(int j = 1; j <= i; j++){
                System.out.print(i+" ");
              }
              System.out.println(" ");
            }


                //  Number Increasing pattern in java
                for(int i = 1; i <= n; i++){
                  for(int j = 1; j <= i; j++){
                    System.out.print(j+" ");
                  }
                  System.out.println(" ");
                }
                


                //  Number Increasing Reverse pattern in java
                for(int i = n; i >= 1; i--){
                  for(int j = 1; j <= i; j++){
                    System.out.print(j+" ");
                  }
                  System.out.println(" ");
                }
                


                   //  Number Changing pyramid pattern in java
                   int num = 1;
                for(int i = 1; i <= n; i++){
                  for(int j = 1; j <= i; j++){
                    System.out.print(num+" ");
                    num++;
                  }
                  System.out.println(" ");
                  
                }
                    

                    //print the pattern zero one triangle
                    for(int i = 1; i <= n; i++){// print the row
                      for(int j = 1; j <= i; j++){ // print the columns
                        if((i+j)%2==0){
                          System.out.print(1 + " ");
                        }else{
                          System.out.print(0 + " ");
                        }
                        
                      }
                      System.out.println(" ");
                    }
                    

                      // print the pattern program for palindrome

                      for(int i = 1; i <= n; i++){
                        for(int j = 1; j <= 2*(n-i); j++){
                          System.out.print(" ");
                        }
                        for(int j = i; j >= 1; j--){
                          System.out.print(j + " ");
                        }
                        for(int j = 2; j <= i; j++){
                          System.out.print(j + " ");
                        }
                        System.out.println(" ");
                      
                      }
                         


                          // pattern program in Rohmbus 
                          for(int i = 1; i <= n; i++){
                            for(int j = 1; j <= i; j++){
                              System.out.print(" ");
                            }
                            for(int j = 1; j <= n; j++){
                              System.out.print("*");
                            }
                            System.out.println(" ");
                          }
                           

                           //  pattern program of java

                           for(int i = 1; i <= n; i++){
                            for(int j = 1; j <= n-i; j++){
                              System.out.print(" ");
                            }
                            for(int j = 1; j <= 2*i-1; j++){
                              System.out.print("*");
                            }
                            System.out.println(" ");

                           }
                           for(int i = n-1; i >= 1; i--){
                            for(int j = 1; j <= n-i; j++){
                              System.out.print(" ");
                            }
                            for(int j = 1; j <= 2*i-1; j++){
                              System.out.print("*");
                            }
                            System.out.println(" ");

                           }
                           
                           // Upper part of the butterfly
for (int i = 1; i <= n; i++) {
  // Left part: print stars
  for (int j = 1; j <= i; j++) {
      System.out.print("*");
  }

  // Spaces in the middle
  int space = 2 * (n - i);  // Corrected space calculation
  for (int j = 1; j <= space; j++) {
      System.out.print(" ");
  }

  // Right part: print stars
  for (int j = 1; j <= i; j++) {
      System.out.print("*");
  }

  // Move to the next line after completing a row
  System.out.println();
}

// Lower part of the butterfly
for (int i = n; i >= 1; i--) {
  // Left part: print stars
  for (int j = 1; j <= i; j++) {
      System.out.print("*");
  }

  // Spaces in the middle
  int space = 2 * (n - i);  // Adjusted the number of spaces
  for (int j = 1; j <= space; j++) {
      System.out.print(" ");
  }

  // Right part: print stars
  for (int j = 1; j <= i; j++) {
      System.out.print("*");
  }

  // Move to the next line after completing a row
  System.out.println();
}
    

    // square fill pattern in java
    for(int i = 1; i <= n; i++){  // print the rows
      for(int j = 1; j <= n; j++){ // print the colums
        System.out.print("*");
      }
      System.out.println(" ");
    }

     

    // Reverse Right half pyramid
    for(int i = 1; i <= n; i++){
      for(int j = 1; j <= n-i; j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }
   

    //  Right half pyramid
    for(int i = n; i >= 1; i--){
      for(int j = 1; j <= n-i; j++){
        System.out.print("*");
      }
      System.out.println(" ");
    }
       
      // Reverse Left half pyramid
      for(int i = n; i>=1;i--) {
        for(int j = 1; j <= n-i; j++){
          System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
          System.out.print("*");
        }
        System.out.println(" ");
      }

   
      // Left half pyramid
      for(int i = 1; i <=n; i++) {
        for(int j = 1; j <= n-i; j++){
          System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
          System.out.print("*");
        }
        System.out.println(" ");
      }
    
      // K pattern program

      for(int i = n; i >= 1; i--){
        for(int j = n; j >= 1; j--){
          System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
          System.out.print("* ");
        }
        System.out.println(" ");
      }
      for(int i = 2; i <= n; i++){
        for(int j = n; j >= 1; j--){
          System.out.print(" ");
        }
        for(int j = 1; j <= i; j++){
          System.out.print("* ");
        }
        System.out.println(" ");
      }
         
          //Triangle star pattern in java
          for(int i = 0; i < n; i++){
            for(int j = n-i; j> 1; j--){
              System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
              System.out.print("* ");

            }
            System.out.println(" ");
          }
            
              // Reverse Number Triangle pattern
              for(int i = 1; i <= n; i++){
                for(int j = 1; j<= i; j++){
                  System.out.print(" ");
                }
                for(int j = i; j <= n; j++){
                  System.out.print(j + " ");
    
                }
                System.out.println(" ");
              }
                 

                  // mirror image Tringle 
                  for(int i = 1; i <= n; i++){
                    for(int j = 1; j<= i; j++){
                      System.out.print(" ");
                    }
                    for(int j = i; j <= n; j++){
                      System.out.print(j + " ");
        
                    }
                    System.out.println(" ");
                  }
                  for(int i = n-1; i >= 1; i--){
                    for(int j = 1; j<= i; j++){
                      System.out.print(" ");
                    }
                    for(int j = i; j <= n; j++){
                      System.out.print(j + " ");
        
                    }
                    System.out.println(" ");
                  }
                    
                    //Hollow pattern Triangle
                    
                      // outer loop to handle rows
                      int i , j, k;
        for (i = 1; i <= n; i++) {
          
          // inner loop to print spaces.
          for (j = i; j < n; j++) {
              System.out.print(" ");
          }
        
          for (k = 1; k <= (2 * i - 1); k++) {
              // printing stars.
              if (k == 1 || i == n || k == (2 * i - 1)) {
                  System.out.print("*");
              }
              // printing spaces.
              else {
                  System.out.print(" ");
              }
          }

          System.out.println("");
      }
           

           // Howllow Reverse triangle
           int i, j ,k;
           for (i = n; i >= 1; i--) {
          
            // inner loop to print spaces.
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
          
            for (k = 1; k <= (2 * i - 1); k++) {
                // printing stars.
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }
  
            System.out.println("");
            

            // Howllow Diamond Pattern 
            for(int i = 1; i <= n; i++){
              for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
              } 
              for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            
        for(int i = n; i >= 1; i--){
          for(int j = 1; j <= n-i; j++){
            System.out.print(" ");
          } 
          for (int j = 1; j <= 2 * i - 1; j++) {
            if (j == 1 || j == 2 * i - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
        */
        // Hollow Hours Glass
        for (int i = n; i >= 1; i--) {
          // Print leading spaces
          for (int j = 1; j < n - i; j++) {
              System.out.print(" ");
          }
          
          // Print the stars and spaces for the hollow effect
          for (int k = 1; k <= 2 * i - 1; k++) {
              if (i == n || k == 1 || k == 2 * i - 1) {
                  System.out.print("*");
              } else {
                  System.out.print(" ");
              }
          }
          
          // Move to the next line after each row
          System.out.println();
      }
      for (int i = 1; i <= n; i++) {
        // Print leading spaces
        for (int j = 1; j < n - i; j++) {
            System.out.print(" ");
        }
        
        // Print the stars and spaces for the hollow effect
        for (int k = 1; k <= 2 * i - 1; k++) {
            if (i == n || k == 1 || k == 2 * i - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        
        // Move to the next line after each row
        System.out.println();
    }
    
      
        
            }
        }

  





  
