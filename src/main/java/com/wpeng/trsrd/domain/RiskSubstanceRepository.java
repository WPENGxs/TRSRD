package com.wpeng.trsrd.domain;

import com.wpeng.trsrd.entity.Node.RiskSubstance;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskSubstanceRepository extends Neo4jRepository<RiskSubstance,Long> {
}
