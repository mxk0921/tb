package com.taobao.weex;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.utils.WXLogUtils;
import java.util.HashMap;
import tb.h8s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile long f14135a = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements WXSDKManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(b bVar) {
        }

        @Override // com.taobao.weex.WXSDKManager.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4e0fc68", new Object[]{this, str, str2});
            }
        }

        @Override // com.taobao.weex.WXSDKManager.a
        public void onInitSuccess() {
            try {
                Class.forName("com.taobao.weex.InitWeexIdleTask").getMethod("doInit", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable th) {
                WXLogUtils.e("LauncherInitWeexIdle", th);
            }
        }
    }

    static {
        t2o.a(773849102);
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        WXLogUtils.e("weex", "enter LauncherInitWeexIdle");
        if (h8s.a(application.getApplicationContext())) {
            TLog.loge("Weex", "Weex", "skip LauncherInitWeexIdle");
        } else {
            WXSDKManager.getInstance().setInitListener(new a(this));
        }
    }
}
