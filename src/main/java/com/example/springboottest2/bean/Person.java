package com.example.springboottest2.bean;

public class Person {
    String bid;
    String pid;
    String adminission_no;
    String name;
    String sex;
    String weight;
    String height;
    String dept;
    String zkys;//质控医生
    String zkhs;//质控护士
    String zzys;//主治医生
    String zrhs;//责任护士
    String sfzh;//身份证号
    String zzd;//主诊断
    String zzddm;//主诊断代码
    String csrq;//出生日期
    String ryrq;//入院日期
    String cyrq;//出院日期
    String fffs;//付费方式
    String zytj;//住院途径
    String djczy;//第几次住院
    String zyts;//住院天数
    String lyfs;//离院方式
    String zfy;//总费用
    String zfje;//自费金额
    String ylfwf;//医疗服务费
    String zlczf;//治疗操作费
    String hlf;//护理费
    String zhyl;//综合医疗服务类其它费
    String blzdf;//病例诊断费
    String syszdf;//实验室
    String yxxzdf;//影像学诊断费用
    String lczdf;//临床诊断费用
    String fsszl;//非手术治疗项目费
    String lcwlzlfy;//其中临床物理治疗费
    String sszlf;//手术治疗费
    String mzf;//其中麻醉费
    String ssf;//其中手术费
    String kff;//康复费
    String zyzlf;//中医治疗费
    String xyf;//西药费
    String kjywf;//抗菌药物费
    String zcyf_mix;//中成药费
    String zcyf;//中草药费
    String xf;//血费
    String bdb;//白蛋白类制品费
    String qbd;//球蛋白类制品费
    String nxyz;//凝血因子类制品费
    String zbyz;//细胞因子类制品费
    String jcy;//检查用一次性医用材料费
    String zly;//治疗用一次性医用材料费
    String ssy;//手术用一次性医用材料费
    String qt;//其他费
    String zs;//主诉
    String cydy;//出院带药
    String wsgj;//外显攻击行为评估表（新）
    String zswxx;//自杀危险性因素评估表
    String adl;
    String bhxyssj;//保护性约束时间
    String bhxyscs;//保护性约束次数
    String norse;

    public String getPerson()  {
        return "Person{" +
                "pid='" + pid + '\'' +
                ", dept='" + dept + '\'' +
                ", bid='" + bid + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", adminission_no='" + adminission_no + '\'' +
                ", zkys='" + zkys + '\'' +
                ", zkhs='" + zkhs + '\'' +
                ", zzys='" + zzys + '\'' +
                ", zrhs='" + zrhs + '\'' +
                ", sfzh='" + sfzh + '\'' +
                ", zzd='" + zzd + '\'' +
                ", zzddm='" + zzddm + '\'' +
                ", csrq='" + csrq + '\'' +
                ", ryrq='" + ryrq + '\'' +
                ", cyrq='" + cyrq + '\'' +
                ", fffs='" + fffs + '\'' +
                ", zytj='" + zytj + '\'' +
                ", djczy='" + djczy + '\'' +
                ", zyts='" + zyts + '\'' +
                ", lyfs='" + lyfs + '\'' +
                ", zfy='" + zfy + '\'' +
                ", zfje='" + zfje + '\'' +
                ", ylfwf='" + ylfwf + '\'' +
                ", zlczf='" + zlczf + '\'' +
                ", hlf='" + hlf + '\'' +
                ", zhyl='" + zhyl + '\'' +
                ", blzdf='" + blzdf + '\'' +
                ", syszdf='" + syszdf + '\'' +
                ", yxxzdf='" + yxxzdf + '\'' +
                ", lczdf='" + lczdf + '\'' +
                ", fsszl='" + fsszl + '\'' +
                ", lcwlzlfy='" + lcwlzlfy + '\'' +
                ", sszlf='" + sszlf + '\'' +
                ", mzf='" + mzf + '\'' +
                ", ssf='" + ssf + '\'' +
                ", kff='" + kff + '\'' +
                ", zyzlf='" + zyzlf + '\'' +
                ", xyf='" + xyf + '\'' +
                ", kjywf='" + kjywf + '\'' +
                ", zcyf_mix='" + zcyf_mix + '\'' +
                ", zcyf='" + zcyf + '\'' +
                ", xf='" + xf + '\'' +
                ", bdb='" + bdb + '\'' +
                ", qbd='" + qbd + '\'' +
                ", nxyz='" + nxyz + '\'' +
                ", zbyz='" + zbyz + '\'' +
                ", jcy='" + jcy + '\'' +
                ", zly='" + zly + '\'' +
                ", ssy='" + ssy + '\'' +
                ", qt='" + qt + '\'' +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                ", zs='" + zs + '\'' +
                ", cydy='" + cydy + '\'' +
                ", wsgj='" + wsgj + '\'' +
                ", zswxx='" + zswxx + '\'' +
                ", adl=" + adl +
                ", bhxyssj='" + bhxyssj + '\'' +
                ", bhxyscs='" + bhxyscs + '\'' +
                ", norse='" + norse + '\'' +
                '}';
    }

    public String getAdminission_no() {
        return adminission_no;
    }

    public void setAdminission_no(String adminission_no) {
        this.adminission_no = adminission_no;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBhxyscs() {
        return bhxyscs;
    }

    public void setBhxyscs(String bhxyscs) {
        this.bhxyscs = bhxyscs;
    }

    public String getNorse() {
        return norse;
    }

    public void setNorse(String norse) {
        this.norse = norse;
    }

    public String getPid() {
        return pid;
    }


    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getZkys() {
        return zkys;
    }

    public void setZkys(String zkys) {
        this.zkys = zkys;
    }

    public String getZkhs() {
        return zkhs;
    }

    public void setZkhs(String zkhs) {
        this.zkhs = zkhs;
    }

    public String getZzys() {
        return zzys;
    }

    public void setZzys(String zzys) {
        this.zzys = zzys;
    }

    public String getZrhs() {
        return zrhs;
    }

    public void setZrhs(String zrhs) {
        this.zrhs = zrhs;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getZzd() {
        return zzd;
    }

    public void setZzd(String zzd) {
        this.zzd = zzd;
    }

    public String getZzddm() {
        return zzddm;
    }

    public void setZzddm(String zzddm) {
        this.zzddm = zzddm;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public String getRyrq() {
        return ryrq;
    }

    public void setRyrq(String ryrq) {
        this.ryrq = ryrq;
    }

    public String getCyrq() {
        return cyrq;
    }

    public void setCyrq(String cyrq) {
        this.cyrq = cyrq;
    }

    public String getFffs() {
        return fffs;
    }

    public void setFffs(String fffs) {
        this.fffs = fffs;
    }

    public String getZytj() {
        return zytj;
    }

    public void setZytj(String zytj) {
        this.zytj = zytj;
    }

    public String getDjczy() {
        return djczy;
    }

    public void setDjczy(String djczy) {
        this.djczy = djczy;
    }

    public String getZyts() {
        return zyts;
    }

    public void setZyts(String zyts) {
        this.zyts = zyts;
    }

    public String getLyfs() {
        return lyfs;
    }

    public void setLyfs(String lyfs) {
        this.lyfs = lyfs;
    }

    public String getZfy() {
        return zfy;
    }

    public void setZfy(String zfy) {
        this.zfy = zfy;
    }

    public String getZfje() {
        return zfje;
    }

    public void setZfje(String zfje) {
        this.zfje = zfje;
    }

    public String getYlfwf() {
        return ylfwf;
    }

    public void setYlfwf(String ylfwf) {
        this.ylfwf = ylfwf;
    }

    public String getZlczf() {
        return zlczf;
    }

    public void setZlczf(String zlczf) {
        this.zlczf = zlczf;
    }

    public String getHlf() {
        return hlf;
    }

    public void setHlf(String hlf) {
        this.hlf = hlf;
    }

    public String getZhyl() {
        return zhyl;
    }

    public void setZhyl(String zhyl) {
        this.zhyl = zhyl;
    }

    public String getBlzdf() {
        return blzdf;
    }

    public void setBlzdf(String blzdf) {
        this.blzdf = blzdf;
    }

    public String getSyszdf() {
        return syszdf;
    }

    public void setSyszdf(String syszdf) {
        this.syszdf = syszdf;
    }

    public String getYxxzdf() {
        return yxxzdf;
    }

    public void setYxxzdf(String yxxzdf) {
        this.yxxzdf = yxxzdf;
    }

    public String getLczdf() {
        return lczdf;
    }

    public void setLczdf(String lczdf) {
        this.lczdf = lczdf;
    }

    public String getFsszl() {
        return fsszl;
    }

    public void setFsszl(String fsszl) {
        this.fsszl = fsszl;
    }

    public String getLcwlzlfy() {
        return lcwlzlfy;
    }

    public void setLcwlzlfy(String lcwlzlfy) {
        this.lcwlzlfy = lcwlzlfy;
    }

    public String getSszlf() {
        return sszlf;
    }

    public void setSszlf(String sszlf) {
        this.sszlf = sszlf;
    }

    public String getMzf() {
        return mzf;
    }

    public void setMzf(String mzf) {
        this.mzf = mzf;
    }

    public String getSsf() {
        return ssf;
    }

    public void setSsf(String ssf) {
        this.ssf = ssf;
    }

    public String getKff() {
        return kff;
    }

    public void setKff(String kff) {
        this.kff = kff;
    }

    public String getZyzlf() {
        return zyzlf;
    }

    public void setZyzlf(String zyzlf) {
        this.zyzlf = zyzlf;
    }

    public String getXyf() {
        return xyf;
    }

    public void setXyf(String xyf) {
        this.xyf = xyf;
    }

    public String getKjywf() {
        return kjywf;
    }

    public void setKjywf(String kjywf) {
        this.kjywf = kjywf;
    }

    public String getZcyf_mix() {
        return zcyf_mix;
    }

    public void setZcyf_mix(String zcyf_mix) {
        this.zcyf_mix = zcyf_mix;
    }

    public String getZcyf() {
        return zcyf;
    }

    public void setZcyf(String zcyf) {
        this.zcyf = zcyf;
    }

    public String getXf() {
        return xf;
    }

    public void setXf(String xf) {
        this.xf = xf;
    }

    public String getBdb() {
        return bdb;
    }

    public void setBdb(String bdb) {
        this.bdb = bdb;
    }

    public String getQbd() {
        return qbd;
    }

    public void setQbd(String qbd) {
        this.qbd = qbd;
    }

    public String getNxyz() {
        return nxyz;
    }

    public void setNxyz(String nxyz) {
        this.nxyz = nxyz;
    }

    public String getZbyz() {
        return zbyz;
    }

    public void setZbyz(String zbyz) {
        this.zbyz = zbyz;
    }

    public String getJcy() {
        return jcy;
    }

    public void setJcy(String jcy) {
        this.jcy = jcy;
    }

    public String getZly() {
        return zly;
    }

    public void setZly(String zly) {
        this.zly = zly;
    }

    public String getSsy() {
        return ssy;
    }

    public void setSsy(String ssy) {
        this.ssy = ssy;
    }

    public String getQt() {
        return qt;
    }

    public void setQt(String qt) {
        this.qt = qt;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getZs() {
        return zs;
    }

    public void setZs(String zs) {
        this.zs = zs;
    }

    public String getCydy() {
        return cydy;
    }

    public void setCydy(String cydy) {
        this.cydy = cydy;
    }

    public String getWsgj() {
        return wsgj;
    }

    public void setWsgj(String wsgj) {
        this.wsgj = wsgj;
    }

    public String getZswxx() {
        return zswxx;
    }

    public void setZswxx(String zswxx) {
        this.zswxx = zswxx;
    }

    public String getAdl() {
        return adl;
    }

    public void setAdl(String adl) {
        this.adl = adl;
    }

    public String getBhxyssj() {
        return bhxyssj;
    }

    public void setBhxyssj(String bhxyssj) {
        this.bhxyssj = bhxyssj;
    }


}
