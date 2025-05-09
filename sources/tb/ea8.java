package tb;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.bis.core.protocol.BioRuntimeDependency;
import com.alipay.mobile.security.bio.runtime.BioResManager;
import com.alipay.mobile.security.bio.runtime.Runtime;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.FileUtil;
import com.alipay.mobile.security.bio.utils.Logger;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zoloz.hummer.common.BaseWebService;
import com.ap.zoloz.hummer.common.ServiceDesc;
import com.ap.zoloz.hummer.common.WebTask;
import com.zoloz.zhub.common.factor.facade.HummerGWFacade;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ea8 extends pu1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "EkycFacade";
    public static ea8 f;
    public y1c d;
    public dfb e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements dfb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.dfb
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ee5ec4b", new Object[]{this});
            } else {
                ea8.f(ea8.this);
            }
        }

        @Override // tb.dfb
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97c8cf5e", new Object[]{this, new Boolean(z)});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements odc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a(f9b f9bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44857e8a", new Object[]{this, f9bVar});
                return;
            }
            ea8.this.f26303a.a("currentTaskName", "context", ea8.TAG);
            ea8.this.f26303a = f9bVar;
            ga8 ga8Var = (ga8) f9bVar.o("hummer_response");
            ga8Var.b = ea8.this.f26303a.g();
            ga8Var.c = JSON.toJSONString(ea8.this.f26303a.k());
            ea8.g(ea8.this, ga8Var);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements bld {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.bld
        public void a(sho shoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8be185d9", new Object[]{this, shoVar});
            } else {
                ea8.h(ea8.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d extends Logger {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(ea8 ea8Var) {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ap/zoloz/hummer/api/EkycFacade$4");
        }

        public int debug(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9757c961", new Object[]{this, str, str2})).intValue();
            }
            return 0;
        }

        public int error(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4a936c16", new Object[]{this, str, str2})).intValue();
            }
            return 0;
        }

        public String getStackTraceString(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d582e916", new Object[]{this, th});
            }
            return "";
        }

        public int info(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f161e0bc", new Object[]{this, str, str2})).intValue();
            }
            return 0;
        }

        public int verbose(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("921d9190", new Object[]{this, str, str2})).intValue();
            }
            return 0;
        }

        public int warn(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c21b5694", new Object[]{this, str, str2})).intValue();
            }
            return 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f18410a;
        public final /* synthetic */ efe b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements BioResManager.Callback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public void onAllDownloadComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("eff344a", new Object[]{this});
                    return;
                }
                efe efeVar = e.this.b;
                if (efeVar != null) {
                    efeVar.a(true);
                }
            }

            public void onDownloadComplete(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ccf49c71", new Object[]{this, str});
                }
            }

            public void onDownloadStart(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5560a96c", new Object[]{this, str});
                }
            }

            public void onError(int i, int i2, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("724a699a", new Object[]{this, new Integer(i), new Integer(i2), str});
                    return;
                }
                efe efeVar = e.this.b;
                if (efeVar != null) {
                    efeVar.a(false);
                }
            }

            public void onInitComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7bbdc66f", new Object[]{this});
                }
            }
        }

        public e(Context context, efe efeVar) {
            this.f18410a = context;
            this.b = efeVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            efe efeVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                BioRuntimeDependency bioRuntimeDependency = BioResManager.getBioRuntimeDependency(this.f18410a);
                if (bioRuntimeDependency != null) {
                    int init = BioResManager.getInstance().init(this.f18410a, bioRuntimeDependency, new a());
                    if (init == 1) {
                        BioResManager.getInstance().startDownload();
                    } else if ((init == 5 || init == 3) && (efeVar = this.b) != null) {
                        efeVar.a(true);
                    }
                }
            } catch (Throwable th) {
                BioLog.e(th.toString());
            }
        }
    }

    static {
        t2o.a(245366809);
    }

    public ea8() {
        f9b f9bVar = new f9b();
        this.f26303a = f9bVar;
        f9bVar.a("currentTaskName", "context", TAG);
        this.b = new g9b();
    }

    public static /* synthetic */ void f(ea8 ea8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db60f0f1", new Object[]{ea8Var});
        } else {
            ea8Var.i();
        }
    }

    public static /* synthetic */ void g(ea8 ea8Var, ga8 ga8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b2b725", new Object[]{ea8Var, ga8Var});
        } else {
            ea8Var.m(ga8Var);
        }
    }

    public static /* synthetic */ void h(ea8 ea8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e3ce73", new Object[]{ea8Var});
        } else {
            ea8Var.j();
        }
    }

    public static /* synthetic */ Object ipc$super(ea8 ea8Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 212160782) {
            super.d();
            return null;
        } else if (hashCode == 1754708833) {
            super.a();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/ap/zoloz/hummer/api/EkycFacade");
        }
    }

    public static ea8 o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ea8) ipChange.ipc$dispatch("4cb09abe", new Object[0]);
        }
        if (f == null) {
            synchronized (ea8.class) {
                try {
                    if (f == null) {
                        f = new ea8();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    @Override // tb.pu1
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6896bb61", new Object[]{this});
            return;
        }
        BioLog.i("forceQuitting");
        super.a();
        this.e = null;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f7ef51", new Object[]{this});
            return;
        }
        f9b f9bVar = this.f26303a;
        if (f9bVar != null) {
            int d2 = f9bVar.d();
            if (d2 == 0) {
                this.f26303a.p(TAG, "Z7034");
                j();
                return;
            }
            jho.d().h(new c(), jho.d().c(this.f26303a, d2, false));
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4af73f", new Object[]{this});
            return;
        }
        nzw.c().b();
        ga8 ga8Var = new ga8();
        ga8Var.f19831a = 1003;
        f9b f9bVar = this.f26303a;
        if (f9bVar != null) {
            ga8Var.b = f9bVar.g();
            ga8Var.c = JSON.toJSONString(this.f26303a.k());
        }
        m(ga8Var);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60ccbaad", new Object[]{this})).booleanValue();
        }
        int status = BioResManager.getInstance().getStatus();
        if (status == 5 || status == 3) {
            return true;
        }
        return false;
    }

    public void l(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a47ac8", new Object[]{this, new Integer(i), str});
            return;
        }
        BioLog.i("endWebTask ");
        f9b f9bVar = this.f26303a;
        if (f9bVar != null && this.b != null && f9bVar.e() != null) {
            if (this.f26303a.e().type.equals("webTask")) {
                WebTask webTask = (WebTask) this.b.p();
                if (webTask != null) {
                    webTask.handleResult(i, str);
                    return;
                }
                return;
            }
            this.f26303a.p(TAG, "Z7021");
            this.f26303a.u(TAG, "Z7021");
            vk0.e().c(this.e);
        }
    }

    public final void m(ga8 ga8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98830628", new Object[]{this, ga8Var});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("prodRetCode", String.valueOf(ga8Var.f19831a));
        hashMap.put("prodSubRetCode", ga8Var.b);
        jqn.a().c("ekycEnd", hashMap);
        y1c y1cVar = this.d;
        if (y1cVar != null) {
            y1cVar.a(ga8Var);
        }
        BioLog.i("ekyc response =" + ga8Var.toString());
        d();
    }

    public f9b n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f9b) ipChange.ipc$dispatch("b0b08238", new Object[]{this});
        }
        return this.f26303a;
    }

    public final BaseWebService p() {
        f9b f9bVar = this.f26303a;
        if (f9bVar == null) {
            return null;
        }
        try {
            return (BaseWebService) Class.forName(((ServiceDesc) JSON.parseObject(new String(FileUtil.getAssetsData(f9bVar.b.getApplicationContext().getResources(), "hummer_service.json")), ServiceDesc.class)).className).newInstance();
        } catch (ClassNotFoundException e2) {
            BioLog.e(e2.toString());
            this.f26303a.p(TAG, "Z7017");
            vk0.e().c(this.e);
            return null;
        } catch (IllegalAccessException e3) {
            BioLog.e(e3.toString());
            this.f26303a.p(TAG, "Z7017");
            vk0.e().c(this.e);
            return null;
        } catch (InstantiationException e4) {
            BioLog.e(e4.toString());
            this.f26303a.p(TAG, "Z7017");
            vk0.e().c(this.e);
            return null;
        } catch (NullPointerException e5) {
            BioLog.e(e5.toString());
            this.f26303a.p(TAG, "Z7016");
            vk0.e().c(this.e);
            return null;
        }
    }

    public void q(Context context, efe efeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89ac6b7", new Object[]{this, context, efeVar});
            return;
        }
        BioLog.setLogger(new d(this));
        int status = BioResManager.getInstance().getStatus();
        if (status == 5 || status == 3) {
            if (efeVar != null) {
                efeVar.a(true);
            }
        } else if (status == -1) {
            if (efeVar != null) {
                efeVar.a(false);
            }
        } else if (Runtime.isNeedtoDownload()) {
            AsyncTask.execute(new e(context, efeVar));
        } else if (efeVar != null) {
            efeVar.a(false);
        }
    }

    @Override // tb.pu1
    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        BioLog.i("releasing");
        super.d();
        pu1.c = false;
        if (f != null) {
            f = null;
        }
        this.d = null;
        this.e = null;
    }

    public void r(fa8 fa8Var, y1c y1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1e1e5a", new Object[]{this, fa8Var, y1cVar});
            return;
        }
        BioLog.i("EkycFacade startEkyc " + fa8Var.toString());
        synchronized (ea8.class) {
            try {
                if (pu1.c) {
                    a();
                }
            } finally {
            }
        }
        pu1.c = true;
        this.d = y1cVar;
        if (this.f26303a == null || this.b == null) {
            BioLog.e("illegal request!");
            return;
        }
        Map<String, Object> map = fa8Var.c;
        if (map != null && ((HashMap) map).containsKey("hummerContext") && (((HashMap) fa8Var.c).get("hummerContext") instanceof Activity)) {
            e((Context) ((HashMap) fa8Var.c).get("hummerContext"));
        }
        if (this.f26303a.b == null) {
            BioLog.e("context is null!");
            ga8 ga8Var = new ga8();
            ga8Var.f19831a = 1003;
            ga8Var.b = "Z7011";
            ga8Var.c = "context is null";
            m(ga8Var);
            return;
        }
        this.e = new a();
        if (StringUtil.isNullorEmpty(fa8Var.f19139a)) {
            this.f26303a.p(TAG, "Z7010");
            this.f26303a.u(TAG, "Z7010");
            vk0.e().c(this.e);
            return;
        }
        this.f26303a.f19115a = fa8Var.f19139a;
        if (StringUtil.isNullorEmpty(fa8Var.d)) {
            this.f26303a.p(TAG, "Z7012");
            this.f26303a.u(TAG, "Z7012");
            vk0.e().c(this.e);
        } else if (!c(fa8Var.d)) {
            this.f26303a.p(TAG, "Z7031");
            this.f26303a.u(TAG, "Z7031");
            vk0.e().c(this.e);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("hummerId", this.f26303a.f19115a);
            if (this.f26303a.o(oeh.DEVICE_ID) != null) {
                hashMap.put(oeh.DEVICE_ID, (String) this.f26303a.o(oeh.DEVICE_ID));
            }
            if (this.f26303a.o("MERCHANT_USER_ID") != null) {
                hashMap.put("userId", (String) this.f26303a.o("MERCHANT_USER_ID"));
            }
            if (this.f26303a.o("REMOTELOG_URL") != null) {
                hashMap.put("REMOTELOG_URL", (String) this.f26303a.o("REMOTELOG_URL"));
            }
            hashMap.put(MspGlobalDefine.AUTH_TYPE, "EKYC");
            jqn.a().b(this.f26303a.b.getApplicationContext(), hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("sdkVersion", ZIMFacade.getZimMetaInfo(this.f26303a.b, (Map) null).getBioMetaInfo());
            jqn.a().c("ekycStart", hashMap2);
            synchronized (this) {
                try {
                    if (this.f26303a != null) {
                        MicroModuleContext.getInstance().attachContext(this.f26303a.b.getApplicationContext());
                        cld cldVar = new cld();
                        cldVar.e(this.f26303a.b.getApplicationContext());
                        cldVar.f(String.valueOf(this.f26303a.o("WORKSPACE_ID")));
                        cldVar.d(String.valueOf(this.f26303a.o("APP_ID")));
                        cldVar.setGW(String.valueOf(this.f26303a.o("GATEWAY_URL")));
                        jho.d().e((HummerGWFacade) cldVar.getRpcProxy(HummerGWFacade.class));
                        nzw.c().d(p());
                        jqn.a().c("ztech_check_pass", null);
                        this.b.t(this.f26303a, new b(), true);
                    }
                } finally {
                }
            }
        }
    }
}
