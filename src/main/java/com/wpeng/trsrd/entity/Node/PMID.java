package com.wpeng.trsrd.entity.Node;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Node("PMID")
public class PMID implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Property("PMID")
    private final String PMID;

    @Relationship(type = "Title",direction = Relationship.Direction.OUTGOING)
    private Title Title;
    @Relationship(type = "DOI",direction = Relationship.Direction.OUTGOING)
    private DOI DOI;
    @Relationship(type = "keywords",direction = Relationship.Direction.OUTGOING)
    private Keywords keywords;
    @Relationship(type = "abstract",direction = Relationship.Direction.OUTGOING)
    private Abstract abstract_;
    @Relationship(type = "summary",direction = Relationship.Direction.OUTGOING)
    private Summary summary ;
    @Relationship(type = "risk substance category",direction = Relationship.Direction.OUTGOING)
    private RiskSubstanceCategory risk_substance_category;
    @Relationship(type = "research category",direction = Relationship.Direction.OUTGOING)
    private ResearchCategory research_category;
    @Relationship(type = "risk substance",direction = Relationship.Direction.OUTGOING)
    private List<RiskSubstance> risk_substances=new ArrayList<>();
}
