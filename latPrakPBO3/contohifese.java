public class contohifese{
	public static void main(String args[]){
		char hurufAwal='a';
		System.out.print("masukkan huruf awal nama Anda : ");
		try{
			hurufAwal = (char)System.in.read();
		}catch(Exception e){
			System.out.println("salahko menginput cess...!");
			}
		if(hurufAwal == 'a')
			System.out.println("apa namamu AMIN");
		 else if (hurufAwal == 'b')
			System.out.println("apa namamu Bambang");
		 else if (hurufAwal == 'c')
			System.out.println("apa namamu ceceo");
		 else if (hurufAwal == 'd')
		     System.out.println("apa namamu daud");
		 else if (hurufAwal == 'e')
			System.out.println("apa namamu Endang");
	     else 
			System.out.println("beta tdk bisa tebak tebak");
			
	}
}