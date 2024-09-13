import axios from "axios";
import React,{useState} from "react";

const PizzaForm = ()=>{
    const [pizzaName,setPizzaName] = useState('');
    const [pizzadescription,setPizzadescription] = useState('');
    const [pizzaprice,setPizzaprice] = useState('');

    const hendleregister= ()=>{
        axios.post('api/pizza/search')
        .then(response)
    }

    return(
        <div className="pizzaform-container">
            <label>
                메뉴이름:
                <input value={pizzaName} onChange={(e=>setPizzaName(e.target.value))}/>
            </label>
            <label>
                메뉴설명:
                <input value={pizzadescription} onChange={(e=>setPizzadescription(e.target.value))}/>
            </label>
            <label>
                메뉴가격:
                <input value={pizzaprice} onChange={(e=>setPizzaprice(e.target.value))}/>
            </label>
            <button onClick={hendleregister}>등록하기</button>
        </div>
    )
}
export default PizzaForm;