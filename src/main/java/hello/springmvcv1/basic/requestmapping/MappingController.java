package hello.springmvcv1.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class MappingController {
    private Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/hello-basic")
    public String helloBasic(){
        log.info("helloBasic");
        return "ok";
    }

    @RequestMapping(value = "/mapping-get-v1",method= RequestMethod.GET)
    public String mappingGetV1(){
        log.info("mappingGetV1싫어 mappingGetV1 이걸로 나오게하꾸얌!><");
        return "ok싫어 mappingGetV1 이걸로 나오게하꾸얌!><";
    }

    @GetMapping(value = "/mapping-get-v2")
    public String mappingGetV2(){
        log.info("mappingGetV2싫어 mappingGetV2 이걸로 나오게하꾸얌!><");
        return "ok싫어 mappingGetV2 이걸로 나오게하꾸얌!><";
    }

    @GetMapping(value = "/mapping/{userId}")
    public String mappingPath(@PathVariable("userId") String data) {
        log.info("mappingPath userId={}",data,"유저 아이디로 나오게한다 이말이야");
        return "ok싫어 mappingPath userId={}\",data,\"유저 아이디로 나오게한다 이말이야";
    }

    @GetMapping(value = "/mapping/users/{userId}/orders/{orderId}")
    public String mappingPath(@PathVariable String userId, @PathVariable Long orderId) {
        log.info("mappingPath userId={}",userId,orderId,"유저 아이디로 나오게한다 이말이야");
        log.info("mappingPath userId={}, orderId={}", userId, orderId);
        return "ok싫어 mappingPath userId={}\",data,\"유저 아이디로 나오게한다 이말이야";
    }

    @GetMapping(value = "/mapping-param", params = "mode=debug")
    public String mappingParam() {
        log.info("mappingParam");
        return "ok";
    }

    @GetMapping(value = "/mapping-header", headers = "mode=debug")
    public String mappingHeader() {
        log.info("mappingHeader");
        return "ok";
    }

    @PostMapping(value = "/mapping-consume", consumes = "application/json")
    public String mappingConsumes() {
        log.info("mappingConsumes");
        return "ok";
    }

    @PostMapping(value = "/mapping-produce", produces = "text/html")
    public String mappingProduces() {
        log.info("mappingProduces");
        return "ok";
    }


}
