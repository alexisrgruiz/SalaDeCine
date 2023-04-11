package salaDeCine;

public class SalaDeCine {
	private int butacas;
	private int filas;
	private boolean[][] sala;
	
	public SalaDeCine(int butacas, int filas) {
		
		this.butacas = butacas;
		this.filas = filas;
		
		int columnas;
		
		if(this.butacas % this.filas != 0) {
			
			columnas = (this.butacas/this.filas)+1;
			this.sala = new boolean[this.filas][];
	
			for(int i = 0; i < this.filas-1; i++) {
				this.sala[i] = new boolean[columnas];
			}
			
			this.sala[this.filas-1] = new boolean[columnas-((this.filas*columnas)-this.butacas)];
		}else {
			columnas = this.butacas/this.filas;
			this.sala = new boolean[this.filas][columnas];
		}
		
		inicializarSala();
	}
	
	public void inicializarSala() {
		for(int i = 0; i < filas ; i++) {
			for(int j = 0 ; j < sala[i].length; j++) {
				sala[i][j] = true;
			}
		}
	}
	
	public static boolean getRandomBoolean() {
	       return Math.random() < 0.5;
	   }
	
	public void salaRandom() {
		for(int i = 0; i < filas ; i++) {
			for(int j = 0 ; j < sala[i].length; j++) {
				sala[i][j] = getRandomBoolean();
			}
		}
	}
	
	public boolean isButacaOcupada(int fila, int asiento) {
		return !this.sala[fila-1][asiento-1];
	}
	
	public boolean isSalaVacia() {
		
		for(int i=0; i < filas-1; i++) {
			for(int j = 0; j < sala[i].length;j++) {
				if(!sala[i][j])
					return sala[i][j];
			}
		}
		return true;
	}
	
	public boolean ocuparButaca(int fila, int asiento) {
		
		if(isButacaOcupada(fila,asiento)) {
			return false;
		}else {
			sala[fila-1][asiento-1] = false;
			return true;
		}
	}
	
	public int cantButacasOcupadas() {
		int cantOcupadas = 0;
		
		for(int i=0; i < filas; i++) {
			for(int j = 0; j < sala[i].length;j++) {
				if(!sala[i][j])
					cantOcupadas++;
			}
		}
		
		return cantOcupadas;
	}
	
	public boolean hayEspacioPara(int cant) {
		
		
		boolean spaceFound = false;
		
		if(sala[0].length < cant)
			return false;
		
		for(int i=0; i < filas; i++) {
			for(int j = 0; j < sala[i].length;j++) {
				if(sala[i][j]) {
					
					if(j+cant-1 >= sala[i].length) continue;
					
					else {
						
						int x = j;
						
						while(x < j+cant) {
							if(!sala[i][x])
								break;
							x++;
						}
						
						if(x == j+cant) {
							spaceFound= true;
							break;
						}
							
						else
							j = x;
					}
				}
			}
			if(spaceFound)
				break;
		}
		
		return spaceFound;
	}
	
	public void mostrarSala() {
		for(int i=0; i < filas; i++) {
			for(int j = 0; j < sala[i].length;j++) {
				if(sala[i][j]) System.out.print("O" + "\t");
				else System.out.print("X" + '\t');
			}
			System.out.println();
		}
	}
}
