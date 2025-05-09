package tb;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.cus.WVCusPlugin;
import com.taobao.cus.a;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pz4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626311);
    }

    public static /* synthetic */ boolean c(JSONObject jSONObject, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9255b7d2", new Object[]{jSONObject, new Boolean(z), str})).booleanValue();
        }
        if (!z && lz4.i().b()) {
            wdm.f("ApkUpdater", "", "ApkUpdater.interrupt.background=false.");
            return false;
        } else if (!lz4.i().j()) {
            wdm.f("ApkUpdater", "", "ApkUpdater.interrupt.isNewStrategyEnable=false.");
            return false;
        } else if (!lz4.i().k()) {
            wdm.f("ApkUpdater", "", "ApkUpdater.interrupt.isNewUpdateForbidMTLPopEnable=false.");
            return false;
        } else {
            String u = a.q().u();
            wdm.f("ApkUpdater", "", "ApkUpdater.interrupt.isMTLPopForOfficialErrorCode=" + u);
            return TextUtils.isEmpty(u);
        }
    }

    public static void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            wdm.d("UpdaterInit.init", new Object[0]);
            sz4.b().d();
            a.q().o(application);
            fsw.i("WVAPKUpdatePlugin", WVCusPlugin.class, true);
            kjv.getInstance().registerInterceptor("main", new uif() { // from class: tb.oz4
                @Override // tb.uif
                public final boolean interrupt(JSONObject jSONObject, boolean z, String str) {
                    boolean c;
                    c = pz4.c(jSONObject, z, str);
                    return c;
                }
            });
            wdm.d("UpdaterInit.init.done", new Object[0]);
        } catch (Throwable th) {
            wdm.h("Updater.init.error", th);
        }
    }
}
