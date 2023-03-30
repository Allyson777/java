
public class PrimeiroApp{
    public static void main(String[] args){
        
    
	Carro meuCarro= new Carro();
	meuCarro.modelo = "Opala";
	System.out.println(meuCarro.modelo);
	
	Propietario dono = new Propietario();
	dono.nome="Allyson";
	dono.meuCarro= meuCarro;
	
	}
}
