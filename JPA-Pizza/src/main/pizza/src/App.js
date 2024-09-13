import {BrowserRouter as Router,Route,Routes} from 'react-router-dom'
import './App.css';
import PizzaList from './component/PizzaList';

function App() {
  return (
   <Router>
    <PizzaRouter />
    <Routes>
      <Route path='/' element={<PizzaList />} />
      <Route path='/pizza-detail' element={<PizzaSearch />} />
      <Route path='/search' element={<PizzaSearch />} />
    </Routes>
   </Router>
  );
}

export default App;
