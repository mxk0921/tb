package com.taobao.weex;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.utils.WXLogUtils;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements WXSDKManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(c cVar) {
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
        t2o.a(773849104);
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        WXLogUtils.e("weex", "enter LauncherInitWeexIdle");
        WXSDKManager.getInstance().setInitListener(new a(this));
    }
}
