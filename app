import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Customer from './view/customer';
import User from './view/user';
import CustomerForm from './view/customer/form';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Customer />} />
        <Route path="/user" element={<User />} />
        <Route path='/form' element={<CustomerForm/>}/>
      </Routes>
    </BrowserRouter>
  );
}
export default App;
