/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan33.userlogin;
import java.util.Scanner;
/**
 *
 ** @author
 * NAMA			: Michael Nagaku Milenn Salim
 * KELAS		: IF-1
 * NIM			: 10118008
 * Deskripsi Program	: program login
 */
public class IF110118008Latihan33UserLogin {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		User user = new User("RizkiAdam", "terbaikselalu");
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan Username = ");
		String usName = sc.next();
		System.out.print("Masukkan Password = ");
		String passWord = sc.next();
		user.pengecekkanLogin(usName, passWord);
	}
	
}
