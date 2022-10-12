import './App.css';
import Header from './components/Header';
import Footer from './components/Footer';
import { useState } from 'react';
import Invoices from './components/Invoices';
import { getInvoices } from './services/InvoiceData';
import Invoice from './components/Invoice';
import { getCustomers } from './services/CustomerData';
import { getBillables } from "./services/BillableData"
import { getLineItems } from "./services/LineItemData"

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
      <Header />
      <Invoices retrieveInvoices={retrieveInvoices} invoices={invoices} setInvoices={setInvoices} />
      <Footer />
    </div>
  );
}

export default App;
