package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.amap.api.location.AMapLocationClient;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.PassiveLocationApplication;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class etl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_NAME = "com.taobao.location.privacy";

    /* renamed from: a  reason: collision with root package name */
    public static final String f18807a = "lbs_launcher";

    static {
        t2o.a(789577730);
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9906d80f", new Object[]{context, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(SP_NAME, 0).edit();
        edit.putBoolean("is_agreed_gd_privacy", true);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
        TLog.logi(f18807a, "agreed privacy policy");
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32f541eb", new Object[]{context})).booleanValue();
        }
        return context.getSharedPreferences(SP_NAME, 0).getBoolean("is_agreed_gd_privacy", false);
    }

    public static void c(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        d(application, true);
        new PassiveLocationApplication().onCreate(application);
    }

    public static void d(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e55d9176", new Object[]{context, new Boolean(z)});
        } else if (context != null && !b(context)) {
            AMapLocationClient.updatePrivacyShow(context, true, true);
            AMapLocationClient.updatePrivacyAgree(context, true);
            a(context, z);
        }
    }
}
