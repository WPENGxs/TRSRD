package com.wpeng.trsrd.entity.Node;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.*;

import java.io.Serializable;
import java.util.List;

@Data
@Node("risk substance")
public class RiskSubstance implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Property("risk substance")
    private final String risk_substance;

    @Relationship(type = "PMID",direction = Relationship.Direction.OUTGOING)
    private List<PMID> PMIDs;
}
