package unico;

public class Ej_04 {

	public static void main(String[] args) {
		/* Implementar un método recursivo que realice la división entera de dos números (sin utilizar el operador /).
Nota: El resultado de la división se corresponde con el número de veces que puedo restar al dividendo, el divisor.
Para resolver 13/4, vemos que puedo realizar la resta 3 veces, hasta que el resultado ya no es mayor o igual que el divisor:

13 / 4 →  (1ª vez: 13-4=9) → (2ª vez: 9-4=5) → (3ª vez: 5-4=1) → resultado = 3

Ayuda para el pensamiento recursivo: siempre que el dividendo sea mayor que el divisor → 13/4 = 1+ ((13-4)/4)

*/
		int n1;
		int n2;
		int res;
		n1=Util.leerInt("Escribe un número: ");
		n2=Util.leerInt("Escribe otro número: ");
		
	}
	public static int division(int n1, int n2) {
		int res;
		if(n1<n2 ) {
			res=0;
		}else {
			res= 1 + division(n1-n2,n2);
		}
		return res;
		
	}
}
