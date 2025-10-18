package privatestudent;

public class hesapmakinesi {

	public int sayi1,sayi2;
	hesapmakinesi(int sayi1,int sayi2){
		this.sayi1 = sayi1;
		this.sayi2 = sayi2;
	}
	public int toplama() {
		return this.sayi1+this.sayi2;
	}
	public int cıkarma() {
		return this.sayi1-this.sayi2;
	}
	public int carpma() {
		return this.sayi1*this.sayi2;
	} 
	public int bölme() {
		return this.sayi1/this.sayi2;
	}
	
}
