package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
public class Item {
  @Getter @Setter private int id;
  @Getter @Setter private String name;
  @Getter @Setter private double price;
}
