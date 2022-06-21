package com.chaining.test;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Data
public class FileTree implements TreeNode<Integer>{

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */

    private Integer id;

    /**
     * 组织名称
     */

    private String name;

    /**
     * 文件路径
     */
    private String path;

    /**
     * 父级ID
     */

    private Integer parentId;

    /**
     * 层级信息，从根节点到当前节点的最短路径，使用-分割节点ID
     */
    private String hierarchy;

    /**
     * 当前节点深度
     */
    private Integer depth;

    /**
     * 排序字段，由小到大
     */
    private Integer sort;

    /**
     * 描述信息
     */
    private String remarks;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 下级组织
     */
    List<FileTree> children = new ArrayList<>();

    /**
     * 设置节点的子节点列表
     * @param children 子节点
     */
    @Override
    @SuppressWarnings("unchecked")
    public <T extends TreeNode<Integer>> void setChildren(List<T> children) {
        this.children = (List<FileTree>) children;
    }
}
