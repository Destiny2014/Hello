//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        char ch;
        String s = "Hello";
        char[] arr = s.toCharArray();

        for (int i=0; i<arr.length; i++){
            ch = arr[i];
            ch = Character.toLowerCase(ch);
            for(int j=i+1; j<arr.length; j++){
                if (ch == arr[j]){
                    System.out.println(ch);
                    break;
                }
            }
        }
    }
}