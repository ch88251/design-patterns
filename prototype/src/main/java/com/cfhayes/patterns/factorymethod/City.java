package com.cfhayes.patterns.factorymethod;

import lombok.*;

@Setter @Getter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
class City implements Cloneable {

    private String name;

    public City clone() throws CloneNotSupportedException {
        return (City) super.clone();
    }
}