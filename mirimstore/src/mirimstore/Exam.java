package mirimstore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
class Text{
	int[] num = new int[10];
	String[] name = new String[10];
	int[] price = new int[10];
	int length;
	public void textk(){
		String fname = "menu2.txt";
		try{
			FileReader fr = new FileReader(fname);
			BufferedReader br = new BufferedReader(fr);
			String s = "";
			while((s = br.readLine()) != null){
			StringTokenizer parse = new StringTokenizer(s,"\t");
			length = parse.countTokens()/3;
			for(int i=0; i<length; i++){
				num[i] = Integer.valueOf(parse.nextToken()).intValue();
				name[i] = parse.nextToken();
				price[i] = Integer.valueOf(parse.nextToken()).intValue();
				}
			}
			print();
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	public void print(){
		for(int i=0; i<length; i++){
			System.out.println(price[i]);
		}
	}
}
public class Exam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Text t = new Text();
		t.textk();
	}
}
