/*
 To change this template, choose Tools | Templates * and open the template in the editor. 
*/

package multiplication;

import java.util.Scanner; 
public class Multiplication {

	/** * @param args the command line arguments */
	public static void main(String[] args) {
		System.out.println("N:");
		int N = scan.nextInt();
		if (N > 0 && N < 3200000) {
			String redica = "";
			int tekushtoChislo = 1;
			while (redica.length() < N) {
				redica += String.format("%d", (tekushtoChislo * tekushtoChislo));
				tekushtoChislo ++;
			}
			System.out.println(redica.substring(N - 1, N));
		} else {
			System.out.println("N trqbva da e mejdu 0 i 3200000");
		}
	}
}
