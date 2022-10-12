import { React, useEffect } from 'react'
import Customer from './Customer'

const Customers = (props) => {
    const customersArray = Array.from(props.customers)

    useEffect(() => {
        props.retrieveCustomers();
    }, []);

  return (
    <div>
        {customersArray.map(customer => (
            <span key={customer.customerId} >
                <Customer customer={customer} />
            </span>
        ))}
    </div>
  )
}

export default Customers