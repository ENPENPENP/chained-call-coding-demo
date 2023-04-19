package cn.elphen.demo;

import cn.elphen.demo.core.AbstractBuilderAdapter;
import cn.elphen.demo.core.IBuilderBackReference;

/**
 * @author Elphen
 */
public class MergedConfigureBuilder implements IBuilderBackReference<MergedConfigure, MergedConfigureBuilder> {

    @Override
    public MergedConfigure build() {
        // TODO: do build operation here
        return new MergedConfigure();
    }

    public A_Configure<MergedConfigureBuilder> withA() {
        return getOrApply(new A_Configure<>());
    }

    public B_Configure<MergedConfigureBuilder> withB() {
        return getOrApply(new B_Configure<>());
    }

    private <C extends AbstractBuilderAdapter<MergedConfigure, MergedConfigureBuilder>> C getOrApply(C subConfigure) {
        // TODO: do something to store or bind config value into this builder from parameter configure

        // !!! must to bind parent builder to children builder here
        subConfigure.setBuilder(this);

        return subConfigure;
    }
}