import React from "react";
import { Link } from "react-router-dom";


export default function Menu() {
    return (

    <div>
        
        <div className="topo-site">


        <h1><span className="titulo-Fly">Fly</span>Turismo</h1>
        
        
        <nav class="navbar navbar-expand-lg navbar-light ">
  <a class="navbar-brand" href="#"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Alterna navegação">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse " id="navbarNav">
    <ul class="navbar-nav menu1">
      <li class="nav-item active">
      <Link to="/">Home</Link>
      </li>
      <li class="nav-item">
      <Link to="/Destino">Destinos</Link>
      </li>
      <li class="nav-item">
      <Link to="/Hospedagem">Hospedagem</Link>
      </li>
      <li class="nav-item">
      <Link to="/AreaCliente">Área do Cliente</Link>
      </li>
      <li class="nav-item">
      <Link to="/Promocao">Promoções</Link>
      </li>
      <li class="nav-item">
      <Link to="/Contato">Contatos</Link>
      </li>
    </ul>
  </div>
</nav>

           
        


        </div> 
    </div>
       
    );
}