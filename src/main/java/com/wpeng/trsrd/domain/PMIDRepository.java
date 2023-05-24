package com.wpeng.trsrd.domain;

import com.wpeng.trsrd.entity.Node.PMID;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PMIDRepository extends Neo4jRepository<PMID,Long> {
    //PMID Node Search
    @Query("MATCH (n:PMID) RETURN n")
    List<PMID> getAllPMIDNode();

    @Query("MATCH (n:PMID) WHERE n.PMID=$pmid_text RETURN n")
    PMID getPMIDNode(String pmid_text);

    @Query("MATCH p=(n:PMID)-[r]->(m) WHERE n.PMID=$pmid_text RETURN p")
    List<PMID> getPMIDProperty(String pmid_text);
}
