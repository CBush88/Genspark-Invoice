import React from 'react'
import Customer from './Customer';
import LineItem from './LineItem';

const Invoice = (props) => {
    const{invoiceId, customer, status, lineItems, totalPrice} = props.invoice;
  return (
    <>
        id{invoiceId}
        <br />
        Customer<Customer customer={customer} />
        <br />
        status {status}
        <br />
        Line Item{lineItems.map(lineItem => (
            <span key={lineItem.lineId}> <LineItem lineItem={lineItem} />
            </span>
        )
    )}
        <br />
        total price{totalPrice}
        <br />
    </>
  )
}

export default Invoice