package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class s2i implements gdd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final s2i INSTANCE = new s2i();

    /* renamed from: a  reason: collision with root package name */
    public static final List<gdd> f27758a = xz3.e(u80.INSTANCE);

    static {
        t2o.a(839909830);
        t2o.a(839909829);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.gdd
    public AppManifest a(cvm cvmVar) {
        AppManifest appManifest;
        AppManifest appManifest2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppManifest) ipChange.ipc$dispatch("af33e449", new Object[]{this, cvmVar});
        }
        ckf.g(cvmVar, "baseInfo");
        Iterator<gdd> it = f27758a.iterator();
        while (true) {
            appManifest = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                appManifest2 = Result.m1108constructorimpl(it.next().a(cvmVar));
            } catch (Throwable th) {
                appManifest2 = Result.m1108constructorimpl(b.a(th));
            }
            if (!Result.m1114isFailureimpl(appManifest2)) {
                appManifest = appManifest2;
            }
            appManifest = appManifest;
            if (appManifest != null) {
                appManifest.setPreset(true);
                break;
            }
        }
        return appManifest;
    }
}
