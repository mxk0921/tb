package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.uli;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v95 implements uli.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w95 f29865a;

    public v95(w95 w95Var) {
        this.f29865a = w95Var;
    }

    @Override // tb.uli.c
    public void onClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f782f0", new Object[]{this});
        } else {
            ouv.a(w95.b(this.f29865a), "Report", ouv.b(w95.b(this.f29865a), null));
        }
    }
}
