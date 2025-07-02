package com.sj.springbootforbeginners.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.sj.springbootforbeginners.model.flipkart.FlipkartItem;
import com.sj.springbootforbeginners.repository.FlipkartRepository;
import com.sj.springbootforbeginners.model.FlipkartData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class DataIngestionService {


    @Autowired
    private FlipkartRepository flipkartRepository;

    public String ingestFlipkartData() {
        try {
            List<FlipkartItem> data = getResourceList("data/flipkart.json", FlipkartItem.class);
            flipkartRepository.saveAll(data);
            return "Data ingestion completed successfully";
        } catch (IOException e) {
            return "Failed to ingest data: " + e.getMessage();
        }
    }

    /**
     * Generic method to load a json resource file
     * @param path path to the json file containing test data
     * @param type class type of the returned collection
     * @param <T> type of class
     * @return list of generic collection loadded from the json resource file
     * @throws IOException
     */
    public  <T> List<T> getResourceList(String path, Class<T> type) throws IOException {
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
    public  <T> T getResource(String path, Class<T> type) throws IOException {
        Resource resource = new ClassPathResource(path);
        T mock = new ObjectMapper().readValue(resource.getInputStream(), TypeFactory.defaultInstance().constructType(type));
        return mock;
    }

}