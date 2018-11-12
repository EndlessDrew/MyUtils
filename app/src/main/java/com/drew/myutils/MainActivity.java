package com.drew.myutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    /**
     *
     * androidstudio项目里面报错compileDebugJavaWithJavac折磨我好久了，每次都是一点点排查代码，因为as不会给出具体出错的位置，
     * 今天修改的代码太多了，用排查的方式 太费事了，从网上找了好久，终于找到能帮助自己的信息了，记录一下，
     * 希望可以帮助更多向我一样的小伙伴....
     * 在Terminal里面输入命令gradlew compileDebugSources
     * --stacktrace -info然后仔细查找，就能找到你认识的类跟具体出错的地方了
     * --------------------
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //提交测试
    }
}
