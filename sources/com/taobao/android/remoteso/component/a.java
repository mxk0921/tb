package com.taobao.android.remoteso.component;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.android.tools.bundleInfo.DynamicFeatureInfo;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.bcq;
import tb.bdq;
import tb.edq;
import tb.gvk;
import tb.jcq;
import tb.qts;
import tb.rbn;
import tb.rqk;
import tb.trq;
import tb.ucq;
import tb.van;
import tb.xcq;
import tb.xmm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ucq f9245a = com.taobao.appbundle.a.Companion.a().h();
    public final Map<Integer, d> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.remoteso.component.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0476a implements edq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0476a() {
        }

        /* renamed from: a */
        public void onStateUpdate(bdq bdqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
                return;
            }
            int h = bdqVar.h();
            d dVar = (d) a.a(a.this).get(Integer.valueOf(h));
            if (dVar != null) {
                try {
                    int i = bdqVar.i();
                    if (i == 2) {
                        dVar.a((int) bdqVar.a());
                    } else if (i == 5) {
                        a.a(a.this).remove(Integer.valueOf(h));
                        dVar.onSuccess(Integer.valueOf(h));
                    } else if (i == 6 || i == 7) {
                        a.a(a.this).remove(Integer.valueOf(h));
                        dVar.onFailure(new RuntimeException("code[" + bdqVar.b() + "], type=" + bdqVar.c()));
                    }
                } catch (Throwable th) {
                    rbn.g("remo,FlexaOperator, state listener ", th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f9247a;

        public b(a aVar, d dVar) {
            this.f9247a = dVar;
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                return;
            }
            RSoLog.d("remo,FlexaOperator, startInstall-onFailure, e = " + exc);
            this.f9247a.onFailure(exc);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements gvk<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.remoteso.component.c f9248a;
        public final /* synthetic */ d b;

        public c(com.taobao.android.remoteso.component.c cVar, d dVar) {
            this.f9248a = cVar;
            this.b = dVar;
        }

        /* renamed from: b */
        public void onSuccess(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
            } else if (num == null) {
                rbn.e("FlexaOperator,install,integer==null", this.f9248a.toString());
            } else {
                a.a(a.this).put(num, this.b);
                RSoLog.d("remo,FlexaOperator, startInstall-onSuccess,  [" + num + "]  sessionMap=" + a.a(a.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d extends gvk<Integer>, rqk {
        void a(int i);
    }

    public a() {
        d();
    }

    public static /* synthetic */ Map a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("886ad35f", new Object[]{aVar});
        }
        return aVar.b;
    }

    public void b(com.taobao.android.remoteso.component.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71136d16", new Object[]{this, cVar});
        } else if (this.f9245a == null) {
            RSoLog.d("remo,FlexaOperator-cancel(), manager == null" + cVar);
        } else {
            RSoLog.d("remo,FlexaOperator, fake cacnel done, do not really cancel install");
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ucq ucqVar = this.f9245a;
        if (ucqVar == null) {
            RSoLog.d("remo,FlexaOperator-init(), manager == null");
        } else {
            ucqVar.g(new C0476a());
        }
    }

    public void e(com.taobao.android.remoteso.component.c cVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af16ee83", new Object[]{this, cVar, dVar});
        } else if (this.f9245a == null) {
            RSoLog.d("remo,FlexaOperator-install(), manager == null" + cVar);
            dVar.onSuccess(999);
        } else {
            try {
                List<String> t = cVar.t("flexa");
                if (t.isEmpty()) {
                    RSoLog.d("remo,FlexaOperator, installFlexa  skip, no flexa module need install");
                    return;
                }
                xcq.e c2 = xcq.c();
                for (String str : t) {
                    c2.l(str);
                }
                this.f9245a.c(c2.n()).c(new c(cVar, dVar)).b(new b(this, dVar));
                RSoLog.d("remo,FlexaOperator, install(),  flexa = " + t);
            } catch (Throwable th) {
                dVar.onFailure(new RuntimeException("startInstall,error", th));
            }
        }
    }

    public String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8f6e2da", new Object[]{this, str});
        }
        ucq ucqVar = this.f9245a;
        if (ucqVar == null) {
            RSoLog.d("remo,FlexaOperator-retrieveState(), manager == null" + str);
            return "null_manager";
        } else if (ucqVar.f().contains(str)) {
            RSoLog.d("remo,FlexaOperator, check(), request module installed =" + str);
            return com.taobao.android.weex_uikit.widget.musview.a.EVENT_LOAD;
        } else if (g(qts.b(), str)) {
            return "remote";
        } else {
            return "local";
        }
    }

    public List<String> c(com.taobao.android.remoteso.component.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4f0025ff", new Object[]{this, cVar});
        }
        List<String> t = cVar.t("flexa");
        if (this.f9245a == null) {
            RSoLog.d("remo,FlexaOperator-check(), manager == null" + cVar);
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : t) {
                if (BundleInfoManager.instance().getDynamicFeatureInfo(str) == null) {
                    RSoLog.d("remo,FlexaOperator,dynamicInfo == null, module=" + str);
                } else {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return Collections.emptyList();
            }
        } catch (Throwable th) {
            rbn.g("remo,FlexaOperator peekNotInstalledModules error", th);
        }
        Set<String> f = this.f9245a.f();
        if (f.containsAll(arrayList)) {
            RSoLog.d("remo,FlexaOperator, check(), all request module installed =" + t);
            return Collections.emptyList();
        }
        arrayList.removeAll(f);
        if (van.f().e().a("key_remo_flexa_load_disabled", false)) {
            RSoLog.d("remo,FlexaOperator, check, disable flexa load, failedModules=" + arrayList);
            return arrayList;
        }
        if (Build.VERSION.SDK_INT > 29) {
            try {
                RSoLog.d("remo,FlexaOperator, check(), trigger load for modules=" + arrayList);
                bcq.a().g(cVar.j(), false, (String[]) arrayList.toArray(new String[0]));
            } catch (Throwable th2) {
                rbn.g("remo,FlexaOperator SplitCompatHolder error", th2);
            }
            Set<String> f2 = this.f9245a.f();
            if (f2.containsAll(arrayList)) {
                RSoLog.d("remo,FlexaOperator, check(), after load, all request module installed =" + t);
                return Collections.emptyList();
            }
            arrayList.removeAll(f2);
        }
        RSoLog.d("remo,FlexaOperator, peekNotInstalledModules(), failedModules=" + arrayList);
        return arrayList;
    }

    public final boolean g(Context context, String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe63abf4", new Object[]{this, context, str})).booleanValue();
        }
        try {
            boolean exists = bcq.a().e().E(str).exists();
            DynamicFeatureInfo dynamicFeatureInfo = BundleInfoManager.instance().getDynamicFeatureInfo(str);
            if (dynamicFeatureInfo == null) {
                return false;
            }
            String str2 = dynamicFeatureInfo.matchedAppVersion;
            boolean z2 = trq.e(str2) && new jcq(context, true, str2, false).E(str).exists();
            boolean c2 = new xmm(qts.a("_")).c(str);
            if (!exists && !z2 && !c2) {
                z = false;
                RSoLog.d("remo,FlexaOperator, shouldNotDownload = " + z + ", moduleFileExists =" + exists + ", newModuleFileExists =" + z2 + ", preloadModuleFileExists =" + c2);
                return !z;
            }
            z = true;
            RSoLog.d("remo,FlexaOperator, shouldNotDownload = " + z + ", moduleFileExists =" + exists + ", newModuleFileExists =" + z2 + ", preloadModuleFileExists =" + c2);
            return !z;
        } catch (Throwable th) {
            rbn.g("remo,FlexaOperator,shouldDownload", th);
            return false;
        }
    }
}
