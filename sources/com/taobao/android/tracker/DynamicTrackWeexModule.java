package com.taobao.android.tracker;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import com.taobao.android.tracker.a;
import com.taobao.android.tracker.wvplugin.DynamicTrackerPlugin;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import java.util.Map;
import tb.fgh;
import tb.o65;
import tb.p58;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DynamicTrackWeexModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_FOR_LITE = "Lite";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f9678a;
        public final /* synthetic */ String b;

        public a(DynamicTrackWeexModule dynamicTrackWeexModule, Activity activity, String str) {
            this.f9678a = activity;
            this.b = str;
        }

        @Override // com.taobao.android.tracker.a.c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5ce7f62", new Object[]{this, str});
                return;
            }
            fgh.a("DynamicTrackWeexModule onUpdateConfigEnd");
            if (this.f9678a != null) {
                com.taobao.android.tracker.a aVar = new com.taobao.android.tracker.a();
                aVar.d(this.f9678a, this.b);
                fgh.a("DynamicTrackWeexModule initCustomIntercept  end");
                com.taobao.android.tracker.a.e(this.f9678a, aVar);
            }
        }
    }

    static {
        t2o.a(455081987);
    }

    private void hookView(String str) {
        o65 g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a656f9", new Object[]{this, str});
        } else if (this.mWXSDKInstance != null && !TextUtils.isEmpty(str) && TYPE_FOR_LITE.equalsIgnoreCase(str)) {
            Context context = this.mWXSDKInstance.getContext();
            if (context == null || !(context instanceof Activity)) {
                fgh.a("DynamicTrackWeexModule enterPageWithCallback   context 不是activity");
                return;
            }
            Activity activity = (Activity) context;
            if (com.taobao.android.tracker.a.b(activity) == null) {
                String bundleUrl = this.mWXSDKInstance.getBundleUrl();
                if (!TextUtils.isEmpty(bundleUrl) && (g = p58.m().g()) != null) {
                    g.p(bundleUrl, new a(this, activity, bundleUrl));
                }
            }
        }
    }

    public static /* synthetic */ Object ipc$super(DynamicTrackWeexModule dynamicTrackWeexModule, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1893695439) {
            super.onActivityCreate();
            return null;
        } else if (hashCode == -17468269) {
            super.onActivityDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/tracker/DynamicTrackWeexModule");
        }
    }

    @JSMethod(uiThread = true)
    public void enterPage(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c069337", new Object[]{this, map});
        } else if (map != null) {
            o65 g = p58.m().g();
            if (g != null && g.b()) {
                g.r(map);
            }
            fgh.b("DynamicTracker=====", TBBuyPreloadScene.ENTER_PAGE);
            fgh.a("enterPage  end");
        }
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f208031", new Object[]{this});
        } else {
            super.onActivityCreate();
        }
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
        } else {
            super.onActivityDestroy();
        }
    }

    @JSMethod(uiThread = true)
    public void updateConfig(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acfb8e18", new Object[]{this, obj, str});
            return;
        }
        String str2 = null;
        if (obj != null) {
            try {
                if (obj instanceof JSONObject) {
                    str2 = ((JSONObject) obj).toJSONString();
                }
            } catch (Exception unused) {
            }
        }
        DynamicTrackerPlugin.updateConfig(str2);
        hookView(str);
    }
}
