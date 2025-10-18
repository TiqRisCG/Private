package privatestudent;

public class yapıcızincirleme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*hesapmakinesi makine1 = new hesapmakinesi();
		makine1.sayi1 = 10;
		makine1.sayi2 = 20;
		System.out.println(makine1.sayi1);
		
		hesapmakinesi makine2 = new hesapmakinesi();
		makine2.sayi1 = 20;
		System.out.println(makine2.sayi1);
		*/
		hesapmakinesi makine = new hesapmakinesi(10,5);
		
		makine.toplama();
		System.out.println(makine.toplama());
		//System.out.println(makine.sayi2);

	}

}
