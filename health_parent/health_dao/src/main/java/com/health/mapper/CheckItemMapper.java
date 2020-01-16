package com.health.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.github.pagehelper.Page;
import com.health.pojo.CheckItem;


public interface CheckItemMapper {
	/**
     * 检查项分页列表
     */
	Page<CheckItem> pageQuery(String queryString);
	/**
     * 检查项新增
     */
	@Insert("insert into t_checkitem set code=#{code},name=#{name},sex=#{sex},age=#{age},price=#{price},type=#{type},remark=#{remark},attention=#{attention}")
	void add(CheckItem checkItem);
	/**
     * 检查项删除
     */
	@Delete("delete from t_checkitem where id=#{id}")
	void dels(Integer id);
	/**
     * 检查项批量编辑
     */
	@Update("update t_checkitem set code=#{code},name=#{name},sex=#{sex},age=#{age},price=#{price},type=#{type},remark=#{remark},attention=#{attention} where id=#{id}")
	void edit(CheckItem checkItem);
	/**
     * 检查项批量编辑回显
     */
	@Select("select * from t_checkitem where id=#{id}")
	CheckItem findById(Integer id);
	/**
     * 检查项列表
     */
	@Select("select * from t_checkitem")
	List<CheckItem> findAll();
	
}
