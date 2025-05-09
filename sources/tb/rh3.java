package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.change.app.icon.model.AppIconComponentName;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rh3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(285212674);
    }

    public static void a(Application application, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b47aac", new Object[]{application, new Boolean(z)});
            return;
        }
        qh3.t(application, z, AppIconComponentName.create(application, "AppIcon", "com.taobao.tao.welcome.Welcome"), AppIconComponentName.create(application, "AppIconVIP", "com.taobao.tao.welcome.Alias1Welcome88VIP", R.mipmap.ic_tb_app_88vip));
        try {
            fsw.h("AlternateIconsBridge", ChangeAppIconBridge.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
