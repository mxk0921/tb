package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.tbadapter.biz.ABTestIndexHook;
import com.taobao.android.remoteso.tbadapter.ext.TaobaoUCKernelResolveHook;
import com.taobao.android.tbuprofen.plugin.DefaultPlugin;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import java.util.HashMap;
import java.util.Map;
import tb.ngd;
import tb.zho;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class u9t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements by4<bu4, hln<String>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public hln<String> a(bu4 bu4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hln) ipChange.ipc$dispatch("614c520b", new Object[]{this, bu4Var});
            }
            return new e9t(bu4Var.f16635a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements zho.c<com.taobao.android.remoteso.resolver2.e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kgd f29249a;
        public final /* synthetic */ cgd b;
        public final /* synthetic */ ggd c;
        public final /* synthetic */ hgd d;
        public final /* synthetic */ egd e;

        public b(kgd kgdVar, cgd cgdVar, ggd ggdVar, hgd hgdVar, egd egdVar) {
            this.f29249a = kgdVar;
            this.b = cgdVar;
            this.c = ggdVar;
            this.d = hgdVar;
            this.e = egdVar;
        }

        /* renamed from: a */
        public com.taobao.android.remoteso.resolver2.e b(bu4 bu4Var, com.taobao.android.remoteso.resolver2.e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.remoteso.resolver2.e) ipChange.ipc$dispatch("a509dde6", new Object[]{this, bu4Var, eVar});
            }
            return new TaobaoUCKernelResolveHook(this.f29249a, this.b, bu4Var.b, this.c, this.d, this.e, eVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements by4<bu4, rzc> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public rzc a(bu4 bu4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rzc) ipChange.ipc$dispatch("bf40ac2", new Object[]{this, bu4Var});
            }
            return new r9t();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements by4<bu4, uec> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cgd f29250a;
        public final /* synthetic */ kgd b;

        public d(cgd cgdVar, kgd kgdVar) {
            this.f29250a = cgdVar;
            this.b = kgdVar;
        }

        /* renamed from: b */
        public uec a(bu4 bu4Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uec) ipChange.ipc$dispatch("bf5fbaa8", new Object[]{this, bu4Var});
            }
            cgd cgdVar = this.f29250a;
            return new dte(new sah(cgdVar), new dar(cgdVar), new d7b(), new ABTestIndexHook(this.b, cgdVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e implements ngd.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final kgd f29251a;
        public final Map<String, Object> b = new HashMap();

        public e(kgd kgdVar) {
            this.f29251a = kgdVar;
        }

        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8130b495", new Object[]{this, map});
                return;
            }
            map.putAll(this.b);
            map.put(WXStorageModule.NAME, Long.valueOf(this.f29251a.f()));
            map.put("isFirstLaunch", Boolean.valueOf(i21.a()));
            map.put("isFullNewInstall", Boolean.valueOf(i21.b()));
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[]{this});
                return;
            }
            ((HashMap) this.b).put(ngd.ARGS_CPU_ABI, this.f29251a.d());
            ((HashMap) this.b).put("args_is_main_process", Boolean.valueOf(this.f29251a.b()));
        }
    }

    public static zho a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zho) ipChange.ipc$dispatch("f9f5e0e5", new Object[]{application});
        }
        qbn.c(new w9t());
        if (qts.e()) {
            bh4.f(application);
        }
        ijo ijoVar = new ijo(application);
        y9h y9hVar = new y9h(new yg4(application));
        nu7 nu7Var = new nu7();
        lt8 lt8Var = new lt8();
        qm2 qm2Var = new qm2();
        t9t t9tVar = new t9t();
        a aVar = new a();
        l8h l8hVar = new l8h(application, ijoVar);
        e eVar = new e(ijoVar);
        eVar.b();
        rbn.a().a(eVar);
        kx4.b(application);
        c();
        zho zhoVar = new zho(ijoVar, y9hVar, nu7Var, lt8Var, qm2Var, aVar, t9tVar, new h9t(application, l8hVar), new o9t(l8hVar), new b(ijoVar, y9hVar, nu7Var, lt8Var, qm2Var), new c());
        zhoVar.c(uec.class, new d(y9hVar, ijoVar));
        zhoVar.d(tmc.class, l8hVar);
        return zhoVar;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4207a848", new Object[0]);
            return;
        }
        RSoLog.f(RSoLog.LogLevel.DEBUG, new q9t("RemoteSo", qts.d(), d1r.a(".enableLog")));
        rbn.c(new v9t());
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("540cbd16", new Object[0]);
            return;
        }
        kc7.a("cro_python_kit", "AliNNPython");
        kc7.a(trr.ENGINE_LIB_NAME, "tbuprofen-util");
        kc7.a(DefaultPlugin.PLUGIN_LIB_NAME, "zstd", "tbuprofen-util");
        kc7.a("mnncv", "AliNNPython");
        kc7.a("walle_base", "AliNNPython");
        kc7.a("mrt", "AliNNPython");
        kc7.a("mnnpybridge", "MNN", "MNN_Express", "MNNOpenCV", "AliNNPython");
        kc7.a("mnnkitcore", "MNN");
        kc7.a("MNN_Express", "MNN");
        kc7.a("MNN_CL", "MNN");
        kc7.a("MNNOpenCV", "MNN_Express", "MNN");
        kc7.a("mnnqjs", "MNN", "MNN_Express");
        kc7.a("mnn_jsi", "MNN", "MNN_Express");
        kc7.a("mnnface", "MNN");
        kc7.a("wbdebug", "AliNNPython");
        kc7.a("nnrruntime", "MNN");
    }
}
