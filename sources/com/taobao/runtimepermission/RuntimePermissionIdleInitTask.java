package com.taobao.runtimepermission;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.config.RPConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.c21;
import tb.ean;
import tb.he2;
import tb.ndh;
import tb.p78;
import tb.u71;
import tb.xyl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RuntimePermissionIdleInitTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f11502a = new HashMap<String, String>() { // from class: com.taobao.runtimepermission.RuntimePermissionIdleInitTask.1
        {
            put("TB_SHOPPING_PROCESS", p78.ACCESS_FINE_LOCATION);
            put("TAO_XIAN_DA", p78.ACCESS_FINE_LOCATION);
            put("TAO_CAI_CAI", p78.ACCESS_FINE_LOCATION);
            put("TMALL_MARKET", p78.ACCESS_FINE_LOCATION);
            put("member_address", p78.ACCESS_FINE_LOCATION);
            put("TB_MESSAGE_LOCATION", p78.ACCESS_FINE_LOCATION);
            put(xyl.TB_GUANGGUANG, "android.permission.READ_EXTERNAL_STORAGE");
        }
    };

    public static void c(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        u71.f();
        if (ean.h().i().enableUniformAuth) {
            e(application);
        }
    }

    public static long b(Application application, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("349d5d29", new Object[]{application, str, new Long(j)})).longValue();
        }
        return application.getSharedPreferences("runtime_permission_status_sp", 0).getLong(str, j);
    }

    public static void d(Application application, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc40a65c", new Object[]{application, str, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = application.getSharedPreferences("runtime_permission_status_sp", 0).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public static void e(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd353c3", new Object[]{application});
        } else if (!a(application)) {
            ndh.a("RuntimePermissionIdle", "uniformAuthorize: authorization of permissions has already executed, exit.");
        } else if (!c21.g().getBoolean("isFirstLaunch", false)) {
            ndh.a("RuntimePermissionIdle", "uniformAuthorize: App is first installed, no need to auth permissions uniformly.");
        } else {
            RPConfig i = ean.h().i();
            ArrayList arrayList = new ArrayList();
            for (String str : i.bizPermissionWhiteList) {
                if (ContextCompat.checkSelfPermission(application, str) == 0) {
                    arrayList.add(str);
                }
            }
            for (String str2 : ((HashMap) f11502a).keySet()) {
                String str3 = (String) ((HashMap) f11502a).get(str2);
                if (arrayList.contains(str3)) {
                    he2.d(application, str2, str3, 0);
                    d(application, str2, System.currentTimeMillis());
                    u71.e(str2, str3);
                }
            }
            d(application, "uniform_authorize_last_time_v2", System.currentTimeMillis());
            ndh.a("RuntimePermissionIdle", "uniformAuthorize: App is upgrade, authorization of permissions is complete");
        }
    }

    public static boolean a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e2222a9", new Object[]{application})).booleanValue();
        }
        return b(application, "uniform_authorize_last_time_v2", -1L) == -1;
    }
}
