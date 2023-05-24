package com.wpeng.trsrd.domain;

import com.wpeng.trsrd.entity.Node.*;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRepository extends Neo4jRepository<PMID,Long> {

    //PMID Node Search
    @Query("MATCH (n:PMID) RETURN n")
    List<PMID> getAllPMIDNode();

    @Query("MATCH (n:PMID) WHERE n.PMID=$pmid_text RETURN n")
    PMID getPMIDNode(String pmid_text);

    //Title Node Search(contains)
    @Query("MATCH (n:Title) WHERE n.Title CONTAINS $title_text RETURN n")
    List<Title> getTitleNode(String title_text);

    //DOI Node Search
    @Query("MATCH (n:DOI) WHERE n.DOI=$doi_text RETURN n")
    DOI getDOINode(String doi_text);

    //keywords Node Search(contains)
    @Query("MATCH (n:keywords) WHERE n.keywords CONTAINS $keywords_text RETURN n")
    List<Keywords> getKeywordsNode(String keywords_text);

    //abstract Node Search(contains)
    @Query("MATCH (n:abstract) WHERE n.abstract CONTAINS $abstract_text RETURN n")
    List<Abstract> getAbstractNode(String abstract_text);

    //summary Node Search(contains)
    @Query("MATCH (n:summary) WHERE n.summary CONTAINS $summary_text RETURN n")
    List<Summary> getSummaryNode(String summary_text);

    //risk substance category Search
    @Query("MATCH (n:`risk substance category`) WHERE n.`risk substance category`=$r_text RETURN n")
    RiskSubstanceCategory getRiskSubstanceCategoryNode(String r_text);

    //research category Search
    @Query("MATCH (n:`research category`) WHERE n.`research category`=$r_text RETURN n")
    ResearchCategory getResearchCategoryNode(String r_text);

    //risk substance Search
    @Query("MATCH (n:`risk substance`) WHERE n.`risk substance`=$r_text RETURN n")
    RiskSubstance getRiskSubstanceNode(String r_text);

}
