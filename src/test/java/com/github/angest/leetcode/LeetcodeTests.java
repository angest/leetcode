package com.github.angest.leetcode;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class LeetcodeTests {
    private ObjectMapper objectMapper = new ObjectMapper();

    protected <T> T getValue(String src, Class<T> valueType) {
        try {
            return objectMapper.readValue(getJsonString(src), valueType);
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    protected <T> T getValue(String src, TypeReference<T> valueTypeRef) {
        try {
            return objectMapper.readValue(getJsonString(src), valueTypeRef);
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    protected static void assertListEquals(List<?> expected, List<?> actual) {
        Assertions.assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    private String getJsonString(String src) throws IOException, URISyntaxException {
        String file = src + ".json";
        String key = null;

        int index = src.indexOf('.');
        if (index >= 0) {
            file = src.substring(0, index) + ".json";
            key = src.substring(index + 1);
        }

        URL url = this.getClass().getResource(file);
        if (key != null) {
            Map<String, ?> map = objectMapper.readValue(url, new TypeReference<Map<String, ?>>() {
            });
            return objectMapper.writeValueAsString(map.get(key));
        } else {
            Path path = Paths.get(url.toURI());
            return new String(Files.readAllBytes(path));
        }
    }
}