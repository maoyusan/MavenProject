package pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private long tid;
    private String name;
    private List<User> users;

    public Teacher(long tid) {
        this.tid = tid;
    }
}
