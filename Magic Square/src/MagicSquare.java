import java.util.Scanner; 

//import java.util.arrays; 

  

public class MagicSquare { 

     

    int square[][]; 

    Scanner in; 

     

    public MagicSquare() { 

    	in = new Scanner(System.in); 

        square = new int[4][4]; 

         

    } 

    
    public void riggedMagic() {
    	//square1 = new int;
    	 int [][]square1 = {
    			{8, 11, 14, 1},
    			{13, 2, 7, 12},
    			{3, 16, 9, 6},
    			{10, 5, 4, 15}
    			
    	};
    	square = square1;
    }
    
    public void riggedInvalid() {
    	//square1 = new int;
    	 int [][]square1 = {
    			{8, 17, 14, 1},
    			{13, 2, 7, 12},
    			{3, 16, 9, 6},
    			{10, 5, 4, 15}
    			
    	};
    	square = square1;
    }
    
    public void riggedNotMagic() {
    	//square1 = new int;
    	 int [][]square1 = {
    			{11, 8, 14, 1},
    			{13, 2, 7, 12},
    			{3, 16, 9, 6},
    			{10, 5, 4, 15}
    			
    	};
    	square = square1;
    }
    
    public void fill() { 

        for(int i = 0; i < square.length; i++) { 

            for(int x = 0; x < square[i].length; x++) { 

                System.out.println("enter next number: "); 

                square[i][x] = in.nextInt(); 

                 

            } 

        } 

    } 

     

    public boolean valid() { 

        /* 

        int temp = 0; 

        for(int i = 0; i < square.length; i++) { 

            for(int x = 0; x < square[i].length; x++) { 

                if(!(square[i][x] == (temp + 1))) { 

                     

                } 

                temp++; 

            } 

        } 

        */ 

         

        //int sum = 0; 

        for(int i = 0; i < square.length; i++) { 

            for(int x = 0; x < square[i].length; x++) { 

                if((square[i][x] > 16 || square[i][x] < 1)) { 
                    return false; 

                } 

                //sum = sum + square[i][x]; 

                 

            } 

        } 

        return true; 

        /* 

        int arr[] = new int[sum]; 

         

        for(int i = 0; i < square.length; i++) { 

            for(int x = 0; x < square[i].length; x++) { 

                for(int y = 0; y < arr.length; y++) { 

                    if(square[i][x] == arr[y]) { 

                        return false; 

                    } 

                } 

                 

            } 

        } 

         

        return true; 

         

        */ 

         

         

    } 

     

    public boolean isMagic() { 
    	
    	 int tot = 0; 

         //for(int i = 0; i < square.length; i++) { 

          for(int x = 0; x < square[0].length; x++) { 

        	  tot = tot + square[0][x]; 

                  

            // } 

         } 
         
          for(int i = 1; i < square.length; i++) { 
        	  int row = 0;

              for(int x = 0; x < square[i].length; x++) { 

                  row = row + square[i][x]; 

                   

              } 
              if(!(row == tot)) {
            	  return false;
              }
            		  
          } 
          
          tot = 0; 

          //for(int i = 0; i < square.length; i++) { 

           for(int x = 0; x < square.length; x++) { 

         	  tot = tot + square[x][0]; 

                   

             // } 

          } 
          
          for(int i = 1; i < square.length; i++) { 
        	  int row = 0;

              for(int x = 0; x < square[i].length; x++) { 

                  row = row + square[x][i]; 

                   

              } 
              if(!(row == tot)) {
            	  return false;
              }
            		  
          } 
          
          tot = 0; 

          //for(int i = 0; i < square.length; i++) { 

           for(int x = 0; x < square.length; x++) { 

         	  tot = tot + square[x][x]; 

                   

             // } 

          } 
          int sum = 0;
           for(int x = square.length - 1; x >= 0; x--) { 

          	  sum = sum + square[x][x]; 

                    

              // } 

           } 
           
           if(!(sum == tot)) {
        	   return false;
           }
           
           return true;

         //return tot; 

    //	int total = 0;
    //	 for(int i = 0; i < square.length; i++) { 
    		 
      //   } 

        /* 

        int needed = 0; 

        for(int i = 0; i < square.length; i++) { 

             

             

        } 

        int tempsum = 0;  

        for(int i = 0; i < square.length; i++) { 

            for(int x = 0; x < square[i].length; x++) { 

                tempsum = tempsum + square[i][x]; 

                 

            } 

        } 

        */ 

    } 
    
    
    /*
    public int rows() { 

        int tot = 0; 

        for(int i = 0; i < square.length; i++) { 

            for(int x = 0; x < square[i].length; x++) { 

                tot = tot + square[i][x]; 

                 

            } 

        } 

        return tot; 

    } 

     

    public int columns() { 

        int tot = 0; 

        for(int x = 0; x < square[0].length; x++) { 

            tot = tot + square[x][0]; 

             

        } 

        for(int i = 0; i < square.length; i++) { 

             

            for(int x = 0; x < square[i].length; x++) { 

                tot = tot + square[x][i]; 

                 

            } 

        } 

        return tot; 

    } 
    */
     

} 

  