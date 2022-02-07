import React from "react";

export default function Promocao() {
    return (
        
         <div className="container">
             
             <h2 className="display-4 text-center">Promoções</h2>
        <hr/>
             
                 
        
             <div className="hcaixa container">
        
                     <h1>Rio de Janeiro</h1>
                     <img src="https://images.pexels.com/photos/6580700/pexels-photo-6580700.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940" width={400}  className="img-fluid border border-dark rounded" alt="" srcset="" />
                     <h5>3 diarias</h5>
                     <h6>De <span className="risco">R$ 599,00</span> </h6>
                     <h2>R$ 399,00</h2>
                     <button className="btn btn-warning btn-lg" >Comprar</button>
                     
             </div>
        
             <div className="hcaixa container">
        
                <h1>Inglaterra</h1>
                <img src="https://images.pexels.com/photos/9825792/pexels-photo-9825792.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940" width={400} className="img-fluid border border-dark rounded" alt="" srcset="" />
                <h5>7 diarias</h5>
                <h6>De <span className="risco">7.000,00</span> </h6>
                <h2>R$ 5.000,00</h2>
                <button className="btn btn-warning btn-lg">Comprar</button>
        </div>
        
        <div className="hcaixa container">
        
            <h1>Dubai</h1>
            <img src="https://images.pexels.com/photos/162031/dubai-tower-arab-khalifa-162031.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940" width={400} className="img-fluid border border-dark rounded" alt="" srcset="" />
            <h5>5 diarias</h5>
            <h6>De <span className="risco">R$ 9.000,00</span> </h6>
            <h2>R$ 7.000,00</h2>
            <button className="btn btn-warning btn-lg">Comprar</button>
        </div>
        
            
        
            
            </div>
    );
}