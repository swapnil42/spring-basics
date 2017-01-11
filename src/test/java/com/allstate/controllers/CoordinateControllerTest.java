//package com.allstate.controllers;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
//import static org.hamcrest.number.IsCloseTo.closeTo;
//import static org.junit.Assert.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(MathController.class)
//public class CoordinateControllerTest {
//
//    @Autowired
//    private MockMvc mvc;
//
//    @Test
//    public void distance() throws Exception {
//        MockHttpServletRequestBuilder request = post("/line/distance")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\"x1\":3, \"x2\":4,\"y1\":5, \"y2\":6}");
//
//        this.mvc.perform(request)
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.area", is(closeTo(21, 0.1))));
//    }
//
//    @Test
//    public void slope() throws Exception {
//
//    }
//
//    @Test
//    public void yintercept() throws Exception {
////        MockHttpServletRequestBuilder request = post("/triangle/area")
////                .contentType(MediaType.APPLICATION_JSON)
////                .content("[{\"width\":3, \"height\":4},{\"width\":5, \"height\":6}]");
////
////        this.mvc.perform(request)
////                .andExpect(status().isOk())
////                .andExpect(jsonPath("$.area", is(closeTo(21, 0.1))));
//    }
//
//}