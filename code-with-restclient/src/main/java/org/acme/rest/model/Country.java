package org.acme.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    public Object name;
    public String capital;
    public List<Currency> currencies;
    public static class Currency {
        public String code;
        public String name;
        public String symbol;
    }
}