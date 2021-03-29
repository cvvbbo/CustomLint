package top.omooo.customlint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    // 文章来自下面的链接
//    https://blog.csdn.net/singwhatiwanna/article/details/95559571

    private static final String TAG = "MainActivity";
    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIv = findViewById(R.id.iv);

    }



    /*** 下面这些如果不加自定义的lint库，那么即使在gradle中输入lint ，得出的报告也只是android lint 自带的  **/
    /**
     * 注意：
     * LagDetector
     * 这是一个 Error 级别的 Lint 警告
     * 编译时会终止编译
     * 运行时可以注释掉，或者配置 LintOptions
     */
    private void testLogUsage() {

        //Android 自带的 ToastDetector
        Toast.makeText(this, "", Toast.LENGTH_SHORT);


        // 以下都是自定义的lint 。
        //SampleCodeDetector
        System.out.println("Omooo");

        //PngDetector
        mIv.setImageResource(R.drawable.google);

        //LogDetector
        Log.i(TAG, "啊啊啊啊，我被发现了！");

        //ThreadDetector
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }

}
