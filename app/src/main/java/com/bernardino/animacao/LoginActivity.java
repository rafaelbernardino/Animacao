package com.bernardino.animacao;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView tvUser;
    TextView tvPass;
    EditText etUser;
    EditText etPass;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUser = (EditText) findViewById(R.id.etUserId);
        etPass = (EditText) findViewById(R.id.etPassId);
        tvUser = (TextView) findViewById(R.id.tvUserId);
        tvPass = (TextView) findViewById(R.id.tvSenhaId);
    }

    public void login(View view) {
        if (etUser.getText() != null && !etUser.getText().toString().equals("")
                && etPass.getText() != null && !etPass.getText().toString().equals("")
                && etUser.getText().toString().equals("admin") && etPass.getText().toString().equals("123")) {
            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
        } else {
            animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake_shake_shake);
//            etUser.startAnimation(animation);
//            etPass.startAnimation(animation);
            tvUser.startAnimation(animation);
            tvPass.startAnimation(animation);
            Vibrator vib = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
            vib.vibrate(500);
            Toast.makeText(this, "Usuáio ou senha inválido", Toast.LENGTH_LONG).show();
        }
    }
}
