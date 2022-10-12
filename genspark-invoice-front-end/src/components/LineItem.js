import React from 'react'
import Billable from './Billable'

const LineItem = (props) => {
  return (
    <div>
        <Billable billable={props.lineItem.billable} />
        <br />
        quantity {props.lineItem.quantity}
        <br />
    </div>
  )
}

export default LineItem