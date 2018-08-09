package fibonacci;

public class Fibona {

	public static int fibonacci(int x) {

		if(x<=1)
			return x; //agar berilgan raqam 1 dan kichik bolsa ashi raqamni ozini print qil
		else
			return fibonacci(x-1) + fibonacci(x-2); //bolmasa ashi raqamdan 1 ni ayrim, raqamdan 2 ayrib keyin qo'sh

	}
	
	public static void main(String[] args) {

		int x=8;
		System.out.println(fibonacci(x));
	}

}
