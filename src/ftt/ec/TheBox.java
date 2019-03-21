package ftt.ec;

/* Reference: Java Autoboxing Unboxing:
 * 
 * https://www.devmedia.com.br/autoboxing-e-unboxing-em-java/28620
 * https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
 * https://goalkicker.com/JavaBook/JavaNotesForProfessionals.pdf
 * 
 * 
 * 	Tipo Primitivo	Classe Wrapper (Empacotador)
 * 	boolean			Boolean
 *	byte			Byte
 * 	char			Character
 *	float			Float
 *	int				Integer
 *	long			Long
 *	short			Short
 *
 * 
 */

public class TheBox {

	public static void main(String[] args) {
		
		//Autoboxing
		Integer auto = 9;
		
		//Unboxing
		int in = new Integer(9);

		System.out.println(auto * in);
		
		if (in == auto) 
            System.out.println("Value of int = " + in); 
		
		
		int a = 10;
		Integer b = new Integer(20);
		
		
		System.out.println(a+b);
		
		System.out.println(Integer.parseInt("22"));
		
		b=0;
		
		for (int i=0; i<100; i++)
			b += i;
		
		System.out.println(b);
		
		List<Integer> li = new ArrayList<>();
		for (int i = 1; i < 50; i += 2) {
		    li.add(i);
		}
		
	}
	

}
