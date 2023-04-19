package cn.elphen.demo.core;

/**
 * @author Elphen
 */
public interface IBuilderBackReference<C, BBF extends IBuilderBackReference<C, BBF>> extends IBuilder<C> {
}
