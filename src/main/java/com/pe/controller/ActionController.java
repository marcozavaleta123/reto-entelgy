package com.pe.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.service.ActionService;

@RestController
@RequestMapping("action")
public class ActionController {

    @Autowired
    private ActionService actionService;

    @PostMapping
    public Map<String, Object> convert() {
	Map<String, Object> map = new HashMap<>();
	
	map.put("data", actionService.convert());
	
	return map;
    }

}
