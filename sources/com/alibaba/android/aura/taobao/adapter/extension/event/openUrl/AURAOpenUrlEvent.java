package com.alibaba.android.aura.taobao.adapter.extension.event.openUrl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.a;
import com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import tb.bh;
import tb.ck;
import tb.fsw;
import tb.hh;
import tb.lo;
import tb.q5l;
import tb.qi;
import tb.rf;
import tb.t2o;
import tb.ws;
import tb.xk;
import tb.xq0;
import tb.yi;
import tb.zbb;

/* compiled from: Taobao */
@AURAExtensionImpl(code = AURAOpenUrlEvent.CODE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AURAOpenUrlEvent extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.impl.event.openUrl";
    public static final String EVENT_TYPE = "openUrl";
    public static final String KEY_PARAMS_METHOD = "method";
    public static final String KEY_PARAMS_PAGE_TYPE = "pageType";
    public static final String KEY_PARAMS_PARAM = "params";
    public static final String KEY_PARAMS_QUERY_PARAMS = "queryParams";
    public static final String KEY_PARAMS_URL = "url";
    public static final int KEY_REQUEST_CODE = 100;
    public AURAJsStandardEventListener e;
    public yi f;
    public lo g;
    public AURAEventIO h;
    public boolean i;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface PageType {
        public static final String H5 = "H5";
        public static final String NATIVE = "NATIVE";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements b.AbstractC0063b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b.AbstractC0063b
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            } else {
                AURAOpenUrlEvent.O0(AURAOpenUrlEvent.this, "openUrl_adjust", str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements rf.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rf f2155a;
        public final /* synthetic */ a.AbstractC0062a b;
        public final /* synthetic */ String c;

        public b(rf rfVar, a.AbstractC0062a aVar, String str) {
            this.f2155a = rfVar;
            this.b = aVar;
            this.c = str;
        }

        @Override // tb.rf.a
        public void a(int i, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2ba32e", new Object[]{this, new Integer(i), intent});
                return;
            }
            this.f2155a.c(100);
            try {
                if (i == -1) {
                    this.b.a(this.c, intent);
                } else {
                    AURAOpenUrlEvent.P0(AURAOpenUrlEvent.this, "openUrl", "onActivityResult failed");
                    this.b.b(this.c, intent);
                }
            } catch (Throwable th) {
                AURAOpenUrlEvent.Q0(AURAOpenUrlEvent.this, "openUrl", th.getMessage());
                ck.g().b("AURAOpenUrlEventExtension", "openUrlHandle", th.getMessage());
            }
        }
    }

    static {
        t2o.a(81789070);
    }

    public static /* synthetic */ void O0(AURAOpenUrlEvent aURAOpenUrlEvent, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f3ea97d", new Object[]{aURAOpenUrlEvent, str, str2});
        } else {
            aURAOpenUrlEvent.M0(str, str2);
        }
    }

    public static /* synthetic */ void P0(AURAOpenUrlEvent aURAOpenUrlEvent, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba2fc1fe", new Object[]{aURAOpenUrlEvent, str, str2});
        } else {
            aURAOpenUrlEvent.M0(str, str2);
        }
    }

    public static /* synthetic */ void Q0(AURAOpenUrlEvent aURAOpenUrlEvent, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2520da7f", new Object[]{aURAOpenUrlEvent, str, str2});
        } else {
            aURAOpenUrlEvent.M0(str, str2);
        }
    }

    public static /* synthetic */ Object ipc$super(AURAOpenUrlEvent aURAOpenUrlEvent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/event/openUrl/AURAOpenUrlEvent");
        }
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
            return;
        }
        this.h = aURAEventIO;
        JSONObject c = aURAEventIO.getEventModel().c();
        if (c == null) {
            M0("openUrl", "eventsFields 为空");
            ck.g().a("AURAOpenUrlEventExtension", "AURAOpenUrlEventExtension innerHandleEvent", "eventsFields is null!");
            return;
        }
        String string2 = c.getString("url");
        if (TextUtils.isEmpty(string2)) {
            M0("openUrl", "url 为空");
            ck.g().a("AURAOpenUrlEventExtension", "AURAOpenUrlEventExtension innerHandleEvent", "url is null!");
            return;
        }
        JSONObject jSONObject = c.getJSONObject("queryParams");
        if (jSONObject != null) {
            string2 = q5l.b(string2, jSONObject);
        }
        String string3 = c.getString("pageType");
        if (TextUtils.isEmpty(string3)) {
            M0("openUrl", "pageType 为空");
            ck.g().a("AURAOpenUrlEventExtension", "AURAOpenUrlEventExtension innerHandleEvent", "pageType is null!");
            return;
        }
        String upperCase = string3.toUpperCase();
        JSONObject jSONObject2 = c.getJSONObject("params");
        int hashCode = upperCase.hashCode();
        if (hashCode != -1999289321) {
            if (hashCode == 2285) {
                upperCase.equals("H5");
            }
        } else if (upperCase.equals("NATIVE")) {
            Y0(aURAEventIO, string2, jSONObject2);
            string = c.getString("isReplace");
            if (string != null && "true".equals(string) && this.i) {
                hh.d(J0().f());
                return;
            }
            return;
        }
        X0(string2, c.getString("method"), jSONObject2);
        string = c.getString("isReplace");
        if (string != null) {
        }
    }

    public final Bundle S0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("b3cf6e4b", new Object[]{this, jSONObject});
        }
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                q5l.a(bundle, str, jSONObject.get(str));
            }
        }
        return bundle;
    }

    public final rf T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rf) ipChange.ipc$dispatch("33e9597d", new Object[]{this});
        }
        lo loVar = this.g;
        if (loVar == null) {
            return null;
        }
        return (rf) loVar.g(rf.USERDATA_KEY_ACTIVITY_RESULT, rf.class);
    }

    public final List<zbb> U0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("853e2d40", new Object[]{this});
        }
        yi yiVar = this.f;
        if (yiVar == null) {
            return null;
        }
        return yiVar.f(zbb.class);
    }

    public final com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.a V0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.a) ipChange.ipc$dispatch("80019698", new Object[]{this, aURAEventIO});
        }
        qi eventModel = aURAEventIO.getEventModel();
        AURARenderComponent j = eventModel.j();
        if (j == null) {
            return null;
        }
        List<zbb> U0 = U0();
        if (bh.a(U0)) {
            return null;
        }
        for (zbb zbbVar : U0) {
            if (zbbVar.C(j).contains(eventModel.i())) {
                return zbbVar.r0(j, aURAEventIO);
            }
        }
        return null;
    }

    public final String W0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa168883", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            return jSONObject.getString("__oldComponent");
        }
        return null;
    }

    public final void X0(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b95e6ff", new Object[]{this, str, str2, jSONObject});
            return;
        }
        String W0 = W0(jSONObject);
        if (W0 == null) {
            str2 = "get";
        } else if (TextUtils.isEmpty(str2)) {
            str2 = "post";
        }
        Context f = J0().f();
        AliNavServiceInterface c = xq0.c();
        if (!"get".equals(str2)) {
            JSONObject a1 = a1(W0);
            if (c != null) {
                c.a(f).b(100).d(R0(W0)).g(c.a(f).f(str, a1));
            } else {
                ck.g().a("AURAOpenUrlEventExtension", "jumpToH5", "com.taobao.android:alinavimp:xx.xx.xx 没有引入，请实现接口适配导航库");
            }
        } else if (c != null) {
            c.a(f).b(100).c(str);
        }
        Z0("H5", new com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b(this.g, this.h, new a()));
    }

    public void Y0(AURAEventIO aURAEventIO, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4e3e553", new Object[]{this, aURAEventIO, str, jSONObject});
            return;
        }
        com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.a V0 = V0(aURAEventIO);
        AliNavServiceInterface c = xq0.c();
        if (c != null) {
            Bundle S0 = S0(jSONObject);
            if (V0 != null) {
                str = q5l.b(str, V0.a());
            }
            c.a(J0().f()).b(100).d(S0).c(str);
        } else {
            ck.g().a("AURAOpenUrlEventExtension", "jumpToNative", "com.taobao.android:alinavimp:xx.xx.xx 没有引入，请实现接口适配导航库");
        }
        if (V0 == null) {
            M0("openUrl", "openUrlResult 为空");
            ck.g().a("AURAOpenUrlEventExtension", "openUrlHandle", "openUrlResult is null");
            return;
        }
        a.AbstractC0062a b2 = V0.b();
        if (b2 == null) {
            M0("openUrl", "openUrlCallback 为空");
            ck.g().a("AURAOpenUrlEventExtension", "openUrlHandle", "mOpenUrlCallback is null");
            return;
        }
        Z0("NATIVE", b2);
    }

    public final void Z0(String str, a.AbstractC0062a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15237ce2", new Object[]{this, str, aVar});
            return;
        }
        rf T0 = T0();
        if (T0 == null) {
            M0("openUrl", "activityResultDelegate 为空");
        } else {
            T0.a(100, new b(T0, aVar, str));
        }
    }

    public final JSONObject a1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d0dacfd", new Object[]{this, str});
        }
        try {
            return JSON.parseObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    @Override // tb.ws, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.f = yiVar;
        this.g = loVar;
        this.i = xk.a("enableOpenUrlReplace", true);
        fsw.i(AURAWVJsBridgePlugin.BRIDGE_PLUGIN_NAME, AURAWVJsBridgePlugin.class, true);
        AURAJsStandardEventListener aURAJsStandardEventListener = new AURAJsStandardEventListener();
        this.e = aURAJsStandardEventListener;
        AURAJsStandardEventListener.register(aURAJsStandardEventListener);
    }

    @Override // tb.ws, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        AURAJsStandardEventListener.unregister(this.e);
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return "openUrl";
    }

    public final Bundle R0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d64dd68d", new Object[]{this, str});
        }
        Bundle bundle = new Bundle();
        String encode = Uri.encode(str);
        bundle.putString("postdata", "data=" + encode);
        bundle.putBoolean("isPostUrl", true);
        return bundle;
    }
}
