package me.javaroad.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author heyx
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Article {
    private String title;
    private String content;
}
