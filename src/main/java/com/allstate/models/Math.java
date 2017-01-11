package com.allstate.models;

import java.util.stream.IntStream;

public class Math {
    public static double square(double n){
        return n*n;
    }

    public static int factorial(int n){
        return IntStream.range(1, n +1).reduce(1, (acc, val) -> acc*val);
    }

    public static int fibo(int n){
        if(n==0 || n==1) return n;
        return fibo(n-1)+fibo(n-2);
    }

//    public static Accumulator fibo2(int n){
//        int x1 = 0;
//        int x2 = 0;
//
//        Accumulator accumulator = new Accumulator(0,0,0);
//
//        List<Accumulator> accumulatorList = new ArrayList<>();
//
//        return  IntStream.range(0, n).map( (val) -> {
//            return accumulatorList.add(new Accumulator(0,0,val));
//        }).boxed().reduce(accumulator, (Accumulator acc, Accumulator acc1) -> {
//            acc.setSum(acc.getX1() + acc.getX2() + acc1.getSum());
//            acc.setX1(acc.getX2());
//            acc.setX2(acc1.getX2());
//            return  acc;
//        });
//
//        Stream<String> stream = Stream.generate((i) -> new Accumulator(0,0,i)).limit(n);
//        String[] strArr = stream.toArray(String[]::new);
//        System.out.println(Arrays.toString(strArr));
//
//        return new Accumulator(0,0,0);
//
//    }

}
