package com.modulith.micro.payment.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentStatus {
IMCOMPLETE("I"), COMPLETED("C"), FAILED("F");
    private  final String code;
}
