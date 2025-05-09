package com.taobao.passivelocation.service;

import android.app.IntentService;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.ich;
import tb.t2o;
import tb.u5a;
import tb.yah;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UserSwitchControlService extends IntentService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_UPDATE_CONFIG = "com.taobao.passivelocation.Update_Config";

    /* renamed from: a  reason: collision with root package name */
    public ich f11450a;
    public u5a b;

    static {
        t2o.a(789577861);
    }

    public UserSwitchControlService() {
        this("UserControlService");
    }

    public static /* synthetic */ Object ipc$super(UserSwitchControlService userSwitchControlService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1899989668) {
            super.onStart((Intent) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/passivelocation/service/UserSwitchControlService");
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        yah.f31937a = getApplicationContext();
        this.f11450a = new ich(yah.f31937a);
        this.b = new u5a();
        AppMonitor.Counter.commit("passivelocation", "UserSwitchControlService", 1.0d);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onStart(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec0755c", new Object[]{this, intent, new Integer(i)});
            return;
        }
        super.onStart(intent, i);
        if (intent != null) {
            TextUtils.isEmpty(intent.getAction());
        }
    }

    public UserSwitchControlService(String str) {
        super(str);
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1253e327", new Object[]{this, intent});
        } else if (intent != null) {
            try {
                if (!TextUtils.isEmpty(intent.getAction()) && intent.getAction().equals(ACTION_UPDATE_CONFIG)) {
                    if (!"off".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "passivelocationoption", "off"))) {
                        if (intent.hasExtra("enabled")) {
                            if (intent.getBooleanExtra("enabled", false)) {
                                this.f11450a.b(intent.getBooleanExtra("enabled", false));
                            } else {
                                this.b.b(getApplicationContext());
                                new ich(yah.f31937a).e(false);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
