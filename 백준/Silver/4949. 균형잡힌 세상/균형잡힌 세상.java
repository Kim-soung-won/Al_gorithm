import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;
            Stack<String> stack = new Stack<>();
            String[] sentence = str.split("");
            for (String k: sentence){
                switch (k){
                    case "(":
                        stack.push("(");
                        break;
                    case ")":
                        if(stack.isEmpty() || !stack.peek().equals("(")){
                            stack.push(")");
                            break;
                        }
                        stack.pop();
                        break;
                    case "[":
                        stack.push("[");
                        break;
                    case "]":
                        if(stack.isEmpty() || !stack.peek().equals("[")){
                            stack.push("]");
                            break;
                        }
                        stack.pop();
                        break;
                }
            }
            if(stack.isEmpty()){
                bw.write("yes"+"\n");
            }else{
                bw.write("no"+"\n");
            }
            bw.flush();
        }
    }
}