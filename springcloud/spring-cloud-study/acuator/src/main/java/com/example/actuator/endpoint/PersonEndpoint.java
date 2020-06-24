package com.example.actuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 自定义端点的一种方式
 */
@Endpoint(id = "person")  //显示的端点名
@Component
public class PersonEndpoint {
    /**
     * 自定义端点
     * 通过@Endpoint、 @ReadOperation、@WriteOperation、@DeleteOperation
     * 您还可以使用@JmxEndpoint或@WebEndpoint编写技术特定的端点
     * @Endpoint: 构建 rest api 的唯一路径
     * @ReadOperation: GET请求，响应状态为 200 如果没有返回值响应 404（资源未找到）
     * @WriteOperation: POST请求，响应状态为 200 如果没有返回值响应 204（无响应内容）
     * @DeleteOperation: DELETE请求，响应状态为 200 如果没有返回值响应 204（无响应内容）
     */

    private final Map<String, Person> people = new HashMap<>();

    PersonEndpoint() {
        this.people.put("mike", new Person("Michael Redlich"));
        this.people.put("rowena", new Person("Rowena Redlich"));
        this.people.put("barry", new Person("Barry Burd"));
    }

    @ReadOperation
    public List<Person> getAll() {
        return new ArrayList<>(this.people.values());
    }

    @ReadOperation
    public Person getPerson(@Selector String person) {
        return this.people.get(person);
    }

    @WriteOperation
    public void updatePerson(@Selector String name, String person) {
        this.people.put(name, new Person(person));
    }

    public static class Person {
        private String name;

        Person(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}