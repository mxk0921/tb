package com.taobao.android.weex_uikit.widget.musview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.ui.UINode;
import tb.egl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_BUNDLE_URL = "bundleUrl";
    public static final String ATTR_DATA = "data";
    public static final String ATTR_ENV = "env";
    public static final String ATTR_SCRIPT_URL = "scriptUrl";
    public static final String EVENT_EXCEPTION = "exception";
    public static final String EVENT_FAILED = "failed";
    public static final String EVENT_LOAD = "loaded";

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.weex_uikit.widget.musview.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class C0525a {

        /* renamed from: a  reason: collision with root package name */
        public int f10019a;
        public int b;

        static {
            t2o.a(986710187);
        }
    }

    static {
        t2o.a(986710186);
    }

    public static MUSUrlHost a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSUrlHost) ipChange.ipc$dispatch("a9bab998", new Object[]{context});
        }
        return new MUSUrlHost(context);
    }

    public static void b(UINode uINode, egl<C0525a> eglVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb72d69", new Object[]{uINode, eglVar});
        } else {
            eglVar.c(new C0525a());
        }
    }

    public static void c(UINode uINode, int i, int i2, int i3, int i4, int[] iArr, C0525a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3b7fd3", new Object[]{uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, aVar});
            return;
        }
        if (i3 == 1073741824) {
            iArr[0] = i;
        } else {
            iArr[0] = aVar.f10019a;
        }
        if (i4 == 1073741824) {
            iArr[1] = i2;
        } else {
            iArr[1] = aVar.b;
        }
    }

    public static void e(UINode uINode, MUSDKInstance mUSDKInstance, MUSUrlHost mUSUrlHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3591b4d", new Object[]{uINode, mUSDKInstance, mUSUrlHost});
        } else {
            mUSUrlHost.unmount();
        }
    }

    public static void f(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793bfec0", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("bundleUrl", str);
        }
    }

    public static void g(UINode uINode, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c36d5b", new Object[]{uINode, jSONObject});
        } else {
            uINode.setAttribute("data", jSONObject);
        }
    }

    public static void h(UINode uINode, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e84d1a", new Object[]{uINode, jSONObject});
        } else {
            uINode.setAttribute("env", jSONObject);
        }
    }

    public static void i(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1346e8c9", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("scriptUrl", str);
        }
    }

    public static void d(UINode uINode, MUSDKInstance mUSDKInstance, MUSUrlHost mUSUrlHost, C0525a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d74856f", new Object[]{uINode, mUSDKInstance, mUSUrlHost, aVar});
            return;
        }
        aVar.f10019a = 0;
        aVar.b = 0;
        View renderRoot = mUSDKInstance.getRenderRoot();
        if (renderRoot instanceof MUSView) {
            ((MUSView) renderRoot).setRecycleWhenDetach(false);
        }
        String str = (String) uINode.getAttribute("bundleUrl");
        if (TextUtils.isEmpty(str)) {
            str = mUSDKInstance.getInstanceEnv("bundleUrl");
        }
        mUSUrlHost.mount(uINode, (String) uINode.getAttribute("scriptUrl"), str, (JSONObject) uINode.getAttribute("data"), (JSONObject) uINode.getAttribute("env"), aVar);
    }
}
