package com.xinsheng.demo;

import java.util.Scanner;

//MoviesOperator类用以处理逻辑
public class MoviesOperator {
    private Movies[] movies;

    public MoviesOperator(Movies[] movies){
        this.movies = movies;
    }
    public void printAll(){
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getId() + "\t" + movies[i].getName() + "\t" + movies[i].getPrice() + "\t" + movies[i].getActor());
        }
    }

    public void printById(){
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            //********关键代码**********
            Movies m = movies[i];
            //********关键代码**********
            if (m.getId() == id){
                System.out.println(movies[id-1].getId() + "\t" + movies[id-1].getName() + "\t" + movies[id-1].getPrice() + "\t" + movies[id-1].getActor());
                return; //*********结果输出完毕 结束循环********
            }
        }
        System.out.println("wrong movie Id");
    }
}
