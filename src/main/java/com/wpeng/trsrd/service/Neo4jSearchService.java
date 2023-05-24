package com.wpeng.trsrd.service;

import com.wpeng.trsrd.utils.Neo4jUtil;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public final class Neo4jSearchService{

    public static Map<String,Object> getGraphPath(String node,String text){
        Map<String, Object> retMap = new HashMap<>();
        String cql = "";
        if(node.equals("PMID")||
        node.equals("risk substance category")||
        node.equals("research category")||
        node.equals("risk sbustance")) {
            //cql语句  ID()可以获取节点自动生成的id
            cql = "MATCH p=(n:`" + node + "`)-[r]->(m) WHERE n.`" + node + "` CONTAINS '" + text + "' RETURN p";
        }else {
            //cql语句  ID()可以获取节点自动生成的id
            cql = "MATCH p=(n)-[r]-(m:`"+ node +"`) WHERE m.`" + node + "` CONTAINS '" + text + "' RETURN p";
        }
        //待返回的值，与cql return后的值顺序对应
        return getStringObjectMap(cql, retMap);
    }

    public static Map<String,Object> getGraphPathFromCypher(String cql){
        Map<String, Object> retMap = new HashMap<>();
        //待返回的值，与cql return后的值顺序对应
        try{
            return getStringObjectMap(cql, retMap);
        }catch (Exception e){
            return null;
        }

    }

    private static Map<String, Object> getStringObjectMap(String cql, Map<String, Object> retMap) {
        Set<Map<String, Object>> nodeList = new HashSet<>();
        Set<Map<String, Object>> edgeList = new HashSet<>();
        Neo4jUtil.getPathList(cql, nodeList, edgeList);
        retMap.put("nodeList", nodeList);
        retMap.put("edgeList", edgeList);
        return retMap;
    }

}
