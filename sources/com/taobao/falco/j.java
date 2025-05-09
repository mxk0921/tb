package com.taobao.falco;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import anet.channel.util.ALog;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.v3.FalcoExceptionReporter;
import com.taobao.falco.FalcoNativePageLifecycleCallbacks;
import com.taobao.weex.ui.component.WXImage;
import tb.crt;
import tb.pl4;
import tb.uz8;
import tb.v11;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class j implements FalcoExceptionReporter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static boolean b = false;
    public static volatile boolean c = false;
    public static volatile boolean d = true;
    public static volatile c e;

    /* renamed from: a  reason: collision with root package name */
    public final c f10467a = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                j.h(j.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements v11, FalcoNativePageLifecycleCallbacks.a, FalcoNativePageLifecycleCallbacks.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void a(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce5770a", new Object[]{this, fragmentManager, fragment, view, bundle});
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void b(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a68ca3e", new Object[]{this, fragmentManager, fragment});
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void c(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8137aff", new Object[]{this, fragmentManager, fragment});
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void d(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93910177", new Object[]{this, fragmentManager, fragment});
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void e(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e970430a", new Object[]{this, fragmentManager, fragment});
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void f(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2658eb2", new Object[]{this, fragmentManager, fragment});
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void g(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("871739b1", new Object[]{this, fragmentManager, fragment, bundle});
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void h(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
                return;
            }
            j.f(false);
            j.g(null);
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void i(FragmentManager fragmentManager, Fragment fragment, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69cbbd64", new Object[]{this, fragmentManager, fragment, context});
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            j.f(false);
            j.g(null);
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.taobao.application.common.IAppLaunchListener
        public void d(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60cba989", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i2 == 1) {
                j.f(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f10469a = uz8.a();
        public String b = "";
        public String c = "";
        public String d = "";
        public String e = "";
        public String f = "";
        public String g = "";
        public String h = "";
        public String i = "";
        public int j = 1;

        public static /* synthetic */ int a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dce469dd", new Object[]{cVar})).intValue();
            }
            return cVar.j;
        }

        public static /* synthetic */ String b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5fe71ec8", new Object[]{cVar});
            }
            return cVar.i;
        }

        public static /* synthetic */ String c(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3bcb66fc", new Object[]{cVar, str});
            }
            cVar.i = str;
            return str;
        }

        public static /* synthetic */ int d(c cVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d983748a", new Object[]{cVar, new Integer(i)})).intValue();
            }
            cVar.j = i;
            return i;
        }

        public static /* synthetic */ String e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a1fe4c27", new Object[]{cVar});
            }
            return cVar.f10469a;
        }

        public static /* synthetic */ String f(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("16048955", new Object[]{cVar});
            }
            return cVar.b;
        }

        public static /* synthetic */ String g(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57fa2849", new Object[]{cVar, str});
            }
            cVar.b = str;
            return str;
        }

        public static /* synthetic */ String h(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("581bb6b4", new Object[]{cVar});
            }
            return cVar.c;
        }

        public static /* synthetic */ String i(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("27ba5be8", new Object[]{cVar, str});
            }
            cVar.c = str;
            return str;
        }

        public static /* synthetic */ String j(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9a32e413", new Object[]{cVar});
            }
            return cVar.e;
        }

        public static /* synthetic */ String k(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f77a8f87", new Object[]{cVar, str});
            }
            cVar.e = str;
            return str;
        }

        public static /* synthetic */ String l(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1e613ed1", new Object[]{cVar});
            }
            return cVar.d;
        }

        public static /* synthetic */ String m(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("96faf6c5", new Object[]{cVar, str});
            }
            cVar.d = str;
            return str;
        }

        public static /* synthetic */ String n(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("60786c30", new Object[]{cVar});
            }
            return cVar.f;
        }

        public static /* synthetic */ String o(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("66bb2a64", new Object[]{cVar, str});
            }
            cVar.f = str;
            return str;
        }

        public static /* synthetic */ String p(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a28f998f", new Object[]{cVar});
            }
            return cVar.g;
        }

        public static /* synthetic */ String q(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("367b5e03", new Object[]{cVar, str});
            }
            cVar.g = str;
            return str;
        }

        public static /* synthetic */ String r(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e4a6c6ee", new Object[]{cVar});
            }
            return cVar.h;
        }

        public static /* synthetic */ String s(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("63b91a2", new Object[]{cVar, str});
            }
            cVar.h = str;
            return str;
        }

        public String t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
            }
            return this.b;
        }

        public String u() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ef2d2cd6", new Object[]{this});
            }
            return this.c;
        }

        public int v() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fce2f514", new Object[]{this})).intValue();
            }
            return this.j;
        }
    }

    public static /* synthetic */ boolean f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aa05dee", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    public static /* synthetic */ c g(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("e6d8630b", new Object[]{cVar});
        }
        e = cVar;
        return cVar;
    }

    public static /* synthetic */ void h(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb2e74d", new Object[]{jVar});
        } else {
            jVar.i();
        }
    }

    public static c j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("c908f104", new Object[0]);
        }
        return e;
    }

    public static void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcf041d", new Object[]{new Boolean(z)});
            return;
        }
        b = z;
        if (!z) {
            ALog.e("falco.reporter", "[init] report not enabled", null, new Object[0]);
            return;
        }
        try {
            b bVar = new b(null);
            FalcoNativePageLifecycleCallbacks.a().c(bVar);
            FalcoNativePageLifecycleCallbacks.a().e(bVar);
        } catch (Throwable th) {
            ALog.e("falco.reporter", "[init] error", null, th, new Object[0]);
        }
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209512c0", new Object[0]);
        } else if (!c) {
            c = true;
            DimensionSet create = DimensionSet.create();
            create.addDimension("falcoId");
            create.addDimension("errorCode");
            create.addDimension(WXImage.ERRORDESC);
            create.addDimension("errorSignal");
            create.addDimension("pageName");
            create.addDimension("pageUrl");
            create.addDimension(pl4.KEY_LOAD_TYPE);
            create.addDimension("afcType");
            create.addDimension("launchUrl");
            create.addDimension("envFalcoId");
            AppMonitor.register(FalcoEnvironmentImpl.MONITOR_MODULE, "falco_exception", MeasureSet.create(), create);
        }
    }

    @Override // com.taobao.analysis.v3.FalcoExceptionReporter
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
        } else if (!b) {
            ALog.e("falco.reporter", "[report] not enabled", null, new Object[0]);
        } else {
            crt.d(new a());
        }
    }

    @Override // com.taobao.analysis.v3.FalcoExceptionReporter
    public FalcoExceptionReporter b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoExceptionReporter) ipChange.ipc$dispatch("b3b4b6f0", new Object[]{this, str});
        }
        c.g(this.f10467a, str);
        return this;
    }

    @Override // com.taobao.analysis.v3.FalcoExceptionReporter
    public FalcoExceptionReporter c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoExceptionReporter) ipChange.ipc$dispatch("7687385a", new Object[]{this, new Integer(i)});
        }
        c.d(this.f10467a, i);
        return this;
    }

    @Override // com.taobao.analysis.v3.FalcoExceptionReporter
    public FalcoExceptionReporter d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoExceptionReporter) ipChange.ipc$dispatch("a93904f3", new Object[]{this, str});
        }
        c.i(this.f10467a, str);
        return this;
    }

    @Override // com.taobao.analysis.v3.FalcoExceptionReporter
    public FalcoExceptionReporter e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoExceptionReporter) ipChange.ipc$dispatch("c563553b", new Object[]{this, str});
        }
        c.k(this.f10467a, str);
        return this;
    }

    public final void i() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7acecc0", new Object[]{this});
            return;
        }
        l();
        c.m(this.f10467a, SceneIdentifier.getCurrentPageNameWithFragment());
        c cVar = this.f10467a;
        if (d) {
            str = "launchLoad";
        } else {
            str = "pageLoad";
        }
        c.o(cVar, str);
        FalcoEnvironmentImpl m = FalcoEnvironmentImpl.m();
        if (m != null) {
            String c2 = m.c();
            k l = m.l();
            c.q(this.f10467a, l.b);
            c.s(this.f10467a, l.c);
            c.c(this.f10467a, c2);
        }
        e = this.f10467a;
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("falcoId", c.e(this.f10467a));
        create.setValue("errorCode", c.f(this.f10467a));
        create.setValue(WXImage.ERRORDESC, c.h(this.f10467a));
        create.setValue("errorSignal", String.valueOf(c.a(this.f10467a)));
        create.setValue("pageName", c.l(this.f10467a));
        create.setValue("pageUrl", c.j(this.f10467a));
        create.setValue(pl4.KEY_LOAD_TYPE, c.n(this.f10467a));
        create.setValue("afcType", c.p(this.f10467a));
        create.setValue("launchUrl", c.r(this.f10467a));
        create.setValue("envFalcoId", c.b(this.f10467a));
        AppMonitor.Stat.commit(FalcoEnvironmentImpl.MONITOR_MODULE, "falco_exception", create, MeasureValueSet.create());
    }
}
