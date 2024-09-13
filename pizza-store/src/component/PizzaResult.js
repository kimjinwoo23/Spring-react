import { useEffect, useState } from "react";
import { useLocation } from "react-router-dom";


const PizzaResult= ()=>{
const [pizzas,setPizzas]= useState([]);
//useLocaion=현재 페이지의 정보를 가지고있음 : 경로나 검색된문자들
const location = useLocation();
const query = new URLSearchParams(location.search).get("query");

    useEffect(()=>{
        if(query){
            axios.get(`htttp://localhost:9090/api/pizza/search?query=${query}`)
            .then((response)=>setPizzas(response.data))
            .catch((e)=>console.error("긴급상황입니다 슈우우웅",e));
        }
    },[query])

    return(
        <div className="pizza-search-list">
            <h1>검색결과 : </h1>
            {pizzas.length>0 ? (pizzas.map)
            .then((response)=>response.data
            ):(
             alert("검색결과가 존재하지않습니당 ")   
            
        )}
        </div>
    )
}
export default PizzaResult;