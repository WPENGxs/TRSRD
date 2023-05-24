package com.wpeng.trsrd.domain;

import com.wpeng.trsrd.entity.Node.RiskSubstanceCategory;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskSubstanceCategoryRepository extends Neo4jRepository<RiskSubstanceCategory,Long> {
}
