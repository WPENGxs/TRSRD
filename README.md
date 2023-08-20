# TRSRD: a database for research on risky substances in tea using natural language processing and knowledge graph-based techniques

## 介绍(Introduction)
我的论文：TRSRD: a database for research on risky substances in tea using natural language processing and knowledge graph-based techniques 中的前后端源代码  
论文链接：https://doi.org/10.1093/database/baad031  
在启动之前请修改application.properties，将
```
spring.neo4j.uri、spring.neo4j.authentication.username、spring.neo4j.authentication.password和server.address
```
修改为部署服务器需要的值，默认端口为8080  
  
Source code for the front and back end of my paper: TRSRD: a database for research on risky substances in tea using natural language processing and knowledge graph-based techniques  
Link to the paper: https://doi.org/10.1093/database/baad031  
Before starting, please modify application.properties to change 
```
spring.neo4j.uri, spring.neo4j.authentication.username, spring.neo4j.authentication.password and server. address 
```
to the values needed to deploy the server, and the default port is 8080 

## 引用(Cite)
<pre>
@article{10.1093/database/baad031,
    author = {Wang, Yongmei and Wang, Peng and Zhang, Yongheng and Yao, Siyi and Xu, Zhipeng and Zhang, Youhua},
    title = "{TRSRD: a database for research on risky substances in tea using natural language processing and knowledge graph-based techniques}",
    journal = {Database},
    volume = {2023},
    pages = {baad031},
    year = {2023},
    month = {05},
    abstract = "{During the production and processing of tea, harmful substances are often introduced. However, they have never been systematically integrated, and it is impossible to understand the harmful substances that may be introduced during tea production and their related relationships when searching for papers. To address these issues, a database on tea risk substances and their research relationships was constructed. These data were correlated by knowledge mapping techniques, and a Neo4j graph database centered on tea risk substance research was constructed, containing 4189 nodes and 9400 correlations (e.g. research category-PMID, risk substance category-PMID, and risk substance-PMID). This is the first knowledge-based graph database that is specifically designed for integrating and analyzing risk substances in tea and related research, containing nine main types of tea risk substances (including a comprehensive discussion of inclusion pollutants, heavy metals, pesticides, environmental pollutants, mycotoxins, microorganisms, radioactive isotopes, plant growth regulators, and others) and six types of tea research papers (including reviews, safety evaluations/risk assessments, prevention and control measures, detection methods, residual/pollution situations, and data analysis/data measurement). It is an essential reference for exploring the causes of the formation of risk substances in tea and the safety standards of tea in the future.Database URLhttp://trsrd.wpengxs.cn}",
    issn = {1758-0463},
    doi = {10.1093/database/baad031},
    url = {https://doi.org/10.1093/database/baad031},
    eprint = {https://academic.oup.com/database/article-pdf/doi/10.1093/database/baad031/50258587/baad031.pdf},
}
</pre>
