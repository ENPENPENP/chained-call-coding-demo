package cn.elphen.demo;

import cn.elphen.demo.core.AbstractBuilderAdapter;
import cn.elphen.demo.core.IBuilderBackReference;

/**
 * @author Elphen
 */
public class B_Configure<CB extends IBuilderBackReference<MergedConfigure, CB>>
        extends AbstractBuilderAdapter<MergedConfigure, CB> {

    B_Configure<CB> configB() {
        System.out.println("this is configure for B");
        return this;
    }

}