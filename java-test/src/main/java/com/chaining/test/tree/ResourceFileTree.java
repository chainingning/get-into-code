package com.chaining.test.tree;
 
/**
 * @author tqf
 * @Description
 * @Version 1.0
 * @since 2022-04-20 14:57
 */
import lombok.Data;
 
@Data
public class ResourceFileTree {
    /**
     *
     */
    private int treeId;
    /**
     * 父ID
     */
    private int pid;
    /**
     * 资源ID
     */
    private String resourcesId;
    /**
     * 文件名称、目录名
     */
    private String fileName;
    /**
     * 文件路径
     */
    private String filePath;
    /**
     * 文件大小
     */
    private Long size;
 
    /**
     * true-文件，false-目录
     */
    private Boolean isFile;
    private boolean expanded = false;
}