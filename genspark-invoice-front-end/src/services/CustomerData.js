import axios from "axios"

export const getCustomers = () => {
  return axios.get(`http://localhost:8080/customers`)
}

export const getCustomerById = (id) => {
    return axios.get(`http://localhost:8080/customers/${id}`)
}

export const createCustomer = (customer) => {
    return axios.post(`http://localhost:8080/customers`, customer)
}

export const updateCustomer = (customer) => {
    return axios.put(`http://localhost:8080/customers`, customer)
}

export const deleteCustomer = (id) => {
    return axios.delete(`http://localhost:8080/customers/${id}`)
}