package org.example.session04.homework01_02_03_04.dao;

import org.example.session04.homework01_02_03_04.model.SearchResult;
import org.springframework.stereotype.Repository;

@Repository
public class SearchResultDAO {
    public SearchResult search(String category, int limit) {
        return new SearchResult(category, limit, "Tìm kiếm thành công");
    }
}