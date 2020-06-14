package viau.lombokexemple.model;

import lombok.*;

/**
 * @author Dudis
 */
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Client {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String lasName;
    @Getter @Setter
    private int age;

    /**
     *
     * @return retorna a idade em meses
     */
    public int calculateAgeInMonths() {
        return this.age * 12;
    }



}
