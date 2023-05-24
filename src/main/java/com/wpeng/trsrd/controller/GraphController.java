package com.wpeng.trsrd.controller;

import com.wpeng.trsrd.service.Neo4jSearchService;
import com.wpeng.trsrd.utils.Neo4jUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RestController
public class GraphController {

    @GetMapping("/hello")
    public String Hello(){
        return "hello world";
    }

    @GetMapping("/datatest")
    public Map<String, Object> Test(){
        String node="PMID";
        String pmid="30741486";
        return Neo4jSearchService.getGraphPath(node,pmid);
    }

    @PostMapping("/data_search")
    public Map<String,Object> getDataSearch(
            @RequestParam(value = "node") String node,
            @RequestParam(value = "key") String key){
        return Neo4jSearchService.getGraphPath(node,key);
    }

    @PostMapping("/data_cypher")
    public Map<String,Object> getDataCypher(
            @RequestParam(value = "cql") String cql){
        if(cql.contains("MATCH")||cql.contains("match")) {
            return Neo4jSearchService.getGraphPathFromCypher(cql);
        }else {
            return null;
        }
    }
}
