package com.example.springboottest2.dao;


import java.util.List;
import java.util.Map;

public interface CeshiDao {

    String query();
    List<String> getAllPid();
    List<String> getAllBid();
    List<String> getDept(String pid);
    List<String> getName(String pid);
    List<String> getSex(String pid);
    String  getZkys(String pid);
    String  getZkhs(String pid);
    String getZzys(String pid);
    String getZrhs(String pid);
    String getSfzh(String pid);
    String getZzd(String pid);
    String getZzddm(String pid);
    String getCsrq(String pid);//出生日期
    String getRyrq(String pid);//入院日期
    String getCyrq(String pid);//出院日期
    String getFffs(String pid);//付费方式
    String getZytj(String pid);//住院途径
    String getDjczy(String pid);//第几次住院
    String getZyts(String pid);//住院天数
    String getLyfs(String pid);//离院方式
    String getZfy(String pid);//总费用
    String getZfje(String pid);//自费金额
    String getYlfwf(String pid);//医疗服务费
    String getZlczf(String pid);//治疗操作费
    String getHlf(String pid);//护理费
    String getZhyl(String pid);//综合医疗服务类其它费
    String getBlzdf(String pid);//病例诊断费
    String getSyszdf(String pid);//实验室
    String getYxxzdf(String pid);//影像学诊断费用
    String getLczdf(String pid);//临床诊断费用
    String getFsszl(String pid);//非手术治疗项目费
    String getLcwlzlfy(String pid);//其中临床物理治疗费
    String getSszlf(String pid);//手术治疗费
    String getMzf(String pid);//其中麻醉费
    String getSsf(String pid);//其中手术费
    String getKff(String pid);//康复费
    String getZyzlf(String pid);//中医治疗费
    String getXyf(String pid);//西药费
    String getKjywf(String pid);//抗菌药物费
    String getZcyf_mix(String pid);//中成药费
    String getZcyf(String pid);//中草药费
    String getXf(String pid);//血费
    String getBdb(String pid);//白蛋白类制品费
    String getQbd(String pid);//球蛋白类制品费
    String getNxyz(String pid);//凝血因子类制品费
    String getZbyz(String pid);//细胞因子类制品费
    String getJcy(String pid);//检查用一次性医用材料费
    String getZly(String pid);//治疗用一次性医用材料费
    String getSsy(String pid);//手术用一次性医用材料费
    String getQt(String pid);//其他费
    String getWeight(String pid);
    String getHeight(String pid);
    String getZs(String pid);//主诉
    String getCydy(String pid);//出院带药
    String getWsgj(String pid);//外显攻击行为评估表（新）
    String getZswxx(String pid);//自杀危险性因素评估表
    Long getAdl(String pid);
    String getBhxyssj(String pid);//保护性约束时间
    String getBhxyscs(String pid);//保护性约束次数_
    String getNorse(String pid);//保护性约束次数_

}
