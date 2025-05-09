package tb;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.Window;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.ActivityMonitor;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class v6a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static v6a f;
    public ScaleGestureDetector b;
    public WeakReference<Activity> e;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, GestureDetector> f29806a = new HashMap();
    public final HashMap<String, HashSet<String>> c = new HashMap<>();
    public boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f29807a;
        public final /* synthetic */ GestureDetector b;

        public a(Activity activity, GestureDetector gestureDetector) {
            this.f29807a = activity;
            this.b = gestureDetector;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.f29807a.isFinishing()) {
                v6a.d(v6a.this, this.f29807a, this.b, null);
            }
        }
    }

    static {
        t2o.a(404750628);
    }

    public static /* synthetic */ void d(v6a v6aVar, Activity activity, GestureDetector gestureDetector, ScaleGestureDetector scaleGestureDetector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b4d133", new Object[]{v6aVar, activity, gestureDetector, scaleGestureDetector});
        } else {
            v6aVar.c(activity, gestureDetector, scaleGestureDetector);
        }
    }

    public static v6a i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v6a) ipChange.ipc$dispatch("4491066d", new Object[0]);
        }
        if (f == null) {
            v6a v6aVar = new v6a();
            f = v6aVar;
            v6aVar.b();
        }
        return f;
    }

    public final GestureDetector a(Activity activity) {
        HashMap hashMap = (HashMap) this.f29806a;
        GestureDetector gestureDetector = (GestureDetector) hashMap.get(activity.getClass().getName());
        if (gestureDetector == null) {
            GestureDetector gestureDetector2 = new GestureDetector(f82.d(), new u6a());
            if ("1".equals(v82.l("updateMinVel", "1"))) {
                try {
                    Field declaredField = GestureDetector.class.getDeclaredField("mMinimumFlingVelocity");
                    declaredField.setAccessible(true);
                    declaredField.set(gestureDetector2, 5);
                } catch (Throwable unused) {
                    TLog.loge("GestureObserve velocity update fail", new String[0]);
                }
            }
            hashMap.put(activity.getClass().getName(), gestureDetector2);
            gestureDetector = gestureDetector2;
        }
        if (this.b == null) {
            this.b = new ScaleGestureDetector(f82.d(), new oro());
        }
        return gestureDetector;
    }

    public final void c(Activity activity, GestureDetector gestureDetector, ScaleGestureDetector scaleGestureDetector) {
        Window.Callback callback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a661432e", new Object[]{this, activity, gestureDetector, scaleGestureDetector});
        } else if (gestureDetector != null && activity != null) {
            Window window = activity.getWindow();
            if (!(window == null || (callback = window.getCallback()) == null)) {
                try {
                    window.setCallback((Window.Callback) Proxy.newProxyInstance(activity.getClass().getClassLoader(), new Class[]{Window.Callback.class}, new bfx(callback, gestureDetector, scaleGestureDetector)));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            u6a.o(activity);
        }
    }

    public final boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (this.c.containsKey(str)) {
            HashSet<String> hashSet = this.c.get(str);
            if (pz3.a(hashSet)) {
                return true;
            }
            Iterator<String> it = hashSet.iterator();
            while (it.hasNext()) {
                if (gwv.j(str2, it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        ScaleGestureDetector scaleGestureDetector;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Activity activity = this.e.get();
        if (activity != null) {
            GestureDetector a2 = a(activity);
            if ("com.taobao.search.sf.MainSearchResultActivity".equals(activity.getClass().getName())) {
                xzh.a().postDelayed(new a(activity, a2), 1500L);
                return;
            }
            if (!v82.h("enableScaleGesture", true) || ((HashMap) this.f29806a).size() != 1 || (scaleGestureDetector = this.b) == null) {
                scaleGestureDetector = null;
            }
            c(activity, a2, scaleGestureDetector);
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b43aaa3a", new Object[]{this})).booleanValue();
        }
        if (!this.d) {
            return true;
        }
        return e(ActivityMonitor.p(), ActivityMonitor.q());
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ccf21a6", new Object[]{this, str});
        } else {
            ((HashMap) this.f29806a).remove(str);
        }
    }

    public void j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb313e8", new Object[]{this, activity});
            return;
        }
        this.e = new WeakReference<>(activity);
        if (!this.d && !pz3.a(v82.c.t()) && v82.c.t().contains(activity.getClass().getName())) {
            f();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.d = v82.c.i();
        JSONObject v = v82.c.v();
        try {
            for (String str : v.keySet()) {
                JSONObject jSONObject = v.getJSONObject(str);
                HashSet<String> hashSet = new HashSet<>();
                this.c.put(str, hashSet);
                JSONArray jSONArray = jSONObject.getJSONArray(xw0.VIEW_ANIM_KEY_URLS);
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        hashSet.add(jSONArray.getString(i));
                    }
                }
            }
        } catch (Throwable unused) {
            TLog.loge("BehaviX", "GestureObserveManager", "解析场景手势配置失败");
        }
    }

    public void k() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6939210e", new Object[]{this});
        } else if (this.d) {
            if (e(ActivityMonitor.p(), ActivityMonitor.q())) {
                f();
                z = true;
            }
            TLog.loge("BehaviX", "GestureObserveManager", "新采集方式，pageName:" + ActivityMonitor.p() + "，url:" + ActivityMonitor.q() + "，开启手势采集:" + z);
        }
    }
}
