package tb;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.android.pissarro.remote.RemoteLoadingActivity;
import com.taobao.android.pissarro.remote.TaopaiLoadConfig;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xbt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31279a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements gvk<Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f31280a;

        public a(long j) {
            this.f31280a = j;
        }

        /* renamed from: b */
        public void onSuccess(Void r5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a4b93d2", new Object[]{this, r5});
            } else {
                ezn.a(a7m.PRE_LOAD, "gg_success", "", System.currentTimeMillis() - this.f31280a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f31281a;

        public b(long j) {
            this.f31281a = j;
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                return;
            }
            if (exc != null) {
                str = exc.getMessage();
            } else {
                str = "";
            }
            ezn.a(a7m.PRE_LOAD, "gg_fail", str, System.currentTimeMillis() - this.f31281a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements gvk<Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f31282a;

        public c(long j) {
            this.f31282a = j;
        }

        /* renamed from: b */
        public void onSuccess(Void r5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a4b93d2", new Object[]{this, r5});
            } else {
                ezn.a("gg_preload", "success", "", System.currentTimeMillis() - this.f31282a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f31283a;

        public d(long j) {
            this.f31283a = j;
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                return;
            }
            if (exc != null) {
                str = exc.getMessage();
            } else {
                str = "";
            }
            ezn.a("gg_preload", "fail", str, System.currentTimeMillis() - this.f31283a);
        }
    }

    static {
        t2o.a(623902791);
    }

    public static void a(Context context, TaopaiLoadConfig taopaiLoadConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae9f3576", new Object[]{context, taopaiLoadConfig, new Boolean(z)});
        } else {
            b(context, taopaiLoadConfig, z, com.taobao.appbundle.a.TAOPAI_FEATURE);
        }
    }

    public static void b(Context context, TaopaiLoadConfig taopaiLoadConfig, boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6a2dc0", new Object[]{context, taopaiLoadConfig, new Boolean(z), str});
            return;
        }
        StringBuilder sb = new StringBuilder(" taopai try init");
        if (taopaiLoadConfig != null) {
            str2 = taopaiLoadConfig.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append(" ");
        sb.append(z);
        TLog.loge("TaopaiCheck", sb.toString());
        if (z) {
            Intent intent = new Intent(context, RemoteLoadingActivity.class);
            intent.putExtra("taopai_load_config", taopaiLoadConfig);
            if (BundleInfoManager.instance().getDynamicFeatureInfo(str) == null) {
                intent.putExtra("feature_name", com.taobao.appbundle.a.TAOPAI_SDK_FEATURE);
            } else {
                intent.putExtra("feature_name", str);
            }
            if (taopaiLoadConfig.getSuccessIntent() != null) {
                intent.putExtra("orignal_intent", taopaiLoadConfig.getSuccessIntent());
            }
            if ((context instanceof Service) || (context instanceof Application)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return;
        }
        com.taobao.appbundle.a.Companion.a().h().c(xcq.c().l(com.taobao.appbundle.a.TAOPAI_SDK_FEATURE).l(str).n());
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[0])).booleanValue();
        }
        if (f31279a) {
            TLog.loge("TaopaiCheck", "is Loaded Init true");
            return true;
        } else if (BundleInfoManager.instance().getDynamicFeatureInfo(com.taobao.appbundle.a.TAOPAI_FEATURE) == null && BundleInfoManager.instance().getDynamicFeatureInfo("rxandroid") == null && BundleInfoManager.instance().getDynamicFeatureInfo(com.taobao.appbundle.a.TAOPAI_SDK_FEATURE) == null) {
            TLog.loge("TaopaiCheck", " DynamicFeature is null, is Init true");
            return true;
        } else {
            ucq h = com.taobao.appbundle.a.Companion.a().h();
            if (!f()) {
                TLog.loge("TaopaiCheck", " pixelAI dependency is not ready");
                return false;
            }
            if (h == null) {
                TLog.loge("TaopaiCheck", " AppBundle is null, is Init false");
            } else if (!h.f().contains(com.taobao.appbundle.a.TAOPAI_FEATURE) || !g(h, "rxandroid") || !h.f().contains(com.taobao.appbundle.a.TAOPAI_SDK_FEATURE)) {
                TLog.loge("TaopaiCheck", " is Init error , not found taopai module");
            } else {
                z = h();
                TLog.loge("TaopaiCheck", " is Init " + z);
            }
            f31279a = z;
            TLog.loge("TaopaiCheck", "is Init result = " + f31279a);
            return z;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79c67345", new Object[0])).booleanValue();
        }
        if (c) {
            TLog.loge("TaopaiCheck", "is GG Loaded Init true");
            return true;
        } else if (BundleInfoManager.instance().getDynamicFeatureInfo("litecreator") == null && BundleInfoManager.instance().getDynamicFeatureInfo("umipublish") == null && BundleInfoManager.instance().getDynamicFeatureInfo(com.taobao.appbundle.a.TAOPAI_SDK_FEATURE) == null) {
            TLog.loge("TaopaiCheck", "GG DynamicFeature is null, is Init true");
            return true;
        } else {
            ucq h = com.taobao.appbundle.a.Companion.a().h();
            if (!d && h != null) {
                d = true;
                ArrayList arrayList = new ArrayList();
                if (BundleInfoManager.instance().getDynamicFeatureInfo("litecreator") != null) {
                    arrayList.add("litecreator");
                }
                if (BundleInfoManager.instance().getDynamicFeatureInfo("umipublish") != null) {
                    arrayList.add("umipublish");
                }
                if (BundleInfoManager.instance().getDynamicFeatureInfo("rxandroid") != null) {
                    arrayList.add("rxandroid");
                }
                arrayList.add(com.taobao.appbundle.a.TAOPAI_SDK_FEATURE);
                bdt<Void> d2 = h.d(arrayList);
                long currentTimeMillis = System.currentTimeMillis();
                ezn.a(a7m.PRE_LOAD, "gg_start", "", 0L);
                d2.c(new a(currentTimeMillis));
                d2.b(new b(currentTimeMillis));
            }
            if (!f()) {
                TLog.loge("TaopaiCheck", "GG pixelAI dependency is not ready");
                return false;
            }
            if (h == null) {
                TLog.loge("TaopaiCheck", "GG AppBundle is null, is Init false");
            } else if (!g(h, "litecreator") || !g(h, "umipublish") || !g(h, "rxandroid") || !g(h, com.taobao.appbundle.a.TAOPAI_SDK_FEATURE)) {
                TLog.loge("TaopaiCheck", " is GG Init error , not found lc and taopai_sdk module");
            } else {
                TLog.loge("TaopaiCheck", " is GG Init success ,both litecreator and taopai_sdk");
                z = true;
            }
            c = z;
            TLog.loge("TaopaiCheck", "is GG Init result = " + c);
            return z;
        }
    }

    public static boolean e(Context context, String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e30b6b5", new Object[]{context, str})).booleanValue();
        }
        if (BundleInfoManager.instance().getDynamicFeatureInfo(str) == null) {
            return true;
        }
        try {
            z = bcq.a().g(context, false, str);
        } catch (Exception e) {
            TLog.loge("TaopaiCheck", "flexa load " + str + " error " + e.getMessage());
        }
        if (z) {
            return z;
        }
        z07 z07Var = new z07();
        boolean c2 = z07Var.c(str);
        if (c2) {
            return z07Var.b(context, str, z07Var.a(str));
        }
        return c2;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdb49bd3", new Object[0])).booleanValue();
        }
        return xdn.b();
    }

    public static boolean g(ucq ucqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef813a6", new Object[]{ucqVar, str})).booleanValue();
        }
        if (BundleInfoManager.instance().getDynamicFeatureInfo(str) == null) {
            return true;
        }
        return ucqVar.f().contains(str);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6748fc15", new Object[0])).booleanValue();
        }
        try {
            Class.forName("com.taobao.taopai.business.workflow.WorkflowLauncherActivity");
            return true;
        } catch (ClassNotFoundException e) {
            ezn.d("classNotFound", Log.getStackTraceString(e));
            TLog.loge("TaopaiCheck", " taipai class not found , " + Log.getStackTraceString(e));
            return false;
        }
    }

    public static void i(Context context) {
        ucq h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f92b28", new Object[]{context});
        } else if (!b) {
            boolean e = e(context, com.taobao.appbundle.a.TAOPAI_SDK_FEATURE);
            boolean e2 = e(context, "litecreator");
            boolean e3 = e(context, "rxandroid");
            if ((!e || !e2 || !e3) && (h = com.taobao.appbundle.a.Companion.a().h()) != null) {
                b = true;
                ArrayList arrayList = new ArrayList();
                if (BundleInfoManager.instance().getDynamicFeatureInfo("rxandroid") != null) {
                    arrayList.add("rxandroid");
                }
                arrayList.add("litecreator");
                arrayList.add(com.taobao.appbundle.a.TAOPAI_SDK_FEATURE);
                bdt<Void> d2 = h.d(arrayList);
                long currentTimeMillis = System.currentTimeMillis();
                ezn.a("gg_preload", "start", "", 0L);
                d2.c(new c(currentTimeMillis));
                d2.b(new d(currentTimeMillis));
            }
        }
    }
}
