package ru.expanse.user.util;

import ru.expanse.user.entity.User;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ObjectFactory {
    public static User getDefaultUser() {
        return User.builder()
                .isBlocked(false)
                .name("John Doe")
                .email("john.doe@example.com")
                .phoneNumber("+79001234567")
                .birthDate(Timestamp.valueOf(LocalDateTime.now().minus(ChronoUnit.YEARS.getDuration().multipliedBy(20))))
                .build();
    }
}
