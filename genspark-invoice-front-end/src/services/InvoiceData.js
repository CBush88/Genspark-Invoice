import axios from "axios"

export const getInvoices = () => {
  return axios.get(`http://localhost:8080/invoices`)
}

export const getInvoiceById = (id) => {
    return axios.get(`http://localhost:8080/invoices/${id}`)
}

export const createInvoice = (invoice) => {
    return axios.post(`http://localhost:8080/invoices`, invoice)
}

export const updateInvoice = (invoice) => {
    return axios.put(`http://localhost:8080/invoices`, invoice)
}

export const deleteInvoice = (id) => {
    return axios.delete(`http://localhost:8080/invoices/${id}`)
}