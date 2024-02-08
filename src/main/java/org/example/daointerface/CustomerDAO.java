package org.example.daointerface;

import org.example.model.Customer;

public interface CustomerDAO {
  Customer getCustomerById(int id);
  void addCustomer(Customer c);
  void removeCustomerById(int id);
}
