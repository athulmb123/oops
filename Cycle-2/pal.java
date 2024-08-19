import java.util.Scanner;
class pal{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the string:");
String str = sc.nextLine().toLowerCase();
int flag=1;
int left=0, right=str.length()-1;
while(left<right)
{
if(str.charAt(left)!=str.charAt(right))
{
flag = 0;
break;
}
left++;
right--;
}
if(flag==1){
System.out.println(str+ " is palindrome");
}
else{
System.out.println(str+ " is not palindrome");
}
}
}
