package co.kr.modublog;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import co.kr.modublog.databinding.NoticeBinding;

public class NoticeActivity extends AppCompatActivity {

    NoticeBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this,R.layout.notice);

        String ed1 = null,ed2, ed3, ed4;


        switch (ed1){

            case "2":

                break;
            case "8":
                break;
            case "16":
                break;

        }




    }
}
