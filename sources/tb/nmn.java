package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.h5b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nmn implements h5b.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d90 f24829a;
    public final /* synthetic */ String b;
    public final /* synthetic */ mmn c;

    public nmn(mmn mmnVar, d90 d90Var, String str) {
        this.c = mmnVar;
        this.f24829a = d90Var;
        this.b = str;
    }

    @Override // tb.h5b.e
    public void onSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            return;
        }
        mmn mmnVar = this.c;
        mmn.d(mmnVar, this.f24829a, mmn.c(mmnVar).u(this.b));
    }
}
