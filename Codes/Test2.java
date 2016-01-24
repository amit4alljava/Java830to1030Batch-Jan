
public class Test2 {

	public static void main(String[] args) {
		String a1 = "Hello";
		System.out.println(a1.toUpperCase());
		int x[]={10,20,30,40,50};
		int []y={10,20,30};
		int z[]=new int[]{10,20,30};
		int a[]= new int[5];
		int q[][]= new int[3][];
		q[0] = new int[3];
		q[1] = new int[2];
		q[2] = new int[4];
		/*for(int w[] : q){
			for(int e : w){
				System.out.println(e);
			}
		}*/
		for(int i = 0; i<q.length; i++){
			for(int j = 0 ; j<q[i].length; j++){
				System.out.println(q[i][j]);
			}
		}
		//int q[][]=new int[3][4];
		/*int q[][]={{10,20,30,40},
		{90,45,22,11}
		};*/
		//q[0][0]=10;
		/*System.out.println(q.length);
		for(int i = 0; i<q.length; i++){
			for(int j = 0 ; j<4; j++){
				System.out.println(q[i][j]);
			}
		}*/
		/*for(int i = 0 ; i<x.length ; i++){
			System.out.println(x[i]);
		}*/
		// Enhance For Loop (Java 5)
		/*for(int w : x){
			System.out.println(w);
		}*/
	}

}
