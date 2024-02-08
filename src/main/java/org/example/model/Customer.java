package org.example.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
public class Customer {
    @Getter @Setter private int id;
    @Getter @Setter private String email;
    @Getter @Setter private String fname;
    @Getter @Setter private String lname;
}
