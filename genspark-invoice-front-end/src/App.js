import './App.css';
import Header from './components/Header';
import Footer from './components/Footer';
import { useState } from 'react';
import Invoices from './components/Invoices';
import { getInvoices } from './services/InvoiceData';
import { getCustomers } from './services/CustomerData';
import { getBillables } from "./services/BillableData";
import { getLineItems } from "./services/LineItemData";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Customers from './components/Customers';
import Billables from './components/Billables';
import LineItems from './components/LineItems';
import Home from './components/Home';

function App() {

  const [invoices, setInvoices] = useState([])

  const retrieveInvoices = () => {
    getInvoices()
    .then(res => {
      setInvoices(res.data);
    })
    .catch(err => console.log(err.response));
  }

  const [customers, setCustomers] = useState([])

  const retrieveCustomers = () => {
    getCustomers()
    .then(res => {
      setCustomers(res.data);
    })
    .catch(err => console.log(err.response));
  }

  const [billables, setbillables] = useState([])

  const retrieveBillables = () => {
    getBillables()
    .then(res => {
      setbillables(res.data);
    })
    .catch(err => console.log(err.response));
  }

  const [lineItems, setLineItems] = useState([])

  const retrieveLineItems = () => {
    getLineItems()
    .then(res => {
      setLineItems(res.data);
    })    
    .catch(err => console.log(err.response));
  }

  return (
    <div className="App">
      <Router>
      <Header />
      <div className='container'>
        <Routes>
          <Route path='/' element={<Home />} />
          <Route path='/invoices' element={<Invoices retrieveInvoices={retrieveInvoices} invoices={invoices} setInvoices={setInvoices} /> } />
          <Route path='/customers' element={<Customers retrieveCustomers={retrieveCustomers} customers={customers} setCustomers={setCustomers} />} />
          <Route path='/billables' element={<Billables retrieveBillables={retrieveBillables} billables={billables} setBillables={setbillables} />} />
          <Route path='/lineitems' element={<LineItems retrieveLineItems={retrieveLineItems} lineItems={lineItems} setLineItems={setLineItems} />} />
        </Routes>
      </div>
      <Footer />
      </Router>
    </div>
  );
}

export default App;
