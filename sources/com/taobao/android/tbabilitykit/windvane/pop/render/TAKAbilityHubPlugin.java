package com.taobao.android.tbabilitykit.windvane.pop.render;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.a8;
import tb.b8;
import tb.c8;
import tb.f8;
import tb.gxv;
import tb.kpw;
import tb.n8;
import tb.n9;
import tb.t2o;
import tb.u8;
import tb.y7;
import tb.ye2;
import tb.zq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TAKAbilityHubPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ABILITY_DEFAULT_TYPE = "unknownType";
    private static final String TAG = "TAKAbilityHubPlugin";
    private static final int WV_PLUGIN_ERROR_CODE = 20001;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f9544a;

        public a(WVCallBackContext wVCallBackContext) {
            this.f9544a = wVCallBackContext;
        }

        @Override // tb.u8
        public void callback(String str, c8 c8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
            } else {
                TAKAbilityHubPlugin.access$000(TAKAbilityHubPlugin.this, c8Var, this.f9544a, str, false);
            }
        }

        public void finalize() throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
                return;
            }
            this.f9544a.success();
            super.finalize();
        }
    }

    static {
        t2o.a(786432161);
    }

    public static /* synthetic */ void access$000(TAKAbilityHubPlugin tAKAbilityHubPlugin, c8 c8Var, WVCallBackContext wVCallBackContext, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22055c3a", new Object[]{tAKAbilityHubPlugin, c8Var, wVCallBackContext, str, new Boolean(z)});
        } else {
            tAKAbilityHubPlugin.wvCallBack(c8Var, wVCallBackContext, str, z);
        }
    }

    private static void failCallback(String str, int i, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a29276", new Object[]{str, new Integer(i), str2, wVCallBackContext});
        } else {
            wVCallBackContext.error(ye2.c(str, i, str2).toJSONString());
        }
    }

    public static /* synthetic */ Object ipc$super(TAKAbilityHubPlugin tAKAbilityHubPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/windvane/pop/render/TAKAbilityHubPlugin");
    }

    private static void successCallback(String str, Object obj, WVCallBackContext wVCallBackContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cbf4c2", new Object[]{str, obj, wVCallBackContext, new Boolean(z)});
        } else if (z) {
            wVCallBackContext.successAndKeepAlive(ye2.d(str, obj).toJSONString());
        } else {
            wVCallBackContext.success(ye2.d(str, obj).toJSONString());
        }
    }

    private void wvCallBack(c8 c8Var, WVCallBackContext wVCallBackContext, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d054cdd5", new Object[]{this, c8Var, wVCallBackContext, str, new Boolean(z)});
        } else if (c8Var instanceof b8) {
            if (c8Var == null || !(c8Var.a() instanceof a8)) {
                failCallback(str, 20001, "未知错误", wVCallBackContext);
                return;
            }
            a8 a8Var = (a8) c8Var.a();
            failCallback(str, a8Var.a(), a8Var.b(), wVCallBackContext);
        } else if (c8Var instanceof f8) {
            successCallback(str, c8Var.a(), wVCallBackContext, z);
        } else {
            successCallback(str, c8Var != null ? c8Var.a() : null, wVCallBackContext, true);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"dispatch".equals(str)) {
            failCallback(ABILITY_DEFAULT_TYPE, 20001, "unsupported " + str, wVCallBackContext);
            return false;
        }
        IWVWebView webview = wVCallBackContext.getWebview();
        if (!(webview instanceof IWVWebView) || (view = webview.getView()) == null) {
            failCallback(ABILITY_DEFAULT_TYPE, 20001, "WebView is not view", wVCallBackContext);
            return false;
        }
        int i = R.id.tak_pop_ability_engine_tag;
        Object tag = view.getTag(i);
        JSONObject jSONObject = null;
        y7 y7Var = tag instanceof y7 ? (y7) tag : null;
        if (y7Var == null) {
            y7Var = new y7(new zq("AbilityKit", "windvane_hub"), null);
            view.setTag(i, y7Var);
        }
        n9 n9Var = new n9();
        n9Var.i(gxv.o(view.getContext()));
        n9Var.m(view);
        n9Var.g(y7Var);
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = JSON.parseObject(str2);
            } catch (Exception unused) {
            }
        }
        if (jSONObject == null) {
            failCallback(ABILITY_DEFAULT_TYPE, 20001, "params parse error :" + str2, wVCallBackContext);
            return false;
        }
        wvCallBack(y7Var.b(new n8(jSONObject), n9Var, new a(wVCallBackContext)), wVCallBackContext, "default", true);
        return true;
    }
}
