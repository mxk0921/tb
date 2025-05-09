package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class e9s implements twd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final bbs mInstance;

    static {
        t2o.a(839909927);
        t2o.a(839909926);
    }

    public e9s(bbs bbsVar) {
        ckf.g(bbsVar, "mInstance");
        this.mInstance = bbsVar;
    }

    public final bbs getMInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("f3197ddf", new Object[]{this});
        }
        return this.mInstance;
    }

    @Override // tb.twd
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }
}
