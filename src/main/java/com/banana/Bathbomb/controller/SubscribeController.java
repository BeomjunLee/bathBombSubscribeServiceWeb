package com.banana.Bathbomb.controller;
import com.banana.Bathbomb.service.SubscribeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SubscribeController {
    private final SubscribeService subscribeService;

    @GetMapping("/mySubscribeList")//구독 내역으로
    public String goSubscribeList(){
        return "/myPage/mySubscribeList";
    }

    @GetMapping("/subscribe")//구독하기 버튼
    public String goSubscribe(){
        return "subscribe/subscribeType";
    }

    @GetMapping("/subscribeResult")//구독 결제 정보
    public String goSubscribeResult(){
        return "/subscribe/subscribeResult";
    }

    @GetMapping("/subscribeInfo")//구독 결제 입력
    public String goPayInfo(){
        return "/subscribe/subscribeInfo";
    }

}
