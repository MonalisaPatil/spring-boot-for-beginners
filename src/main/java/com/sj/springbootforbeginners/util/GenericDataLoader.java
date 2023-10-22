package com.sj.springbootforbeginners.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.List;

public class GenericDataLoader {

    /**
     * Generic method to load a json resource file
     * @param path path to the json file containing test data
     * @param type class type of the returned collection
     * @param <T> type of class
     * @return list of generic collection loadded from the json resource file
     * @throws IOException
     */
    public static <T> List<T> getResourceList(String path, Class<T> type) throws IOException {
        Resource resource = new ClassPathResource(path);
        List<T> mockList = new ObjectMapper().readValue(resource.getInputStream(), TypeFactory.defaultInstance().constructCollectionType(List.class, type));
        return mockList;
    }

    /**
     * Generic method to load a json resource file
     * @param path path to the json file containing test data
     * @param type class type of the returned collection
     * @param <T> type of class
     * @return Object
     * @throws IOException
     */
    public static <T> T getResource(String path, Class<T> type) throws IOException {
        Resource resource = new ClassPathResource(path);
        T mock = new ObjectMapper().readValue(resource.getInputStream(), TypeFactory.defaultInstance().constructType(type));
        return mock;
    }

}
