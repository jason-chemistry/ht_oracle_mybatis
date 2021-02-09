package com.example.springboottest2.service.serviceImpl;

import com.example.springboottest2.bean.Person;
import com.example.springboottest2.dao.CeshiDao;
import com.example.springboottest2.service.CeshiService;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class CeshiServiceImpl implements CeshiService {

    @Autowired
    private CeshiDao ceshiDao;

    @Override
    public String query() {
        String i = ceshiDao.query();
        return i;
    }
    @Override
    public List<String> getAllPid(){
        List<String> pids=ceshiDao.getAllPid();

        return pids;
    }
    @Override
    public List<String> getAllBid(){
        List<String> bids=ceshiDao.getAllBid();
        return bids;
    }
    @Override
    public String getAllMessage() throws IOException {
        List<String> pids=ceshiDao.getAllPid();
        List<String> bids=ceshiDao.getAllBid();
        List<String> sexs=ceshiDao.getSex("1");
        List<String> depts=ceshiDao.getDept("1");
        List<String> names=ceshiDao.getName("1");
        List<Person> persons=new ArrayList<Person>();

        for(int k=0;k<=pids.size();k++) {
            Person person=new Person();
            String p=pids.get(k);
            String b=bids.get(k);

            person.setPid(p);
            person.setBid(b);
            person.setAdminission_no(b);
            person.setSex(sexs.get(k));
            person.setDept(depts.get(k));
            person.setName(names.get(k));
            person.setZkys(ceshiDao.getZkys(p));
            person.setZkhs(ceshiDao.getZkhs(p));
            person.setZzys(ceshiDao.getZzys(p));
            person.setZrhs(ceshiDao.getZrhs(p));
            person.setSfzh(ceshiDao.getSfzh(b));
            person.setZzd(ceshiDao.getZzd(p));
            person.setZzddm(ceshiDao.getZzddm(p));
            person.setCsrq(ceshiDao.getCsrq(p));
            person.setRyrq(ceshiDao.getRyrq(p));
            person.setCyrq(ceshiDao.getCyrq(p));
            person.setFffs(ceshiDao.getFffs(p));
            person.setZytj(ceshiDao.getZytj(p));
            person.setDjczy(ceshiDao.getDjczy(p));
            person.setZyts(ceshiDao.getZyts(p));
            person.setLyfs(ceshiDao.getLyfs(p));
            person.setZfy(ceshiDao.getZfy(p));
            person.setZfje(ceshiDao.getZfje(p));
            person.setYlfwf(ceshiDao.getYlfwf(p));
            person.setZlczf(ceshiDao.getZlczf(p));
            person.setHlf(ceshiDao.getHlf(p));
            person.setZhyl(ceshiDao.getZhyl(p));
            person.setBlzdf(ceshiDao.getBlzdf(p));
            person.setSyszdf(ceshiDao.getSyszdf(p));
            person.setYxxzdf(ceshiDao.getYxxzdf(p));
            person.setLczdf(ceshiDao.getLczdf(p));
            person.setFsszl(ceshiDao.getFsszl(p));
            person.setLcwlzlfy(ceshiDao.getLcwlzlfy(p));
            person.setSszlf(ceshiDao.getSszlf(p));
            person.setMzf(ceshiDao.getMzf(p));
            person.setSsf(ceshiDao.getSsf(p));
            person.setKff(ceshiDao.getKff(p));
            person.setZyzlf(ceshiDao.getZyzlf(p));
            person.setXyf(ceshiDao.getXyf(p));
            person.setKjywf(ceshiDao.getKjywf(p));
            person.setZcyf_mix(ceshiDao.getZcyf_mix(p));
            person.setZcyf(ceshiDao.getZcyf(p));
            person.setXf(ceshiDao.getXf(p));
            person.setBdb(ceshiDao.getBdb(p));
            person.setQbd(ceshiDao.getQbd(p));
            person.setNxyz(ceshiDao.getNxyz(p));
            person.setZbyz(ceshiDao.getZbyz(p));
            person.setJcy(ceshiDao.getJcy(p));
            person.setZly(ceshiDao.getZly(p));
            person.setSsy(ceshiDao.getSsy(p));
            person.setQt(ceshiDao.getQt(p));
            person.setWeight(ceshiDao.getWeight(p));
            person.setHeight(ceshiDao.getHeight(p));//有问题
            person.setZs(ceshiDao.getZs(p));
            person.setCydy(ceshiDao.getCydy(p));
            person.setWsgj(ceshiDao.getWsgj(p));
            person.setZswxx(ceshiDao.getZswxx(p));
            Long l=ceshiDao.getAdl(p);
            String m=String.valueOf(l);
            person.setAdl(m);
            person.setBhxyssj(ceshiDao.getBhxyssj(p));
            person.setBhxyscs(ceshiDao.getBhxyscs(p));
            person.setNorse(ceshiDao.getNorse(p));
            persons.add(person);
            System.out.println(person.getPerson());
        }

        HSSFWorkbook wb = new HSSFWorkbook();
        //  创建一个工作表
        HSSFSheet sheet = wb.createSheet();

        //  创建行
        HSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("bid");
        row.createCell(1).setCellValue("pid");
        row.createCell(2).setCellValue("adminission_no");
        row.createCell(3).setCellValue("name");
        row.createCell(4).setCellValue("sex");
        row.createCell(5).setCellValue("weight");
        row.createCell(6).setCellValue("height");
        row.createCell(7).setCellValue("dept");
        row.createCell(8).setCellValue("zkys");
        row.createCell(9).setCellValue("zkhs");
        row.createCell(10).setCellValue("zzys");
        row.createCell(11).setCellValue("zrhs");
        row.createCell(12).setCellValue("sfzh");
        row.createCell(13).setCellValue("zzd");
        row.createCell(14).setCellValue("zzddm");
        row.createCell(15).setCellValue("csrq");
        row.createCell(16).setCellValue("ryrq");
        row.createCell(17).setCellValue("cyrq");
        row.createCell(18).setCellValue("fffs");
        row.createCell(19).setCellValue("zytj");
        row.createCell(20).setCellValue("djczy");
        row.createCell(21).setCellValue("zyts");
        row.createCell(22).setCellValue("lyfs");
        row.createCell(23).setCellValue("zfy");
        row.createCell(24).setCellValue("zfje");
        row.createCell(25).setCellValue("ylfwf");
        row.createCell(26).setCellValue("zlczf");
        row.createCell(27).setCellValue("hlf");
        row.createCell(28).setCellValue("zhyl");
        row.createCell(29).setCellValue("blzdf");
        row.createCell(30).setCellValue("syszdf");
        row.createCell(31).setCellValue("yxxzdf");
        row.createCell(32).setCellValue("lczdf");
        row.createCell(33).setCellValue("fsszl");
        row.createCell(34).setCellValue("lcwlzlfy");
        row.createCell(35).setCellValue("sszlf");
        row.createCell(36).setCellValue("mzf");
        row.createCell(37).setCellValue("ssf");
        row.createCell(38).setCellValue("kff");
        row.createCell(39).setCellValue("zyzlf");
        row.createCell(40).setCellValue("xyf");
        row.createCell(41).setCellValue("kjywf");
        row.createCell(42).setCellValue("zcyf_mix");
        row.createCell(43).setCellValue("zcyf");
        row.createCell(44).setCellValue("xf");
        row.createCell(45).setCellValue("bdb");
        row.createCell(46).setCellValue("qbd");
        row.createCell(47).setCellValue("nxyz");
        row.createCell(48).setCellValue("zbyz");
        row.createCell(49).setCellValue("jcy");
        row.createCell(50).setCellValue("zly");
        row.createCell(51).setCellValue("ssy");
        row.createCell(52).setCellValue("qt");
        row.createCell(53).setCellValue("zs");
        row.createCell(54).setCellValue("cydy");
        row.createCell(55).setCellValue("wsgj");
        row.createCell(56).setCellValue("zswxx");
        row.createCell(57).setCellValue("adl");
        row.createCell(58).setCellValue("bhxyssj");
        row.createCell(59).setCellValue("bhxyscs");
        row.createCell(60).setCellValue("nosie");





        for (int i = 1; i < persons.size(); i++) {
            HSSFRow rows = sheet.createRow(i);
            Person a=persons.get(i-1);
            for (int j = 0; j < 59; j = j + 1){
                rows.createCell(0).setCellValue(a.getBid());
                rows.createCell(1).setCellValue(a.getPid());
                rows.createCell(2).setCellValue(a.getAdminission_no());
                rows.createCell(3).setCellValue(a.getName());
                rows.createCell(4).setCellValue(a.getSex());
                rows.createCell(5).setCellValue(a.getWeight());
                rows.createCell(6).setCellValue(a.getHeight());
                rows.createCell(7).setCellValue(a.getDept());
                rows.createCell(8).setCellValue(a.getZkys());
                rows.createCell(9).setCellValue(a.getZkhs());
                rows.createCell(10).setCellValue(a.getZzys());
                rows.createCell(11).setCellValue(a.getZrhs());
                rows.createCell(12).setCellValue(a.getSfzh());
                rows.createCell(13).setCellValue(a.getZzd());
                rows.createCell(14).setCellValue(a.getZzddm());
                rows.createCell(15).setCellValue(a.getCsrq());
                rows.createCell(16).setCellValue(a.getRyrq());
                rows.createCell(17).setCellValue(a.getCyrq());
                rows.createCell(18).setCellValue(a.getFffs());
                rows.createCell(19).setCellValue(a.getZytj());
                rows.createCell(20).setCellValue(a.getDjczy());
                rows.createCell(21).setCellValue(a.getZyts());
                rows.createCell(22).setCellValue(a.getLyfs());
                rows.createCell(23).setCellValue(a.getZfy());
                rows.createCell(24).setCellValue(a.getZfje());
                rows.createCell(25).setCellValue(a.getYlfwf());
                rows.createCell(26).setCellValue(a.getZlczf());
                rows.createCell(27).setCellValue(a.getHlf());
                rows.createCell(28).setCellValue(a.getZhyl());
                rows.createCell(29).setCellValue(a.getBlzdf());
                rows.createCell(30).setCellValue(a.getSyszdf());
                rows.createCell(31).setCellValue(a.getYxxzdf());
                rows.createCell(32).setCellValue(a.getLczdf());
                rows.createCell(33).setCellValue(a.getFsszl());
                rows.createCell(34).setCellValue(a.getLcwlzlfy());
                rows.createCell(35).setCellValue(a.getSszlf());
                rows.createCell(36).setCellValue(a.getMzf());
                rows.createCell(37).setCellValue(a.getSsf());
                rows.createCell(38).setCellValue(a.getKff());
                rows.createCell(39).setCellValue(a.getZyzlf());
                rows.createCell(40).setCellValue(a.getXyf());
                rows.createCell(41).setCellValue(a.getKjywf());
                rows.createCell(42).setCellValue(a.getZcyf_mix());
                rows.createCell(43).setCellValue(a.getZcyf());
                rows.createCell(44).setCellValue(a.getXf());
                rows.createCell(45).setCellValue(a.getBdb());
                rows.createCell(46).setCellValue(a.getQbd());
                rows.createCell(47).setCellValue(a.getNxyz());
                rows.createCell(48).setCellValue(a.getZbyz());
                rows.createCell(49).setCellValue(a.getJcy());
                rows.createCell(50).setCellValue(a.getZly());
                rows.createCell(51).setCellValue(a.getSsy());
                rows.createCell(52).setCellValue(a.getQt());
                rows.createCell(53).setCellValue(a.getZs());
                rows.createCell(54).setCellValue(a.getCydy());
                rows.createCell(55).setCellValue(a.getWsgj());
                rows.createCell(56).setCellValue(a.getZswxx());
                rows.createCell(57).setCellValue(a.getAdl());
                rows.createCell(58).setCellValue(a.getBhxyssj());
                rows.createCell(59).setCellValue(a.getBhxyscs());
                rows.createCell(60).setCellValue(a.getNorse());

            }
        }

        //  写文件
        FileOutputStream fos = new FileOutputStream("G:/wb.xls");
        wb.write(fos);
        fos.close();

        return "1";
    }



















    @Override
    public String getZkys(String pid) { return ceshiDao.getZkys(pid); }
    @Override
    public String  getZkhs(String pid){
        return ceshiDao.getZkhs(pid);
    }
    @Override
    public String getZzys(String pid){
        return ceshiDao.getZzys(pid);
    }
    @Override
    public String getZrhs(String pid) {
        return ceshiDao.getZrhs(pid);
    }
    @Override
    public String getSfzh(String pid) {
        return ceshiDao.getSfzh(pid);
    }
	@Override
	public String getZzd(String pid) {return ceshiDao.getZzd(pid); }
	
	@Override
	public String getCsrq(String pid){
        return "1";
	}
	@Override
	public String getRyrq(String pid){
        return "1";
	}
	@Override
	public String getCyrq(String pid){
        return "1";
	}//出院日期
	@Override
	public String getFffs(String pid){
        return "1";
	}//付费方式
	@Override
	public String getZytj(String pid){
		return "1";
	}	//住院途径
	@Override
    public String getDjczy(String pid){
        return "1";
	}//第几次住院
	@Override
    public String getZyts(String pid){
        return "1";
	}//住院天数
	@Override
	public String getLyfs(String pid){
        return "1";
	}//离院方式
	@Override
    public String getZfy(String pid){
        return "1";
	}//总费用
	@Override
    public String getZfje(String pid){
        return "1";
	}//自费金额
	@Override
    public String getYlfwf(String pid){
        return "1";
	}//医疗服务费
	@Override
    public String getZlczf(String pid){
        return "1";
	}//治疗操作费
	@Override
    public String getHlf(String pid){
        return "1";
	}//护理费
	@Override
	public String getZhyl(String pid){
        return "1";
	}//综合医疗服务类其它费
	@Override
    public String getBlzdf(String pid){
        return "1";
	}//病例诊断费
	@Override
    public String getSyszdf(String pid){
        return "1";
	}//实验室
	@Override
    public String getYxxzdf(String pid){
        return "1";
	}//影像学诊断费用
	@Override
    public String getLczdf(String pid){
        return "1";
	}//临床诊断费用
    @Override
    public  String getFsszl(String pid){
        return "1";
    }
    //非手术治疗项目费
    @Override
    public String getLcwlzlfy(String pid){
        return "1";
    }//其中临床物理治疗费
    @Override
    public String getSszlf(String pid){
        return "1";
    }
    //手术治疗费
    @Override
    public String getMzf(String pid){
        return "1";
    }//其中麻醉费
    @Override
    public  String getSsf(String pid){
        return "1";
    }//其中手术费
    @Override
    public String getKff(String pid){
        return "1";
    }//康复费
    @Override
    public  String getZyzlf(String pid){
        return "1";
    }//中医治疗费
    @Override
    public String getXyf(String pid){
        return "1";
    }//西药费
    @Override
    public String getKjywf(String pid){
        return "1";
    }//抗菌药物费
    @Override
    public String getZcyf_mix(String pid) {
        return "1";
    }//药费
    @Override
    public String getZcyf(String pid){
        return "1";
    }//中草药费
    @Override
    public String getXf(String pid){
        return "1";
    }//血费
    @Override
    public String getBdb(String pid){
        return "1";
    }//白蛋白类制品费
    @Override
    public String getQbd(String pid){
        return "1";
    }//球蛋白类制品费
    @Override
    public String getNxyz(String pid){
        return "1";
    }//凝血因子类制品费
    @Override
    public String getZbyz(String pid){
        return "1";
    }//细胞因子类制品费
    @Override
    public String getJcy(String pid){
        return "1";
    }//检查用一次性医用材料费
    @Override
    public String getZly(String pid){
        return "1";
    }//治疗用一次性医用材料费
    @Override
    public String getSsy(String pid){
        return "1";
    }//手术用一次性医用材料费
	@Override
    public String getQt(String pid){
        return "1";
    }//其他费
    @Override
     public String getWeight(String pid) {
        return "1";
    }
    @Override
   public String getHeight(String pid){
        return "1";
    }
    @Override
    public String getZs(String pid){
        return "1";
    }//主诉
    @Override
    public String getCydy(String pid){
        return "1";
    }//出院带药
    @Override
    public String getWsgj(String pid){
        return "1";
    }//外显攻击行为评估表（新）
    @Override
    public String getZswxx(String pid){
        return "1";
    }//自杀危险性因素评估表
    @Override
    public Long getAdl(String pid){
        return  Long.parseLong("123");

    }
    @Override
    public String getBhxyssj(String pid){
        return "1";
    }//保护性约束时间
    @Override
    public Long getBhxyscs(String pid){
        return  Long.parseLong("123");
    }//保护性约束次数_

}
