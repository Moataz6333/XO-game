 class pointer {
   static String [][] arr = new String[3][3];
   static int n =0;

     public static void setArr(String[][] arr) {
         pointer.arr = arr;
     }

     public static void setN(int n) {
         pointer.n = n;
     }

     public static int getN() {
         return n;
     }

     public static String setSymbol(int i){
       String s;
       if(i % 2 == 0)
           s="X";
       else
           s="O";

       return s;
   }



   public static boolean check(String[][] a){
         boolean flag =false ;
        if(noteqalnull(a[0][0],a[0][1],a[0][2])  && a[0][0].equals(a[0][1]) && a[0][0].equals(a[0][2]) ){
            flag=true;
        } else if (noteqalnull(a[1][0],a[1][1],a[1][2])  && a[1][0].equals(a[1][1])  && a[1][0].equals(a[1][2]) ) {
            flag=true;
        } else if (noteqalnull(a[2][0],a[2][1],a[2][2])  && a[2][0].equals(a[2][1]) && a[2][0].equals(a[2][2])) {
            flag=true;
        } else if (noteqalnull(a[0][0],a[1][0],a[2][0]) && a[0][0].equals(a[1][0])  &&  a[0][0].equals(a[2][0])) {
            flag=true;
        } else if (noteqalnull(a[0][1],a[1][1], a[2][1]) && a[0][1].equals(a[1][1]) &&  a[0][1].equals(a[2][1])) {
            flag=true;
        } else if (noteqalnull(a[0][2],a[1][2],a[2][2]) && a[0][2].equals(a[1][2])  && a[0][2].equals(a[2][2])) {
            flag=true;
        } else if (noteqalnull(a[0][0],a[1][1],a[2][2]) && a[0][0].equals(a[1][1]) && a[0][0].equals(a[2][2])) {
            flag=true;
        } else if (noteqalnull(a[0][2],a[1][1],a[2][0])  && a[0][2].equals(a[1][1]) && a[0][2].equals(a[2][0])) {
            flag=true;

        }

       return flag;

   }
   public static  boolean noteqalnull(String s1,String s2, String s3){
       boolean flag1 = false;
       if(s1 != null && s2 != null && s3 != null )
           flag1=true;

       return flag1;
   }
   public static void clear(){
         for(int i = 0; i<3;i++){
             for (int j =0; j<3;j++){
                 arr[i][j]=null;
             }
         }
     }

     public static boolean isfull(){
         boolean flag=true;
         boolean flag2 = false;
         for(int i = 0; i<3;i++){
             for (int j =0; j<3;j++){
               if(arr[i][j]== null ){
                 flag=false;
                 break;             //is full
               }
             }
         }
         if(flag && !check(arr)){
             flag2 = true;
         }
         return flag2;
     }
     public static String getSympol(int n){
         if(n %2==0){
             return "X";
         }else
             return "O";
     }

}
