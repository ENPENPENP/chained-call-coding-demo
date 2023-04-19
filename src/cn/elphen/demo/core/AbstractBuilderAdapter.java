package cn.elphen.demo.core;

/**
 * @author Elphen
 */
public abstract class AbstractBuilderAdapter<C, B extends IBuilder<C>> implements IBuilderAdapter<C, B> {

    private B builder;

    @Override
    public B and() {
        return getBuilder();
    }

    protected final B getBuilder() {
        return this.builder;
    }

    @Override
    public void setBuilder(B builder) {
        this.builder = builder;
    }

}