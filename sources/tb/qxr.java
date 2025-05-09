package tb;

import android.app.Activity;
import android.net.Uri;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qxr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26988a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Activity d;

        public a(String str, String str2, String str3, Activity activity) {
            this.f26988a = str;
            this.b = str2;
            this.c = str3;
            this.d = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                qxr.b(this.d, StdPopAbility.API_H5, qxr.a(this.f26988a, this.b, this.c));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f26989a;

        public b(Activity activity) {
            this.f26989a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("popId", (Object) "TBTeenager");
            qxr.b(this.f26989a, "close", jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26990a;

        public c(String str) {
            this.f26990a = str;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            TLog.loge("TBTeenager", "stdPop api=" + this.f26990a + " statusCode:" + executeResult.getStatusCode());
        }
    }

    static {
        t2o.a(745537704);
    }

    public static /* synthetic */ JSONObject a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("209c4135", new Object[]{str, str2, str3});
        }
        return e(str, str2, str3);
    }

    public static /* synthetic */ void b(Activity activity, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1079a1c", new Object[]{activity, str, jSONObject});
        } else {
            c(activity, str, jSONObject);
        }
    }

    public static void c(Activity activity, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a004529f", new Object[]{activity, str, jSONObject});
        } else {
            new AbilityHubAdapter(new zq("TeenagerRemind", "mytaobao").a(activity)).z("stdPop", str, new xq().p(activity.getWindow().getDecorView()), jSONObject, new c(str));
        }
    }

    public static void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d61b7b8d", new Object[]{activity});
        } else if (activity != null) {
            uuu.a(new b(activity));
        }
    }

    public static JSONObject e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a2bf4907", new Object[]{str, str2, str3});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("popId", (Object) "TBTeenager");
        jSONObject.put("bizId", (Object) "TBTeenager");
        Uri.Builder buildUpon = Uri.parse("https://web.m.taobao.com/app/message-social-front/teenager-password-check/pop").buildUpon();
        if (Versions.isDebug() && !MtbGlobalEnv.w()) {
            buildUpon.authority("web.wapa.taobao.com");
        }
        buildUpon.appendQueryParameter("bizCode", str);
        buildUpon.appendQueryParameter("mode", str2);
        jSONObject.put("url", (Object) buildUpon.build());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("maxHeight", (Object) Float.valueOf(0.35f));
        jSONObject2.put("shouldBlockClose", (Object) Boolean.TRUE);
        if (str3 != null) {
            jSONObject2.put("backgroundMode", (Object) "color");
            jSONObject2.put("backgroundStyle", (Object) str3);
        }
        jSONObject.put(h9.KEY_POP_CONFIG, (Object) jSONObject2);
        return jSONObject;
    }

    public static void f(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0b3472", new Object[]{activity, str, str2});
        } else {
            g(activity, str, str2, null);
        }
    }

    public static void g(Activity activity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2cae5bc", new Object[]{activity, str, str2, str3});
        } else if (activity != null && str != null) {
            uuu.a(new a(str, str2, str3, activity));
        }
    }
}
