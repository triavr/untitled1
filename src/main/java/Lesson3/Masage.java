package Lesson3;

import java.util.Date;

public class Masage {
    String content;
    String imagPath;
    Date sendDate;
    int readCount;

    void print() {
        System.out.println(content);
    }

    void LoadImage() {
        System.out.println("идет процесс загрузки по пути" + imagPath);
        Thread.sleep(1000)
      System.out.println("Картинка загружена");
    }

    void printSentData() {
        System.out.println(SentDate);

    }

    int getReadCount() {
        return readCount;
    }
}
