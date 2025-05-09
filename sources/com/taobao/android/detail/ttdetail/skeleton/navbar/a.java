package com.taobao.android.detail.ttdetail.skeleton.navbar;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.a07;
import tb.q84;
import tb.rc7;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class a {
    public static final C0383a Companion = new C0383a(null);

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.skeleton.navbar.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class C0383a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262609);
        }

        public C0383a() {
        }

        public /* synthetic */ C0383a(a07 a07Var) {
            this();
        }

        public final void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae20e079", new Object[]{this, context});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put((JSONObject) "page", "Page_Detail");
                jSONObject.put((JSONObject) "eventId", (String) 2201);
                jSONObject.put((JSONObject) "arg1", "Page_Detail_Show-Navigation-Share");
                jSONObject2.put((JSONObject) "style", "1");
                jSONObject.put((JSONObject) "args", (String) jSONObject2);
                q84.f(context, new rc7("userTrack", jSONObject, new RuntimeAbilityParam[0]));
            } catch (Exception e) {
                tgh.c("NavBarUtils", "shareImageViewExposure error: ", e);
            }
        }
    }

    static {
        t2o.a(912262608);
    }
}
