package com.wpeng.trsrd.entity.Node;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import java.io.Serializable;

@Data
@Node("abstract")
public class Abstract implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Property("abstract")
    private final String abstract_;
}
