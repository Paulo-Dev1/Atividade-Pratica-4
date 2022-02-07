import React from "react";

export default function Home() {
    return (
  
        
        <div className="container ">
        <h2 className="display-4 text-center">Bem Vindo a FlyTurismo</h2>
        <p className="h2 text-center">Confira nossos principais pacotes de viagens:</p>
        <hr/>
        <p className="h2">Estamos aqui para realizar todas sua viagens tanto Internacionais quanto nacionas!</p>
        
        
        
        <div className="row m-3">
    <div class="col-sm">
    <div className="card p-3 text-center bg-info">
            <div >
               <img className="imagem" src="https://images.pexels.com/photos/1203565/pexels-photo-1203565.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940" alt=""/> 
            </div>
                <h4>Foz do Iguaçu</h4>
                <p>Passagem ida e volta</p>
                <p>Hospedagem(Hotel)</p>
                <p>Compras no Paraguai</p>
                <form>
                    <label className="text-danger">R$ 880,00</label><br />
                    <button type="button" class="btn btn-outline-danger">Comprar</button>
                </form>

                
        </div>
    </div>
    <div className="col-sm">
    <div className="card p-3 text-center bg-info">
            <div >
               <img className="imagem" src="https://images.pexels.com/photos/3411135/pexels-photo-3411135.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940" alt=""/> 
            </div>
                <h4>Disney</h4>
                <p>Passagem Áerea</p>
                <p>Quarto</p>
                <p>Orlando,EUA</p>
                <form>
                    <label className="text-danger">R$ 1119,00 + taxas</label><br />
                    <button className="btn btn-outline-danger">Comprar</button>
                </form>
        </div>
    </div>
    <div className="col-sm">
    <div className="card p-3 text-center bg-info">
            <div >
               <img className="imagem" src="https://destino.betocarrero.com.br/wp-content/uploads/2020/12/WhatsApp-Image-2020-12-29-at-16.26.27-1024x682.jpeg" alt=""/> 
            </div>
                <h4>Beto Carreiro</h4>
                <p>Passagem Áerea</p>
                <p>Hospedagem</p>
                <p>Balneário Camboriú, SC</p>
                <form>
                    <label className="text-danger">R$ 399,00</label><br />
                    <button className="btn btn-outline-danger">Comprar</button>
                </form>
        </div>
    </div>
    
    
  </div>

  
  <div class="row m-3">
    <div class="col-sm">
      
    <div className="card p-3 text-center bg-info">
            <div >
               <img className="imagem" src="https://images.pexels.com/photos/930595/pexels-photo-930595.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940" alt=""/> 
            </div>
                <h4>Madrid</h4>
                <p>Espanha</p>
                <p>Hospedagem(Hotel)</p>
                <p>Passagem</p>
                
                <form>
                    <label className="text-danger">R$ 1.599,00 + taxas</label><br />
                    <button className="btn btn-outline-danger">Comprar</button>
                </form>
        </div>
    </div>
    <div class="col-sm">
    <div className="card p-3 text-center bg-info">
            <div >
               <img className="imagem" src="https://images.pexels.com/photos/3779816/pexels-photo-3779816.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940" alt=""/> 
            </div>
                <h4>Toquio</h4>
                <p>Japão</p>
                <p>Hospedagem(Hotel)</p>
                <p>Passagem</p>
                <form>
                    <label className="text-danger">R$ 2.399,00 + taxas</label><br />
                    <button className="btn btn-outline-danger">Comprar</button>
                </form>
        </div>

    </div>

   
    <div class="col-sm">
        
    <div className="card p-3 text-center bg-info">
            <div >
               <img className="imagem" src="https://images.pexels.com/photos/1804177/pexels-photo-1804177.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940" alt=""/> 
            </div>
                <h4>Rio de Janeiro</h4>
                <p>Passagem</p>
                <p>Hospedagem(Hotel)</p>
                <p>Cristo Redentor</p>
                <form>
                    <label className="text-danger">R$ 499,00 + taxas</label><br />
                    <button className="btn btn-outline-danger">Comprar</button>
                </form>
        </div>

    
  </div>
</div>
      

      

        


    
        

        
                
            
        

    </div>




      
        
    );
}