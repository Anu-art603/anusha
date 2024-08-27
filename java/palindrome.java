import java.util.StringTokenizer;
import java.util.StringJoiner;
public class palindrome {
	public static void main(String[] args) {
		String temp,str="hi iam going to Watch racecar with car number as 545";
		StringTokenizer st=new StringTokenizer(str);
		StringJoiner sj=new StringJoiner(",");
		while(st.hasMoreElements())
		{
			temp=st.nextToken().toLowerCase();
			if(temp.contentEquals(new StringBuffer(temp).reverse()))
				sj.add(temp);		
		}
		
		System.out.println(sj.toString());
		
	}

	
	}




