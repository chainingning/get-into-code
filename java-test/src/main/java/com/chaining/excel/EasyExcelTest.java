package com.chaining.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson2.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class EasyExcelTest {
    private static void read2() {
        final List list = new ArrayList();
        List<Person> personList = new ArrayList();
        //使用EasyExcel读取test1.xlsx文件
        EasyExcel.read("E:\\easyexcel1.xls", Person.class, new AnalysisEventListener<Person>() {
                    //重写子类方法
                    @Override
                    public void invoke(Person question1, AnalysisContext analysisContext) {
                        list.add(question1);
                    }

                    //重写子类方法
                    @Override
                    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

                    }

                    @Override
                    public void invokeHeadMap(Map headMap, AnalysisContext context) {
                        System.out.println(headMap);
                    }
                }
        ).doReadAll();

        //获取读取到的数据
        for (Object o : list) {
            Person question1 = (Person) o;
            personList.add(question1);
        }

        Map<String, List<Person>> collect = personList.stream().collect(Collectors.groupingBy(Person::getAddress,
                Collectors.toList()));

//        System.out.println(JSON.toJSONString(personList));
        System.out.println(JSON.toJSONString(collect));

    }

    public static void main(String[] args) {
        read2();
    }

}
