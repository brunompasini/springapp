package com.emse.spring.faircorp.hello;


import org.springframework.stereotype.Service;

@Service
public class DummyUserService implements UserService{
    private GreetingService grt;
    DummyUserService(GreetingService grt){
        this.grt = grt;
    }

    public void greetAll() {
        String[] lst = {"Elodie", "Charles"};
        for (int i=0;i<2;i++){
            grt.greet(lst[i]);
        }
    }
}
