package arbolito;

public class NodoBinario {
	private int dato;
	private NodoBinario izq;
	private NodoBinario der;
	public NodoBinario(int dato) {
		this.dato = dato;
		this.izq = null;
		this.der = null;
	}
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public NodoBinario getIzq() {
		return izq;
	}
	public void setIzq(NodoBinario izq) {
		this.izq = izq;
	}
	public NodoBinario getDer() {
		return der;
	}
	public void setDer(NodoBinario der) {
		this.der = der;
	}
	
	

}
