package co.kr.modublog;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import co.kr.modublog.databinding.LoginBinding;

public class LoginActivity extends AppCompatActivity{

    LoginBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this,R.layout.login);
    }
}
