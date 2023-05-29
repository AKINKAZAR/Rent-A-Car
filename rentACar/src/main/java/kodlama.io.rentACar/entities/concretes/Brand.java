package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

// @Data  -- Bizim için Getter ve Setter metodlarını Tanımlar,
// @Getter -- sadece o class içerisinde getter kullanacaksak @Data yerine @Getter yazabiliriz.
// @Setter -- sadece o class içerisinde setter kullanacaksak @Data yerine @Setter yazabiliriz.
// @Entity -- sen bir veri tabanı varlığısın

@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id değerini otomatik olarak her kayıtta 1 arttırır.
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "brand")
    private List<Model> models;
}
// @Builder

