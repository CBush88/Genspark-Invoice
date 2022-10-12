import axios from "axios"

export const getBillables = () => {
  return axios.get(`http://localhost:8080/billables`)
}

export const getBillableById = (id) => {
    return axios.get(`http://localhost:8080/billables/${id}`)
}

export const createBillable = (billable) => {
    return axios.post(`http://localhost:8080/billables`, billable)
}

export const updateBillable = (billable) => {
    return axios.put(`http://localhost:8080/billables`, billable)
}

export const deleteBillable = (id) => {
    return axios.delete(`http://localhost:8080/billables/${id}`)
}