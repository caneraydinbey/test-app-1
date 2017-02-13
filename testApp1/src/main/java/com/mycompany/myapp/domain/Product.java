package com.mycompany.myapp.domain;

    import com.mycompany.myapp.config.Constants;

    import com.fasterxml.jackson.annotation.JsonIgnore;
    import org.hibernate.validator.constraints.Email;
    import org.springframework.data.annotation.Id;
    import org.springframework.data.mongodb.core.mapping.Document;
    import org.springframework.data.mongodb.core.mapping.Field;

    import javax.validation.constraints.NotNull;
    import javax.validation.constraints.Pattern;
    import javax.validation.constraints.Size;
    import java.io.Serializable;
    import java.util.HashSet;
    import java.util.Locale;
    import java.util.Set;
    import java.time.ZonedDateTime;

/**
 * Created by vegan on 13.02.2017.
 */

/**
 * A product.
 */
@Document(collection = "product")
public class Product {

    @Id
    private String id;

    @Size(min = 2, max = 5)
    @Field("price")
    private String price;

    @Size(min = 2, max = 5)
    @Field("name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != null ? !id.equals(product.id) : product.id != null) return false;
        if (price != null ? !price.equals(product.price) : product.price != null) return false;
        return name != null ? name.equals(product.name) : product.name == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
            "id='" + id + '\'' +
            ", price='" + price + '\'' +
            ", name='" + name + '\'' +
            '}';
    }
}
