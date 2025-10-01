package com.xinsheng.oneArray;

import java.util.Arrays;

public class pokerArray {
    public static void main(String[] args) {
        shuffle();
    }

    public static void shuffle() {
        String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] type = {"♥","♠","♦","♣"};
        String[] cards = new String[54];

        //========================================
        int index= 0; //使用递增的索引来存储不同的牌
        //========================================

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < type.length; j++) {
                cards[index++] = type[j] + number[i];
            }

        }
        cards[52] = "小王";
        cards[53] = "大王";
        System.out.println(Arrays.toString(cards));

        //随机发牌
        for (int i = 0; i < cards.length; i++) {
            int index2 = (int)(Math.random() * cards.length);
            System.out.print(cards[index2]);
        }

    }
}
