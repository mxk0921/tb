package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class u18 implements iwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g1a f29071a;

    public u18(g1a g1aVar) {
        this.f29071a = g1aVar;
    }

    @Override // tb.iwb
    public final /* synthetic */ void onNotificationListener(k66 k66Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
        } else {
            ckf.f(this.f29071a.invoke(k66Var), "invoke(...)");
        }
    }
}
