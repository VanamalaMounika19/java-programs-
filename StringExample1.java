import java.lang.*;
public class StringExample1 {
public static void main(String args[]) {
String s = "abc123$@";
int uppercount=0,lowercount=0,numbercount=0,symbolcount=0;
for(int i=0;i<s.length();i++) {
char ch=s.charAt(i);
 if(ch>='A' && ch<='Z') 
     uppercount++;
   else if(ch>='a' && ch<='z') 
     lowercount++;
   else if(ch>='0' && ch<='9')
    numbercount++;
  else
    symbolcount++;
   }
System.out.println(uppercount+" "+lowercount+" "+numbercount+" "+symbolcount);
    }
  }
 