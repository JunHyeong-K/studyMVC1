package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {


    @RequestMapping("/log-test")
    public String LogTest(){

        String name = "Spring";

       // System.out.println("name  =" + name ); 이건 뭘 써도 서버에 남아버림
        log.info("info log={}", name);
        log.trace("trace log={}",name);
        log.debug("debug log={}",name);
        log.warn("warn log={}",name);
        log.error("error log={}",name);

        return "ok";

    }

}
