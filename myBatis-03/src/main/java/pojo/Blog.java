package pojo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data

public class Blog implements Serializable {

    private String id;
    private String title;
    private String author;
    private java.sql.Timestamp createTime;
    private long views;

    public Blog(String id, String title, String author, Timestamp createTime, long views) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.createTime = createTime;
        this.views = views;
    }
}
