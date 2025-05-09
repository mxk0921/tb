package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class l6r implements sgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final l6r INSTANCE = new l6r();

    @Override // tb.sgb
    public yt a(bkc bkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yt) ipChange.ipc$dispatch("5ad9e98f", new Object[]{this, bkcVar});
        }
        ckf.g(bkcVar, "lifecycleEvent");
        return new k6r(bkcVar);
    }
}
