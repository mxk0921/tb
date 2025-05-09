package com.taobao.appbundle;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.appbundle.remote.activity.RemoteLoadingActivity;
import com.taobao.appbundle.runtime.AppBundleComponentFactory;
import com.taobao.appbundle.runtime.InjectClassLoader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.a07;
import tb.acq;
import tb.al9;
import tb.ckf;
import tb.e49;
import tb.j49;
import tb.jpu;
import tb.q48;
import tb.r48;
import tb.ru1;
import tb.s11;
import tb.t2o;
import tb.ucq;
import tb.xz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAOPAI_SDK_FEATURE = "taopai_sdk";

    /* renamed from: a  reason: collision with root package name */
    public e49 f10043a;
    public final HashMap<String, String> b;
    public al9 c;
    public com.taobao.appbundle.b d;
    public Application e;
    public final HashMap<String, Object> f;
    public ucq g;
    public static final C0529a Companion = new C0529a(null);
    public static final String TAOPAI_FEATURE = "taopai_business";
    public static final Map<String, String> h = kotlin.collections.a.j(jpu.a(TAOPAI_FEATURE, "com.taobao.android.pissarro.remote.RemoteLoadingActivity"), jpu.a("litecreator", "com.taobao.android.pissarro.remote.RemoteLoadingActivity"), jpu.a(MainRequestParams.INDUSTRY, "com.taobao.android.industry.base.IdstryModuleLoadActivity"), jpu.a("TB3DSpace", "com.taobao.android.tb3dspaceprocessor.Tb3dSpaceInstallActivity"));

    /* compiled from: Taobao */
    /* renamed from: com.taobao.appbundle.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class C0529a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(377487363);
        }

        public C0529a() {
        }

        public final a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a4178c45", new Object[]{this});
            }
            return d.INSTANCE.a();
        }

        public /* synthetic */ C0529a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a();

        ComponentName b(ComponentName componentName);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void onFeatureComponentLoaded(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final d INSTANCE = new d();

        /* renamed from: a  reason: collision with root package name */
        public static final a f10044a = new a(null);

        static {
            t2o.a(377487366);
        }

        public final a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7c09ba8d", new Object[]{this});
            }
            return f10044a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public e(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.a(a.this, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class f implements j49 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public f(String str) {
            this.b = str;
        }

        @Override // tb.j49
        public final void a(String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0656ece", new Object[]{this, strArr});
            } else {
                a.a(a.this, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Set b;

        public g(Set set) {
            this.b = set;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (String str : this.b) {
                a.c(a.this, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class h implements j49 {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Set b;

        public h(Set set) {
            this.b = set;
        }

        @Override // tb.j49
        public final void a(String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0656ece", new Object[]{this, strArr});
                return;
            }
            a aVar = a.this;
            Set set = this.b;
            ckf.f(strArr, AdvanceSetting.NETWORK_TYPE);
            a.b(aVar, set, strArr);
        }
    }

    public a() {
        this.b = new HashMap<>();
        this.f = new HashMap<>();
    }

    public static final /* synthetic */ void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c2626fd", new Object[]{aVar, str});
        } else {
            aVar.m(str);
        }
    }

    public static final /* synthetic */ void b(a aVar, Set set, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b828f33", new Object[]{aVar, set, strArr});
        } else {
            aVar.n(set, strArr);
        }
    }

    public static final /* synthetic */ void c(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e1c88d", new Object[]{aVar, str});
        } else {
            aVar.o(str);
        }
    }

    public final Application d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return this.e;
    }

    public final Class<?> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f7d6f780", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final HashMap<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("af6075b3", new Object[]{this});
        }
        return this.b;
    }

    public final String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87eade42", new Object[]{this, str});
        }
        ckf.g(str, ru1.FEATURE_NAME);
        return BundleInfoManager.instance().getDownGradeUri(str);
    }

    public final ucq h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ucq) ipChange.ipc$dispatch("868b03e2", new Object[]{this});
        }
        return this.g;
    }

    public final <T extends Activity> Class<T> i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("708baff", new Object[]{this, str});
        }
        ckf.g(str, ru1.FEATURE_NAME);
        Map<String, String> map = h;
        if (map.containsKey(str) && e(map.get(str)) != null) {
            Class<T> cls = (Class<T>) e(map.get(str));
            if (cls != null) {
                return cls;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        } else if (this.f.containsKey(str)) {
            Object obj = this.f.get(str);
            if (obj != null) {
                return (Class) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        } else if (TextUtils.isEmpty(BundleInfoManager.instance().getRedirectActivity(str))) {
            return RemoteLoadingActivity.class;
        } else {
            Class<T> cls2 = (Class<T>) e(BundleInfoManager.instance().getRedirectActivity(str));
            if (cls2 != null) {
                return cls2;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc81ce1", new Object[]{this});
            return;
        }
        try {
            InjectClassLoader.Companion companion = InjectClassLoader.Companion;
            Application application = this.e;
            ckf.d(application);
            ClassLoader classLoader = application.getClassLoader();
            ckf.f(classLoader, "application!!.classLoader");
            Application application2 = this.e;
            ckf.d(application2);
            companion.inject(classLoader, application2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void l() {
        String str;
        ucq ucqVar;
        Set<String> f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e99e88", new Object[]{this});
            return;
        }
        Log.e("AppBundle", "installDynamicFeatures");
        String f3 = s11.f();
        Application application = this.e;
        String str2 = null;
        if (application != null) {
            str = application.getPackageName();
        } else {
            str = null;
        }
        if (!ckf.b(f3, str) || BundleInfoManager.instance().getDynamicFeatureInfo(acq.PLUGIN_NAME) == null || (ucqVar = this.g) == null || (f2 = ucqVar.f()) == null || f2.contains(acq.PLUGIN_NAME)) {
            String f4 = s11.f();
            Application application2 = this.e;
            if (application2 != null) {
                str2 = application2.getPackageName();
            }
            if (ckf.b(f4, str2)) {
                al9 al9Var = this.c;
                if (al9Var != null) {
                    al9Var.j(this.f10043a);
                }
                al9 al9Var2 = this.c;
                if (al9Var2 != null) {
                    al9Var2.k(this.f10043a);
                    return;
                }
                return;
            }
            return;
        }
        ucq ucqVar2 = this.g;
        if (ucqVar2 != null) {
            ucqVar2.d(xz3.e(acq.PLUGIN_NAME));
        }
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bca4a72", new Object[]{this, str});
            return;
        }
        try {
            if (!acq.p().h(this.e, false, str, new String[0])) {
                q48.e().b();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            q48.e().b();
        }
    }

    public final void n(Set<String> set, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2328a8", new Object[]{this, set, strArr});
            return;
        }
        for (String str : set) {
            try {
                if (!acq.p().h(this.e, false, str, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                    r48.h().b(str);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                r48.h().b(str);
            }
        }
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d7e1582", new Object[]{this, str});
            return;
        }
        try {
            if (!acq.p().h(this.e, false, str, new String[0])) {
                r48.h().b(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            r48.h().b(str);
        }
    }

    public final void p(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a0d759", new Object[]{this, str, cVar});
            return;
        }
        ckf.g(str, ru1.FEATURE_NAME);
        ckf.g(cVar, "featureComponentLoader");
        if (Build.VERSION.SDK_INT > 27) {
            AppBundleComponentFactory.Companion.registerFeatureComponentLoader(str, cVar);
        } else {
            InjectClassLoader.Companion.registerFeatureComponentLoader(str, cVar);
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("577c9ee7", new Object[]{this});
            return;
        }
        al9 al9Var = this.c;
        if (al9Var != null) {
            al9Var.j(this.d);
        }
        al9 al9Var2 = this.c;
        if (al9Var2 != null) {
            al9Var2.k(this.d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(com.alibaba.flexa.compat.a r9) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.appbundle.a.j(com.alibaba.flexa.compat.a):void");
    }

    static {
        t2o.a(377487362);
    }

    public /* synthetic */ a(a07 a07Var) {
        this();
    }
}
