public class FlightTicketPriceCalculator {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan input almak için scanner oluşturduk.
        int distance, age, flightType;
        double flightCost;
        final double costPerKM = 0.1; // KM basina ücreti final keywordu ile sabit değişken olarak tanımladık.

        System.out.print("Mesafeyi KM türünden giriniz : ");
        distance = scanner.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        age = scanner.nextInt();
        System.out.print("Yolculuk Tipini giriniz (1 -> Tek Yön, 2 -> Gidiş Dönüş ): ");
        flightType = scanner.nextInt();
        flightCost = distance * costPerKM;

        if (distance >= 0 && (flightType == 1 || flightType == 2)){
        
            if (flightType == 1){//ucus tek yon ise
                if (age <= 12){
                    flightCost -= (flightCost * 0.50);//yas 12 den ufak ise %50 indirim yapıyoruz.
                } else if (age > 12 && age < 24) {
                    flightCost -= (flightCost * 0.10);//yas 12 ile 24 araliginda ise %10 indirim yapıyoruz.
                } else if (age > 65) {
                    flightCost -= (flightCost * 0.30);}//yas 65 den buyuk ise %30 indirim yapıyoruz.
            }
            
            else if (flightType == 2){//ucus gidis donus ise
                if (age <= 12){
                    flightCost -= (flightCost * 0.50);//yas 12 den ufak ise %50 indirim yapıyoruz.
                } else if (age > 12 && age < 24) {
                    flightCost -= (flightCost * 0.10);//yas 12 ile 24 araliginda ise %10 indirim yapıyoruz.
                } else if (age > 65) {
                    flightCost -= (flightCost * 0.30);}//yas 65 den buyuk ise %30 indirim yapıyoruz.
                flightCost -= (flightCost * 0.20);
            }
            System.out.println("Toplam tutar = " + flightCost + " TL ");}
        else {
            System.out.println("Hatali Veri Girdiniz !");
        }

    }
}
