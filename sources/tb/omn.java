package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.knn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class omn implements knn.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d90 f25492a;
    public final /* synthetic */ String b;
    public final /* synthetic */ mmn c;

    public omn(mmn mmnVar, d90 d90Var, String str) {
        this.c = mmnVar;
        this.f25492a = d90Var;
        this.b = str;
    }

    @Override // tb.knn.d
    public void onSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            return;
        }
        hrg.e("cacheProcess", "gateway2.loadCache", "template download completed trigger successfully");
        mmn mmnVar = this.c;
        mmn.d(mmnVar, this.f25492a, mmn.c(mmnVar).u(this.b));
    }
}
