import { React, useEffect } from 'react'
import Customer from './Customer'

const Customers = (props) => {
    const customersArray = Array.from(props.customers)

    useEffect(() => {
        props.retrieveCustomers();
    }, []);

  return (
    <table className='table table-striped table-sm'>
        <thead>
            <tr>
                <th style={{width:"15%"}}>
                    First Name
                </th>
                <th style={{width:"15%"}}>
                    Last Name
                </th>
                <th style={{width:"15%"}}>
                    Email Address
                </th>
                <th style={{width:"15%"}}>
                    Phone Number
                </th>
            </tr>
            </thead>
        <tbody>
        {customersArray.map(customer => (
            <tr key={customer.customerId} >
                <Customer customer={customer} />
                <td style={{width:"10%"}}>
                    <button>Update</button>
                </td>
                <td style={{width:"10%"}}>
                    <button>Delete</button>
                </td>
            </tr>
        ))}
        </tbody>
    </table>
  )
}

export default Customers