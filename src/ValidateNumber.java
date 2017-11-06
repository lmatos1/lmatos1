class ValidateNumber{
    public static void main(String []arg){
        if(arg.length != 1){
            System.out.println("Please enter one command line argument.");
        }else{
            if(arg[0].length() != 10){
                System.out.println("Please eneter 10 digits Integer value.");
            }else{
                int ans = 0;
                for(int i=0;i<10;i++){
                    if(i%2 == 0){
                        ans += (arg[0].charAt(i)-48);
                    }else{
                        ans += f(arg[0].charAt(i)-48);
                    }
                }
                int checksumValue = ans % 10;
                System.out.println(arg[0] + checksumValue);
            }
        }
    }

    public static int f(int val){
        val *= 2;
        if(val > 9){
            val = val/10 + val%10;
        }
        return val;
    }
}