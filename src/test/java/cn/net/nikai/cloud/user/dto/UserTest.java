package cn.net.nikai.cloud.user.dto;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;

public class UserTest {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
        .setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    @Test
    public void jsonTest() throws JsonProcessingException {

        User tom = new User(1L,"tom",18,"tom@qq.com");

        ArrayList<User> family = new ArrayList<User>(2);
        User fml1 = new User(1L,"fml1",18,"fml1@qq.com");
        User fml2 = new User(1L,"fml2",18,"fml2@qq.com");
        family.add(fml1);
        family.add(fml2);

        HashMap<String, Friend> friends = new HashMap<String, Friend>(2);
        User f1wf = new User(1L,"f1wf",18,"f1wf@qq.com");
        User f2wf = new User(1L,"f2wf",18,"f2wf@qq.com");
        Friend f1 = new Friend(1, "f1", "f1address", new Date(), "f1@qq.com");
        f1.setWife(f1wf);
        Friend f2 = new Friend(1, "f2", "f2address", new Date(), "f2@qq.com");
        f2.setWife(f2wf);
        friends.put("f1",f1);
        friends.put("f2",f2);

        Wife wife = new Wife("1", "lucy", 130.0, 175.0, 20, "lucy");

        tom.setFamily(family);
        tom.setFriends(friends);
        tom.setWife(wife);

        String ts = OBJECT_MAPPER.writeValueAsString(tom);
        System.out.println(ts);

    }
}