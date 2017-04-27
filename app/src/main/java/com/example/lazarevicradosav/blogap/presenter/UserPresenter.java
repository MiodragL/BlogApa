package com.example.lazarevicradosav.blogap.presenter;

import android.widget.Toast;

import com.example.lazarevicradosav.blogap.LoginActivity;
import com.example.lazarevicradosav.blogap.model.User;

/**
 *Handles click events from LoginActivity and managages user object
 */

public class UserPresenter {

    private LoginActivity mView;

    public LoginActivity getmView() {
        return mView;
    }
    //alt+enter i importujemo klasu user

    public void onLoginClicked(User user){

        //// TODO: handle login clicked//

        Toast.makeText(mView, "User's email: "+user.getEmail(),Toast.LENGTH_SHORT).show();


    }
    //UMESTO SET STAVLJAMO PREFIKS BIND I TAKO GA POVEZUJEMO SA NASIM AKTIVITIJEM//
    public void bind(LoginActivity mView) {
        this.mView = mView;
    }


    //u sekciji button u xmlu smo stavili zapravmo lambda izraz posle onClick//


}
