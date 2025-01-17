class Pattern {
    public static void main(String[] args){
        for(int i= 1; i<=5; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
};
class Pattern2{
    public static void main(String[] args){
for(int b =1;b<=5;b++){
    for (int a = 5 ; a>=b;a--)
    {
        System.out.print("*");
    }
    System.out.println();
}
    }
};
class Pattern3 {
    public static void main(String[] args){
        for(int c= 1; c<=5; c++){
            for(int d=1 ; d<=c ; d++){
                System.out.print("*");
            }
           System.out.println();
        };
    for(int a = 1; a<=4; a++){
          for(int k = 4; k>=a;k--){
               System.out.print("*");  
            }
              System.out.println();
    }
    }
};
class Pattern4{
public static void main(String[] args){
    for(int f=1 ; f<=4; f++){
        for(int g =4; g>=f; g--){
            System.out.print(" ");
        }
        for(int h= 1; h<=f; h++ ){
             System.out.print("*");  
        }
        for(int m = 2 ; m<=f;m++){
         System.out.print("*");  
}
         System.out.println();
    }
}
};
class Pattern5{
public static void main(String[] args){
    for(int n= 1; n<=5; n++){
        for(int o =1; o<=n;o++){
            int p = n+o;
            if(p%2==0){
                System.out.print(1+" ");
            }else{
                System.out.print(0 +" ");
            }
        }
        System.out.println();
    }
}
};

class Pattern6{
public static void main(String[] args){
    for(int q = 1; q<=3; q++){
        for(int r=1;r<=3;r++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}