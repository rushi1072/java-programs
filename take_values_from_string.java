class take_values_from_string{
	public static void main(String[]args){
		String values[]={"Rushikesh","Utkarsha","Ayush","Digya","Datta"};
			for(String  i:values){
				System.out.print(i+"  ");
				
			}
			System.out.println(values[0].charAt(2));
			
			for(int i=values.length-1;i>=0;i--){
			System.out.print(values[i]+"  ");
			}
		int index = find(values, "Datta");
			System.out.println(index);
			for(int i = values[index].length() -1 ; i >= 0  ; i-- ){
				System.out.print(values[index].charAt(i));
			}
	}
	
	static int find(String[] arr, String name){
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] == name){
				return  i;
			}		
		}
		return -1;
	}
	
	
}