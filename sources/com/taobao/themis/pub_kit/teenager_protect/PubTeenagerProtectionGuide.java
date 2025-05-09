package com.taobao.themis.pub_kit.teenager_protect;

import android.app.Activity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.pub_kit.teenager_protect.PubTimeLock;
import tb.a07;
import tb.c8;
import tb.ckf;
import tb.d1a;
import tb.e9;
import tb.f04;
import tb.g1a;
import tb.h9;
import tb.hij;
import tb.n8;
import tb.n9;
import tb.njg;
import tb.r38;
import tb.t2o;
import tb.tk0;
import tb.u8;
import tb.x96;
import tb.xhv;
import tb.xk0;
import tb.y7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubTeenagerProtectionGuide {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final g1a<PubTimeLock.c, xhv> f13732a;
    public final d1a<xhv> b;
    public final njg c = kotlin.a.b(PubTeenagerProtectionGuide$alertInstance$2.INSTANCE);
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(845152347);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // tb.u8
        public final void callback(String str, c8 c8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
                return;
            }
            TMSLogger.f("PubTeenagerProtectionGuide", ckf.p(str, c8Var));
            if (ckf.b(str, "onClose")) {
                JSONObject jSONObject = (JSONObject) c8Var.a();
                if (jSONObject == null) {
                    PubTeenagerProtectionGuide.a(PubTeenagerProtectionGuide.this).invoke();
                    return;
                }
                String string = jSONObject.getString("action");
                if (ckf.b(string, "confirm")) {
                    PubTeenagerProtectionGuide.c(PubTeenagerProtectionGuide.this, false);
                    PubTeenagerProtectionGuide.b(PubTeenagerProtectionGuide.this).invoke(PubTimeLock.c.d(this.b));
                } else if (ckf.b(string, "cancel")) {
                    PubTeenagerProtectionGuide.c(PubTeenagerProtectionGuide.this, false);
                    PubTeenagerProtectionGuide.a(PubTeenagerProtectionGuide.this).invoke();
                }
            }
        }
    }

    static {
        t2o.a(845152346);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PubTeenagerProtectionGuide(g1a<? super PubTimeLock.c, xhv> g1aVar, d1a<xhv> d1aVar) {
        ckf.g(g1aVar, "onConfirm");
        ckf.g(d1aVar, "onClose");
        this.f13732a = g1aVar;
        this.b = d1aVar;
    }

    public static final /* synthetic */ d1a a(PubTeenagerProtectionGuide pubTeenagerProtectionGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("81cf8a6c", new Object[]{pubTeenagerProtectionGuide});
        }
        return pubTeenagerProtectionGuide.b;
    }

    public static final /* synthetic */ g1a b(PubTeenagerProtectionGuide pubTeenagerProtectionGuide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("71d0f893", new Object[]{pubTeenagerProtectionGuide});
        }
        return pubTeenagerProtectionGuide.f13732a;
    }

    public static final /* synthetic */ void c(PubTeenagerProtectionGuide pubTeenagerProtectionGuide, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a201d23", new Object[]{pubTeenagerProtectionGuide, new Boolean(z)});
        } else {
            pubTeenagerProtectionGuide.d = z;
        }
    }

    public final void g(Activity activity, xk0 xk0Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("957a126f", new Object[]{this, activity, xk0Var, new Integer(i)});
            return;
        }
        n9 n9Var = new n9();
        n9Var.i(activity);
        n9Var.m(activity.getWindow().getDecorView());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "type", "showStdDxPop");
        jSONObject.put((JSONObject) "params", (String) e(xk0Var));
        new y7().b(new n8(jSONObject), n9Var, new b(i));
    }

    public final JSONArray d(xk0 xk0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("99f6361b", new Object[]{this, xk0Var});
        }
        JSONArray jSONArray = new JSONArray();
        String str = xk0Var.d;
        if (!(str == null || str == null || str.length() == 0)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text", (Object) xk0Var.d);
            jSONObject.put("highlighted", (Object) Boolean.TRUE);
            jSONObject.put("action", (Object) "confirm");
            jSONArray.add(jSONObject);
        }
        String str2 = xk0Var.f;
        if (!(str2 == null || str2 == null || str2.length() == 0)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("text", (Object) xk0Var.f);
            jSONObject2.put("highlighted", (Object) Boolean.FALSE);
            jSONObject2.put("action", (Object) "other");
            jSONArray.add(jSONObject2);
        }
        String str3 = xk0Var.e;
        if (!(str3 == null || str3 == null || str3.length() == 0)) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("text", (Object) xk0Var.e);
            jSONObject3.put("highlighted", (Object) Boolean.FALSE);
            jSONObject3.put("action", (Object) "cancel");
            jSONArray.add(jSONObject3);
        }
        if (jSONArray.size() == 2) {
            f04.N(jSONArray);
        }
        return jSONArray;
    }

    public final JSONObject e(xk0 xk0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6dcf07d7", new Object[]{this, xk0Var});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "popId", ckf.p("alert:", Long.valueOf(System.currentTimeMillis())));
        jSONObject.put((JSONObject) "bizId", "megability");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "title", xk0Var.f31435a);
        jSONObject2.put((JSONObject) "content", xk0Var.b);
        jSONObject2.put((JSONObject) "actions", (String) d(xk0Var));
        if (xk0Var.c != null) {
            JSONObject jSONObject3 = new JSONObject();
            tk0 tk0Var = xk0Var.c;
            String str = null;
            jSONObject3.put((JSONObject) "isChecked", String.valueOf(tk0Var == null ? null : tk0Var.f28759a));
            tk0 tk0Var2 = xk0Var.c;
            if (tk0Var2 != null) {
                str = tk0Var2.b;
            }
            jSONObject3.put((JSONObject) "text", str);
            jSONObject2.put((JSONObject) UiUtil.INPUT_TYPE_VALUE_CHECKBOX, (String) jSONObject3);
        }
        jSONObject2.put((JSONObject) "popId", jSONObject.getString("popId"));
        jSONObject2.put((JSONObject) "bizId", jSONObject.getString("bizId"));
        jSONObject.put((JSONObject) "content", (String) jSONObject2);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put((JSONObject) "gravity", "center");
        Boolean bool = Boolean.FALSE;
        jSONObject4.put((JSONObject) "tapEnable", (String) bool);
        jSONObject4.put((JSONObject) "panEnable", (String) bool);
        Boolean bool2 = Boolean.TRUE;
        jSONObject4.put((JSONObject) e9.TAK_ABILITY_MATCH_CONTENT, (String) bool2);
        jSONObject4.put((JSONObject) hij.KEY_CORNER_RADIUS, (String) 0);
        jSONObject4.put((JSONObject) "animation", "fadeInOut");
        jSONObject4.put((JSONObject) "droidBlockHandleBack", (String) bool2);
        jSONObject.put((JSONObject) h9.KEY_POP_CONFIG, (String) jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put((JSONObject) "template", (String) r38.a());
        jSONObject5.put((JSONObject) x96.REFRESH_TYPE, "renderFirst");
        jSONObject5.put((JSONObject) "sharedEngine", (String) bool);
        jSONObject.put((JSONObject) h9.KEY_EXT_CONFIG, (String) jSONObject5);
        return jSONObject;
    }

    public final void f(Activity activity, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99bc80f", new Object[]{this, activity, new Integer(i)});
            return;
        }
        ckf.g(activity, "activity");
        if (!this.d) {
            xk0 a2 = xk0.Companion.a();
            if (a2 == null) {
                a2 = null;
            } else {
                PubTimeLock.c.a aVar = PubTimeLock.c.Companion;
                if (PubTimeLock.c.g(i, aVar.a())) {
                    str = "监护人输入密码可以继续访问";
                } else if (PubTimeLock.c.g(i, aVar.b())) {
                    str = "累计使用超过40分钟，输入密码可以继续访问";
                } else {
                    return;
                }
                a2.b = str;
                a2.f31435a = "您正在未成年模式中";
                a2.d = "家长验证";
                a2.e = "退出";
            }
            if (a2 != null) {
                this.d = true;
                g(activity, a2, i);
            }
        }
    }
}
