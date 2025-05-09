package tb;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.android.detail2.core.framework.data.net.prerequest.NewDetailPreRequester;
import com.taobao.android.detail2.core.framework.data.net.prerequest.NewDetailRandomPreRequester;
import com.taobao.tao.TBMainHost;
import com.taobao.utils.Global;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.xmh;
import tb.y49;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yq0 implements k0d, gnd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PRELOAD_LITE_DETAIL_FEATURE_NAME = "ugc_imagecontent_detailpage";
    public static final String PRELOAD_REQUESTER_BIZ_NAME = "new_detail";
    public static final String PRELOAD_REQUESTER_BIZ_NAME_LITE = "lite_detail";
    public static final String PRELOAD_REQUESTER_BIZ_NAME_ND_RANDOM = "new_detail_random";
    public static final WeakHashMap<String, dxj> c = new WeakHashMap<>();
    public static final AtomicBoolean d = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public final c f32274a = new c(null);
    public final xmh.a b = new a(this);
    public final xmh.a e = new b(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements xmh.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(yq0 yq0Var) {
        }

        @Override // tb.xmh.a
        public int a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f1381923", new Object[]{this, str, str2})).intValue();
            }
            return byj.K(Global.getApplication());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements xmh.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(yq0 yq0Var) {
        }

        @Override // tb.xmh.a
        public int a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f1381923", new Object[]{this, str, str2})).intValue();
            }
            return byj.m0();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352321882);
        }

        public c() {
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
                return;
            }
            TBMainHost.b();
            if (TBMainHost.fromActivity(activity) != null) {
                txj.e(txj.TAG_RENDER, "首页Activity onDestroy");
                syj.d();
                com.taobao.android.weex_framework.b.f().a();
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

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements y49.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.y49.a
        public void onFeatureStatusChange(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acce9b03", new Object[]{this, new Integer(i)});
            } else if (i == 3) {
                txj.e(txj.TAG_RENDER, "图文requester远程化模块onFeatureStatusChange，status=3");
                yq0.a(yq0.this);
            }
        }
    }

    static {
        t2o.a(352321878);
    }

    public static /* synthetic */ void a(yq0 yq0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55786e6c", new Object[]{yq0Var});
        } else {
            yq0Var.j();
        }
    }

    public static dxj c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dxj) ipChange.ipc$dispatch("6d9e8bf3", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        String d2 = d(uri);
        if (TextUtils.isEmpty(d2)) {
            return null;
        }
        return e(d2);
    }

    public static String d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5b01d95", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        return uri.getQueryParameter("controllerId");
    }

    public static dxj e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dxj) ipChange.ipc$dispatch("5fc0cd85", new Object[]{str});
        }
        WeakHashMap<String, dxj> weakHashMap = c;
        if (weakHashMap == null || weakHashMap.size() == 0 || TextUtils.isEmpty(str)) {
            return null;
        }
        return weakHashMap.get(str);
    }

    public final void b(dxj dxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d2de8", new Object[]{this, dxjVar});
        } else if (dxjVar != null) {
            c.put(String.valueOf(dxjVar.a()), dxjVar);
        }
    }

    public final void f(dxj dxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7f493b", new Object[]{this, dxjVar});
        } else if (dxjVar != null) {
            dxjVar.h(new com.taobao.android.detail2.core.framework.base.weex.b());
            new yxj().a(dxjVar);
            dxjVar.i(this);
        }
    }

    public void g(dxj dxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7413fd", new Object[]{this, dxjVar});
        } else if (dxjVar != null) {
            b(dxjVar);
            f(dxjVar);
        }
    }

    public void h(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0a5ea0", new Object[]{this, application});
            return;
        }
        txj.b(txj.TAG_RENDER, "registerActivityLifeCycle调用");
        application.registerActivityLifecycleCallbacks(this.f32274a);
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34688f81", new Object[]{this});
            return;
        }
        ucq a2 = vcq.a(Global.getApplication());
        if (BundleInfoManager.instance().getDynamicFeatureInfo(PRELOAD_LITE_DETAIL_FEATURE_NAME) == null) {
            txj.e(txj.TAG_RENDER, "图文requester不是dynamicFeature，在包内可以直接访问");
            j();
        } else if (BundleInfoManager.instance().getDynamicFeatureInfo(PRELOAD_LITE_DETAIL_FEATURE_NAME) == null || !a2.f().contains(PRELOAD_LITE_DETAIL_FEATURE_NAME)) {
            o49.b().d(PRELOAD_LITE_DETAIL_FEATURE_NAME, new d(), AsyncTask.THREAD_POOL_EXECUTOR);
        } else {
            txj.e(txj.TAG_RENDER, "图文requester远程化模块可以访问插件包代码");
            j();
        }
    }

    public final void j() {
        txj.e("new_detail异常", "registerLiteDetailRequesterImpl执行");
        ftm b2 = itm.b(PRELOAD_REQUESTER_BIZ_NAME_LITE);
        b2.p(new pje());
        try {
            b2.q((yjd) Class.forName("com.taobao.ugc.imagecontent.detailpage.prerequest.ImageContentPreRequester").newInstance());
        } catch (ClassNotFoundException e) {
            txj.f("new_detail异常", "registerLiteDetailRequesterImpl类加载异常", e);
        } catch (IllegalAccessException e2) {
            txj.f("new_detail异常", "registerLiteDetailRequesterImpl类加载异常", e2);
        } catch (InstantiationException e3) {
            txj.f("new_detail异常", "registerLiteDetailRequesterImpl类加载异常", e3);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba9a7e49", new Object[]{this});
        } else {
            dxj.f(this);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57421d0b", new Object[]{this});
            return;
        }
        ftm b2 = itm.b("new_detail_random");
        b2.q(new NewDetailRandomPreRequester());
        b2.o(new oiz());
        b2.p(new niz());
        b2.r(new piz());
        b2.s(1);
        ktm a2 = ltm.a("new_detail_random");
        if (a2 != null) {
            a2.e(this.e);
            Log.e(txj.TAG_RENDER, "preRequester注册完成");
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c89628", new Object[]{this});
        } else if (d.compareAndSet(false, true)) {
            i();
            m();
            ftm b2 = itm.b("new_detail");
            b2.q(new NewDetailPreRequester());
            b2.o(new ayj());
            b2.p(new pxj());
            b2.r(new oyj());
            ktm a2 = ltm.a("new_detail");
            if (a2 != null) {
                a2.e(this.b);
                Log.e(txj.TAG_RENDER, "preRequester注册完成");
            }
        } else {
            Log.e(txj.TAG_RENDER, "已经注册过preRequester，直接返回");
        }
    }
}
