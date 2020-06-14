package heinle.leonardo.exemplolombok.model;

import lombok.*;

/**
 * @author Leonardo
 *
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private int age;

    /**
     *
     * @return Retorna idade em meses.
     */
    public int calculateAgeInMonths() {
        return this.age * 12;
    }
}
