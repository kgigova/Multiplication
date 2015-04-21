/*
 To change this template, choose Tools | Templates * and open the template in the editor. 
*/

package multiplication;

import java.util.Scanner; 
public class Multiplication {

	/** * @param args the command line arguments */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System. in );
		System.out.println("N:");
		int N = scan.nextInt();
		if (N < 0 || N > 3200000) {
			System.out.println("N trqbva da e mejdu 0 i 3200000");
			return;
		}
		string redica = "";
		int tekushtoChislo = 1;
		while (redica.Length < n) {
			redica += String.format("%d", (tekushtoChislo * tekushtoChislo));
			tekushtoChislo++
		}
		System.out.println(redica.Substring(N - 1, N));
	}

}
