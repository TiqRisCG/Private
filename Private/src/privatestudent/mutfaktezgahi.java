package privatestudent;

import java.util.concurrent.Semaphore;

public class mutfaktezgahi {
	private final String[] tezgah;
	private int index = 0;
	private final Semaphore empty;
	private final Semaphore full;
	private final Semaphore mutex;
	
	public mutfaktezgahi(int kapasite) {
		tezgah = new String[kapasite];
		empty = new Semaphore (kapasite);
		full = new Semaphore (0);
		mutex = new Semaphore (1);
	}
	public void yemekhazirla(String yemek , String asciAdi) throws InterruptedException {
		empty.acquire();
		mutex.acquire();
		tezgah [index] = yemek;
		tezgah [index++] = yemek;
		System.out.println("Asciadi: "+asciAdi+"YemekHazırlandı: "+yemek);
		full.release();
		mutex.release();
	}
		public void yemekal(String yemek , String asciAdi) throws InterruptedException {
			full.acquire();
			mutex.acquire();
			tezgah [index] = yemek;
			tezgah [index--] = yemek;
			System.out.println("Asciadi: "+asciAdi+"Yemekal: "+yemek);
			full.release();
			mutex.release();
		}
		public void run() {
	}
	

}
