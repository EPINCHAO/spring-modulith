package com.modulith.micro.order.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {

    OPEN("O"), COMPLETED("C");
    private final String code;
}
