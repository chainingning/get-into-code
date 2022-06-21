package com.chaining.test.tree;
 
/**
 * @author tqf
 * @Description
 * @Version 1.0
 * @since 2022-04-20 14:57
 */

 
import cn.hutool.core.util.StrUtil;

import java.io.File;
import java.util.*;
 
public class FileTree {
    //用于储存找到的每一个文件
    List<ResourceFileTree> node=new LinkedList();
 
    /**
     * 读取文件目录返回树形结构
     * @param path 文件路径
     * @param id 每条记录的id
     * @param pid 父id
     * @param resourcesId 数据资源的id
     * @param fileFilter 过滤掉某个命名的文件
     * @return
     */
    private  List<ResourceFileTree> getFile(String path, int id, int pid, String resourcesId,String fileFilter) {
        File file = new File(path);
        if(file.exists()) {
            File[] array = file.listFiles();
            List fileList = Arrays.asList(array);
            //对读到的本地文件夹进行排序
            Collections.sort(fileList, new Comparator<File>() {
                @Override
                public int compare(File o1, File o2) {
                    if (o1.isDirectory() && o2.isFile()){
                        return -1;
                    }
                    if (o1.isFile() && o2.isDirectory()){
                        return 1;
                    }
                    return o1.getName().compareTo(o2.getName());
                }
            });
 
            for (int i = 0; i < array.length; i++) {
                ResourceFileTree resourceFileTree = new ResourceFileTree();
                //过滤文件
                if(StrUtil.isNotBlank(fileFilter) && fileFilter.equals(array[i].getName())){
                    continue;
                }
                resourceFileTree.setResourcesId(resourcesId);
                resourceFileTree.setPid(pid);
                resourceFileTree.setTreeId(id);
                resourceFileTree.setFilePath(array[i].getPath());
                resourceFileTree.setFileName(array[i].getName());
                resourceFileTree.setIsFile(array[i].isFile());
                //判断是否为文件夹，是的话进行递归
                if (array[i].isDirectory()) {
                    node.add(resourceFileTree);
                    //进行递归，此时的pid为上一级的id
                    getFile(array[i].getPath(), id * 10 + 1 + i, id,resourcesId,fileFilter);
                    id++;
                } else {
                    resourceFileTree.setSize(array[i].length());
                    node.add(resourceFileTree);
                    id++;
                }
            }
        }
        return node;
    }
 
    public List<ResourceFileTree> getFileTree(String resourcesId, String path,String fileFilter) {
        node.removeAll(node);
        FileTree counter = new FileTree();
        int level=0;
        List<ResourceFileTree> file = counter.getFile(path, 1, level,resourcesId,fileFilter);
        return file;
    }
}