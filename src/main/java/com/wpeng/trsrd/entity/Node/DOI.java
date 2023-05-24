package com.wpeng.trsrd.entity.Node;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import java.io.Serializable;

@Data
@Node("DOI")
public class DOI implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Property("DOI")
    private final String DOI;
}
