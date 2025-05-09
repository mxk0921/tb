package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.BundleInfo;
import com.taobao.android.turbo.Tab2OuterInstanceRegistry;
import com.taobao.android.turbo.Tab2ServiceRegistry;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import tb.tpu;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kpu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUNDLE_TURBOFLOW_BIZ_REMOTE = "turboflow_biz_remote";

    /* renamed from: a  reason: collision with root package name */
    public static volatile Boolean f22842a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zk9.i f22843a;

        public a(zk9.i iVar) {
            this.f22843a = iVar;
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                return;
            }
            tpu.Companion.a("TurboBizLoader", "loadRemoteTurboBizBundle success", null);
            kpu.a(true);
            zk9.i iVar = this.f22843a;
            if (iVar != null) {
                iVar.onClassLoaded(cls);
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                return;
            }
            tpu.Companion.a("TurboBizLoader", "loadRemoteTurboBizBundle fail", null);
            kpu.a(false);
            zk9.i iVar = this.f22843a;
            if (iVar != null) {
                iVar.onClassNotFound();
            }
        }
    }

    static {
        t2o.a(502268254);
    }

    public static /* synthetic */ void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddeb9a3d", new Object[]{new Boolean(z)});
        } else {
            j(z);
        }
    }

    public static boolean b() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fd46a13", new Object[0])).booleanValue();
        }
        if (f22842a == null) {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (akt.class) {
                if (f22842a == null) {
                    if (akt.p2("enableCheckBundleFeatureUpdate", true)) {
                        z = w49.c(l91.Companion.a(spu.g()), BUNDLE_TURBOFLOW_BIZ_REMOTE);
                        tpu.a aVar = tpu.Companion;
                        aVar.a("TurboBizLoader", "isFeatureUpdated " + z, null);
                    } else {
                        z = true;
                    }
                    if (z) {
                        try {
                            z2 = bcq.a().g(spu.g(), true, BUNDLE_TURBOFLOW_BIZ_REMOTE);
                        } catch (Exception e) {
                            tpu.a aVar2 = tpu.Companion;
                            aVar2.a("TurboBizLoader", "load turboflow_biz-remote error " + e.getMessage(), null);
                            z2 = false;
                        }
                        if (z2) {
                            try {
                                Class.forName("com.taobao.android.turbo.flexaremote.Tab2ServiceRegistry");
                                Class.forName("com.taobao.android.turbo.flexaremote.Tab2OuterInstanceRegistry");
                            } catch (Throwable unused) {
                            }
                        }
                        z3 = z2;
                    }
                    f22842a = Boolean.valueOf(z3);
                    tpu.a aVar3 = tpu.Companion;
                    aVar3.a("TurboBizLoader", "isRemoteTurboBizLoaded " + z3 + " time:" + (System.currentTimeMillis() - currentTimeMillis), null);
                }
            }
        }
        return f22842a.booleanValue();
    }

    public static s4d c() {
        if (f()) {
            try {
                s4d s4dVar = (s4d) Class.forName("com.taobao.android.turbo.flexaremote.Tab2OuterInstanceRegistry").newInstance();
                tpu.Companion.a("TurboBizLoader", "create remote Tab2OuterInstanceRegistry success", null);
                return s4dVar;
            } catch (Throwable th) {
                tpu.a aVar = tpu.Companion;
                aVar.a("TurboBizLoader", "createTab2OuterInstanceRegistry error " + th.getMessage(), null);
                aVar.a("TurboBizLoader", "createTab2OuterInstanceRegistry fail", null);
                return null;
            }
        } else {
            tpu.Companion.a("TurboBizLoader", "create local Tab2OuterInstanceRegistry success", null);
            return new Tab2OuterInstanceRegistry();
        }
    }

    public static xod d(boolean z) {
        if (f()) {
            try {
                xod xodVar = (xod) Class.forName("com.taobao.android.turbo.flexaremote.Tab2ServiceRegistry").getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
                tpu.Companion.a("TurboBizLoader", "create remote Tab2ServiceRegistry success", null);
                return xodVar;
            } catch (Throwable th) {
                tpu.a aVar = tpu.Companion;
                aVar.a("TurboBizLoader", "create remote Tab2ServiceRegistry error " + th.getMessage(), null);
                aVar.a("TurboBizLoader", "createTab2ServiceRegistry fail", null);
                return null;
            }
        } else {
            tpu.Companion.a("TurboBizLoader", "create local Tab2ServiceRegistry success", null);
            return new Tab2ServiceRegistry(z);
        }
    }

    public static String e() {
        if (!f()) {
            return BundleInfo.getVersion();
        }
        try {
            return (String) xtn.Companion.a("getVersion", Class.forName("com.taobao.android.turbo.flexaremote.BundleInfo")).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("746629c7", new Object[0])).booleanValue();
        }
        if (!b() || !g() || l91.Companion.c()) {
            return false;
        }
        return true;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a330659", new Object[0])).booleanValue();
        }
        return TextUtils.equals("true", akt.G2("guangguang.tab2turboflow.enableremotebiz", "false")) || akt.q2("enableTab2RemoteBiz");
    }

    public static void h(zk9.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418162c4", new Object[]{iVar});
        } else {
            zk9.b("com.taobao.android.turbo.flexaremote.Tab2ServiceRegistry", new a(iVar));
        }
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62df1249", new Object[0]);
        } else if (g()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pageName", (Object) "Page_GuangGuang");
            jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
            jSONObject.put("arg1", (Object) "loadRemoteTurboBundle");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", (Object) Boolean.valueOf(b()));
            jSONObject2.put("version", (Object) e());
            jSONObject.put("args", (Object) jSONObject2);
            TrackerModule.commit(new d.j(null, jSONObject, null), false);
        }
    }

    public static void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e32cc8b", new Object[]{new Boolean(z)});
        } else if (f22842a == null) {
            f22842a = Boolean.valueOf(z);
            tpu.a aVar = tpu.Companion;
            aVar.a("TurboBizLoader", "isRemoteTurboBizLoaded " + z + " in setRemoteTurboBizLoaded", null);
        }
    }
}
