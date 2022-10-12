import { React, useEffect } from 'react'
import Billable from './Billable';

const Billables = (props) => {
    const billablesArray = Array.from(props.billables)

    useEffect(() => {
      props.retrieveBillables();
    }, []);
    

  return (
    <div>
        {billablesArray.map(billable =>(
            <Billable billable={billable} />
        ))}
    </div>
  )
}

export default Billables