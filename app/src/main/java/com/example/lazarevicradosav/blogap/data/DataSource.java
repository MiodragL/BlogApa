package com.example.lazarevicradosav.blogap.data;

import com.example.lazarevicradosav.blogap.model.User;

/**
 * FOR MANAGING OBJECTS AND MEMORY
 * npr da sacuvamo aplikacije i nakon rotiranja ekrana
 */

public class DataSource {

    private User mUser;
    private static DataSource mInstance;

    //ogranicavamo da objekat bude ogranicen iskljucivo na ovu klasu, tj da se ne moze kreirati npr iz login aktivitija//
    private DataSource(){}
    public static DataSource getInstance(){
        if(mInstance==null)
        {
            mInstance= new DataSource();

        }


        return mInstance;
    }

    public static DataSource getmInstance() {
        return mInstance;
    }

    public static void setmInstance(DataSource mInstance) {
        DataSource.mInstance = mInstance;
    }

    public User getUser() {

        if (mUser==null){
            mUser=new User();

        }
        return mUser;
    }

    public void setUser(User User) {
        this.mUser = mUser;
    }
}
