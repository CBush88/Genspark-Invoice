import {React, useEffect} from 'react'
import Invoice from './Invoice';

const Invoices = (props) => {
    const invoicesArray = Array.from(props.invoices)

    useEffect(() => {
        props.retrieveInvoices();
    }, []);

  return (
    <div>
        {
            invoicesArray.map(invoice => (
                <span key={invoice.invoiceId}>
                <Invoice invoice={invoice} />
                </span>
            ))}
    </div>
  )
}

export default Invoices