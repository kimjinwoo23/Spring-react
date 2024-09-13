import React,{useState,useEffect} from "react";
import axios from "axios";
import { useLocation } from "react-router-dom";

const SearchResult=()=>{

    const [chickens,setchickens]= useState([]);

    const location = useLocation();

    const query = new URLSearchParams(location.search).get("query");

    useEffect(()=>{
        if(query){
            axios.get(`http://localhost:9090/api/chicken/search?query=${query}`)
            .then((response)=>setchickens(response.data))
            .cahch((error)=>console.error("에러",error))
        }
    },[query]);

    return(
        <div className="chicken-list">
            <h2>검색결과 : "{query}"</h2>
            {chickens.length >0 ?(
                chickens.map((chickens)=>(
                <div key={chickens.id}className="chicken-item">
                    <h3>{chickens.chickenName}</h3>
                    <p>{chickens.desricption}</p>
                    <p>{chickens.price}</p>
                    </div>
            ))
            ):(
                <div>
                    <p>검색결과 없음</p>
                </div>
            )};
        </div>
       
        )
}
export default SearchResult;