package com.micah.spring_basics.businessCalculationService;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataServiceInterface {
    @Override
    public int[] retrieveData() {
        return new int[] { 11, 22, 79, 90, 161, 13 };
    }

}