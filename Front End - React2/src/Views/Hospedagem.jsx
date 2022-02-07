import React from "react";

export default function Hospedagem() {
    return (

 <div className="container">
     
             <h2 className="display-4 text-center">Hospedagens</h2>
<hr/>
     
         

     <div className="hcaixa container">

             <h4 className="h1">Hotel</h4>
             <img src="https://media-cdn.tripadvisor.com/media/photo-s/16/1a/ea/54/hotel-presidente-4s.jpg" width={400} className="img-fluid border border-dark rounded" alt="" srcset="" />
             <h5>3 diarias</h5>
             <h6>A partir de </h6>
             <h2>R$ 399,00</h2>
             <button className="btn btn-warning btn-lg" >Comprar</button>
             
     </div>

     <div className="hcaixa container">

        <h4 className="h1">Resort</h4>
        <img src="https://images.pexels.com/photos/261204/pexels-photo-261204.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940" width={400} className="img-fluid border border-dark rounded" alt="" srcset="" />
        <h5>7 diarias</h5>
        <h6>A partir de </h6>
        <h2>R$ 1.500,00</h2>
        <button className="btn btn-warning btn-lg">Comprar</button>
</div>

<div className="hcaixa container">

    <h4 className="h1">Cobertura</h4>
    <img src="https://imgbr.imovelwebcdn.com/avisos/2/29/30/35/82/97/1200x1200/1033561196.jpg" width={400} className="img-fluid border border-dark rounded" alt="" srcset="" />
    <h5>1 diarias</h5>
    <h6>A partir de </h6>
    <h2>R$ 800,00</h2>
    <button className="btn btn-warning btn-lg">Comprar</button>
</div>

    

    
    </div>
    );
}