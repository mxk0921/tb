package com.ali.user.mobile.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.SessionManager;
import java.text.SimpleDateFormat;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FileUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(68157638);
    }

    public static int getLaunchTimes() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff14c017", new Object[0])).intValue();
        }
        int i = 1;
        try {
            if (DataProviderFactory.getApplicationContext() != null) {
                context = DataProviderFactory.getApplicationContext();
            } else {
                context = SessionManager.getContext();
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("aliuser_bootcount", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            if (!sharedPreferences.getString("todaytime", "").equals(simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())))) {
                edit.putString("todaytime", simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())));
            }
            int i2 = sharedPreferences.getInt("bootcountnum", 0);
            if (i2 >= 1) {
                int i3 = i2 + 1;
                edit.putInt("bootcountnum", i3);
                i = i3;
            } else {
                edit.putInt("bootcountnum", 1);
            }
            edit.apply();
        } catch (Exception unused) {
        }
        return i;
    }
}
