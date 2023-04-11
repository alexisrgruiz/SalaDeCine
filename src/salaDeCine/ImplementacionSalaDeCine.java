package salaDeCine;

public class ImplementacionSalaDeCine {
	public static void main(String[] args) {
		
		SalaDeCine sala = new SalaDeCine(20,3);
		
		
		sala.mostrarSala();
		System.out.println("la sala " + (sala.isSalaVacia() == true ? "esta " : "no esta ") + "vacia.");
		
		sala.salaRandom();
		sala.mostrarSala();
		System.out.println("la sala " + (sala.isSalaVacia() == true ? "esta " : "no esta ") + "vacia.");
		
		
		System.out.println();
		
		if(sala.isButacaOcupada(1, 1)) {
			System.out.println("la butaca esta ocupada.");
		}else System.out.println("la butaca esta desocupada.");
		if(sala.isButacaOcupada(1, 2)) {
			System.out.println("la butaca esta ocupada.");
		}else System.out.println("la butaca esta desocupada.");
		if(sala.isButacaOcupada(1, 3)) {
			System.out.println("la butaca esta ocupada.");
		}else System.out.println("la butaca esta desocupada.");
		if(sala.isButacaOcupada(2, 1)) {
			System.out.println("la butaca esta ocupada.");
		}else System.out.println("la butaca esta desocupada.");
		if(sala.isButacaOcupada(2, 2)) {
			System.out.println("la butaca esta ocupada.");
		}else System.out.println("la butaca esta desocupada.");
		
		System.out.println();
		
		System.out.println("la butaca " + (sala.ocuparButaca(1, 1) == true ? "fue ocupada satisfactoriamente.":"ya estaba ocupada."));
		
		System.out.println("la butaca " + (sala.ocuparButaca(1, 2) == true ? "fue ocupada satisfactoriamente.":"ya estaba ocupada."));
		
		System.out.println("la butaca " + (sala.ocuparButaca(1, 3) == true ? "fue ocupada satisfactoriamente.":"ya estaba ocupada."));
		
		System.out.println("la butaca " + (sala.ocuparButaca(2, 1) == true ? "fue ocupada satisfactoriamente.":"ya estaba ocupada."));
		
		sala.mostrarSala();
		
		System.out.println(sala.hayEspacioPara(1) == true ? "hay espacio" : "no hay espacio");
		System.out.println(sala.hayEspacioPara(2) == true ? "hay espacio" : "no hay espacio");
		System.out.println(sala.hayEspacioPara(3) == true ? "hay espacio" : "no hay espacio");
		System.out.println(sala.hayEspacioPara(4) == true ? "hay espacio" : "no hay espacio");
		System.out.println(sala.hayEspacioPara(5) == true ? "hay espacio" : "no hay espacio");
		System.out.println(sala.hayEspacioPara(6) == true ? "hay espacio" : "no hay espacio");
		System.out.println(sala.hayEspacioPara(7) == true ? "hay espacio" : "no hay espacio");
		System.out.println(sala.hayEspacioPara(8) == true ? "hay espacio" : "no hay espacio");
		System.out.println(sala.hayEspacioPara(9) == true ? "hay espacio" : "no hay espacio");
		System.out.println(sala.hayEspacioPara(10) == true ? "hay espacio" : "no hay espacio");
		System.out.println("cantidad de butacas ocupadas: " + sala.cantButacasOcupadas());
	}
}
