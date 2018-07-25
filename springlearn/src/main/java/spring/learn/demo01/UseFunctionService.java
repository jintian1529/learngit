package spring.learn.demo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
    @Autowired
    spring.learn.demo01.FunctionService functionService;

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
