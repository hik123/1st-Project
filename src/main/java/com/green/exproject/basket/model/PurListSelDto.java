package com.green.exproject.basket.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class PurListSelDto {
    @JsonIgnore
    private int userPk = 1;
}
