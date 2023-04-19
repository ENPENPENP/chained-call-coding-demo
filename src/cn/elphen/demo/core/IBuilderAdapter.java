package cn.elphen.demo.core;

/**
 * @author Elphen
 */
public interface IBuilderAdapter<C, B extends IBuilder<C>> {

    B and();

    void setBuilder(B builder);
}
