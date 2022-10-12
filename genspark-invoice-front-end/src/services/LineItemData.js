import axios from "axios"

export const getLineItems = () => {
  return axios.get(`http://localhost:8080/lineitems`)
}

export const getLineItemById = (id) => {
    return axios.get(`http://localhost:8080/lineitems/${id}`)
}

export const createLineItem = (lineItem) => {
    return axios.post(`http://localhost:8080/lineitems`, lineItem)
}

export const updateLineItem = (lineItem) => {
    return axios.put(`http://localhost:8080/lineitems`, lineItem)
}

export const deleteLineItem = (id) => {
    return axios.delete(`http://localhost:8080/lineitems/${id}`)
}