package com.allstate.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.allstate.models.Math;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MathController {
    @RequestMapping(value = "/math/square/{x}" , method = RequestMethod.GET)
    public Map<String, Double> square(@PathVariable int x){
        double result = Math.square(x);
        Map<String, Double> map = new HashMap<>();
        map.put("square", result);
        return map;
    }

    @RequestMapping(value = "/math/fact/{x}" , method = RequestMethod.GET)
    public Map<String, Integer> factorial(@PathVariable int x){
        int result = Math.factorial(x);
        Map<String, Integer> map = new HashMap<>();
        map.put("factorial", result);
        return map;
    }

    @RequestMapping(value = "/math/fib/{x}" , method = RequestMethod.GET)
    public Map<String, Integer> fibo(@PathVariable int x){
        int result = Math.fibo(x);
        Map<String, Integer> map = new HashMap<>();
        map.put("fibo", result);
        return map;
    }
}
