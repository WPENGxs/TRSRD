package com.wpeng.trsrd;

import com.wpeng.trsrd.domain.PMIDRepository;
import com.wpeng.trsrd.domain.ResearchCategoryRepository;
import com.wpeng.trsrd.entity.Node.PMID;
import com.wpeng.trsrd.entity.Node.ResearchCategory;
import com.wpeng.trsrd.service.Neo4jSearchService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class TrsrdApplicationTests {

    @Autowired
    PMIDRepository pmidRepository;
    @Autowired
    ResearchCategoryRepository researchCategoryRepository;

    /*@Test
    public void searchPMIDNode(){
        PMID pmid=pmidRepository.getPMIDNode("28532335");
        System.out.println(pmid);
    }

    @Test
    public void searchPMIDGraph(){
        List<PMID> result=pmidRepository.getPMIDProperty("30741486");
        System.out.println(result);
    }

    @Test
    public void searchResearchCategoryGraph(){
        List<ResearchCategory> result=researchCategoryRepository.getResearchCategoryProperty("detection methods");
        System.out.println(result);
    }*/

}
