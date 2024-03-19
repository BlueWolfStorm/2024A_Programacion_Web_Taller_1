package com.lct.SpringCine.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Admin{
    private User user;
    private LocalDateTime creationDate;

    public Admin(User user, LocalDateTime creationDate) {
        this.user = user;
        this.creationDate = creationDate;
    }
}
