package cn.ucai.live.utils;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;


import cn.ucai.live.I;
import cn.ucai.live.R;
import cn.ucai.live.ui.activity.ChangeActivity;
import cn.ucai.live.ui.activity.LoginActivity;
import cn.ucai.live.ui.activity.MainActivity;
import cn.ucai.live.ui.activity.RegisterActivity;


/**
 * Created by clawpo on 2017/1/10.
 */

public class MFGT {
    public static void finish(Activity activity){
        activity.finish();
        activity.overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
    }

    public static void startActivity(Activity context, Class<?> clz){
        context.startActivity(new Intent(context, clz));
        context.overridePendingTransition(R.anim.push_right_in,R.anim.push_right_out);
    }

    public static void startActivity(Activity context, Intent intent){
        context.startActivity(intent);
        context.overridePendingTransition(R.anim.push_right_in,R.anim.push_right_out);
    }

    public static void gotoLogin(Activity activity){
        startActivity(activity, LoginActivity.class);
    }

    public static void gotoLoginCleanTask(Activity activity){
        startActivity(activity, new Intent(activity,LoginActivity.class)
                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
    }

    public static void gotoRegister(Activity activity){
        startActivity(activity, RegisterActivity.class);
    }

    public static void gotoMain(Activity activity){
        startActivity(activity,new Intent(activity,MainActivity.class)
        .putExtra(I.BACK_MAIN_FROM_CHAT,true));
    }

    public static void gotoChange(Activity activity) {
        startActivity(activity,ChangeActivity.class);
    }
}