import React from 'react'

const Billable = (props) => {
  return (
    <div>
        {props.billable.billableName}
        <br />
        {props.billable.billableDescription}
        <br />
        price {props.billable.billablePrice}
        <br />
    </div>
  )
}

export default Billable