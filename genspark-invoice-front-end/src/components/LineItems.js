import {React, useEffect} from 'react'
import LineItem from './LineItem';

const LineItems = (props) => {
    const lineItemsArray = Array.from(props.lineItems);
    
    useEffect(() => {
      props.retrieveLineItems();
    }, []);
    
  return (
    <div>
        {lineItemsArray.map(lineItem => (
            <span key={lineItem.lineId}>
                <LineItem lineItem={lineItem} />
            </span>
        ))}
    </div>
  )
}

export default LineItems