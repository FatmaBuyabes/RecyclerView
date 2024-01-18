package com.joincoded.adapter.Data;

public class CurrencyData {
    private String name;
    private String code;
    private  Double exchange;

    public CurrencyData(String name, String code, Double exchange) {
        this.name = name;
        this.code = code;
        this.exchange = exchange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getExchange() {
        return exchange;
    }

    public void setExchange(Double exchange) {
        this.exchange = exchange;
    }
}
