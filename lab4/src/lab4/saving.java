package lab4;

public class saving {
		private String Khanbank;
		private String MNT;
		private double Zeelinhvv;
		private int Hugatsaa;
		private double Dansandahmungu;
		private double savingscalcaccrued() {
			double monthlyRate = Zeelinhvv / 12;
			double Hvv = Dansandahmungu * monthlyRate * Hugatsaa / 100;
			return Hvv;	
		}
		private double savingcalc() {
			double Hvv = savingscalcaccrued();
			double EtsiinVldegdel = Dansandahmungu + Hvv;
			return EtsiinVldegdel;
		}
		private void savingsreport() {
			double Hvv = savingscalcaccrued();
			double EtsiinVldegdel = savingcalc();
			System.out.println("Hadgalamjiin ner:" + Khanbank);
			System.out.println("Valuyt:" + MNT);
			System.out.println("Jiliin Hvv:" + Zeelinhvv);
			System.out.println("Hugatsaa Sar:" + Hugatsaa);
			System.out.println("Ehnii Vldegdel:" + Dansandahmungu);
			System.out.println("Tsuglarsan Hvv:" + Hvv);
			System.out.println("Etsiin Vldegdel:" + EtsiinVldegdel);
		}
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			test s = new test();
			System.out.println("Hadgalamjiin ner: ");
			s.Khanbank = input.nextLine();
			System.out.println("Valuyt: ");
	        s.MNT = input.nextLine();
			System.out.println("Jiliin Hvv: ");
	        s.Zeelinhvv = input.nextDouble();
			System.out.println("Hugatsaa Sar: ");
	        s.Hugatsaa = input.nextInt();
			System.out.println("Ehnii Vldegdel: ");
	        s.Dansandahmungu = input.nextDouble();
	        s.savingsreport();
		}
	}
}