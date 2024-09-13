import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <h1>조회</h1>
      <div>
        {DataTransfer.map((item,index)=>(
          <div key={index} className='card'>
            </div>
        ))}
      </div>
    </div>
  );
}

export default App;
