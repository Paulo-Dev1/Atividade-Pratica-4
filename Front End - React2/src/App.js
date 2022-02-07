import { BrowserRouter, Route, Routes } from "react-router-dom";
import Menu from "./Components/Menu";
import Footer from "./Components/Footer";
import Home from "./Views/Home";
import Destino from"./Views/Destino";
import Hospedagem from "./Views/Hospedagem";
import AreaCliente from "./Views/AreaCliente";
import Promocao from "./Views/Promocao";
import Contato from "./Views/Contato";
import "./assets/style/Estilo.css"

function App() {
  return (
    <BrowserRouter >
    <Menu/>
    <Routes>
     <Route path="/" element={<Home/>} />
     <Route path="/Destino" element={<Destino/>} />
     <Route path="/Hospedagem" element={<Hospedagem/>} />
     <Route path="/AreaCliente" element={<AreaCliente/>} />
     <Route path="/Promocao" element={<Promocao/>} />
     <Route path="/Contato" element={<Contato/>} />
     </Routes>
     <Footer/>
    </BrowserRouter>
  );
}

export default App;
