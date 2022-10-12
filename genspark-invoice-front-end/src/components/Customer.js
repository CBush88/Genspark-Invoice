import React from 'react'

const Customer = (props) => {
  return (
    <div>
        {props.customer.firstName}
        <br />
        {props.customer.lastName}
        <br />
        {props.customer.email}
        <br />
        {props.customer.phone}
        <br />
    </div>
  )
}

export default Customer