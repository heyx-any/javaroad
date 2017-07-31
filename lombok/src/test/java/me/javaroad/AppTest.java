package me.javaroad;

import me.javaroad.entity.Article;
import org.junit.Test;

public class AppTest {

    @Test
    public void getAndSet(){
        Article article = new Article();
        article.setTitle("hello");
        article.setContent("world");
        System.out.println(article.getTitle()+":"+article.getContent());
    }

    @Test
    public void builder(){
    }
}
