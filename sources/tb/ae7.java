package tb;

import android.app.Application;
import android.content.Context;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.jsbridge.WidgetOpenJsBridge;
import com.taobao.desktop.widget.jsbridge.WidgetServerJsBridge;
import com.taobao.desktop.widget.jsbridge.WidgetServiceJsBridge;
import com.taobao.desktop.widget.manager.LoginStateManager;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.template.combine.WidgetCombineMiuiReceiver;
import com.taobao.desktop.widget.template.gold.WidgetTaoGoldReceiver;
import com.taobao.desktop.widget.template.standard.WidgetStandardMiuiReceiver;
import java.util.HashMap;
import tb.bcx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ae7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ae7 b;

    /* renamed from: a  reason: collision with root package name */
    public Application f15691a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f15692a;

        public a(Application application) {
            this.f15692a = application;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                obx.f(this.f15692a).i(null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HashMap f15693a;

        public b(HashMap hashMap) {
            this.f15693a = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                new asg().d(ae7.a(ae7.this).getApplicationContext(), this.f15693a);
            }
        }
    }

    static {
        t2o.a(437256230);
    }

    public static /* synthetic */ Application a(ae7 ae7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("a4d66c3f", new Object[]{ae7Var});
        }
        return ae7Var.f15691a;
    }

    public static ae7 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ae7) ipChange.ipc$dispatch("ba66407d", new Object[0]);
        }
        if (b == null) {
            synchronized (ae7.class) {
                try {
                    if (b == null) {
                        b = new ae7();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static void d(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        try {
            sd7.d().h(application, hashMap);
            td7.b().d(application, hashMap);
            nn8.c().execute(new a(application));
            Object obj = hashMap.get("launchStartTime");
            if (obj != null) {
                bcx.e().a(MonitorType.WIDGET_RENDER_STATE, new bcx.a().t("widget_render_init").q(System.currentTimeMillis() - ((Long) obj).longValue()));
            }
            fca.c();
        } catch (Exception e) {
            hgh.d("DesktopWidgetInit error: " + e.getMessage());
        }
    }

    public Application b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return this.f15691a;
    }

    public void e(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64440f64", new Object[]{this, application, hashMap});
            return;
        }
        try {
            this.f15691a = application;
            sd7.d().g(application);
            td7.b().c(application);
            f();
            LoginStateManager.a(this.f15691a);
            g(this.f15691a);
            fsw.h(WidgetOpenJsBridge.CLASSNAME_WIDGET_OPEN, WidgetOpenJsBridge.class);
            fsw.h(WidgetServiceJsBridge.CLASSNAME_WIDGET_SERVICE, WidgetServiceJsBridge.class);
            fsw.h(WidgetServerJsBridge.CLASSNAME_WIDGET_CLIENT_PASS, WidgetServerJsBridge.class);
            ira.d(this.f15691a).e();
            nn8.c().execute(new b(hashMap));
        } catch (Throwable th) {
            hgh.d("DesktopWidgetInit init error: " + th.getMessage());
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7e7361c", new Object[]{this});
            return;
        }
        try {
            int initialize = SecurityGuardManager.getInitializer().initialize(this.f15691a);
            hgh.d("SecurityGuardManager_initResult: " + initialize);
        } catch (SecException e) {
            hgh.d("SecurityGuardManager_init_error code is: " + e.getErrorCode());
        }
    }

    public final void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9d4d08", new Object[]{this, context});
            return;
        }
        try {
            if (!qj7.m(context)) {
                edx.c(context, WidgetTaoGoldReceiver.class.getName());
                edx.c(context, WidgetStandardMiuiReceiver.class.getName());
                edx.c(context, WidgetCombineMiuiReceiver.class.getName());
            }
        } catch (Throwable th) {
            hgh.d("setMiuiWidgetEnable: " + th.getMessage());
        }
    }
}
