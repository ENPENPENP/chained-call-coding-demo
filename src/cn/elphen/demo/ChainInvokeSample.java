package cn.elphen.demo;

/**
 * @author Elphen
 */
public class ChainInvokeSample {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        MergedConfigure configure = new MergedConfigureBuilder()
                .withA()
                .doSomething()
                .and()
                .withB()
                .doSomething()
                .and()
                .build();
    }

}