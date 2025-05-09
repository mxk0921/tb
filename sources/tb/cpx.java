package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.packages.downloader.ZCacheExtKt;
import kotlin.NotImplementedError;
import tb.m5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class cpx implements m5d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(843055292);
        t2o.a(843055287);
    }

    @Override // tb.m5d
    public void a(jkl jklVar, m5d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1dc3d9a", new Object[]{this, jklVar, cVar});
            return;
        }
        ckf.g(jklVar, "packageInfo");
        zas.a();
        ZCacheExtKt.c(jklVar.b(), cVar);
    }

    public m5d.a b(jkl jklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m5d.a) ipChange.ipc$dispatch("e7c62cbb", new Object[]{this, jklVar});
        }
        ckf.g(jklVar, "packageInfo");
        throw new NotImplementedError("sync download method not implement please use async download");
    }
}
