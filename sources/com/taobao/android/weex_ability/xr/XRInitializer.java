package com.taobao.android.weex_ability.xr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.android.nav.Nav;
import com.taobao.tao.TaoPackageInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bdq;
import tb.dwh;
import tb.edq;
import tb.t2o;
import tb.ucq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XRInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURE = "TB3DSpace";

    /* renamed from: a  reason: collision with root package name */
    public final ucq f9960a;
    public boolean b = false;
    public boolean c = false;
    public final List<WeakReference<c>> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f9962a;

        public a(d dVar) {
            this.f9962a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f9962a != null) {
                XRInitializer.c(XRInitializer.this, true);
                this.f9962a.b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f9963a;

        public b(d dVar) {
            this.f9963a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f9963a != null) {
                XRInitializer.c(XRInitializer.this, false);
                this.f9963a.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements edq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(980418695);
            t2o.a(676331590);
        }

        /* renamed from: a */
        public void onStateUpdate(bdq bdqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
                return;
            }
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {
        void a();

        void b();
    }

    static {
        t2o.a(980418691);
    }

    public XRInitializer() {
        try {
            ucq h = com.taobao.appbundle.a.Companion.a().h();
            this.f9960a = h;
            this.d = new ArrayList(4);
            if (h == null) {
                dwh.p("XRInitializer", "fatal error. failed to get split manager.");
            }
        } catch (Throwable th) {
            dwh.p("XRInitializer", "fatal error. failed to create XRInitializer: " + th.getMessage());
        }
    }

    public static /* synthetic */ void a(XRInitializer xRInitializer, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2924c22", new Object[]{xRInitializer, dVar});
        } else {
            xRInitializer.e(dVar);
        }
    }

    public static /* synthetic */ boolean b(XRInitializer xRInitializer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12628452", new Object[]{xRInitializer, new Boolean(z)})).booleanValue();
        }
        xRInitializer.b = z;
        return z;
    }

    public static /* synthetic */ boolean c(XRInitializer xRInitializer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f4f9b71", new Object[]{xRInitializer, new Boolean(z)})).booleanValue();
        }
        xRInitializer.c = z;
        return z;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        try {
            if (this.f9960a != null && !((ArrayList) this.d).isEmpty()) {
                Iterator it = ((ArrayList) this.d).iterator();
                while (it.hasNext()) {
                    c cVar = (c) ((WeakReference) it.next()).get();
                    if (cVar != null) {
                        this.f9960a.e(cVar);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af331dd5", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("301c2283", new Object[]{this, str})).booleanValue();
        }
        if (this.f9960a == null) {
            return false;
        }
        String str2 = TaoPackageInfo.sTTID;
        if ("212200".equals(str2) || "36400112278902".equals(str2)) {
            return true;
        }
        if (BundleInfoManager.instance().getDynamicFeatureInfo(str) == null || !this.f9960a.f().contains(str)) {
            return false;
        }
        return true;
    }

    public void h(Context context, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8875ff88", new Object[]{this, context, dVar});
        } else if (this.b) {
            dwh.f("XRInitializer", "already loaded...");
        } else if (BundleInfoManager.instance().getDynamicFeatureInfo("TB3DSpace") == null) {
            e(dVar);
        } else if (this.f9960a == null) {
            dVar.a();
            dwh.f("XRInitializer", "failed to fetch(code: 0x001)");
        } else if (g("TB3DSpace")) {
            e(dVar);
        } else {
            this.b = true;
            LocalBroadcastManager.getInstance(context.getApplicationContext()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.weex_ability.xr.XRInitializer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/xr/XRInitializer$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    XRInitializer.a(XRInitializer.this, dVar);
                    XRInitializer.b(XRInitializer.this, false);
                    LocalBroadcastManager.getInstance(context2.getApplicationContext()).unregisterReceiver(this);
                }
            }, new IntentFilter("TB3DSPACE_INSTALL_SUCCESS"));
            Nav.from(context.getApplicationContext()).toUri("taobao://go/installxrspace3d");
        }
    }

    public final void e(d dVar) {
        try {
            Class.forName("com.taobao.android.weex.plugin.xr.XREnvironment").getDeclaredMethod("setup", Runnable.class, Runnable.class).invoke(null, new a(dVar), new b(dVar));
        } catch (Throwable th) {
            dVar.a();
            dwh.g("XRInitializer", "failed to inject xr os environment because of " + th.getMessage(), th);
        }
    }
}
