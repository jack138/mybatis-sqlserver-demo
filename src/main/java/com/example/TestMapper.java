package com.example;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface TestMapper {

	@Insert("INSERT INTO test (col2, col3) VALUES(#{col2}, #{col3})")
	@Options(useGeneratedKeys = true)
	void insert(Test test);
}
