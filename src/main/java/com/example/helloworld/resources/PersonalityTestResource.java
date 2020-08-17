package com.example.helloworld.resources;

import com.example.helloworld.api.Question;
import com.example.helloworld.db.MockDB;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


@Path("/api")
public class PersonalityTestResource {

    MockDB mockDB = new MockDB();

    public static <T> T mostCommon(List<T> list) {
        Map<T, Integer> map = new HashMap<>();
        for (T t : list) {
            Integer val = map.get(t);
            map.put(t, val == null ? 1 : val + 1);
        }
        Entry<T, Integer> max = null;
        for (Entry<T, Integer> e : map.entrySet()) {
            if (max == null || e.getValue() > max.getValue())
                max = e;
        }
        return max.getKey();
    }

    @GET
    @Path("/questions")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Question> getQuestions() {

        return mockDB.getQuestions();
    }

    @POST
    @Path("/result")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getResult(List<Integer> scores) {
        int result = mostCommon(scores);
        HashMap<Integer, String> personalities = mockDB.getPersonalities();
        return personalities.get(result);
    }
}
