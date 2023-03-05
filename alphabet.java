
//PRINT ALPHABETS IN ARRAY USING FOR LOOP
class alphabet{
	public static void main (String[]args){
		char a[]=new char[26];
		for(int i=0;i<a.length;i++){
			a[i]=(char)('a'+i);
		}
		for(char i:a){
			System.out.print(i+"  ");
		}
	}
}