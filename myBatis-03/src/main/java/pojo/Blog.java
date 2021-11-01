package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Blog implements Serializable {
    private String id;
    private String title;
    private String author;
    private java.sql.Timestamp createTime;
    private long views;

}
