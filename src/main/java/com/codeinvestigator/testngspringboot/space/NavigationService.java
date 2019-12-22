package com.codeinvestigator.testngspringboot.space;

import org.springframework.stereotype.Service;

@Service
public class NavigationService {
    public String destination(){
        return "Mars";
    }
}
