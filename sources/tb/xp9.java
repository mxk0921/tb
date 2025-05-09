package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.taobao.windvane.extra.performance2.WVPageTracker;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserActivity;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.linkmanager.afc.request.TBLinkRequest;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.tao.welcome.Welcome;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xp9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31510a;
    public final Application.ActivityLifecycleCallbacks b;
    public final WVPageTracker.PageStatusCallback c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements i6j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.i6j
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bdd26f3", new Object[]{this, jSONObject});
                return;
            }
            vp9.a("linkx", "FlowInTimeManager === sendInTimeData === 上报成功:" + jSONObject);
        }

        @Override // tb.i6j
        public void b(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29c4da98", new Object[]{this, jSONObject, str});
                return;
            }
            vp9.a("linkx", "FlowInTimeManager === sendInTimeData === 上报失败:" + str);
        }

        @Override // tb.i6j
        public void c(MtopResponse mtopResponse, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7369b0e", new Object[]{this, mtopResponse, jSONObject});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            try {
                String simpleName = activity.getClass().getSimpleName();
                if (!TextUtils.equals(Welcome.class.getSimpleName(), simpleName)) {
                    xp9.c().d(simpleName, activity.getIntent());
                }
            } catch (Exception e) {
                e.printStackTrace();
                WVPageTracker.removeH5LifeCallback(xp9.a(xp9.this));
                AfcCustomSdk.h().f10563a.unregisterActivityLifecycleCallbacks(xp9.this.b);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements WVPageTracker.PageStatusCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.taobao.windvane.extra.performance2.WVPageTracker.PageStatusCallback
        public void onRedirect(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5c125f6", new Object[]{this, str, str2});
                return;
            }
            vp9.a("linkx", "FlowInTimeManager === onRedirect === 302");
            TFCCommonUtils.w(str, str2, new HashMap());
        }

        @Override // android.taobao.windvane.extra.performance2.WVPageTracker.PageStatusCallback
        public void onPageFinish(String str) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f0cb712", new Object[]{this, str});
                return;
            }
            vp9.a("linkx", "FlowInTimeManager === onPageFinish === 当前URL：" + str);
            if (!TextUtils.isEmpty(str)) {
                z = str.contains("_afc_link=1");
            }
            if (z) {
                vp9.a("linkx", "FlowInTimeManager === processLandingData === URL相同开始上报数据");
                xp9.e(str);
                WVPageTracker.removeH5LifeCallback(xp9.a(xp9.this));
                AfcCustomSdk.h().f10563a.unregisterActivityLifecycleCallbacks(xp9.this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final xp9 f31513a = new xp9(null);

        static {
            t2o.a(744488989);
        }

        public static /* synthetic */ xp9 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xp9) ipChange.ipc$dispatch("231475d9", new Object[0]);
            }
            return f31513a;
        }
    }

    static {
        t2o.a(744488985);
    }

    public /* synthetic */ xp9(a aVar) {
        this();
    }

    public static /* synthetic */ WVPageTracker.PageStatusCallback a(xp9 xp9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVPageTracker.PageStatusCallback) ipChange.ipc$dispatch("c4e583da", new Object[]{xp9Var});
        }
        return xp9Var.c;
    }

    public static xp9 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xp9) ipChange.ipc$dispatch("ac763d4", new Object[0]);
        }
        return d.a();
    }

    public void d(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a7a040", new Object[]{this, str, intent});
            return;
        }
        if (!(intent == null || intent.getData() == null)) {
            this.f31510a = intent.getData().toString();
        }
        vp9.a("linkx", "FlowInTimeManager === processLandingData === data=" + this.f31510a);
        if (TextUtils.equals(BrowserActivity.class.getSimpleName(), str)) {
            WVPageTracker.registerH5LifeCallback(this.c);
            vp9.b("linkx", "FlowInTimeManager === processLandingData === h5页面，注册监听：" + str);
            return;
        }
        vp9.b("linkx", "FlowInTimeManager === processLandingData === native落地：" + str);
        e(this.f31510a);
        AfcCustomSdk.h().f10563a.unregisterActivityLifecycleCallbacks(this.b);
    }

    public xp9() {
        this.b = new b();
        this.c = new c();
    }

    public static HashMap<String, String> b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a0806c0a", new Object[]{str, new Boolean(z)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (z) {
            hashMap.put(ah0.AFC_ID, UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id"));
        }
        hashMap.put("launchType", pg0.i().k("COLD"));
        hashMap.put("isBackground", pg0.i().j(false) + "");
        hashMap.put("url", str);
        return hashMap;
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12690595", new Object[]{str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("content", JSON.toJSONString(b(str, true)));
        vp9.a("linkx", "FlowInTimeManager === sendInTimeData === 上报参数：" + hashMap.toString());
        i4j.b().d(TBLinkRequest.ARRIVE_DATA_API, "1.0", hashMap, false, new a(), new Handler(zsa.b.f32989a.getLooper()), 4000);
        ah0.d("afc_flow_arrive", "", "", b(str, false));
        ovv.g().h(str);
    }
}
