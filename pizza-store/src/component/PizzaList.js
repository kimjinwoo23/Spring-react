import React,{useState,useEffect} from "react"
import axios from "axios";

const PizzaList= ()=>{
    const [Pizzas,setPizzas] = useState([]);

    useEffect(
        axios.get("http://localhost:9090/api/pizza")
        .then(response=>{
            setPizzas(response.data);
        })
        .catch(e=>alert("문제발생"))
    )

    return(
        <div className="pizza-container">
            <h1>피자메뉴</h1>
            <ul>
                {Pizzas.map(Pizza(pizza=>(
                    <li key={setPizzas}>
                        <div className="pizza-name">{pizza.name}</div>
                        <div className="pizza-desciption">{pizza.desciption}</div>
                        <div className="pizza-price">{pizza.price}</div>
                        <button>상세보기</button>
                    </li>
                )))}
            </ul>

        </div>
    )
}



export default PizzaList