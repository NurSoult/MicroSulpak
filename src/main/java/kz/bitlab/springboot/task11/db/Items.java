package kz.bitlab.springboot.task11.db;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Items {

    private Long id;
    private String name;
    private String description;
    private double price;

}
