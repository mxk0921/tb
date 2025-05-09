package com.taobao.android.behavir.util;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.util.b;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.f82;
import tb.fm1;
import tb.gwv;
import tb.o0r;
import tb.om8;
import tb.qv6;
import tb.rja;
import tb.t2o;
import tb.v6a;
import tb.v82;
import tb.xzh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ActivityMonitor extends FragmentManager.FragmentLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_DEBUG = "ActivityMonitorDebug";
    public static final ActivityMonitor g = new ActivityMonitor();
    public static volatile b b = new b();
    public static WeakReference<Fragment> h = new WeakReference<>(null);
    public static WeakReference<Activity> i = new WeakReference<>(null);
    public static final List<String> j = new CopyOnWriteArrayList();
    public static volatile Pair<String, List<Runnable>> k = null;
    public static final List<String> l = n();
    public static Boolean m = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Runnable b;

        public a(Runnable runnable) {
            this.b = runnable;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/util/ActivityMonitor$3");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
                return;
            }
            Pair l = ActivityMonitor.l();
            if (l == null || !TextUtils.equals(ActivityMonitor.b().b, (CharSequence) l.first)) {
                this.b.run();
                return;
            }
            ((List) l.second).add(this.b);
            TLog.loge("ActivityMonitor", "wait for fragment");
        }
    }

    static {
        t2o.a(404750412);
    }

    private ActivityMonitor() {
        m();
    }

    public static /* synthetic */ Pair a(Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1ef953c", new Object[]{pair});
        }
        k = pair;
        return pair;
    }

    public static /* synthetic */ b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("26957dd2", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ String c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf9cba26", new Object[]{activity});
        }
        return h(activity);
    }

    public static /* synthetic */ void d(b bVar, int i2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b50d9", new Object[]{bVar, new Integer(i2), jSONObject});
        } else {
            i(bVar, i2, jSONObject);
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d871a777", new Object[]{str});
            return;
        }
        List<String> list = j;
        if (!((CopyOnWriteArrayList) list).contains(str)) {
            ((CopyOnWriteArrayList) list).add(str);
        }
    }

    public static /* synthetic */ ActivityMonitor g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityMonitor) ipChange.ipc$dispatch("e241dd", new Object[0]);
        }
        return g;
    }

    public static String h(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92892385", new Object[]{activity});
        }
        if (activity == null || activity.getIntent() == null) {
            return "";
        }
        return activity.getIntent().getDataString();
    }

    public static /* synthetic */ Object ipc$super(ActivityMonitor activityMonitor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/util/ActivityMonitor");
    }

    public static void j(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3533a3e3", new Object[]{str, str2, jSONObject});
        } else {
            i(new b(str, str2, b), 0, jSONObject);
        }
    }

    public static /* synthetic */ List k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[0]);
        }
        return l;
    }

    public static /* synthetic */ Pair l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bbe3e075", new Object[0]);
        }
        return k;
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        LocalBroadcastManager.getInstance(f82.d()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.behavir.util.ActivityMonitor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/util/ActivityMonitor$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (v82.h("enableBizCustomSceneChanged", true)) {
                    String stringExtra = intent.getStringExtra("scene");
                    String stringExtra2 = intent.getStringExtra("sceneUrl");
                    ActivityMonitor.g();
                    ActivityMonitor.d(new b(stringExtra, stringExtra2, ActivityMonitor.b()), 0, (JSONObject) intent.getSerializableExtra("bizArgs"));
                }
            }
        }, new IntentFilter("BizCustomSceneChanged"));
        LocalBroadcastManager.getInstance(f82.d()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.behavir.util.ActivityMonitor.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.behavir.util.ActivityMonitor$2$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ List f6441a;

                public a(List list) {
                    this.f6441a = list;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (Runnable runnable : this.f6441a) {
                        try {
                            runnable.run();
                        } catch (Exception e) {
                            om8.e("ActivityMonitor", e);
                        }
                    }
                }
            }

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/util/ActivityMonitor$2");
            }

            public final List<Runnable> a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("287b5bd5", new Object[]{this, str});
                }
                Pair l2 = ActivityMonitor.l();
                if (l2 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty((CharSequence) l2.first) || !((String) l2.first).endsWith(str)) {
                    return null;
                }
                return (List) l2.second;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String stringExtra = intent.getStringExtra(PopLayer.EXTRA_KEY_FRAGMENT_NAME);
                if (!TextUtils.isEmpty(stringExtra)) {
                    if (ActivityMonitor.k().contains(stringExtra)) {
                        BHREvent buildInternalEvent = BHREvent.buildInternalEvent(ActivityMonitor.b().c, stringExtra, "");
                        buildInternalEvent.userId = "userId";
                        fm1.f().a(buildInternalEvent);
                    }
                    List<Runnable> a2 = a(stringExtra);
                    ActivityMonitor.a(null);
                    if (a2 != null && !a2.isEmpty()) {
                        xzh.a().postAtFrontOfQueue(new a(a2));
                    }
                }
            }
        }, new IntentFilter(PopLayer.ACTION_FRAGMENT_SWITCH));
    }

    public static List<String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e89f38ba", new Object[0]);
        }
        String m2 = v82.m(o0r.c.K_FRAGMENT_WAIT, null);
        if (m2 == null) {
            return Collections.singletonList("HomepageFragment");
        }
        String[] split = m2.split(",");
        if (split != null) {
            return Arrays.asList(split);
        }
        return Collections.emptyList();
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        if (gwv.v()) {
            return false;
        }
        if (m == null) {
            m = Boolean.valueOf(v82.n(o0r.c.K_BACKGROUND_SWITCH, false));
        }
        return Boolean.TRUE.equals(m);
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b68c695", new Object[0]);
        }
        return b.b;
    }

    public static String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e285214", new Object[0]);
        }
        return b.c;
    }

    public static ActivityMonitor r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityMonitor) ipChange.ipc$dispatch("2c7bc106", new Object[0]);
        }
        return g;
    }

    public static JSONArray s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9d9ab6f", new Object[0]);
        }
        String l2 = v82.l("ucpPageSwitchBalckList", "[\"com.taobao.tao.TBMainActivity\"]");
        if (!TextUtils.isEmpty(l2)) {
            return JSON.parseArray(l2);
        }
        return new JSONArray();
    }

    public static void t(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7fc8ce", new Object[]{runnable});
        } else {
            com.taobao.android.behavir.util.b.e(new a(runnable));
        }
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
        } else if (activity == null) {
            TLog.loge(TAG_DEBUG, "no_activity");
        } else {
            if (!o()) {
                if (i.get() == activity) {
                    b bVar = new b(activity, b);
                    String str = bVar.b;
                    String str2 = bVar.c;
                    TLog.loge(TAG_DEBUG, "same_activity_filter:" + str + ";" + str2);
                    return;
                }
                i = new WeakReference<>(activity);
                h = new WeakReference<>(null);
            }
            i(new b(activity, b), activity.hashCode(), null);
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

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
        } else if (fragment != null) {
            if (!o()) {
                if (h.get() == fragment) {
                    b bVar = new b(fragment, b);
                    String str = bVar.b;
                    String str2 = bVar.c;
                    TLog.loge(TAG_DEBUG, "same_fragment_filter:" + str + ";" + str2);
                    return;
                }
                h = new WeakReference<>(fragment);
            }
            String name = fragment.getClass().getName();
            i(new b(fragment, b), fragment.hashCode(), null);
            if (l.contains(fragment.getClass().getSimpleName())) {
                k = new Pair<>(name, new ArrayList());
            }
        }
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        return ((CopyOnWriteArrayList) j).contains(str) || s().contains(str);
    }

    public static void i(b bVar, int i2, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e1c01a", new Object[]{bVar, new Integer(i2), jSONObject});
            return;
        }
        String str2 = bVar.b;
        String str3 = bVar.c;
        TLog.loge(TAG_DEBUG, "bx_onPageChange:" + str2 + ";" + str3);
        if (e(str2)) {
            TLog.loge(TAG_DEBUG, "bx_checkIgnore:" + str2 + ";" + str3);
        } else if (!TextUtils.equals(b.b, str2) || !TextUtils.equals(b.c, str3)) {
            if (rja.a()) {
                UtUtils.e("UCP", UtUtils.g(), "ActivityMonitor", str2, b.b, "");
                LogUtils.i("ActivityMonitor", str2, str3);
                TLog.loge("ActivityMonitor", str2, str3);
            }
            k = null;
            if (i2 > 0) {
                str = i2 + str3;
            } else {
                str = str3;
            }
            JSONObject j2 = Utils.j(jSONObject);
            j2.put("br_fromPage", (Object) bVar.d);
            j2.put("br_fromPageUrl", (Object) bVar.e);
            if (qv6.b.d()) {
                HashMap hashMap = new HashMap();
                hashMap.put("uploadSource", "UCP");
                qv6.h("UCPLog", str2, str3, j2.toJSONString(), hashMap);
            }
            BHREvent bHREvent = new BHREvent(str3, str2, str, "pv");
            bHREvent.bizArgKVMapObject = j2;
            bHREvent.setExcludeToHistoryEventList(true);
            bHREvent.fromScene = bVar.d;
            bHREvent.userId = "userId";
            b = bVar;
            fm1.f().a(bHREvent);
            v6a.i().k();
        } else {
            TLog.loge(TAG_DEBUG, "bx_callMulti:" + str2 + ";" + str3);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Activity> f6442a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        static {
            t2o.a(404750417);
        }

        public b() {
            this.d = "-";
            this.e = "-";
            this.b = "-";
            this.c = "-";
        }

        public Activity a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Activity) ipChange.ipc$dispatch("2162bf40", new Object[]{this});
            }
            WeakReference<Activity> weakReference = this.f6442a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        public b(String str, String str2, b bVar) {
            this.d = "-";
            this.e = "-";
            if (bVar != null) {
                this.d = bVar.b;
                this.e = bVar.c;
            }
            this.b = str;
            this.c = str2;
        }

        public b(Fragment fragment, b bVar) {
            this.d = "-";
            this.e = "-";
            if (bVar != null) {
                if (fragment.getActivity() == bVar.a()) {
                    this.d = bVar.d;
                    this.e = bVar.e;
                } else {
                    this.d = bVar.b;
                    this.e = bVar.c;
                }
            }
            this.f6442a = null;
            this.b = fragment.getClass().getName();
            this.c = ActivityMonitor.c(fragment.getActivity());
        }

        public b(Activity activity, b bVar) {
            this(activity.getClass().getName(), ActivityMonitor.c(activity), bVar);
            this.f6442a = new WeakReference<>(activity);
        }
    }
}
