package com.taylorsfan.blog.service.impl;

import com.github.pagehelper.PageInfo;
import com.taylorsfan.blog.model.Blog;
import com.taylorsfan.blog.repository.BlogMapper;
import com.taylorsfan.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author taylorsfan
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;


    @Override
    public List<Blog> findAll(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public Blog findOneById(int id) {
        return null;
    }

    @Override
    public boolean update(Blog blog) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean insert(Blog blog) {
        return false;
    }
}
