import axios from "axios"

export const getLineItems = () => {
  return axios.get(`http://localhost:8080/lineItems`)
}

export const getLineItemById = (id) => {
    return axios.get(`http://localhost:8080/lineItems/${id}`)
}

export const createLineItem = (lineItem) => {
    return axios.post(`http://localhost:8080/lineItems`, lineItem)
}

export const updateLineItem = (lineItem) => {
    return axios.put(`http://localhost:8080/lineItems`, lineItem)
}

export const deleteLineItem = (id) => {
    return axios.delete(`http://localhost:8080/lineItems/${id}`)
}