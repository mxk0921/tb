package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.TriggerChannelService;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.orange.OrangeConfig;
import com.taobao.zcache.Environment;
import com.taobao.zcache.Error;
import com.taobao.zcache.PackUpdateFinishedCallback;
import com.taobao.zcache.ResourceResponse;
import com.taobao.zcache.ResourceResponseCallback;
import com.taobao.zcache.api.ZCacheAPI;
import com.taobao.zcache.core.IZCacheCore;
import com.taobao.zcache.core.PackUpdateCallback;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yox {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ManualStartUpdate = 1;
    public static Context b;

    /* renamed from: a  reason: collision with root package name */
    public static final mpx f32246a = new mpx();
    public static boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                yox.k();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f32247a;
        public final /* synthetic */ String b;

        public c(List list, String str) {
            this.f32247a = list;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dpx.b().prefetch(this.f32247a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ hkl f32248a;
        public final /* synthetic */ IZCacheCore b;
        public final /* synthetic */ ekl c;
        public final /* synthetic */ fkl d;

        public d(hkl hklVar, IZCacheCore iZCacheCore, ekl eklVar, fkl fklVar) {
            this.f32248a = hklVar;
            this.b = iZCacheCore;
            this.c = eklVar;
            this.d = fklVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            PackUpdateCallback packUpdateCallback;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f32248a != null) {
                packUpdateCallback = new PackUpdateCallback();
                packUpdateCallback.resultCallback = this.f32248a;
            } else {
                packUpdateCallback = null;
            }
            this.b.updatePack(this.c, packUpdateCallback, this.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IZCacheCore f32249a;
        public final /* synthetic */ y8o b;
        public final /* synthetic */ ResourceResponseCallback c;

        public e(IZCacheCore iZCacheCore, y8o y8oVar, ResourceResponseCallback resourceResponseCallback) {
            this.f32249a = iZCacheCore;
            this.b = y8oVar;
            this.c = resourceResponseCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f32249a.getResource(this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PackUpdateFinishedCallback f32250a;
        public final /* synthetic */ IZCacheCore b;
        public final /* synthetic */ ekl c;
        public final /* synthetic */ fkl d;

        public f(PackUpdateFinishedCallback packUpdateFinishedCallback, IZCacheCore iZCacheCore, ekl eklVar, fkl fklVar) {
            this.f32250a = packUpdateFinishedCallback;
            this.b = iZCacheCore;
            this.c = eklVar;
            this.d = fklVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            PackUpdateCallback packUpdateCallback;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f32250a != null) {
                packUpdateCallback = new PackUpdateCallback();
                packUpdateCallback.finishedCallback = this.f32250a;
            } else {
                packUpdateCallback = null;
            }
            this.b.updatePack(this.c, packUpdateCallback, this.d);
        }
    }

    static {
        t2o.a(996147222);
    }

    @Deprecated
    public static void A(ekl eklVar, PackUpdateFinishedCallback packUpdateFinishedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6cb2078", new Object[]{eklVar, packUpdateFinishedCallback});
        } else {
            B(eklVar, packUpdateFinishedCallback, null);
        }
    }

    @Deprecated
    public static void B(ekl eklVar, PackUpdateFinishedCallback packUpdateFinishedCallback, fkl fklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16304e7f", new Object[]{eklVar, packUpdateFinishedCallback, fklVar});
        } else if (eklVar != null && !TextUtils.isEmpty(eklVar.b())) {
            String b2 = eklVar.b();
            IZCacheCore b3 = dpx.b();
            if (b3 == null) {
                dpx.g("ZCache/UpdatePack").j("finished").a("name", b2).f();
                if (packUpdateFinishedCallback != null) {
                    packUpdateFinishedCallback.finish(b2, dpx.e());
                }
            } else if (dpx.d()) {
                tft.a(new f(packUpdateFinishedCallback, b3, eklVar, fklVar));
            } else if (packUpdateFinishedCallback != null) {
                packUpdateFinishedCallback.finish(b2, j());
            }
        } else if (packUpdateFinishedCallback != null) {
            packUpdateFinishedCallback.finish(null, new Error(1001, "packName is null or empty"));
        }
    }

    @Deprecated
    public static void a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[0]);
            return;
        }
        try {
            throw new Exception();
        } catch (Exception e2) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            if (stackTrace.length > 1) {
                str = stackTrace[1].toString();
                if (stackTrace.length > 2) {
                    str = str + "\n" + stackTrace[2].toString();
                }
            } else {
                str = "Unknown";
            }
            c(str);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792e92b", new Object[0]);
            return;
        }
        IZCacheCore b2 = dpx.b();
        if (b2 == null) {
            dpx.g("ZCache/Task").j("cleanup").f();
        } else if (dpx.d()) {
            b2.cleanup();
        } else {
            lcn.a(RVLLevel.Error, "ZCache/Task").j("cleanup").g(2004, "sub process cleanup disabled").f();
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769f891e", new Object[]{str});
            return;
        }
        IZCacheCore b2 = dpx.b();
        if (b2 == null) {
            dpx.g("ZCache/Task").j(pg1.ATOM_EXT_clear).a("reason", str).f();
        } else if (dpx.d()) {
            b2.clear(str);
        } else {
            lcn.a(RVLLevel.Error, "ZCache/Task").j(pg1.ATOM_EXT_clear).g(2004, "sub process clear disabled").a("reason", str).f();
        }
    }

    public static void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f99ce0", new Object[]{str, str2, str3});
            return;
        }
        IZCacheCore b2 = dpx.b();
        if (b2 != null) {
            b2.clearResource(str, str2, str3);
        }
    }

    public static String e(String str, String str2) {
        IZCacheCore b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ad4dc7", new Object[]{str, str2});
        }
        if (str == null || (b2 = dpx.b()) == null) {
            return null;
        }
        return b2.getACacheRootPath(str, str2);
    }

    public static long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c1ae3db", new Object[0])).longValue();
        }
        IZCacheCore b2 = dpx.b();
        if (b2 == null) {
            return 0L;
        }
        return b2.getAccessAPI();
    }

    public static Context g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        return b;
    }

    public static ResourceResponse h(y8o y8oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResourceResponse) ipChange.ipc$dispatch("c4515e99", new Object[]{y8oVar});
        }
        IZCacheCore b2 = dpx.b();
        if (b2 == null) {
            return ResourceResponse.getErrorResponse(dpx.e());
        }
        return b2.getResource(y8oVar);
    }

    public static void i(y8o y8oVar, ResourceResponseCallback resourceResponseCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985a830", new Object[]{y8oVar, resourceResponseCallback});
        } else if (resourceResponseCallback != null) {
            IZCacheCore b2 = dpx.b();
            if (b2 == null) {
                resourceResponseCallback.finish(ResourceResponse.getErrorResponse(dpx.e()));
            } else {
                tft.a(new e(b2, y8oVar, resourceResponseCallback));
            }
        }
    }

    public static Error j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Error) ipChange.ipc$dispatch("71191782", new Object[0]);
        }
        return new Error(2004, "sub process update disabled");
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5234975", new Object[0]);
        } else {
            l("preload_packageapp.zip");
        }
    }

    public static void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e6dfff", new Object[]{str});
        } else if (dpx.d()) {
            IZCacheCore b2 = dpx.b();
            if (b2 == null) {
                dpx.g("ZCache/Preload").j("install").a("file", str).f();
            } else {
                b2.installPreload(str);
            }
        }
    }

    @Deprecated
    public static boolean m(String str) {
        IZCacheCore b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3525c17", new Object[]{str})).booleanValue();
        }
        if (str == null || (b2 = dpx.b()) == null) {
            return false;
        }
        return b2.isResourceInstalled(new y8o(str));
    }

    public static void n(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("778b03ef", new Object[]{list});
        } else {
            o(list, null);
        }
    }

    public static void o(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec6aff9", new Object[]{list, str});
        } else if (list != null && list.size() != 0) {
            if (dpx.b() == null) {
                icn a2 = dpx.g("ZCache/Prefetch").j("trigger").a(TriggerChannelService.EXTRA_ORIGIN, str);
                JSONObject jSONObject = new JSONObject();
                for (String str2 : list) {
                    a2.a(str2, jSONObject);
                }
                a2.f();
                return;
            }
            tft.a(new c(list, str));
        }
    }

    public static void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ad4916", new Object[]{new Boolean(z)});
        } else if (z) {
            try {
                fsw.h("ZCache", ZCacheAPI.class);
            } catch (Exception | NoClassDefFoundError unused) {
            }
        }
    }

    public static void q(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cc730f0", new Object[]{str, str2, str3});
        } else {
            dpx.h(str, str2, str3);
        }
    }

    public static void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c111c8c", new Object[0]);
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"ZCache"}, new b(), true);
        } catch (NoClassDefFoundError unused) {
        }
    }

    public static void s(String str, PackUpdateFinishedCallback packUpdateFinishedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2daa1393", new Object[]{str, packUpdateFinishedCallback});
        } else if (str != null && packUpdateFinishedCallback != null) {
            bkv.c(str, packUpdateFinishedCallback);
        }
    }

    public static void t(String str, String str2) {
        IZCacheCore b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defa1e60", new Object[]{str, str2});
        } else if (str != null && (b2 = dpx.b()) != null && dpx.d()) {
            b2.removePack(new ekl(str, str2));
        }
    }

    public static mpx u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mpx) ipChange.ipc$dispatch("2276d94", new Object[0]);
        }
        return f32246a;
    }

    public static void v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context});
        } else if (context != null) {
            if (context instanceof Activity) {
                new AndroidRuntimeException("Cannot use context which instance of Activity").printStackTrace();
                return;
            }
            b = context;
            lcn.n(context);
            dpx.l(b);
        }
    }

    public static void w(Environment environment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b177a10", new Object[]{environment});
        } else {
            dpx.m(environment);
        }
    }

    public static void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8e3ed2", new Object[0]);
            return;
        }
        IZCacheCore b2 = dpx.b();
        if (b2 != null) {
            b2.startUpdate();
        }
    }

    public static void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6e4f73", new Object[0]);
            return;
        }
        IZCacheCore b2 = dpx.b();
        if (b2 != null) {
            b2.syncSubProcessConfig();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("ZCache".equals(str)) {
                String str2 = OrangeConfig.getInstance().getConfigs("ZCache").get("useCustomBizId");
                if (str2 == null || !"1".contentEquals(str2)) {
                    z = false;
                }
                iv7.p = z;
            }
        }
    }

    public static void C(ekl eklVar, hkl hklVar, fkl fklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e356f4", new Object[]{eklVar, hklVar, fklVar});
        } else if (eklVar != null && !TextUtils.isEmpty(eklVar.b())) {
            String b2 = eklVar.b();
            IZCacheCore b3 = dpx.b();
            if (b3 == null) {
                dpx.g("ZCache/UpdatePack").j("finished").a("name", b2).f();
                if (hklVar != null) {
                    hklVar.a(b2, new gkl(b2, false, dpx.e()));
                }
            } else if (dpx.d()) {
                tft.a(new d(hklVar, b3, eklVar, fklVar));
            } else if (hklVar != null) {
                hklVar.a(b2, new gkl(b2, false, j()));
            }
        } else if (hklVar != null) {
            hklVar.a(null, new gkl(null, false, new Error(1001, "packName is null or empty")));
        }
    }

    public static void x(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e6fb2b", new Object[]{context, str, str2, new Integer(i)});
            return;
        }
        if (context != null) {
            v(context);
        }
        IZCacheCore b2 = dpx.b();
        if (b2 == null) {
            dpx.g("ZCache/Setup").j("setup").f();
        } else if (!c) {
            c = true;
            if (dpx.d()) {
                dpx.a();
                r();
                b2.setup(str, str2, i);
                p(true);
                tft.a(new a());
                return;
            }
            b2.setupSubProcess();
            p(false);
        }
    }
}
