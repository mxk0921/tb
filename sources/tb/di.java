package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.android.tools.bundleInfo.DynamicFeatureInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class di implements gbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static di g;

    /* renamed from: a  reason: collision with root package name */
    public final BundleInfoManager f17830a = BundleInfoManager.instance();
    public final ucq b = com.taobao.appbundle.a.Companion.a().h();
    public final ei c = new ei();
    public final c d = new c();
    public boolean e = false;
    public fbb f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements gvk<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ci f17831a;

        public a(ci ciVar) {
            this.f17831a = ciVar;
        }

        /* renamed from: b */
        public void onSuccess(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
            } else {
                di.a(di.this).e(this.f17831a, 3);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ci f17832a;

        public b(ci ciVar) {
            this.f17832a = ciVar;
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                return;
            }
            di.a(di.this).d(this.f17832a);
            if (di.b(di.this) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f17832a.f17067a);
                fbb b = di.b(di.this);
                if (exc == null || exc.getMessage() == null) {
                    str = "";
                } else {
                    str = exc.getMessage();
                }
                b.b(arrayList, "start_install_failed", str);
            }
            rbb g = ck.g();
            g.e("AURADynamicFeatureInstaller.requestForInstall:OnFailureListener,bundle is " + this.f17832a.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements edq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(79691859);
            t2o.a(676331590);
        }

        public c() {
        }

        /* renamed from: a */
        public void onStateUpdate(bdq bdqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
            } else if (bdqVar == null) {
                ck.g().e("InnerInstallListener.onStateUpdate:splitInstallSessionState is null");
            } else {
                List<String> f = bdqVar.f();
                if (f == null || f.isEmpty()) {
                    ck.g().e("InnerInstallListener.onStateUpdate:no modules");
                    return;
                }
                int i = bdqVar.i();
                if (i != 5) {
                    if (i != 6) {
                        StringBuffer stringBuffer = new StringBuffer("modules:");
                        for (String str : f) {
                            if (str == null) {
                                str = "";
                            }
                            stringBuffer.append(str);
                            stringBuffer.append("/");
                        }
                        rbb g = ck.g();
                        g.d("InnerInstallListener.onStateUpdate:" + stringBuffer.toString() + ",status:" + i);
                        return;
                    }
                    if (di.b(di.this) != null) {
                        di.b(di.this).b(f, String.valueOf(bdqVar.b()), String.valueOf(bdqVar.c()));
                    }
                    for (String str2 : f) {
                        di.a(di.this).c(str2);
                    }
                } else if (di.b(di.this) != null) {
                    di.b(di.this).a(f);
                }
            }
        }
    }

    static {
        t2o.a(79691856);
        t2o.a(79691862);
    }

    public static /* synthetic */ ei a(di diVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ei) ipChange.ipc$dispatch("f3b0cc7e", new Object[]{diVar});
        }
        return diVar.c;
    }

    public static /* synthetic */ fbb b(di diVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fbb) ipChange.ipc$dispatch("fb6dc911", new Object[]{diVar});
        }
        return diVar.f;
    }

    public static di c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (di) ipChange.ipc$dispatch("cfa20ba9", new Object[0]);
        }
        if (g == null) {
            synchronized (di.class) {
                try {
                    if (g == null) {
                        g = new di();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public boolean d(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daa206c0", new Object[]{this, ciVar})).booleanValue();
        }
        if (!ci.b(ciVar)) {
            ck.g().e("AURADynamicFeatureInstaller.isDynamicFeatureBundle:bundleInfo is invalid");
            return false;
        }
        BundleInfoManager bundleInfoManager = this.f17830a;
        if (bundleInfoManager == null) {
            ck.g().e("AURADynamicFeatureInstaller.isDynamicFeatureBundle:mBundleInfoManager is null");
            return false;
        }
        List<String> dynamicFeatures = bundleInfoManager.getDynamicFeatures();
        if (dynamicFeatures != null && !dynamicFeatures.isEmpty()) {
            return dynamicFeatures.contains(ciVar.f17067a);
        }
        ck.g().e("AURADynamicFeatureInstaller.isDynamicFeatureBundle:no dynamicFeatures");
        return false;
    }

    public String e(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("956722a", new Object[]{this, ciVar});
        }
        if (!d(ciVar)) {
            ck.g().e("AURADynamicFeatureInstaller.queryDynamicFeatureBundleMD5:is not a dynamicFeature bundle");
            return null;
        }
        BundleInfoManager bundleInfoManager = this.f17830a;
        if (bundleInfoManager == null) {
            ck.g().e("AURADynamicFeatureInstaller.queryDynamicFeatureBundleMD5:mBundleInfoManager is null");
            return null;
        }
        DynamicFeatureInfo dynamicFeatureInfo = bundleInfoManager.getDynamicFeatureInfo(ciVar.f17067a);
        if (dynamicFeatureInfo != null) {
            return dynamicFeatureInfo.md5;
        }
        ck.g().e("AURADynamicFeatureInstaller.queryDynamicFeatureBundleMD5:systemInfo is null");
        return null;
    }

    public int f(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad162e9f", new Object[]{this, ciVar})).intValue();
        }
        if (!d(ciVar)) {
            ck.g().e("AURADynamicFeatureInstaller.queryDynamicFeatureBundleStatus:is not a dynamicFeature bundle");
            return 0;
        }
        ucq ucqVar = this.b;
        if (ucqVar == null) {
            ck.g().e("AURADynamicFeatureInstaller.queryDynamicFeatureBundleStatus:mInstallManager is null");
            return 0;
        }
        Set<String> f = ucqVar.f();
        if (f != null && f.contains(ciVar.f17067a)) {
            return 4;
        }
        int b2 = this.c.b(ciVar);
        if (b2 == 0) {
            return 1;
        }
        return b2;
    }

    public void g(fbb fbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e802962", new Object[]{this, fbbVar});
        } else {
            this.f = fbbVar;
        }
    }

    public void h(ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28ab1da", new Object[]{this, ciVar});
        } else if (!d(ciVar)) {
            ck.g().e("AURADynamicFeatureInstaller.requestForInstall:is not a dynamicFeature bundle");
        } else {
            int f = f(ciVar);
            if (f == 2 || f == 3 || f == 4) {
                ck.g().d("AURADynamicFeatureInstaller.requestForInstall:bundle is already request for install or installed");
            } else if (this.b == null) {
                ck.g().e("AURADynamicFeatureInstaller.requestForInstall:mInstallManager is null");
            } else {
                this.c.a(ciVar);
                if (!this.e) {
                    this.b.g(this.d);
                    this.e = true;
                }
                bdt<Integer> c2 = this.b.c(xcq.c().l(ciVar.f17067a).n());
                c2.c(new a(ciVar));
                c2.b(new b(ciVar));
            }
        }
    }
}
