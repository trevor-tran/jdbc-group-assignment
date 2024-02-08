package org.example.daointerface;

import org.example.model.Item;

import java.util.List;

public interface ItemDAO {
  List<Item> getAllItems();
  void addItem(Item item);
  void removeItemById(int id);
}
