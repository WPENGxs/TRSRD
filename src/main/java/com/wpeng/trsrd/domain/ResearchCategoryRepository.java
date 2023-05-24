package com.wpeng.trsrd.domain;

import com.wpeng.trsrd.entity.Node.ResearchCategory;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResearchCategoryRepository extends Neo4jRepository<ResearchCategory,Long> {
    //research category Search
    @Query("MATCH (n:`research category`) WHERE n.`research category`=$r_text RETURN n")
    ResearchCategory getResearchCategoryNode(String r_text);

    @Query("MATCH p=(n:`research category`)-[r]->(m) WHERE n.`research category`=$r_text RETURN p")
    List<ResearchCategory> getResearchCategoryProperty(String r_text);
}
