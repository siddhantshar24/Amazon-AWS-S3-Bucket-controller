package com.localstack.awss3.controller;

import com.localstack.awss3.service.s3service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "localstack/")
public class s3controller {
    @Autowired
    s3service S3service;
    @PostMapping(value = "create",consumes = {"application/json"})
    public String createBucket(@RequestParam(name="bucketName") String bucketName){
        S3service.createBucket(bucketName);
        return "Successfully created bucket";
    }

    @DeleteMapping(value = "delete", consumes = {"application/json"})
    public String deleteBucket(@RequestParam(name="bucketName") String bucketName){
        S3service.deleteBucket(bucketName);
        return "Successfully deleted bucket";
    }
}
