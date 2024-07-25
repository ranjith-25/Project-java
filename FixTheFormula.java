
package fixtheformula;

import java.util.*;

public class FixTheFormula {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char[] ch= str.toCharArray();
        String dig="",op="";
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(ch[i])){
                dig+=ch[i];
            }
            else if(ch[i]=='+'||ch[i]=='-'||ch[i]=='*'||ch[i]=='/'){
                op+=ch[i];
            }
        }
        int ans=dig.charAt(0)-'0';
        for(int i=0;i<op.length();i++){
            int val=dig.charAt(i+1)-'0';
            if(op.charAt(i)=='+'){
                ans=ans+val;
            }
            if(op.charAt(i)=='-'){
                ans=ans-val;
            }
            if(op.charAt(i)=='*'){
                ans=ans*val;
            }
            if(op.charAt(i)=='/'){
                ans=ans/val;
            }
        }
        System.out.println(ans);
        
    }
    
}
