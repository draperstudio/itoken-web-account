package com.draper.itoken.web.account.controller;

import com.draper.itoken.core.entity.dto.Response;
import com.draper.itoken.core.util.JWTUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author draper_hxy
 */
@Slf4j
@RestController
public class AccountController {

    @RequestMapping(value = "/account/{account}", method = RequestMethod.POST)
    public Response login(@PathVariable String account, @RequestBody String password) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("sub", account);
        String jwts = JWTUtil.buildJwts(claims, System.currentTimeMillis() + 1000 * 60 * 60);
        return new Response(200, "OK", jwts);
    }

}
