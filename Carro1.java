
public class Carro1 {
    public String modelo;
    public String cor;
    int marcha;
    double velocidade;
            
    
    
    
public void Acelerar() {
     
    
    velocidade += marcha * 20;
        System.out.println("velocidade" + velocidade);
        
        
}


public void Frear() {
    
    velocidade -= marcha * 10;
}
   
     
    
    
    public static void main(String[] args) {
        
        Carro1 gol = new Carro1();
        
            gol.modelo = "Gol";
            gol.cor ="Vermelho";
            
            
        Carro1 uno = new Carro1();
        
            uno.modelo = "Uno";
            uno.cor = "Amarelo";
            
            
        Carro1 ka = new Carro1();
        
        
            ka.modelo = "Ka";
            ka.cor = "Azul";
            
            
      
            
            
        
                    
            
    
            
   
    }
        
    }

        
        
         
        
    
    

