interface ValidationUtility{
	static boolean isBlank(String value){
		if(value!=null && value.length()>0){
			return false;
		}
		return true;
	}
}
/*class ValidationUtility
{
	private ValidationUtility(){
		
	}
	static boolean isBlank(String value){
		if(value!=null && value.length()>0){
			return false;
		}
		return true;
	}
}*/
public class StaticMethod {

	public static void main(String[] args) {
		String x = "";
		//ValidationUtility obj = new ValidationUtility();
		if(ValidationUtility.isBlank(x)){
			System.out.println("This is Blank Value");
		}
		else{
			System.out.println("Correct Value");
		}

		
		
		
		
		
		
		
		
		
	}

}
