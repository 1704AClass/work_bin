package com.health.service;

import java.util.Map;

import com.health.entity.Result;

public interface OrderService {

	Result order(Map map) throws Exception;

	Map findById(Integer id) throws Exception;

}
