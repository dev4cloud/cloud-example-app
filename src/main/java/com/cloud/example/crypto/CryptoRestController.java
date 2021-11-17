package com.cloud.example.crypto;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;

@RestController
public class CryptoRestController {

    @GetMapping("/encrypt")
    public String encryptString(@RequestParam(value = "string") String string) throws NoSuchAlgorithmException {
        return DigestUtils.sha256Hex(string);
    }
}
