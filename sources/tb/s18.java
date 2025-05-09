package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ni8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class s18 implements ni8.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d1a f27744a;

    public s18(d1a d1aVar) {
        this.f27744a = d1aVar;
    }

    @Override // tb.ni8.c
    public final /* synthetic */ void onRetry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2145010", new Object[]{this});
        } else {
            ckf.f(this.f27744a.invoke(), "invoke(...)");
        }
    }
}
