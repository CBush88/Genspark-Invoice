import React from 'react'
import Customer from './Customer';
import LineItem from './LineItem';

const Invoice = (props) => {
    const{invoiceId, customer, status, lineItems, totalPrice} = props.invoice;
  return (
    <>
        Invoice Number: {invoiceId}
        <br />
        Status: {status}
        <br />
        Customer: <Customer customer={customer} />
        <br />
        Line Items: {lineItems.map(lineItem => (
            <span key={lineItem.lineId}> <LineItem lineItem={lineItem} />
            </span>
        )
    )}
        <br />
        Total Price: {totalPrice}
        <br />
    </>
  )
}

export default Invoice