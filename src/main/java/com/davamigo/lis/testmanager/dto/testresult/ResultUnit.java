package com.davamigo.lis.testmanager.dto.testresult;

/**
 * @author david.amigo
 */
public enum ResultUnit {
    MG_100ML("mg/100mL"),
    MMOL_L("mmol/L");

    private final String name;

    ResultUnit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
