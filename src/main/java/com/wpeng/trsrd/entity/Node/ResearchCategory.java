package com.wpeng.trsrd.entity.Node;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.*;

import java.io.Serializable;
import java.util.List;

@Data
@Node("research category")
public class ResearchCategory implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Property("research category")
    private final String research_category;

    @Relationship(type = "PMID",direction = Relationship.Direction.OUTGOING)
    private List<PMID> PMIDs;
}
