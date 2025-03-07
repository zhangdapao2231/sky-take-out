package com.dapao;


import com.sky.dto.EmployeeDTO;
import com.sky.result.Result;
import com.sky.vo.EmployeeLoginVO;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/daopaotest/employee")
@Slf4j
public class test1 {


    @PostMapping("/login")
    public Result<EmployeeLoginVO> login(@RequestBody EmployeeDTO employeeLoginDTO) {
        log.info("员工登录：{}", employeeLoginDTO);

        return Result.success();

    }
}
