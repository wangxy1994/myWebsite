package com.wangxy;

import com.wangxy.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestService implements ITestService {
    @Autowired
    public TestMapper testMapper;

    @Override
    public void testService() {
        System.out.println("service层");
        User temp = testMapper.findById(1);
        System.out.println(temp);
    }
}
