package com.chaining.test.tree;
 

import lombok.Data;
 
import java.util.List;
 
/**
 * @author tqf
 * @Description
 * @Version 1.0
 * @since 2022-04-19 17:01
 */
@Data
public class FileMessage {

    private Integer id;

    private Integer parentId;
 
    /**
     * 类型 0-文件夹，1-文件
     */
    private Integer type;
 
    /**
     * 文件名称
     */
    private String fileName;
 
    /**
     * 文件路径
     */
    private String filePath;
    /**
     * 文件大小
     */
    private Long fileSize;
    /**
     * 文件类型
     */
    private String fileType;
    /**
     * 子目录文件列表
     */
    private List<FileMessage> chindren;
 
}