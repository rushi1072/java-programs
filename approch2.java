class approch2{ //using for loop sPRint alphabets 
	public static void main(String[]args){
		int count=0;
		char [] arr=new char[26];
		for(char a='A';a<='Z';a++){
			arr[count]=a;
			System.out.println(arr[count]);
			count++;
		}
	}
}