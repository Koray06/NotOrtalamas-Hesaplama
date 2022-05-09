import java.util.Scanner;

public class notHesaplamaGonder {

	public static void main(String[] args) {
		/*  Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
		derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını
		hesaplayıp ekrana bastırılan program */
		Scanner scan = new Scanner (System.in);
		
		int  Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik ;
		
		
		System.out.println("merhaba Not Hesaplama Programına Hoşgeldiniz");
		System.out.println("Lütfen matematik notunuzu giriniz");
		Matematik = scan.nextInt();
		System.out.println("Lütfen Fizik notunuzu giriniz");
		Fizik= scan.nextInt();
		System.out.println("Lütfen kimya notunuzu giriniz");
		Kimya = scan.nextInt();
		System.out.println("Lütfen türkce notunuzu giriniz");
		Türkçe = scan.nextInt();
		System.out.println("Lütfen tarih notunuzu giriniz");
		Tarih = scan.nextInt();
		System.out.println("Lütfen müzik notunuzu giriniz");
		Müzik = scan.nextInt();
		
		double ortalama = ((Matematik+Fizik+Kimya+Türkçe+Tarih+Müzik) / 6);
		System.out.println("Not Ortalamanız " + ortalama );
		String sonuc = (ortalama >=60) ? "Tebrikler Geçtiniz" : "Üzgünüm Kaldınız";
		System.out.println(sonuc);

	}

}
