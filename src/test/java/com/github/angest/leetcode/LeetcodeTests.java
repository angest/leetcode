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

    protected <T> void assertListEquals(List<T> expected, List<T> actual) {
        Assertions.assertTrue(listEquals(expected, actual));
    }

    protected <T> void assertListOfListEquals(List<List<T>> expected, List<List<T>> actual) {
        Assertions.assertTrue(listOfListEquals(expected, actual));
    }

    private <T> boolean listEquals(List<T> list1, List<T> list2) {
        return list1.size() == list2.size()
                && list1.containsAll(list2)
                && list2.containsAll(list1);
    }

    private <T> boolean listOfListEquals(List<List<T>> listOfList1, List<List<T>> listOfList2) {
        return listOfList1.size() == listOfList2.size()
                && listOfList1.stream().allMatch(list1 -> listOfList2.stream().anyMatch(list2 -> listEquals(list1, list2)))
                && listOfList2.stream().allMatch(list2 -> listOfList1.stream().anyMatch(list1 -> listEquals(list1, list2)));
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