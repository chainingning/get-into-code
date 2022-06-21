package com.chaining.test;

import com.alibaba.fastjson2.JSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
 
/**
 * 文件目录转成树结构
 * @author lph
 */
public class FileTreeUtil {
    /**
     * 用来存放数据 可存库
     */
    private static List<Tree> list = new ArrayList<>();
    /**
     * 因为测试使用，当初主键id来用
     */
    private static Integer id = 0;
 
    public static void main(String[] args) {
 
        //扫描此文件夹下面的所有文件
        String filepath = "D:\\001项目管理\\002-智慧社区-蠡湖社区-bim-2022年6月\\02-执行\\2、设计编码与集成\\8#";
        //初始化父节点id
        int parentid = 0;
        try {
            file(filepath, parentid);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        for (int i = 0; i < list.size(); i++) {
//            Tree tree = list.get(i);
//            System.out.println("id==  " + tree.getId() + "  parentId==  " + tree.getParentId() + "  url==  " + tree.getPath());
//        }
        System.out.println(JSON.toJSONString(list));
    }
 
    public static void file(String filepath, int parentid) throws FileNotFoundException {
        File file = new File(filepath);
        //1.判断文件
        if (!file.exists()) {
            throw new FileNotFoundException("文件不存在");
        }
        //2.文件
        if (file.isFile()) {
            String name = file.getName();
            String path = file.getAbsolutePath();
            Tree tree = new Tree(id++, name, path, parentid);
            list.add(tree);
            return;
        }
        //3.获取文件夹路径下面的所有文件递归调用；
        if (file.isDirectory()) {
            String name = file.getName();
            String path = file.getAbsolutePath();
            Tree tree = new Tree(id++, name, path, parentid);
            list.add(tree);
            String[] list = file.list();
            for (int i = 0; i < list.length; i++) {
                String s = list[i];
                //根据当前文件夹，拼接其下文文件形成新的路径
                String newFilePath = path + "\\" + s;
                file(newFilePath, tree.getId());
            }
        }
    }
}
 
class Tree {
    private Integer id;
    //文件夹或者文件名称
    private String name;
    //全路径,或则部分路径,自己决定
    private String path;
    //父节点id
    private Integer parentId;
 
    public Tree() {
    }
 
    public Tree(Integer id, String name, String path, Integer parentId) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.parentId = parentId;
    }
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getPath() {
        return path;
    }
 
    public void setPath(String path) {
        this.path = path;
    }
 
    public Integer getParentId() {
        return parentId;
    }
 
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
 
    @Override
    public String toString() {
        return "Tree{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}