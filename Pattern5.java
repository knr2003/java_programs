//pattern 5
/*

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 


*/

class Pattern5{
    public static void main(String args[]){
        int n=9 , maxcol=5,n1,temp;
        temp=maxcol;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            
            if(row>=maxcol)
                  break;
            System.out.println("");
        }
        System.out.println();
        n1=temp-1;
        for(int row=1;row<=n1;row++){
            for(int col=1;col<=n1-row+1;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}