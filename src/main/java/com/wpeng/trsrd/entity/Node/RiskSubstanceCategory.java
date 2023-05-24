package com.wpeng.trsrd.entity.Node;

import com.wpeng.trsrd.entity.Node.PMID;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.*;

import java.io.Serializable;
import java.util.List;

@Data
@Node("risk substance category")
public class RiskSubstanceCategory implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Property("risk substance category")
    private final String risk_substance_category;

    @Relationship(type = "PMID",direction = Relationship.Direction.OUTGOING)
    private List<PMID> PMIDs;
}
