package com.micah.spring_basics.businessCalculationService;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataService {
     DataServiceInterface dataService;

    @Autowired
    public DataService(DataServiceInterface dataService){
       super();
       this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
