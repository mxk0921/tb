package tb;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.LinkRule;
import com.taobao.android.launcher.bootstrap.tao.ability.RestoreStrategy;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.fuk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class arg implements xqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final sgg f15948a;
    public final Instrumentation b;
    public SharedPreferences c;
    public final AtomicBoolean d = new AtomicBoolean(true);
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements fuk.a<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LinkRule f15949a;

        public a(arg argVar, LinkRule linkRule) {
            this.f15949a = linkRule;
        }

        @Override // tb.fuk.a
        public void a(v35<String> v35Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0335d16", new Object[]{this, v35Var});
            } else {
                v35Var.b(this.f15949a.tasks).b("InitFastEmptyTask");
            }
        }
    }

    public arg(sgg sggVar, Instrumentation instrumentation) {
        this.f15948a = sggVar;
        this.b = instrumentation;
    }

    @Override // tb.xqg
    public void b(Activity activity, Intent intent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a938c6", new Object[]{this, activity, intent});
        } else if (!qg0.b(activity.getIntent())) {
            imo.c(activity, intent);
            this.b.callActivityOnNewIntent(activity, intent);
        } else {
            if (intent != null && !TextUtils.isEmpty(intent.getDataString())) {
                z = e(activity, intent);
            }
            if (!z) {
                this.b.callActivityOnNewIntent(activity, intent);
            }
        }
    }

    public final boolean e(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd9e340f", new Object[]{this, activity, intent})).booleanValue();
        }
        if (intent != null && qqg.b(intent.getData())) {
            if (bqg.d(intent.getExtras())) {
                if (!(activity instanceof wqg)) {
                    return false;
                }
                d();
                String e = bqg.e(intent);
                if (!TextUtils.isEmpty(e)) {
                    intent.setData(Uri.parse(e));
                    g(activity.getIntent(), intent);
                }
                return false;
            } else if (k(activity, intent, true)) {
                qqg.c(activity, intent);
                return true;
            }
        }
        return false;
    }

    public final String f(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d353ae54", new Object[]{this, str, intent});
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            return component.getClassName();
        }
        return str;
    }

    public final void g(Intent intent, Intent intent2) {
        Uri uri;
        Uri uri2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4717af0d", new Object[]{this, intent, intent2});
            return;
        }
        if (intent == null) {
            uri = Uri.EMPTY;
        } else {
            uri = intent.getData();
        }
        if (intent2 == null) {
            uri2 = Uri.EMPTY;
        } else {
            uri2 = intent2.getData();
        }
        if (uri != null) {
            if (qqg.b(uri)) {
                String queryParameter = uri.getQueryParameter("h5Url");
                if (!TextUtils.isEmpty(queryParameter)) {
                    uri = Uri.parse(queryParameter);
                }
            }
            if (uri2 != null) {
                if (!TextUtils.equals(uri.getHost(), uri2.getHost()) || !TextUtils.equals(uri.getPath(), uri2.getPath())) {
                    LinkRule c = yrg.c();
                    String str = c == null ? null : c.name;
                    String str2 = "moduleName=" + str + ", old=" + uri.toString() + ", new=" + uri2.toString();
                    TLog.loge(erj.MODULE, "LinkConsistency", "processURLRedirection, moduleName is" + str + ", url not equal: " + str2);
                    AppMonitor.Counter.commit(erj.MODULE, "LinkConsistency", str2, 1.0d);
                }
            }
        }
    }

    public final void h(String str) {
        RestoreStrategy restoreStrategy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d353aa9", new Object[]{this, str});
            return;
        }
        TLog.loge(erj.MODULE, "LinkOptimized", "restoreByStrategy, firstLink=false， pageName=" + str);
        LinkRule c = yrg.c();
        if (c == null || (restoreStrategy = c.strategy) == null || TextUtils.isEmpty(restoreStrategy.ignoredPages) || !c.strategy.ignoredPages.contains(str)) {
            l();
            return;
        }
        TLog.loge(erj.MODULE, "LinkOptimized", "restoreByStrategy, firstLink=false， ignored pageName=" + str);
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3f8c0ba", new Object[]{this, str});
            return;
        }
        xhq c = ppo.b().c();
        if (c != null && !c.f31405a) {
            TLog.loge(erj.MODULE, "LinkOptimized", "restoreForBackground, pageName=" + str);
            l();
        }
    }

    public final void j(String str, Intent intent) {
        LinkRule d;
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb35a034", new Object[]{this, str, intent});
            return;
        }
        String a2 = bqg.a(intent);
        if (!TextUtils.isEmpty(a2)) {
            iqk d2 = this.f15948a.d();
            if ((d2 instanceof fuk) && (d = yrg.d(a2)) != null && (strArr = d.tasks) != null && strArr.length != 0) {
                ((fuk) d2).t(str, new a(this, d));
            }
        }
    }

    public final boolean k(Activity activity, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e912d4a5", new Object[]{this, activity, intent, new Boolean(z)})).booleanValue();
        }
        ComponentName component = intent.getComponent();
        if (component == null) {
            return false;
        }
        String className = component.getClassName();
        if (!"com.taobao.tao.welcome.Welcome".equals(className)) {
            return false;
        }
        if (z && TextUtils.equals(activity.getClass().getName(), className)) {
            return false;
        }
        intent.putExtra(bqg.EXTRA_LINK_HOT_START, true);
        return true;
    }

    public final void l() {
        iqk d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8d1735a", new Object[]{this});
        } else if (this.e.compareAndSet(false, true) && (d = this.f15948a.d()) != null) {
            d.i();
        }
    }

    @Override // tb.xqg
    public Activity c(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f0db1f2d", new Object[]{this, classLoader, str, intent});
        }
        if (!LauncherRuntime.n) {
            return this.b.newActivity(classLoader, str, intent);
        }
        TLog.loge(erj.MODULE, "LinkOptimized", "newActivity=" + str);
        boolean z = this.d.get();
        this.d.compareAndSet(true, false);
        boolean b = qg0.b(intent);
        if (b && !z) {
            intent.removeExtra("cold_startup_h5");
            TLog.loge(erj.MODULE, "LinkOptimized", "the state of H5HCColdStartup went wrong");
            AppMonitor.Counter.commit(erj.MODULE, "LinkOptimized", "className=" + str + ",data=" + intent.getData(), 1.0d);
        }
        if (b && z) {
            j(str, intent);
        }
        TLog.loge(erj.MODULE, "LinkOptimized", "current state: isH5HCColdStartup=" + b + ", firstLink=" + z);
        if (z) {
            i(str);
            return this.b.newActivity(classLoader, f(str, intent), intent);
        }
        h(str);
        return this.b.newActivity(classLoader, str, intent);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a469514", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences != null && sharedPreferences.getBoolean(imo.KEY_NEW_INTENT_PV, false)) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("skipbk", "1");
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // tb.xqg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.app.Activity r8, android.os.Bundle r9, java.lang.Runnable r10) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 4
            com.android.alibaba.ip.runtime.IpChange r3 = tb.arg.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "bc1b4131"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            r8 = 2
            r2[r8] = r9
            r8 = 3
            r2[r8] = r10
            r3.ipc$dispatch(r4, r2)
            return
        L_0x001b:
            android.content.Intent r3 = r8.getIntent()
            boolean r4 = tb.qg0.b(r3)
            java.lang.String r5 = "__link_cold_start__"
            if (r4 == 0) goto L_0x0040
            r6 = 131072(0x20000, float:1.83671E-40)
            boolean r6 = com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode.d(r6)
            if (r6 == 0) goto L_0x0040
            tb.og0.d(r8, r1)
            com.taobao.linkmanager.AfcLifeCycleCenter r2 = com.taobao.linkmanager.AfcLifeCycleCenter.instance()
            r2.callLinkActivityCreate(r8, r9)
            r3.putExtra(r5, r0)
            tb.og0.d(r8, r0)
            goto L_0x0081
        L_0x0040:
            if (r4 == 0) goto L_0x0056
            boolean r2 = com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode.d(r2)
            if (r2 == 0) goto L_0x0056
            com.taobao.linkmanager.AfcLifeCycleCenter r2 = com.taobao.linkmanager.AfcLifeCycleCenter.instance()
            r2.callLinkActivityCreate(r8, r9)
            r3.putExtra(r5, r0)
            tb.qqg.c(r8, r3)
            goto L_0x0081
        L_0x0056:
            if (r4 == 0) goto L_0x0071
            android.net.Uri r2 = r3.getData()
            boolean r2 = tb.qqg.b(r2)
            if (r2 == 0) goto L_0x0071
            com.taobao.linkmanager.AfcLifeCycleCenter r2 = com.taobao.linkmanager.AfcLifeCycleCenter.instance()
            r2.callLinkActivityCreate(r8, r9)
            r3.putExtra(r5, r0)
            tb.qqg.c(r8, r3)
            r9 = 1
            goto L_0x0082
        L_0x0071:
            tb.imo.c(r8, r3)
            android.net.Uri r9 = r3.getData()
            boolean r9 = tb.qqg.b(r9)
            if (r9 == 0) goto L_0x0081
            r7.k(r8, r3, r1)
        L_0x0081:
            r9 = 0
        L_0x0082:
            if (r4 == 0) goto L_0x00b4
            boolean r2 = r8 instanceof tb.wqg
            if (r2 == 0) goto L_0x00b4
            r2 = r8
            tb.wqg r2 = (tb.wqg) r2
            r2.onSetActivityTheme()
            android.content.SharedPreferences r2 = r7.c
            if (r2 != 0) goto L_0x009f
            android.app.Application r8 = r8.getApplication()
            java.lang.String r2 = "next_launch_link_filter"
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r2, r1)
            r7.c = r8
        L_0x009f:
            java.lang.String r8 = tb.bqg.f(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00b4
            java.lang.String r8 = com.taobao.linkmanager.afc.utils.TFCCommonUtils.m(r8)
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r3.setData(r8)
        L_0x00b4:
            r10.run()
            if (r9 == 0) goto L_0x00bc
            r3.removeExtra(r5)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.arg.a(android.app.Activity, android.os.Bundle, java.lang.Runnable):void");
    }
}
