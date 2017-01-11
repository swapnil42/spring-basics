//package com.allstate.controllers;
//
//import com.allstate.models.Line;
//import com.allstate.models.Point;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//public class CoordinateController {
//    @RequestMapping(value = "/line/distance", method = RequestMethod.POST)
//    public double distance(@RequestBody Line line){
//        return Line.distance(line);
//    }
//
//
//    @RequestMapping(value = "/line/slope", method = RequestMethod.POST)
//    public double slope(@RequestBody Line line){
//        return Line.slope(line);
//    }
//
//    @RequestMapping(value = "/line/yintercept", method = RequestMethod.POST)
//    public Point yintercept(@RequestBody Line line){
//        return Line.yIntercept(line);
//    }
//}