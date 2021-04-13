
public class Main {
	
	public static void main(String[] args) {
			
			Consumidor[] c = new Consumidor[2];
			
			Consumidor consumidor1 = new Consumidor();					
			consumidor1.SetNome("Josefina");
			consumidor1.setTelefone("48987654321");
			consumidor1.SetRegistrarFiado(0);
			
			Consumidor consumidor2 = new Consumidor();
			consumidor2.SetNome("Leopoldina");
			consumidor2.setTelefone("48123456789");
			consumidor2.SetRegistrarFiado(0);
				
			c[0] = consumidor1;
			c[1] = consumidor2;
			
			for(int i =0; i< c.length; i++){
				System.out.println(c[i].getNome());
				System.out.println(c[i].getFiado()[i]);
				System.out.println(c[i].getTelefone());
				  
		    }	
				        	    
			    		 	
			
		}
	
}
