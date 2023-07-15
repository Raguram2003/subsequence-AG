import java.util.Scanner;

class Solution{
    public int FindNoofSequence(String st){
        int total =0;
        int a_count =0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i) == 'A'){
                a_count++;
            }
            if(st.charAt(i)=='G'){
                total = total+a_count;
            }
        }
        return total;
    }
}

public class SubSequenceAG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sequence: ");
        String word = sc.next();
        Solution answer = new Solution();
        System.out.println(answer.FindNoofSequence(word));
    }
}
