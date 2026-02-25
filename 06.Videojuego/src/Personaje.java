public class Personaje {
	protected String nombre;
	protected int nivel;
	protected int hp;
	protected int xp;
        
        public Personaje(String nombre){
            this.nombre = nombre;   
            this.xp = 0;
            this.nivel = 1;
            this.hp = 0;            
        }
        
	public void caminar(String direccion) {
            System.out.println("El personaje " + this.nombre 
                             + " camina hacia " + direccion);
	}
	
	public void atacar(Personaje contrincante) {
	
	}
	
	public void morir() {
	
	}
}
