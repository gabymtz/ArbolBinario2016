package arbolito;

public class ArbolBinario {
	
	private NodoBinario raiz;

	public ArbolBinario() {
		this.raiz = null;
	}
	public boolean crearArbolBinario(int d) {
		boolean respuesta=false;
		if(this.raiz==null) {
			this.setRaiz(new NodoBinario(d));
			respuesta=true;
		}		
		return respuesta;
	}
	public void insertarElemento(int d, NodoBinario r) {
		if(r.getIzq()==null) {
			r.setIzq(new NodoBinario(d));
		}else if(r.getDer()==null) {
			r.setDer(new NodoBinario(d));
		}else {
			if(this.contarArbolBinario(r.getIzq())<=this.contarArbolBinario(r.getDer())) {
				this.insertarElemento(d, r.getIzq());
			}else {
				this.insertarElemento(d, r.getDer());
			}
		}
	}
	public int contarArbolBinario(NodoBinario r) {
		if(r==null) {
			return 0;
		}else {
			return 1 + this.contarArbolBinario(r.getIzq()) + this.contarArbolBinario(r.getDer());
		}
		
	}

	public NodoBinario getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoBinario raiz) {
		this.raiz = raiz;
	}
	
}
