package cn.elphen.demo;

import cn.elphen.demo.core.AbstractBuilderAdapter;
import cn.elphen.demo.core.IBuilderBackReference;

/**
 * @author Elphen
 */
public class A_Configure<CB extends IBuilderBackReference<MergedConfigure, CB>>
        extends AbstractBuilderAdapter<MergedConfigure, CB> {

    A_Configure<CB> configA() {
        System.out.println("this is configure for A");
        return this;
    }
}