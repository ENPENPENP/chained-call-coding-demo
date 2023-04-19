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
                // return A_Configure
                .A()
                .configA()
                // roll back to MergedConfigureBuilder
                .and()
                // return B_Configure
                .B()
                .configB()
                // roll back to MergedConfigureBuilder
                .and()
                .build();
    }

}