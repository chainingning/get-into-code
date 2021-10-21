package com.chaining.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * description
 * <p>
 *
 * @author ning.chai@foxmail.com 2021/10/21 15:37
 */
public class Composite extends Component {

    private List<Component> childComponents = null;


    /**
     * 示意方法，子组件对象可能有的功能方法
     */
    @Override
    public void someOperation() {
        if (childComponents != null) {
            for (Component child : childComponents) {
                child.someOperation();
            }
        }
    }

    @Override
    public void addChild(Component child) {
        if (childComponents == null) {
            childComponents = new ArrayList<Component>();
        }
        childComponents.add(child);
    }

    @Override
    public void removeChild(Component child) {
        if (childComponents != null) {
            childComponents.remove(child);
        }
    }

    @Override
    public Component getChildren(int index) {
        if (childComponents != null) {
            if (index >= 0 && index < childComponents.size()) {
                return childComponents.get(index);
            }
        }
        return null;
    }
}
