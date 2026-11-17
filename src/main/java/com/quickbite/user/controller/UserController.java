package com.quickbite.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @GetMapping("/me")
    public ResponseEntity<Map<String, Object>> getCurrentUser() {
        Map<String, Object> profile = new HashMap<>();
        profile.put("id", 101);
        profile.put("username", "quickbite_customer");
        profile.put("status", "ACTIVE");
        return ResponseEntity.ok(profile);
    }
}
