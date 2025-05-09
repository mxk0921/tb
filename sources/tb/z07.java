package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z07 implements s5c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wnc f32444a = (wnc) d62.b(wnc.class, "DefaultFeatureSourceStrategy");
    public final b4d b = (b4d) d62.a(b4d.class, new Object[0]);

    @Override // tb.s5c
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4723202a", new Object[]{this, str});
        }
        try {
            return bcq.a().e().l().a();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // tb.s5c
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fefed0e", new Object[]{this, str})).booleanValue();
        }
        try {
            if (BundleInfoManager.instance().getDynamicFeatureInfo(str) != null && !n1r.C(bcq.a().e().j(), str)) {
                String a2 = bcq.a().e().l().a();
                wnc wncVar = this.f32444a;
                wncVar.c("CurrentUseHisAppVersion:" + a2, new Object[0]);
                if (!TextUtils.isEmpty(a2)) {
                    if (BundleInfoManager.instance().getDynamicFeatureInfo(str).matchedAppFeatureMd5.containsKey(a2)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.s5c
    public boolean b(Context context, String str, String str2) {
        boolean z;
        Exception e;
        jcq jcqVar;
        File E;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acc95f1c", new Object[]{this, context, str, str2})).booleanValue();
        }
        try {
            wnc wncVar = this.f32444a;
            wncVar.c("FeatureSourceStrategy  installHistoryFeature:" + str, new Object[0]);
            jcqVar = new jcq(context, true, str2, false);
            E = jcqVar.E(str);
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
        try {
            if (!E.exists() || !this.b.a(E.getAbsolutePath()).equals(BundleInfoManager.instance().getDynamicFeatureInfo(str).matchedAppFeatureMd5.get(str2))) {
                wnc wncVar2 = this.f32444a;
                String absolutePath = E.getAbsolutePath();
                if (E.exists()) {
                    str3 = hbi.b(E);
                } else {
                    str3 = "";
                }
                wncVar2.c("hisSplitApkFile exist:%s and md5 is:%s", absolutePath, str3);
                wnc wncVar3 = this.f32444a;
                wncVar3.c("FeatureSourceStrategy  installHistoryFeature:" + str + " md5 is mismatch", new Object[0]);
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (!bcq.a().d(context, true, jcqVar, str) || mcq.a() == null || !mcq.a().a().contains(str)) {
                return false;
            }
            ddq.a().b(str, q5c.HISTORY);
            ((jvc) d62.a(jvc.class, new Object[0])).a(str, true, "install_history_" + jcqVar.n(), System.currentTimeMillis() - currentTimeMillis, 0, "", jcqVar.E(str).getPath().split("splitcompat")[1], jcqVar.E(str).length(), oaq.a(), h21.a(), h21.c(), h21.b());
            wnc wncVar4 = this.f32444a;
            wncVar4.c("FeatureSourceStrategy  installHistoryFeature:" + str + " success", new Object[0]);
            return true;
        } catch (Exception e3) {
            e = e3;
            z = jcqVar;
            e.printStackTrace();
            return z;
        }
    }
}
