
public class Test {

	public static void main(String[] args) {
		/*int firstNumber = 10 ;
		int secondNumber =20 ;
		int result = firstNumber + secondNumber;
		System.out.println("Sum is "+result);
        */
	/*	int k =1;
		for(;k<=10;){
			k++;
		}
		int n = 10;*/
		myouterloop:
		for(int i = 1; i<=3 ; i++){
			for(int j = 1; j<=3 ; j++){
				if(i==j){
					continue myouterloop;
					//break;
					//break myouterloop;
				}
				else{
					System.out.println("I is "+i+" And J is "+j);
				}
			}
		}
		/*for(int i = 1 ; i<=10 ; i++){
			if(i==5)
				continue;
				//break;
			System.out.println("I is "+i);
		}*/
		/*int i = 1;
		while(i<=10){
			System.out.println("I is "+i);
			if(i==2){
				i = i + 5;
			}
			else{
			i++;
			}
		}*/
	}

}
