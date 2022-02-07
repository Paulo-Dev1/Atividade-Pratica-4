import React from "react";


export default function Contato() {
    return (
 
  <div className="container bg-light mb-3 p-5">       
  <h2 className="display-4 text-center">Contatos</h2>
    <hr/>
<h3>Email :<span> flyturismo@flyturismo.com.br</span></h3>

<br/>
<h3>Telefones:</h3>
<p>(21) 9999-99999</p>
<p>(21) 8888-99999</p>
<p>(21) 7777-99999</p>
<br/><br/>
<hr/>
<br/><br/>
<h3>Se preferir deixei suas Informações</h3>
<br/>
<form >
    Nome: <input className="form mr-3" type="text"/>
    Sobrenome: <input className="form" type="text"/><br/><br/>
    Mensagem:<br/><textarea className="form" name="" id="" cols="30" rows="10"></textarea><br/>
    <button type="button" class="btn btn-outline-primary">Enviar</button>

</form>
  </div>
    );
}