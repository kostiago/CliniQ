package com.kostiago.api.cliniq.entities.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Specialty {
    ORTOPEDIA("O.", "Ortopedia"),
    CARDIOLOGIA("C.", "Cardiologia"),
    GINECOLOGIA("G.", "Ginecologia"),
    DERMATOLOGIA("D.", "Dermatologia");

    private String code;
    private String description;

    private Specialty(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @JsonValue
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Specialty fromCode(String code) {
        for (Specialty specialty : Specialty.values()) {
            if (specialty.getCode().equals(code)) {
                return specialty;
            }
        }
        throw new IllegalArgumentException("Invalid specialty code: " + code);
    }
}
