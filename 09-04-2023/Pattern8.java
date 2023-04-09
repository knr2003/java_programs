class Pattern8{
    public static void main(String[] args){
        int n=5,row,col;
        for(row=1;row<=n;row++){
            for(col=row;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}