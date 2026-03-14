package TOP_50;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Vaibhav";


        // using sb.append
        String reversed="";
        char[] ch = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            reversed += ch[i];
        }
        System.out.println("Using the String : "+reversed);


        // using
        int left =0;
        int right = ch.length-1;
        while(left<right){
            char temp=ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        System.out.println("Using the char array : ");
        for(Character c : ch){
            System.out.print(c);
        }

        // using string Builder

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Using the String Builder : "+sb.toString());
    }
}
