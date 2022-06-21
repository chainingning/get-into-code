package com.chaining.test.tree;

import com.alibaba.fastjson2.JSON;

import java.util.ArrayList;
import java.util.List;

public class TreeMain {
    public static void main(String[] args) {
        FileTree counter = new FileTree();
        // 返回所有文件目录和文件 但是是list结构不是树形结构
        List<ResourceFileTree> fileResourceFileTree = counter.getFileTree("5asd5as6d8asdas4dqw873e4", "F:\\buildingCAD","");
        // 下面处理为树形结构
        List<FileMessage> list = new ArrayList<>();
        for (ResourceFileTree data : fileResourceFileTree){
            FileMessage message = new FileMessage();
            message.setId(data.getTreeId());
            message.setParentId(data.getPid());
            message.setFileSize(data.getSize());
            message.setFileName(data.getFileName());
            message.setFilePath(data.getFilePath());
            message.setType(data.getIsFile() ? 1: 0);
            list.add(message);
        }
        List<FileMessage> powerListDTOSs = TreeUtil.toTree(list, "id", "parentId", "chindren", FileMessage.class);
        System.out.println(JSON.toJSONString(powerListDTOSs));
    }
}
