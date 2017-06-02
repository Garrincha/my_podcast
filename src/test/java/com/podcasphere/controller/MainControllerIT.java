package com.podcasphere.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MainControllerIT {

//    @LocalServerPort
    private int port;

    private URL base;

//    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception {
//        this.base = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void testMain() throws Exception {
//        ResponseEntity<String> response = template.getForEntity(base.toString(),
//                String.class);
//        assertThat(response.getBody(), containsString("Spring Boot"));
    }
}