import React from "react";

export default function AreaCliente() {
    return (
      
         <div className="container">
              <h2 className="display-4 text-center">DUVIDAS SOBRE VIAGENS?</h2>
            <hr/>

                <div className="a-c">
                    <h3 className="a-ctitulo">Reembolso</h3>
                    <p>Para solicitar o cancelamento de um bilhete, o titular pagante pode acessar o formulário de autoatendimento acima. O valor líquido de reembolso é igual ao valor total pago pelo(s) bilhete(s) = (tarifa + taxas), subtraído do valor da multa cobrada.</p>
        
                       <p> ATENÇÃO: Os reembolsos referentes a cancelamentos de voos que ocorrerem no período de 31 de Dezembro de 2020 a 31 de outubro de 2021, respeitarão o prazo disposto na Medida Provisória 1.024, publicada pelo Governo Federal em 31 de dezembro de 2020. Esta medida altera a Lei Federal n° 14.034 e determina que os estornos poderão ser realizados em até 12 meses a partir da data do embarque.
                        Saiba mais acessando nossas Regras de Cancelamento e Reembolso.</p>
                </div>   
        
                <div className="a-c">
                    <h3 className="a-ctitulo">Remarcação</h3>
                    <p>Caso não possa viajar na data e/ou horário adquirido(s), recomendamos que solicite o cancelamento por meio de nossa opção de atendimento acima.
                        Se você está no aeroporto, recomendamos tentar a reacomodação no balcão da cia. aérea.
                        Caso prefira nosso auxílio ou se seu voo for em uma data futura, acesse nossa opção de atendimento acima.</p>
        
                       
                </div> 
                
                <div className="a-c">
                    <h3 className="a-ctitulo">Animais de estimação</h3>
                    <p>Para viajar com animais, é necessário entrar em contato com a companhia aérea para verificar as condições desse transporte</p>
        
                       
                </div> 
        
                <div className="a-c">
                    <h3 className="a-ctitulo">Deixe seu comentario.</h3>
        
                    <form >
                        <textarea name="" id="" cols="30" rows="10"></textarea>
                        <br/>
                        <button onclick="">Enviar</button>
                    </form>
        
                       
                </div> 
        
                
        
        
            
        
            
            </div>
    );
}