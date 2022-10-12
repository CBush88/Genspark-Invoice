import React from 'react'

const Customer = (props) => {
  return (
    <>
        <td style={{width:"15%"}}>
            {props.customer.firstName}
        </td>
        <td style={{width:"15%"}}>
            {props.customer.lastName}
        </td>
        <td style={{width:"15%"}}>
            {props.customer.email}
        </td>
        <td style={{width:"15%"}}>
            {props.customer.phone}
        </td>
        </>
  )
}

export default Customer