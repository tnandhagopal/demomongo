package com.anandan.mongo.demomongo.api;

import com.anandan.mongo.demomongo.entity.MyData;
import com.anandan.mongo.demomongo.service.MyDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/my-data")
public class MyDataController {

    @Autowired
    private MyDataService myDataService;

    @GetMapping("/{id}")
    public ResponseEntity<MyData> get(@PathVariable String id) {
        return ResponseEntity.of(myDataService.get(id));
    }

    @PostMapping("/create/random")
    public ResponseEntity<MyData> createRandomData() {

        MyData data = MyData.builder()
                .id(UUID.randomUUID().toString())
                .name("TestName")
                .dob(LocalDate.of(1986, 06, 21))
                .account(123456789L)
                .salary(new BigDecimal("123456789.45788765"))
                .build();

        return ResponseEntity.ok(myDataService.save(data));
    }

    @GetMapping("/")
    public ResponseEntity<List<MyData>> getAll() {
        return ResponseEntity.ok(myDataService.getAll());
    }

}
