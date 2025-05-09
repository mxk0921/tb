package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.d;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.TaobaoApplication;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zgg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        if (TaobaoApplication.isMainProcess()) {
            lwt.c(application, TaobaoApplication.sPackageName, 0);
        }
        try {
            u9a.b(application);
        } catch (Throwable unused) {
        }
        fx4.m().n(application);
        BundleInfoManager.instance();
        ApplicationInvoker.getInstance(TaobaoApplication.sPackageName).invoke(TaoApplication.class.getName(), application, null);
        d.i().j(application);
    }
}
