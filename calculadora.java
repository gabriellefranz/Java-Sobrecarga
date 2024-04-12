package calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner teclado = new Scanner (System.in);
		System.out.println("digite a operação\n"
				           +"1-adição dois valores inteiros\n"
				           +"2-subtração\n"
				           +"3-multiplicação\n"
				           +"4-divisão\n"
				           +"5-exponenciação\n"
				           +"6-fatorial\n"
				           +"7-adição três valores\n"
				           +"8-adição dois valores texto");
		
		int tipo = teclado.nextInt();
		System.out.println("digite o valor 1");
		int valor1 = teclado.nextInt();
		int valor2 = 0;
		if (tipo != 5 && tipo != 6) {
			System.out.println("digite o valor 2");
			valor2 = teclado.nextInt();
		}
		teclado.close();
		
		Operacao operacao = new Operacao();
		
		switch (tipo) {
		case 1 : System.out.println("adição 2 valores inteiros =" + operacao.soma(valor1, valor2)); break;
		case 2 : operacao.setMinuendo(valor1);
		         operacao.setSubtraendo(valor2);
		         System.out.println("Subtração="+ operacao.subtracao());
		         break;
	    case 3 : operacao.setNumeroGenerico1(valor1);
	             operacao.setNumeroGenerico1(valor2);
	             System.out.println("multiplicação="+(valor1*valor2));
	    case 4 : operacao.setNumeroGenerico1(valor1);
	             operacao.setNumeroGenerico1(valor2);
	             System.out.println("divisão="+(valor1/valor2));
	             break;
	    case 5 : System.out.println("Exponenciacao = TA COM VOCÊ COLEGA!"); break;
	    case 6 : operacao.setFatorial(valor1);
	             System.out.println("Fatorial="+ operacao.getFatorial());
	    case 7 : System.out.println("adição 3 valores="+operacao.soma(valor1, valor2,78)); break;
	    case 8 : System.out.println("adição 2 valores textos="+operacao.soma(Integer.toString(valor1), Integer.toString(valor2))); break;
	    default : System.out.println("operação invalida!");
	             
		}
		
	}

}
