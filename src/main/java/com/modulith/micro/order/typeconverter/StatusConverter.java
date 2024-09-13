package com.modulith.micro.order.typeconverter;

import com.modulith.micro.order.type.Status;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;

@Converter(autoApply = true)
public class StatusConverter implements AttributeConverter<Status, String> {

    @Override
    public String convertToDatabaseColumn(Status status) {
//        return Arrays.stream(Status.values())
//                .filter(s -> s == status)
//                .map(Status::getCode)
//                .findFirst().orElseThrow(() -> new ModulithException("No status found"));
            return null;
    }

    @Override
    public Status convertToEntityAttribute(String s) {
        return null;
    }
}
