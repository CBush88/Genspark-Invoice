import React from 'react'
import {Link} from 'react-router-dom'

const Home = () => {
  return (
    <div>
        <Link to="/invoices">Manage Invoices</Link>
        <br />
        <Link to="/customers">Manage Customers</Link>
        <br />
        <Link to="/billables">Manage Products and Services</Link>
        <br />
        <Link to="/lineitems">Manage line items</Link>
    </div>
  )
}

export default Home