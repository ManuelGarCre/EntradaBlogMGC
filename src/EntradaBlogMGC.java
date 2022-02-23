/**
 * Clase para manejar las entradas de un blog.
 * @author Manuel García Cremades
 * @version 2.3
 * @since 23/02/2022
 */
public class EntradaBlogMGC {
	
	/**
	 * Atributo separador de la clase EntradaBlogMGC
	 * Es el cáracter que separa ENTRADA DE del nombre del autor
	 */
	public static char separador=':';
	
	/**
	 * Atributo id de la clase EntradaBlogMGC
	 * Es el número de la entrada del blog creada
	 */
	private int id;
	
	/**
	 * Atributo texto de la clase EntradaBlogMGC
	 * Es el contenido en texto de la entrada del blog
	 */
	private String texto;
	
	/**
	 * Atributo autor de la clase EntradaBlogMGC
	 * Es el creador de la entrada del blog
	 */
	private String autor;
	
	/**
	 * Constructor de la clase EntradaBlogMGC
	 * @param id numero de la entrada
	 * @param autor nombre del autor de la entrada
	 * @param texto contenido en texto de la entrada
	 * @throws IllegalArgumentException se lanza cuando el numero de entrada(id) es negativo o igual a 0
	 */
	public EntradaBlogMGC(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * Devuelve el número de la entrada
	 * @return id El número e identificador de la entrada(id)
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * Devuelve el texto completo de la entrada
	 * @return texto El contenido en texto de la entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * Devuelve el nombre del autor de la entrada en mayúsculas
	 * @return autor El creador de la entrada en mayúsculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 * @return autor El creador de la entrada
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * No tiene porqué tener argumentos
	 * @param args argumentos obtenidos al ejecutar el programa
	 */
	public static void main(String[] args) {
        
		/**
		 * Modificar
		 */
		EntradaBlogMGC e1=new EntradaBlogMGC (1,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}
