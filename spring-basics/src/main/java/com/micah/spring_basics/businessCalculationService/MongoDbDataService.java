package com.micah.spring_basics.businessCalculationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataServiceInterface {

    @Override
    public int[] retrieveData() {
        return new int[] { 56,78,9,546,87,99,199798 };
    }

}