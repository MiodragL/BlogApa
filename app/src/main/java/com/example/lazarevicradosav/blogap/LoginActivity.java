package com.example.lazarevicradosav.blogap;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lazarevicradosav.blogap.data.DataSource;
import com.example.lazarevicradosav.blogap.databinding.ActivityLoginBinding;
import com.example.lazarevicradosav.blogap.model.User;
import com.example.lazarevicradosav.blogap.presenter.UserPresenter;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //ODRADJUJE DATABINDING UMESTO NAS//
        ActivityLoginBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_login);
       // NijE NAM POTREBNO PA STAVLJAMMO POD KOMENTAR JER GA PRAVIMO METODOM BINDING.SETUSER User user= DataSource.getInstance().getmUser();

        //OVIM CE PO POKRETANJU NASE APLIKACIJE PO DIFOLTU IMATI OVAJ IMEJL I PASSWD, JER SMO U XML FAJLU DODALI USER.EMAIL//

        UserPresenter presenter=new UserPresenter();


        //PREZENTER BINDUJEMO SA OVIM AKTIVITIJEM KAKO BISMO IMALI KONTEKST//


        presenter.bind(this);
        //KRITICNO!!!!//
        binding.setUser(DataSource.getInstance().getmUser());
        binding.setPresenter(presenter);


        //UserPresenter je klasa i nju predstavljamo pomocu varijable presenter//


    }
}
