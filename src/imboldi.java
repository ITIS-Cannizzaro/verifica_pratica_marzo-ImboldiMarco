import java.util.Scanner;
import java.util.Random;
public class imboldi
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{   
		System.out.println("+-------------------------+");
		System.out.println("| verifica di informatica |");
		System.out.println("+-------------------------+");


		System.out.println("+-----------------------------------+");
		System.out.println("| pigiare 1 per l'esercizio uno     |");
		System.out.println("| pigiare 2 per l'esercizio due     |");
		System.out.println("| pigiare 3 per l'esercizio tre     |");
		System.out.println("| pigiare 4 per l'esercizio quattro |");		
		System.out.println("| (il 4 non è collaudato)           |");		
		System.out.println("+-----------------------------------+");


		int scelta = in.nextInt();
		switch(scelta)
		{
		case 1:
			es1();
			break;
		case 2:
			es2();
			break;
		case 3:
			es3();
			break;
		case 4:
			es4();
			break;
		case 5:
			System.out.println("Scelta errata, riprova!");
			break;
		case 6:
			System.out.println("Scelta errata, riprova!");
			break;
		case 7:
			System.out.println("Scelta errata, riprova!");
			break;
		case 8:
			System.out.println("Scelta errata, riprova!");
			break;
		}
	}
	public static void es1()
	{	
		int[] array = new int[10];
		Random random = new Random();
		// Riempimento dell'array con numeri
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = random.nextInt(11) - 5;
		}
		// Stampa l'array
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		// calcola l'indice del valore minimo
		int minimo = 0;
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i] < array[minimo]) 
			{
				minimo = i;
			}
		}
		System.out.println("Valore minimo: " + array[minimo]);
		System.out.println("Indice del valore minimo: " + minimo);
		// calcola dove spunta la prima volta il numero minimo
		int primaPosizione = minimo;
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i] == array[minimo]) 
			{
				primaPosizione = i;
				break;
			}
		}
		System.out.println("Prima occorrenza del valore minimo: " + primaPosizione);
	}
	public static void es2()
	{
		String[] parole = {"cane", "gatto", "uccello", "pesce", "pietro"};      
		Scanner scanner = new Scanner(System.in);
		int tentativiRimasti = 3;
		while (tentativiRimasti > 0)                  
			System.out.print("Indovina una delle seguenti parole: ");
		for (int i = 0; i < parole.length; i++) 
		{
			System.out.print(parole[i] + " ");
		}
		System.out.println();
		System.out.print("Tentativi rimasti: " + tentativiRimasti + ". Inserisci la parola: ");
		String parolaIndovinata = scanner.nextLine();  
		boolean parolaTrovata = false;
		for (int i = 0; i < parole.length; i++) 
		{
			if (parole[i].equalsIgnoreCase(parolaIndovinata)) 
			{
				parolaTrovata = true;
				break;
			}
		}
		if (parolaTrovata) 
		{
			System.out.println("Bravo, hai indovinato!");
			return;
		} 
		else 
		{
			tentativiRimasti--;
			if (tentativiRimasti > 0) 
			{
				System.out.println("La parola inserita non è corretta. Riprova.");
			} 
			else 
			{
				System.out.println("Hai esaurito i tentativi disponibili. La parola corretta era: " + parole[0]);
			}
		}      
	}
	public static void es3()	
	{
		int[] numeri = new int[20];
		for (int i = 0; i < numeri.length; i++) 
		{
			numeri[i] = (int) (Math.random() * 100) + 1;
		}        
		System.out.println("Numeri generati:");
		for (int i = 0; i < numeri.length; i++) 
		{
			System.out.print(numeri[i] + " ");
		}
		System.out.println();        
		int[] pari = new int[numeri.length];
		int j = 0;
		for (int i = 0; i < numeri.length; i++) 
		{
			if (numeri[i] % 2 == 0) {
				pari[j] = numeri[i];
				j++;
			}
		}        
		if (numeri.length/2==1)
		{
			System.out.println();
		}             
		System.out.println("Numeri pari in ordine crescente:");
		for (int i = 0; i < j; i++) 
		{
			System.out.print(pari[i] + " ");
		}
		System.out.println();
	}
	public static void es4()
	{		
		int[] array1 = new int[50];
		int[] array2 = new int[8];
		Random random = new Random();		        
		for (int i = 0; i < array1.length; i++) 
		{
			array1[i] = random.nextInt(100) + 1;
		}		        
		for (int i = 0; i < array2.length; i++) 
		{
			for (int j = 2; j <= 10; j++) 
			{		            	
				if (array1[i] % j == 0) 
				{
					array2[j-2]++;
				}
			}
		}		        
		System.out.println("array1:");
		for (int i = 0; i < array1.length; i++) 
		{
			System.out.print(array1[i] + " ");
		}
		System.out.println("\narray2:");
		for (int i = 0; i < array2.length; i++) 
		{
			System.out.print(array2[i] + " ");
		}
	}
}	