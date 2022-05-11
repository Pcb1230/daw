import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Jugador.nomJugador.add("Pedro");
		Jugador.nomJugador.add("Adri");
		Jugador.nomJugador.add("Francesco");
		Jugador.nomJugador.add("Rober");
		Jugador.dorJugador.add(7);
		Jugador.dorJugador.add(69);
		Jugador.dorJugador.add(45);
		Jugador.dorJugador.add(30);
		Jugador.nacionalidad.add("espanol");
		Jugador.nacionalidad.add("espanol");
		Jugador.nacionalidad.add("italiano");
		Jugador.nacionalidad.add("americano");
		int opcion;
		String nombre;
		int dorsal;
		do {
		System.out.println("------------------------------------");
		System.out.println("Que quiere hacer?\n"
				+ "1.Añadir Jugador\n"
				+ "2.Añadir Jugador al principio\n"
				+ "3.Mostrar los dorsales de los Jugadores ordenados\n"
				+ "4.Ver cuantos jugadores hay de cada nacionalidad\n"
				+ "5.Mostrar Jugadores\n"
				+ "6.Salir");
		opcion=sc.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("------------------------------------");
			System.out.println("Introduce el nombre");
			nombre=sc.next();
			System.out.println("Introduce el dorsal");
			dorsal=sc.nextInt();
			Jugador.anadirJugador(nombre,dorsal);
			break;
		case 2:
			System.out.println("------------------------------------");
			System.out.println("Introduce el nombre");
			nombre=sc.next();
			System.out.println("Introduce el dorsal");
			dorsal=sc.nextInt();
			Jugador.anadirJugador(nombre,dorsal);
			break;
		case 3:
			System.out.println("------------------------------------");
			System.out.println("Jugadores:\n");
			Jugador.ordenarJugadores();
		case 4:
			System.out.println("------------------------------------");
			Jugador.mostrarNacionalidad();
		case 5:
			System.out.println("------------------------------------");
			System.out.println("Jugadores:\n");
			Jugador.mostrarJugadores();
			}
		}while(opcion!=6);


	}

}
