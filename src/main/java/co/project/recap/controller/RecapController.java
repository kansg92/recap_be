package co.project.recap.controller;

import co.project.recap.model.User;
import co.project.recap.service.RecapService;
import co.project.common.Response;
import co.project.recap.dto.SignInRequest;
import co.project.recap.dto.TestReqDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping(value = "api/v2/Recap/")
public class RecapController {

    @Autowired
    RecapService recapService;

    @GetMapping("test2")
    public String test2(){

        TestReqDTO testRequest = TestReqDTO.builder()
                .message("테스트입니다.")
                .build();

        return "hello";

    }

    @GetMapping("test")
    public Response test(){

        TestReqDTO testRequest = TestReqDTO.builder()
                .message("테스트입니다.")
                .build();

        return Response.builder()
                .data(testRequest)
                .build();

    }

    @GetMapping("signIn")
    public Response signIn(@RequestBody @Valid SignInRequest signInRequest) throws Exception {


        recapService.saveUser(User.builder()
                .name(signInRequest.getName())
                .email(signInRequest.getEmail())
                .build());

        return Response.builder()
                .traceId("222")
                .build();

    }


}
