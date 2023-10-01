package com.localstack.awss3.service;

import com.amazonaws.services.s3.AmazonS3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class s3service {
    @Autowired
    AmazonS3 amazonS3;
    public String createBucket(String name){
        if(!amazonS3.doesBucketExistV2(name)){
            amazonS3.createBucket(name);
        }
        return name;
    }

    public String deleteBucket(String name){
        if(amazonS3.doesBucketExistV2(name)){
            amazonS3.deleteBucket(name);
        }
        return name;
    }
}
