package co.kr.modublog;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import co.kr.modublog.databinding.LoginBinding;

public class LoginActivity extends AppCompatActivity{

    LoginBinding bind;
    LinearLayout back;
    EditText email,password;
    Button login,find,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this,R.layout.login);

        bind.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        bind.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = bind.email.getText().toString();
                String password = bind.password.getText().toString();

                if(validateLogin(email,password)){
                    doLogin(email,password);
                }

            }
        });
        bind.find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Login_FindActivity.class);
                startActivity(intent);
            }
        });
        bind.register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Login_RegisterActivity.class);
                startActivity(intent);
            }
        });

    }


    private boolean validateLogin(String email, String password){
      if(email == null || email.trim().length() == 0){
          Toast.makeText(getApplicationContext(),"이메일 주소를 입력해주세요",Toast.LENGTH_SHORT).show();
          return false;
      }
      if(password == null || password.trim().length() == 0){
            Toast.makeText(getApplicationContext(),"비밀번호를 입력해주세요",Toast.LENGTH_SHORT).show();
            return false;
      }
      return true;
    }

    private void doLogin(String email, String password){

    }
}
