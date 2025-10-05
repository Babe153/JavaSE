package com.xinsheng.demo;

public class Test {
    public static void main(String[] args) {
        Movies[] arr = new Movies[6]; //这里的6是数组长度 因此只有6个对象
        arr[0] = new Movies(1,"喜羊羊与灰太狼", 9.5, "喜羊羊、灰太狼");
        arr[1] = new Movies(2,"唐顿庄园", 8.5, "唐顿");
        arr[2] = new Movies(3,"夏洛特烦恼", 9.5, "沈腾");
        arr[3] = new Movies(4,"变形金刚", 9.5, "擎天柱、威震天");
        arr[4] = new Movies(5,"熊出没", 9.5, "熊大、熊二、光头强");
        arr[5] = new Movies(6,"食贫道", 9.5, "饼叔");

        MoviesOperator moviesOperator = new MoviesOperator(arr);


        moviesOperator.printAll();

        moviesOperator.printById();
    }
}
